package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Retorno;
import model.Usuario;

public class RetornoDAO {

    private Connection con; //estabelecer a conexao
    private PreparedStatement cmd; //enviar comando SQL

    public List<Retorno> listarVendaEProdutoVendaEProduto(Usuario usuario, int idVenda) {
        try {
            String SQL = "SELECT pv.id_produto, p.descricao,p.qtd, pv.qtd_produto, pv.preco_produto,v.desconto, v.data_venda, v.valor\n"
                    + "FROM produto_venda as pv\n"
                    + "INNER JOIN produto as p ON (pv.id_produto = p.id)\n"
                    + "INNER JOIN venda as v ON (pv.id_venda = v.id)\n"
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
                retorno.produto.setId(rs.getInt("id_produto"));
                retorno.produto.setDescricao(rs.getString("descricao"));
                retorno.produto.setQtd(rs.getFloat("qtd"));
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
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }

    public List<Retorno> listarRecebimentoEClienteEVenda(Usuario usuario, int idVenda) {
        try {
            String SQL = "SELECT c.id as 'id_cliente', c.nome, r.id as 'id_recebimento', r.num_parcela, r.data_recebimento, r.valor_recebido, r.modo_pgto,\n"
                    + "r.id_venda, v.desconto, v.data_venda, v.valor\n"
                    + "FROM recebimento as r\n"
                    + "INNER JOIN venda as v ON (r.id_venda = v.id)\n"
                    + "INNER JOIN cliente as c ON (v.id_cliente = c.id)"
                    + "WHERE r.id_venda = ?;";

            con = controller.Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);
            
            cmd.setInt(1, idVenda);

            //retornar o resultado da consulta
            ResultSet rs = cmd.executeQuery();

            //declarar uma lista dinamica para armazenar os resultados
            List<Retorno> retornos = new ArrayList<>();

            //percorrer os dados no resultset
            //se rs.next() = true significa que dados foram retornados
            while (rs.next()) {
                Retorno retorno = new Retorno();
                //criar um objeto produto
                retorno.cliente.setId(rs.getInt("id_cliente"));
                retorno.cliente.setNome(rs.getString("nome"));
                retorno.recebimento.setId(rs.getInt("id_recebimento"));
                retorno.recebimento.setNum_parcela(rs.getInt("num_parcela"));
                retorno.recebimento.setData_recebimento(rs.getDate("data_recebimento"));
                retorno.recebimento.setValor_recebido(rs.getFloat("valor_recebido"));
                retorno.recebimento.setModo_Pgto(rs.getString("modo_pgto"));
                retorno.venda.setId(rs.getInt("id_venda"));
                retorno.venda.setDesconto(rs.getFloat("desconto"));
                retorno.venda.setDataVenda(rs.getDate("data_venda"));
                retorno.venda.setValor(rs.getFloat("valor"));
                
                //adiciona a lista
                retornos.add(retorno);
            }
            return retornos;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }

}
