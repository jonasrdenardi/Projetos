package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;
import javax.swing.JOptionPane;
import model.Item;
import model.ItemPedido;
import model.Mesa;
import model.Pedido;
import model.Usuario;

public class PedidoDAO {

    private Connection con;
    private PreparedStatement cmd;

    public List<Object> listarAberto(Usuario usuario) {
        try {
            String SQL = "SELECT id_pedido,id_mesa,to_char(dt_pedido,'DD-MM-YYYY') AS dt_pedido,valor_pedido FROM tb_pedido WHERE fg_ativo = true ORDER BY id_pedido";

            con = Conexao.Conectar(usuario);
            cmd = con.prepareStatement(SQL);
            ResultSet rs = cmd.executeQuery();

            List<Object> lista = new ArrayList<>();
            while (rs.next()) {
                Pedido p = new Pedido();
                Mesa m = new Mesa();
                p.setId(rs.getInt("id_pedido"));
                // Se o id da mesa dor 0 entao a descricao sera Balcão senão a descricao sera igual ao id da mesa
                if(rs.getInt("id_mesa") == 0){
                    m.setDesc("Balcão");
                }else{
                    m.setDesc(String.valueOf(rs.getInt("id_mesa")));
                }
                p.setData(rs.getString("dt_pedido"));
                p.setValor(rs.getFloat("valor_pedido"));
                p.setMesa(m);
                lista.add(p);
            }
            return lista;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problema ao listar: " + e.getMessage());
            return null;

        } finally {
            Conexao.Desconectar(con);
        }
    }
    
    public List<Object> listarFechado(Usuario usuario) {
        try {
            String SQL = "SELECT id_pedido,id_mesa,to_char(dt_pedido,'DD-MM-YYYY') AS dt_pedido,valor_pedido FROM tb_pedido WHERE fg_ativo = false ORDER BY id_pedido";

            con = Conexao.Conectar(usuario);
            cmd = con.prepareStatement(SQL);
            ResultSet rs = cmd.executeQuery();

            List<Object> lista = new ArrayList<>();
            while (rs.next()) {
                Pedido p = new Pedido();
                Mesa m = new Mesa();
                p.setId(rs.getInt("id_pedido"));
                // Se o id da mesa dor 0 entao a descricao sera Balcão senão a descricao sera igual ao id da mesa
                if(rs.getInt("id_mesa") == 0){
                    m.setDesc("Balcão");
                }else{
                    m.setDesc(String.valueOf(rs.getInt("id_mesa")));
                }
                p.setData(rs.getString("dt_pedido"));
                p.setValor(rs.getFloat("valor_pedido"));
                p.setMesa(m);
                lista.add(p);
            }
            return lista;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problema ao listar: " + e.getMessage());
            return null;

        } finally {
            Conexao.Desconectar(con);
        }
    }

    public Pedido listarDetalhes(Usuario usuario, int idPedido) {
        try {
            String SQL = "SELECT i.id_item, i.desc_item, ip.qtd_item, ip.valor_item AS \"Valor Unitário\", p.valor_garcom FROM tb_pedido p INNER JOIN tb_item_pedido ip ON (p.id_pedido = ip.id_pedido) INNER JOIN tb_item i ON (ip.id_item = i.id_item) WHERE p.id_pedido = ? ORDER BY id_item;";

            con = Conexao.Conectar(usuario);
            cmd = con.prepareStatement(SQL,ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            cmd.setInt(1, idPedido);
            ResultSet rs = cmd.executeQuery();

            List<Object> lista = new ArrayList<>();
            Pedido p = new Pedido();
            int aux = 0;
            
            rs.last();
            aux = rs.getRow(); // count agora tem o numero de linhas do ResultSet
            rs.beforeFirst();
            
            Item[] i = new Item[aux];
            ItemPedido[] ip = new ItemPedido[aux];
            
            aux = 0;
            
            while (rs.next()) {
                i[aux] = new Item();
                ip[aux] = new ItemPedido();
                
                i[aux].setId(rs.getInt("id_item"));
                i[aux].setDesc(rs.getString("desc_item"));
                ip[aux].setQtdItem(rs.getInt("qtd_item"));
                i[aux].setValor(rs.getFloat("Valor Unitário"));
                p.setGarcom10(rs.getFloat("valor_garcom"));
                aux++;
            }            
            p.setItem(i);
            p.setQtdItem(ip);
            return p;

        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Problema ao listar: " + e.getMessage());
            return null;

        } finally {
            Conexao.Desconectar(con);
        }
    }
    
    public int inserir(Usuario u, Pedido p) {
        try {
            // Formatar a data
            SimpleDateFormat fm = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = fm.parse(p.getData());
            p.setData(fm.format(date));
            date = fm.parse(p.getData());
            
            String SQL = "INSERT INTO tb_pedido(id_mesa,dt_pedido,valor_pedido,fg_ativo,usuario,valor_garcom)\n" +
                    "VALUES\n" +
                    "(?,?,?,?,?,?);"; 
            
            con = Conexao.Conectar(u);
            cmd = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            // Se a mesa for Balcão o id será 0 senão será o próprio número da mesa
            if(p.getMesa().getDesc().equals("Balcão")){
                cmd.setInt(1, 0);
            }else{
                cmd.setInt(1, Integer.parseInt(p.getMesa().getDesc()));
            }
            cmd.setTimestamp(2, new java.sql.Timestamp(date.getTime()));
            cmd.setFloat(3, p.getValor());
            cmd.setBoolean(4, true);
            cmd.setString(5, p.getUsuario().getNome());
            cmd.setFloat(6, p.getGarcom10());
            
            if (cmd.executeUpdate() > 0) {
                ResultSet rs = cmd.getGeneratedKeys();
                return rs.next() ? rs.getInt(1) : -1;
            }
            
            return -1;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
            return -1;
            
        } finally {
            Conexao.Desconectar(con);
        }
    }
    
     public int deletar(Usuario usuario, int idPedido) {
        try {
            String SQL = "DELETE FROM tb_pedido\n" +
                         "WHERE id_pedido = ?;";

            con = Conexao.Conectar(usuario);
            cmd = con.prepareStatement(SQL);
            
            cmd.setInt(1, idPedido);
            
            int retorno = cmd.executeUpdate();
            
            if(retorno > 0){
                return retorno;
            }else{
                return -1;
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            return -1;

        } finally {
            Conexao.Desconectar(con);
        }
    }
     
     public int alterarValorGarcomETotal(Usuario usuario, Pedido p) {
        try {
            String SQL = "UPDATE tb_pedido\n" +
                         "SET valor_garcom = ?,\n" +
                         "    valor_pedido = ?\n" +
                         "WHERE id_pedido = ?;";

            con = Conexao.Conectar(usuario);
            cmd = con.prepareStatement(SQL);
            
            cmd.setFloat(1, p.getGarcom10());
            cmd.setFloat(2, p.getValor());
            cmd.setInt(3, p.getId());
            
            int retorno = cmd.executeUpdate();
            
            if(retorno > 0){
                return retorno;
            }else{
                return -1;
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            return -1;

        } finally {
            Conexao.Desconectar(con);
        }
    }
}
