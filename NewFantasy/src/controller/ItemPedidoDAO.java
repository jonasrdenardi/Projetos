package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Pedido;
import model.Usuario;

/**
 *
 * @author Jonas
 */
public class ItemPedidoDAO {

    private Connection con;
    private PreparedStatement cmd;

    public int inserir(Usuario u, Pedido p) {
        try {

            String SQL = "INSERT INTO tb_item_pedido(id_pedido,id_item,qtd_item,valor_item)\n"
                    + "VALUES\n";

            for (int i = 0; i < p.getItem().length; i++) {
                if (i < (p.getItem().length - 1)) {
                    SQL += "(?,?,?,?),\n";
                } else if (i == (p.getItem().length - 1)) {
                    SQL += "(?,?,?,?);";
                }
            }

            con = Conexao.Conectar(u);
            cmd = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
           
            int aux = 1;

            for (int i = 0; i < p.getItem().length; i++) {
                System.out.println("ID Pedido, " + p.getId());
                cmd.setInt(aux, p.getId());
                aux++;
                System.out.println("ID Item, " + p.getItem(i).getId());
                cmd.setInt(aux, p.getItem(i).getId());
                aux++;
                System.out.println("Qtd Item, " + p.getQtdItem(i).getQtdItem());
                cmd.setInt(aux, p.getQtdItem(i).getQtdItem());
                aux++;
                System.out.println("Valor " + p.getItem(i).getValor());
                cmd.setFloat(aux, p.getItem(i).getValor());
                aux++;
            }

            if (cmd.executeUpdate() > 0) {
                ResultSet rs = cmd.getGeneratedKeys();
                return rs.next() ? rs.getInt(1) : -1;
            }

            return -1;

        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
            return -1;

        } finally {
            Conexao.Desconectar(con);
        }
    }
    
    public int deletar(Usuario usuario, int idPedido) {
        try {
            String SQL = "DELETE FROM tb_item_pedido\n" +
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
}
