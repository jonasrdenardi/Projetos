package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Produto;
import model.ProdutoVenda;
import model.Retorno;
import model.Usuario;
import model.Venda;

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
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
            return -1;

        } finally {
            controller.Conexao.desconectar(con);
        }
    }

    public List<Retorno> listar(Usuario usuario, int idVenda) {
        try {
            String SQL = "SELECT c.id as 'id_cliente',c.nome,pv.id_produto, p.descricao, pv.qtd_produto, pv.preco_produto,v.desconto, v.data_venda, v.valor\n"
                    + "FROM produto_venda as pv\n"
                    + "INNER JOIN produto as p ON (pv.id_produto = p.id)\n"
                    + "INNER JOIN venda as v ON (pv.id_venda = v.id)\n"
                    + "INNER JOIN cliente as c ON (v.id_cliente = c.id)\n"
                    + "WHERE pv.id_venda = ?;";

            con = controller.Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);

            cmd.setInt(1, idVenda);

            //retornar o resultado da consulta
            ResultSet rs = cmd.executeQuery();

            //declarar uma lista dinamica para armazenar os resultados
            List<Retorno> retornos = new ArrayList<Retorno>();

            //percorrer os dados no resultset
            //se rs.next() = true significa que dados foram retornados
            while (rs.next()) {
                Retorno retorno = new Retorno();
                //criar um objeto produto
                retorno.cliente.setId(rs.getInt("id_cliente"));
                retorno.cliente.setNome(rs.getString("nome"));
                retorno.produto.setId(rs.getInt("id_produto"));
                retorno.produto.setDescricao(rs.getString("descricao"));
                retorno.produtoVenda.setQtdProduto(rs.getFloat("qtd_produto"));
                retorno.produtoVenda.setValorProduto(rs.getFloat("preco_produto"));
                retorno.venda.setDesconto(rs.getFloat("desconto"));
                retorno.venda.setDataVenda(rs.getDate("data_venda"));
                retorno.venda.setValor(rs.getFloat("valor"));
                //adiciona a lista
                retornos.add(retorno);
            }
            return retornos;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }

    public int deletar(Usuario u, int idVenda) {
        try {

            final String SQL = "DELETE FROM produto_venda\n"
                    + "WHERE id_venda = ?;";

            con = controller.Conexao.conectar(u);
            
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, idVenda);

            //enviar a instrucao SQL para o SGBD
            //resultado maior que 0 significa que o comando foi executado corretamente
            int retorno = cmd.executeUpdate();

            if (retorno > 0) {
                return retorno;
            }
            //algo de errado aconteceu, a instrucao nao foi executada.
            return -1;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
            return -1;

        } finally {
            controller.Conexao.desconectar(con);
        }
    }
}
