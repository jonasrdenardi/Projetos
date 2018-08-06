package controller;

import java.sql.Connection;
import java.sql.Date;
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

    public List<Retorno> listarVendaEClienteERecebimentoAberto(Usuario usuario) {
        try {
            String SQL = "SELECT DISTINCT v.id, c.nome, v.data_venda, v.desconto, v.valor\n"
                    + "FROM venda as v\n"
                    + "INNER JOIN cliente as c ON (v.id_cliente = c.id)\n"
                    + "INNER JOIN recebimento as r ON (v.id = r.id_venda)\n"
                    + "where v.fg_ativo = false\n"
                    + "AND r.fg_ativo = true\n"
                    + "ORDER BY v.data_venda desc;";

            con = controller.Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);

            //retornar o resultado da consulta
            ResultSet rs = cmd.executeQuery();

            //declarar uma lista dinamica para armazenar os resultados
            List<Retorno> retornos = new ArrayList<>();

            //percorrer os dados no resultset
            //se rs.next() = true significa que dados foram retornados
            while (rs.next()) {
                Retorno retorno = new Retorno();
                //criar um objeto produto
                retorno.venda.setId(rs.getInt("id"));
                retorno.cliente.setNome(rs.getString("nome"));
                retorno.venda.setDataVenda(rs.getDate("data_venda"));
                retorno.venda.setDesconto(rs.getFloat("desconto"));
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

    public List<Retorno> listarVendaEClienteERecebimento(Usuario usuario) {
        try {
            String SQL = "SELECT DISTINCT v.id, c.nome, v.data_venda, v.desconto, v.valor\n"
                    + "FROM venda as v\n"
                    + "INNER JOIN cliente as c ON (v.id_cliente = c.id)\n"
                    + "INNER JOIN recebimento as r ON (v.id = r.id_venda)\n"
                    + "ORDER BY v.data_venda desc;";

            con = controller.Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);

            //retornar o resultado da consulta
            ResultSet rs = cmd.executeQuery();

            //declarar uma lista dinamica para armazenar os resultados
            List<Retorno> retornos = new ArrayList<>();

            //percorrer os dados no resultset
            //se rs.next() = true significa que dados foram retornados
            while (rs.next()) {
                Retorno retorno = new Retorno();
                //criar um objeto produto
                retorno.venda.setId(rs.getInt("id"));
                retorno.cliente.setNome(rs.getString("nome"));
                retorno.venda.setDataVenda(rs.getDate("data_venda"));
                retorno.venda.setDesconto(rs.getFloat("desconto"));
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

    public List<Retorno> listarRelatorioVendaEClienteERecebimento(Usuario usuario) {
        try {
            String SQL = "SELECT r.id,r.id_venda, r.num_parcela, c.nome, v.data_venda, r.data_recebimento,\n"
                    + "	  r.valor_recebido, r.modo_pgto,r.fg_ativo,c.id,v.desconto,v.valor\n"
                    + "FROM recebimento as r\n"
                    + "INNER JOIN venda as v ON (r.id_venda = v.id)\n"
                    + "INNER JOIN cliente as c ON (v.id_cliente = c.id)\n"
                    + "ORDER BY r.id desc;";

            con = controller.Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);

            //retornar o resultado da consulta
            ResultSet rs = cmd.executeQuery();

            //declarar uma lista dinamica para armazenar os resultados
            List<Retorno> retornos = new ArrayList<>();

            //percorrer os dados no resultset
            //se rs.next() = true significa que dados foram retornados
            while (rs.next()) {
                Retorno retorno = new Retorno();
                //criar um objeto produto
                retorno.recebimento.setId(rs.getInt("id"));
                retorno.recebimento.setId_venda(rs.getInt("id_venda"));
                retorno.recebimento.setNum_parcela(rs.getInt("num_parcela"));
                retorno.cliente.setNome(rs.getString("nome"));
                retorno.venda.setDataVenda(rs.getDate("data_venda"));
                retorno.recebimento.setData_recebimento(rs.getDate("data_recebimento"));
                retorno.recebimento.setValor_recebido(rs.getFloat("valor_recebido"));
                retorno.recebimento.setModo_Pgto(rs.getString("modo_pgto"));
                retorno.recebimento.setFg_ativo(rs.getBoolean("fg_ativo"));
                retorno.cliente.setId(rs.getInt("id"));
                retorno.venda.setDesconto(rs.getFloat("desconto"));
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
    public List<Retorno> listarRelatorioVendaEClienteERecebimentoPorIdVenda(Usuario usuario,int idVenda) {
        try {
            String SQL = "SELECT r.id,r.id_venda, r.num_parcela, c.nome, v.data_venda, r.data_recebimento,\n"
                    + "	  r.valor_recebido, r.modo_pgto,r.fg_ativo,c.id,v.desconto,v.valor\n"
                    + "FROM recebimento as r\n"
                    + "INNER JOIN venda as v ON (r.id_venda = v.id)\n"
                    + "INNER JOIN cliente as c ON (v.id_cliente = c.id)\n"
                    + "WHERE r.id_venda = ?\n"
                    + "ORDER BY r.id desc;";

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
                retorno.recebimento.setId(rs.getInt("id"));
                retorno.recebimento.setId_venda(rs.getInt("id_venda"));
                retorno.recebimento.setNum_parcela(rs.getInt("num_parcela"));
                retorno.cliente.setNome(rs.getString("nome"));
                retorno.venda.setDataVenda(rs.getDate("data_venda"));
                retorno.recebimento.setData_recebimento(rs.getDate("data_recebimento"));
                retorno.recebimento.setValor_recebido(rs.getFloat("valor_recebido"));
                retorno.recebimento.setModo_Pgto(rs.getString("modo_pgto"));
                retorno.recebimento.setFg_ativo(rs.getBoolean("fg_ativo"));
                retorno.cliente.setId(rs.getInt("id"));
                retorno.venda.setDesconto(rs.getFloat("desconto"));
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
    public List<Retorno> listarRelatorioVendaEClienteERecebimentoPorNome(Usuario usuario, String cliente) {
        try {
            String SQL = "SELECT r.id,r.id_venda, r.num_parcela, c.nome, v.data_venda, r.data_recebimento,\n"
                    + "	  r.valor_recebido, r.modo_pgto,r.fg_ativo,c.id,v.desconto,v.valor\n"
                    + "FROM recebimento as r\n"
                    + "INNER JOIN venda as v ON (r.id_venda = v.id)\n"
                    + "INNER JOIN cliente as c ON (v.id_cliente = c.id)\n"
                    + "WHERE c.nome like ?\n"
                    + "ORDER BY r.id desc;";

            con = controller.Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);
            
            cmd.setString(1, "%" + cliente + "%");

            //retornar o resultado da consulta
            ResultSet rs = cmd.executeQuery();

            //declarar uma lista dinamica para armazenar os resultados
            List<Retorno> retornos = new ArrayList<>();

            //percorrer os dados no resultset
            //se rs.next() = true significa que dados foram retornados
            while (rs.next()) {
                Retorno retorno = new Retorno();
                //criar um objeto produto
                retorno.recebimento.setId(rs.getInt("id"));
                retorno.recebimento.setId_venda(rs.getInt("id_venda"));
                retorno.recebimento.setNum_parcela(rs.getInt("num_parcela"));
                retorno.cliente.setNome(rs.getString("nome"));
                retorno.venda.setDataVenda(rs.getDate("data_venda"));
                retorno.recebimento.setData_recebimento(rs.getDate("data_recebimento"));
                retorno.recebimento.setValor_recebido(rs.getFloat("valor_recebido"));
                retorno.recebimento.setModo_Pgto(rs.getString("modo_pgto"));
                retorno.recebimento.setFg_ativo(rs.getBoolean("fg_ativo"));
                retorno.cliente.setId(rs.getInt("id"));
                retorno.venda.setDesconto(rs.getFloat("desconto"));
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
    public List<Retorno> listarRelatorioVendaEClienteERecebimentoPorData(Usuario usuario, java.util.Date dataInicio, java.util.Date dataFim) {
        try {
            String SQL = "SELECT r.id,r.id_venda, r.num_parcela, c.nome, v.data_venda, r.data_recebimento,\n"
                    + "	  r.valor_recebido, r.modo_pgto,r.fg_ativo,c.id,v.desconto,v.valor\n"
                    + "FROM recebimento as r\n"
                    + "INNER JOIN venda as v ON (r.id_venda = v.id)\n"
                    + "INNER JOIN cliente as c ON (v.id_cliente = c.id)\n"
                    + "WHERE v.data_venda BETWEEN ? AND ?\n"
                    + "ORDER BY r.id desc;";

            con = controller.Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);
            
            cmd.setDate(1, new Date(dataInicio.getTime()));
            cmd.setDate(2, new Date(dataFim.getTime()));

            //retornar o resultado da consulta
            ResultSet rs = cmd.executeQuery();

            //declarar uma lista dinamica para armazenar os resultados
            List<Retorno> retornos = new ArrayList<>();

            //percorrer os dados no resultset
            //se rs.next() = true significa que dados foram retornados
            while (rs.next()) {
                Retorno retorno = new Retorno();
                //criar um objeto produto
                retorno.recebimento.setId(rs.getInt("id"));
                retorno.recebimento.setId_venda(rs.getInt("id_venda"));
                retorno.recebimento.setNum_parcela(rs.getInt("num_parcela"));
                retorno.cliente.setNome(rs.getString("nome"));
                retorno.venda.setDataVenda(rs.getDate("data_venda"));
                retorno.recebimento.setData_recebimento(rs.getDate("data_recebimento"));
                retorno.recebimento.setValor_recebido(rs.getFloat("valor_recebido"));
                retorno.recebimento.setModo_Pgto(rs.getString("modo_pgto"));
                retorno.recebimento.setFg_ativo(rs.getBoolean("fg_ativo"));
                retorno.cliente.setId(rs.getInt("id"));
                retorno.venda.setDesconto(rs.getFloat("desconto"));
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

    public List<Retorno> listarVendaEClienteERecebimentoPesquisarPorId(Usuario usuario, int idVenda) {
        try {
            String SQL = "SELECT DISTINCT v.id, c.nome, v.data_venda, v.desconto, v.valor\n"
                    + "FROM venda as v\n"
                    + "INNER JOIN cliente as c ON (v.id_cliente = c.id)\n"
                    + "INNER JOIN recebimento as r ON (v.id = r.id_venda)\n"
                    + "WHERE v.id = ?\n"
                    + "ORDER BY v.data_venda desc;";

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
                retorno.venda.setId(rs.getInt("id"));
                retorno.cliente.setNome(rs.getString("nome"));
                retorno.venda.setDataVenda(rs.getDate("data_venda"));
                retorno.venda.setDesconto(rs.getFloat("desconto"));
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

    public List<Retorno> listarVendaEClienteERecebimentoPesquisarPorNome(Usuario usuario, String nome) {
        try {
            String SQL = "SELECT DISTINCT v.id, c.nome, v.data_venda, v.desconto, v.valor\n"
                    + "FROM venda as v\n"
                    + "INNER JOIN cliente as c ON (v.id_cliente = c.id)\n"
                    + "INNER JOIN recebimento as r ON (v.id = r.id_venda)\n"
                    + "WHERE c.nome like ?\n"
                    + "ORDER BY v.data_venda desc;";

            con = controller.Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);

            cmd.setString(1, "%" + nome + "%");

            //retornar o resultado da consulta
            ResultSet rs = cmd.executeQuery();

            //declarar uma lista dinamica para armazenar os resultados
            List<Retorno> retornos = new ArrayList<>();

            //percorrer os dados no resultset
            //se rs.next() = true significa que dados foram retornados
            while (rs.next()) {
                Retorno retorno = new Retorno();
                //criar um objeto produto
                retorno.venda.setId(rs.getInt("id"));
                retorno.cliente.setNome(rs.getString("nome"));
                retorno.venda.setDataVenda(rs.getDate("data_venda"));
                retorno.venda.setDesconto(rs.getFloat("desconto"));
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

    public List<Retorno> listarVendaEClienteERecebimentoPesquisarPorData(Usuario usuario, java.util.Date dataInicio, java.util.Date dataFim) {
        try {
            String SQL = "SELECT DISTINCT v.id, c.nome, v.data_venda, v.desconto, v.valor\n"
                    + "FROM venda as v\n"
                    + "INNER JOIN cliente as c ON (v.id_cliente = c.id)\n"
                    + "INNER JOIN recebimento as r ON (v.id = r.id_venda)\n"
                    + "WHERE v.data_venda BETWEEN ? AND ?\n"
                    + "ORDER BY v.data_venda desc;";

            con = controller.Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);

            cmd.setDate(1, new Date(dataInicio.getTime()));
            cmd.setDate(2, new Date(dataFim.getTime()));

            //retornar o resultado da consulta
            ResultSet rs = cmd.executeQuery();

            //declarar uma lista dinamica para armazenar os resultados
            List<Retorno> retornos = new ArrayList<>();

            //percorrer os dados no resultset
            //se rs.next() = true significa que dados foram retornados
            while (rs.next()) {
                Retorno retorno = new Retorno();
                //criar um objeto produto
                retorno.venda.setId(rs.getInt("id"));
                retorno.cliente.setNome(rs.getString("nome"));
                retorno.venda.setDataVenda(rs.getDate("data_venda"));
                retorno.venda.setDesconto(rs.getFloat("desconto"));
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
