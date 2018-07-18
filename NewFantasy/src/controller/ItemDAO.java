package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.Item;
import model.Pedido;
import model.Usuario;

public class ItemDAO {
    private Connection con;
    private PreparedStatement cmd;

    public List<Object> listarAtivos(Usuario usuario) {
        try {
            String SQL = "SELECT id_item, desc_item, valor_item\n" +
                         "FROM tb_item\n" +
                         "WHERE fg_ativo = true \n" +
                         "ORDER BY id_item;";

            con = Conexao.Conectar(usuario);
            cmd = con.prepareStatement(SQL);
            ResultSet rs = cmd.executeQuery();

            List<Object> lista = new ArrayList<>();
            while (rs.next()) {
                Item i = new Item();
                i.setId(rs.getInt("id_item"));
                i.setDesc(rs.getString("desc_item"));
                i.setValor(rs.getFloat("valor_item"));
                lista.add(i);
            }
            return lista;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problema ao listar: " + e.getMessage());
            return null;

        } finally {
            Conexao.Desconectar(con);
        }
    }
    
    public List<Object> listarTodos(Usuario usuario) {
        try {
            String SQL = "SELECT *\n" +
                         "FROM tb_item \n" +
                         "ORDER BY id_item;";

            con = Conexao.Conectar(usuario);
            cmd = con.prepareStatement(SQL);
            ResultSet rs = cmd.executeQuery();

            List<Object> lista = new ArrayList<>();
            while (rs.next()) {
                Item i = new Item();
                i.setId(rs.getInt("id_item"));
                i.setDesc(rs.getString("desc_item"));
                i.setValor(rs.getFloat("valor_item"));
                i.setFg_ativo(rs.getBoolean("fg_ativo"));
                lista.add(i);
            }
            return lista;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problema ao listar: " + e.getMessage());
            return null;

        } finally {
            Conexao.Desconectar(con);
        }
    }
    
    public List<Object> pesquisarPorId(Usuario usuario, int id){
        try {
            String SQL = "SELECT id_item, desc_item, valor_item\n" +
                         "FROM tb_item\n" +
                         "WHERE id_item = ?\n" +
                         "AND fg_ativo = true;";

            con = Conexao.Conectar(usuario);
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, id);
            
            ResultSet rs = cmd.executeQuery();

            List<Object> lista = new ArrayList<>();
            while (rs.next()) {
                Item i = new Item();
                i.setId(rs.getInt("id_item"));
                i.setDesc(rs.getString("desc_item"));
                i.setValor(rs.getFloat("valor_item"));
                lista.add(i);
            }
            return lista;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problema ao listar: " + e.getMessage());
            return null;

        } finally {
            Conexao.Desconectar(con);
        }
    }
    
    public List<Object> pesquisarPorNome(Usuario usuario, String desc){
        try {
            String SQL = "SELECT id_item, desc_item, valor_item\n" +
                         "FROM tb_item\n" +
                         "WHERE desc_item like ?\n" +
                         "AND fg_ativo = true\n" +
                         "ORDER BY desc_item;";

            con = Conexao.Conectar(usuario);
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, "%" + desc + "%");
            
            ResultSet rs = cmd.executeQuery();

            List<Object> lista = new ArrayList<>();
            while (rs.next()) {
                Item i = new Item();
                i.setId(rs.getInt("id_item"));
                i.setDesc(rs.getString("desc_item"));
                i.setValor(rs.getFloat("valor_item"));
                lista.add(i);
            }
            return lista;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problema ao listar: " + e.getMessage());
            return null;

        } finally {
            Conexao.Desconectar(con);
        }
    }
    
    public int inserir(Usuario u, Item i) {
        try {
            
            String SQL = "INSERT INTO tb_item(desc_item,valor_item,fg_ativo)\n" +
                         "VALUES\n" +
                         "(?,?,?);"; 
            
            con = Conexao.Conectar(u);
            cmd = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            
            cmd.setString(1, i.getDesc());
            cmd.setFloat(2, i.getValor());
            cmd.setBoolean(3, true);
            
            if (cmd.executeUpdate() > 0) {
                ResultSet rs = cmd.getGeneratedKeys();
                return rs.next() ? rs.getInt(1) : -1;
            }
            
            return -1;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
            return -1;
        }finally {
            Conexao.Desconectar(con);
        }
    }
    
    public int atualizar(Usuario u, Item i) {
        try {
            
            String SQL = "UPDATE tb_item\n" +
                         "SET desc_item = ?, valor_item = ?, fg_ativo = ?  \n" +
                         "WHERE id_item = ?;"; 
            
            con = Conexao.Conectar(u);
            cmd = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            
            cmd.setString(1, i.getDesc());
            cmd.setFloat(2, i.getValor());
            cmd.setBoolean(3, i.getFg_ativo());
            cmd.setInt(4, i.getId());
            
            if (cmd.executeUpdate() > 0) {
                ResultSet rs = cmd.getGeneratedKeys();
                return rs.next() ? rs.getInt(1) : -1;
            }
            
            return -1;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
            return -1;
        }finally {
            Conexao.Desconectar(con);
        }
    }
}
