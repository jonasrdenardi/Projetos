package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.ProdutoVenda;
import model.Usuario;

public class ProdutoVendaDAO {

    private Connection con; //estabelecer a conexao
    private PreparedStatement cmd; //enviar comando SQL
    
        public int inserir(Usuario u, ProdutoVenda pv[]) {
        try {

            String SQL = "insert into db_controle_estoque.produto_venda(id_venda,id_produto,qtd_produto,preco_produto)\n"
                    + "values\n";

            for (int i = 0; i < pv.length; i++) {
                if (i < (pv.length - 1)) {
                    SQL += "(?,?,?,?),\n";
                } else if (i == (pv.length - 1)) {
                    SQL += "(?,?,?,?);";
                }
            }

            con = controller.Conexao.conectar(u);
            cmd = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
           
            int aux = 1;

            for (int i = 0; i < pv.length; i++) {
                cmd.setInt(aux, pv[i].getIdVenda());
                aux++;
                cmd.setInt(aux, pv[i].getIdProduto());
                aux++;
                cmd.setFloat(aux, pv[i].getQtdProduto());
                aux++;
                cmd.setFloat(aux, pv[i].getValorProduto());
                aux++;
            }

            if (cmd.executeUpdate() > 0) {
                ResultSet rs = cmd.getGeneratedKeys();
                return 1;
            }

            return -1;

        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
            return -1;

        } finally {
            controller.Conexao.desconectar(con);
        }
    }
}
