package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.Usuario;
import model.Venda;

public class VendaDAO {

    private Connection con; //estabelecer a conexao
    private PreparedStatement cmd; //enviar comando SQL

    public int inserir(Usuario u, Venda v) {
        try {
            
            final String SQL = "insert into db_controle_estoque.venda(id_cliente,data_venda,desconto,valor,fg_ativo)\n" +
                               "values\n" +
                               "(?,?,?,?,?);";
            
            con = controller.Conexao.conectar(u);
            //a execucao da instrucao retornara o valor da chave gerada pelo SGBD
            cmd = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            
            //configurar os parametros da intrucao SQL, sao especificados com o simbolo de interrogacao
            cmd.setInt(1, v.getIdCliente());
            cmd.setDate(2,  new Date(v.getDataVenda().getTime()));
            cmd.setFloat(3, v.getDesconto());
            cmd.setFloat(4, v.getValor());
            cmd.setBoolean(5, true);
            
            //enviar a instrucao SQL para o SGBD
            //resultado maior que 0 significa que o comando foi executado corretamente
            if(cmd.executeUpdate()>0){
                //retornar o novo ID gerado pelo SGBD
                ResultSet rs = cmd.getGeneratedKeys();
                if(rs.next()){
                    return rs.getInt(1);
                }
            }
            
            //algo de errado aconteceu, a instrucao nao foi executada.
            return -1;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
            return -1;

        } finally {
            controller.Conexao.desconectar(con);
        }
    }
}
