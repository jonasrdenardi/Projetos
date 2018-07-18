package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Mesa;
import model.Pedido;
import model.Usuario;

public class MesaDAO {
    private Connection con;
    private PreparedStatement cmd;
    
    public List<Object> listarAtiva(Usuario usuario) {
        try {
            String SQL = "SELECT *\n" +
                         "FROM tb_mesa\n" +
                         "WHERE fg_ativo = true\n" +
                         "ORDER BY id_mesa;";

            con = Conexao.Conectar(usuario);
            cmd = con.prepareStatement(SQL);
            ResultSet rs = cmd.executeQuery();

            List<Object> lista = new ArrayList<>();
            while (rs.next()) {
                Mesa m = new Mesa();
                m.setId(rs.getInt("id_mesa"));
                m.setDesc(rs.getString("desc_mesa"));
                lista.add(m);
            }
            return lista;

        } catch (Exception e) {
            System.out.println("Problema ao listar mesas ativas: " + e.getMessage());
            return null;

        } finally {
            Conexao.Desconectar(con);
        }
    }
    
    public List<Object> listarInativa(Usuario usuario) {
        try {
            String SQL = "SELECT *\n" +
                         "FROM tb_mesa\n" +
                         "WHERE fg_ativo = false;";

            con = Conexao.Conectar(usuario);
            cmd = con.prepareStatement(SQL);
            ResultSet rs = cmd.executeQuery();

            List<Object> lista = new ArrayList<>();
            while (rs.next()) {
                Mesa m = new Mesa();
                m.setId(rs.getInt("id_mesa"));
                lista.add(m);
            }
            return lista;

        } catch (Exception e) {
            System.out.println("Problema ao listar mesas ativas: " + e.getMessage());
            return null;

        } finally {
            Conexao.Desconectar(con);
        }
    }
}
