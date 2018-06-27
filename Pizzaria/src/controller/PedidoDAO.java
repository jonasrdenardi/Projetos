package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Item;
import model.ItemPedido;
import model.Mesa;
import model.Pedido;
import model.Usuario;

public class PedidoDAO {

    private Connection con;
    private PreparedStatement cmd;

    public List<Object> listar(Usuario usuario) {
        try {
            String SQL = "SELECT id_pedido,id_mesa,to_char(dt_pedido,'DD-MM-YYYY') AS dt_pedido,valor_pedido FROM tb_pedido WHERE fg_ativo = true";

            con = Conexao.Conectar(usuario);
            cmd = con.prepareStatement(SQL);
            ResultSet rs = cmd.executeQuery();

            List<Object> lista = new ArrayList<>();
            while (rs.next()) {
                Pedido p = new Pedido();
                Mesa m = new Mesa();
                p.setId(rs.getInt("id_pedido"));
                m.setId(rs.getInt("id_mesa"));
                p.setData(rs.getString("dt_pedido"));
                p.setValor(rs.getFloat("valor_pedido"));
                p.setMesa(m);
                lista.add(p);
            }
            return lista;

        } catch (Exception e) {
            System.out.println("Problema ao listar: " + e.getMessage());
            return null;

        } finally {
            Conexao.Desconectar(con);
        }
    }

    public Pedido listarDetalhes(Usuario usuario, int idPedido) {
        try {
            String SQL = "SELECT i.id_item, i.desc_item, ip.qtd_item, ip.valor_item AS \"Valor Unitário\" FROM tb_pedido p INNER JOIN tb_item_pedido ip ON (p.id_pedido = ip.id_pedido) INNER JOIN tb_item i ON (ip.id_item = i.id_item) WHERE p.id_pedido = ?;";

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
                aux++;
            }            
            p.setItem(i);
            p.setQtdItem(ip);
            return p;

        }catch (Exception e) {
            System.out.println("Problema ao listar: " + e.getMessage());
            return null;

        } finally {
            Conexao.Desconectar(con);
        }
    }
    
    public int inserir(Usuario u, Pedido p) {
        try {
            String SQL = "insert into contato(nome,email,telefone) "
                    + "values (?,?,?) ";

            con = Conexao.Conectar(u);
            cmd = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            cmd.setString(1, c.getNome());
            cmd.setString(2, c.getEmail());
            cmd.setString(3, c.getTelefone());
            
            if (cmd.executeUpdate() > 0) {
                ResultSet rs = cmd.getGeneratedKeys();
                return rs.next() ? rs.getInt(1) : -1;
            }
            return -1;
            
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return -1;
            
        } finally {
            Conexao.desconectar(con);
        }
    }
}
