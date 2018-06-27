package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Item;
import model.Pedido;
import model.Usuario;

public class ItemDAO {
    private Connection con;
    private PreparedStatement cmd;

    public List<Object> listar(Usuario usuario) {
        try {
            String SQL = "SELECT id_item, desc_item, valor_item\n" +
                         "FROM tb_item\n" +
                         "WHERE fg_ativo = true;";

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
            System.out.println("Problema ao listar: " + e.getMessage());
            return null;

        } finally {
            Conexao.Desconectar(con);
        }
    }
}
