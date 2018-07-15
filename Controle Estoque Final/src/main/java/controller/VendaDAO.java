package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Retorno;
import model.Usuario;
import model.Venda;

public class VendaDAO {

    private Connection con; //estabelecer a conexao
    private PreparedStatement cmd; //enviar comando SQL

    public int inserir(Usuario u, Venda v) {
        try {

            final String SQL = "insert into db_controle_estoque.venda(id_cliente,data_venda,desconto,valor,fg_ativo)\n"
                    + "values\n"
                    + "(?,?,?,?,?);";

            con = controller.Conexao.conectar(u);
            //a execucao da instrucao retornara o valor da chave gerada pelo SGBD
            cmd = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);

            //configurar os parametros da intrucao SQL, sao especificados com o simbolo de interrogacao
            cmd.setInt(1, v.getIdCliente());
            cmd.setDate(2, new Date(v.getDataVenda().getTime()));
            cmd.setFloat(3, v.getDesconto());
            cmd.setFloat(4, v.getValor());
            cmd.setBoolean(5, true);

            //enviar a instrucao SQL para o SGBD
            //resultado maior que 0 significa que o comando foi executado corretamente
            if (cmd.executeUpdate() > 0) {
                //retornar o novo ID gerado pelo SGBD
                ResultSet rs = cmd.getGeneratedKeys();
                if (rs.next()) {
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

    //LISTAR TODOS OS REGISTROS DA TABELA
    public List<Venda> listar(Usuario usuario) {
        try {
            String SQL = "select * from db_controle_estoque.venda order by id";

            con = controller.Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);

            //retornar o resultado da consulta
            ResultSet rs = cmd.executeQuery();

            //declarar uma lista dinamica para armazenar os resultados
            List<Venda> resultado = new ArrayList<>();

            //percorrer os dados no resultset
            //se rs.next() = true significa que dados foram retornados
            while (rs.next()) {

                //criar um objeto venda
                Venda venda = new Venda();
                venda.setId(rs.getInt("id"));
                venda.setIdCliente(rs.getInt("id_cliente"));
                venda.setDataVenda(rs.getDate("data_venda"));
                venda.setDesconto(rs.getFloat("desconto"));
                venda.setValor(rs.getFloat("valor"));
                venda.setFg_ativo(rs.getBoolean("fg_ativo"));

                //adiciona a lista
                resultado.add(venda);
            }
            return resultado;

        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }

    public List<Retorno> listarClienteVenda(Usuario usuario) {
        try {
            String SQL = "SELECT v.id as 'id_venda', c.nome, v.data_venda, v.desconto, v.valor\n"
                    + "FROM venda as v\n"
                    + "INNER JOIN cliente as c ON (v.id_cliente = c.id)\n"
                    + "ORDER BY v.data_venda desc";

            con = controller.Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);

            //retornar o resultado da consulta
            ResultSet rs = cmd.executeQuery();

            List<Retorno> retornos = new ArrayList<>();

            //percorrer os dados no resultset
            //se rs.next() = true significa que dados foram retornados
            while (rs.next()) {
                Retorno retorno = new Retorno();
                //criar um objeto venda
                retorno.venda.setId(rs.getInt("id_venda"));
                retorno.cliente.setNome(rs.getString("nome"));
                retorno.venda.setDataVenda(rs.getDate("data_venda"));
                retorno.venda.setDesconto(rs.getFloat("desconto"));
                retorno.venda.setValor(rs.getFloat("valor"));

                //adiciona a lista
                retornos.add(retorno);
            }
            return retornos;

        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }

    public List<Retorno> pesquisarClienteVendaPorId(Usuario usuario, int idVenda) {
        try {
            String SQL = "SELECT v.id as 'id_venda', c.nome, v.data_venda, v.desconto, v.valor\n"
                       + "FROM venda as v\n"
                       + "INNER JOIN cliente as c ON (v.id_cliente = c.id)\n"
                       + "WHERE v.id = ?\n"
                       + "ORDER BY v.data_venda desc";

            con = controller.Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);

            cmd.setInt(1, idVenda);
            //retornar o resultado da consulta
            ResultSet rs = cmd.executeQuery();

            List<Retorno> retornos = new ArrayList<>();

            //percorrer os dados no resultset
            //se rs.next() = true significa que dados foram retornados
            while (rs.next()) {
                Retorno retorno = new Retorno();
                //criar um objeto venda
                retorno.venda.setId(rs.getInt("id_venda"));
                retorno.cliente.setNome(rs.getString("nome"));
                retorno.venda.setDataVenda(rs.getDate("data_venda"));
                retorno.venda.setDesconto(rs.getFloat("desconto"));
                retorno.venda.setValor(rs.getFloat("valor"));

                //adiciona a lista
                retornos.add(retorno);
            }
            return retornos;

        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }
    
    public List<Retorno> pesquisarClienteVendaPorData(Usuario usuario, java.util.Date dataInicio, java.util.Date dataFim) {
        try {
            String SQL = "SELECT v.id as 'id_venda', c.nome, v.data_venda, v.desconto, v.valor\n"
                       + "FROM venda as v\n"
                       + "INNER JOIN cliente as c ON (v.id_cliente = c.id)\n"
                       + "WHERE data_venda BETWEEN ? AND ?\n"
                       + "ORDER BY v.data_venda desc";

            con = controller.Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);

            cmd.setDate(1,  new Date(dataInicio.getTime()));
            cmd.setDate(2,  new Date(dataFim.getTime()));
            //retornar o resultado da consulta
            ResultSet rs = cmd.executeQuery();

            List<Retorno> retornos = new ArrayList<>();

            //percorrer os dados no resultset
            //se rs.next() = true significa que dados foram retornados
            while (rs.next()) {
                Retorno retorno = new Retorno();
                //criar um objeto venda
                retorno.venda.setId(rs.getInt("id_venda"));
                retorno.cliente.setNome(rs.getString("nome"));
                retorno.venda.setDataVenda(rs.getDate("data_venda"));
                retorno.venda.setDesconto(rs.getFloat("desconto"));
                retorno.venda.setValor(rs.getFloat("valor"));

                //adiciona a lista
                retornos.add(retorno);
            }
            return retornos;

        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }
    
    public List<Retorno> pesquisarClienteVendaPorNome(Usuario usuario, String data) {
        try {
            String SQL = "SELECT v.id as 'id_venda', c.nome, v.data_venda, v.desconto, v.valor\n"
                       + "FROM venda as v\n"
                       + "INNER JOIN cliente as c ON (v.id_cliente = c.id)\n"
                       + "WHERE c.nome like ?\n"
                       + "ORDER BY v.data_venda desc";

            con = controller.Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);

            cmd.setString(1, "%" + data + "%");
            //retornar o resultado da consulta
            ResultSet rs = cmd.executeQuery();

            List<Retorno> retornos = new ArrayList<>();

            //percorrer os dados no resultset
            //se rs.next() = true significa que dados foram retornados
            while (rs.next()) {
                Retorno retorno = new Retorno();
                //criar um objeto venda
                retorno.venda.setId(rs.getInt("id_venda"));
                retorno.cliente.setNome(rs.getString("nome"));
                retorno.venda.setDataVenda(rs.getDate("data_venda"));
                retorno.venda.setDesconto(rs.getFloat("desconto"));
                retorno.venda.setValor(rs.getFloat("valor"));

                //adiciona a lista
                retornos.add(retorno);
            }
            return retornos;

        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }

    public List<Venda> pesquisarPorData(Usuario usuario, String data) {
        try {
            String SQL = "select * from db_controle_estoque.venda where data_venda like ?";

            con = controller.Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, "%" + data + "%");

            //retornar o resultado da consulta
            ResultSet rs = cmd.executeQuery();

            //declarar uma lista dinamica para armazenar os resultados
            List<Venda> resultado = new ArrayList<>();

            //percorrer os dados no resultset
            //se rs.next() = true significa que dados foram retornados
            while (rs.next()) {

                //criar um objeto venda
                Venda venda = new Venda();
                venda.setId(rs.getInt("id"));
                venda.setIdCliente(rs.getInt("id_cliente"));
                venda.setDataVenda(rs.getDate("data_venda"));
                venda.setDesconto(rs.getFloat("desconto"));
                venda.setValor(rs.getFloat("valor"));
                venda.setFg_ativo(rs.getBoolean("fg_ativo"));

                //adiciona a lista
                resultado.add(venda);
            }
            return resultado;

        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }

    public List<Venda> pesquisarPorId(Usuario usuario, int id) {
        try {
            String SQL = "select * from db_controle_estoque.venda where id=?";

            con = controller.Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, id);

            //retornar o resultado da consulta
            ResultSet rs = cmd.executeQuery();

            //declarar uma lista dinamica para armazenar os resultados
            List<Venda> resultado = new ArrayList<>();

            //percorrer os dados no resultset
            //se rs.next() = true significa que dados foram retornados
            while (rs.next()) {

                //criar um objeto venda
                Venda venda = new Venda();
                venda.setId(rs.getInt("id"));
                venda.setIdCliente(rs.getInt("id_cliente"));
                venda.setDataVenda(rs.getDate("data_venda"));
                venda.setDesconto(rs.getFloat("desconto"));
                venda.setValor(rs.getFloat("valor"));
                venda.setFg_ativo(rs.getBoolean("fg_ativo"));

                //adiciona a lista
                resultado.add(venda);
            }
            return resultado;

        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }

    public Venda get(Usuario usuario, String id) {
        try {
            String SQL = "select * from db_controle_estoque.venda where id=?";

            con = controller.Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, id);

            //retornar o resultado da consulta
            ResultSet rs = cmd.executeQuery();

            //percorrer os dados no resultset
            //se rs.next() = true significa que dados foram retornados
            while (rs.next()) {

                //criar um objeto venda
                Venda venda = new Venda();
                venda.setId(rs.getInt("id"));
                venda.setIdCliente(rs.getInt("id_cliente"));
                venda.setDataVenda(rs.getDate("data_venda"));
                venda.setDesconto(rs.getFloat("desconto"));
                venda.setValor(rs.getFloat("valor"));
                venda.setFg_ativo(rs.getBoolean("fg_ativo"));

                //adiciona a lista
                return venda;
            }
            return null;

        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }
}
