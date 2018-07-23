package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Recebimento;
import model.Usuario;

public class RecebimentoDAO {

    private Connection con; //estabelecer a conexao
    private PreparedStatement cmd; //enviar comando SQL

    public RecebimentoDAO() {

    }

    public int inserir(Usuario usuario, Recebimento r) {
        try {

            final String SQL = "insert into db_controle_estoque.recebimento (num_parcela,data_recebimento,valor_recebido,modo) values (?,?,?,?)";

            con = controller.Conexao.conectar(usuario);
            //a execucao da instrucao retornara o valor da chave gerada pelo SGBD
            cmd = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);

            //configurar os parametros da intrucao SQL, sao especificados com o simbolo de interrogacao
            cmd.setFloat(1, r.getNum_parcela());
            cmd.setDate(2, new Date(r.getData_recebimento().getTime()));
            cmd.setFloat(3, r.getValor_recebido());
            cmd.setString(4, r.getModo_Pgto());

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
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return -1;
        } finally {
            controller.Conexao.desconectar(con);
        }
    }

    public int atualizar(Usuario usuario, Recebimento r) {
        try {

            final String SQL = "update db_controle_estoque.recebimento set num_parcela=?,data_recebimento=?,valor_recebido=?,modo=? where id=?";

            con = controller.Conexao.conectar(usuario);
            //a execucao da instrucao retornara o valor da chave gerada pelo SGBD
            cmd = con.prepareStatement(SQL);

            //configurar os parametros da intrucao SQL, sao especificados com o simbolo de interrogacao
            cmd.setFloat(1, r.getNum_parcela());
            cmd.setDate(2, new Date(r.getData_recebimento().getTime()));
            cmd.setFloat(3, r.getValor_recebido());
            cmd.setString(4, r.getModo_Pgto());
            cmd.setInt(5, r.getId());

            //enviar a instrucao SQL para o SGBD
            //resultado maior que 0 significa que o comando foi executado corretamente
            if (cmd.executeUpdate() > 0) {
                return r.getId();
            }

            //algo de errado aconteceu, a instrucao nao foi executada.
            return -1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return -1;
        } finally {
            Conexao.desconectar(con);
        }
    }

    public int remover(Usuario usuario, int id) {
        try {

            final String SQL = "delete from db_controle_estoque.recebimento where id=?";

            con = controller.Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, id);

            return cmd.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return -1;
        } finally {
            Conexao.desconectar(con);
        }
    }
    
    //LISTAR TODOS OS REGISTROS DA TABELA
    public List<Recebimento> listar(Usuario usuario){
        try {
            String SQL = "select * from db_controle_estoque.recebimento order by data_recebimento";
            
            con = controller.Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);
            
            //retornar o resultado da consulta
            ResultSet rs = cmd.executeQuery();
            
            //declarar uma lista dinamica para armazenar os resultados
            List<Recebimento> resultado = new ArrayList<>();
            
            //percorrer os dados no resultset
            //se rs.next() = true significa que dados foram retornados
            while(rs.next()){
                
                //criar um objeto produto
                Recebimento r = new Recebimento();
                r.setId(rs.getInt("id"));
                r.setNum_parcela(rs.getInt("num_parcela"));
                
                //Valor do banco esta vindo com 1 dia a menos por conta da timezone
                java.util.Date dataSomada = rs.getDate("data_recebimento");
                dataSomada.setDate(dataSomada.getDate());
                r.setData_recebimento(dataSomada);
                
                r.setValor_recebido(rs.getFloat("valor_recebido"));
                r.setModo_Pgto(rs.getString("modo"));

                //adiciona a lista
                resultado.add(r);
            }       
            return resultado;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }finally{
            Conexao.desconectar(con);
        }
    }
    
    public List<Recebimento> pesquisarPorDataRecebimento(Usuario usuario, Date data){
        try {
            String SQL = "select * from db_controle_estoque.recebimento where data_recebimento = ? order by data_recebimento;";
            
            con = controller.Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);
            cmd.setDate(1, data);
            
            //retornar o resultado da consulta
            ResultSet rs = cmd.executeQuery();
            
            //declarar uma lista dinamica para armazenar os resultados
            List<Recebimento> resultado = new ArrayList<>();
            
            //percorrer os dados no resultset
            //se rs.next() = true significa que dados foram retornados
            while(rs.next()){
                
                //criar um objeto produto
                Recebimento r = new Recebimento();
                r.setId(rs.getInt("id"));
                r.setNum_parcela(rs.getInt("num_parcela"));
                
                //Valor do banco esta vindo com 1 dia a menos por conta da timezone
                java.util.Date dataSomada = rs.getDate("data_recebimento");
                dataSomada.setDate(dataSomada.getDate());
                r.setData_recebimento(dataSomada);
                
                r.setValor_recebido(rs.getFloat("valor_recebido"));
                r.setModo_Pgto(rs.getString("modo"));
                
                //adiciona a lista
                resultado.add(r);
            }       
            return resultado;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }finally{
            Conexao.desconectar(con);
        }
    }
    
    public List<Recebimento> pesquisarPorId(Usuario usuario, int id){
        try {
            String SQL = "select * from db_controle_estoque.recebimento where id=? order by data_recebimento";
            
            con = controller.Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, id);
            
            //retornar o resultado da consulta
            ResultSet rs = cmd.executeQuery();
            
            //declarar uma lista dinamica para armazenar os resultados
            List<Recebimento> resultado = new ArrayList<>();
            
            //percorrer os dados no resultset
            //se rs.next() = true significa que dados foram retornados
            while(rs.next()){
                
                //criar um objeto produto
                Recebimento r = new Recebimento();
                r.setId(rs.getInt("id"));
                r.setNum_parcela(rs.getInt("num_parcela"));
                
                //Valor do banco esta vindo com 1 dia a menos por conta da timezone
                java.util.Date dataSomada = rs.getDate("data_recebimento");
                dataSomada.setDate(dataSomada.getDate());
                r.setData_recebimento(dataSomada);
                
                r.setValor_recebido(rs.getFloat("valor_recebido"));
                r.setModo_Pgto(rs.getString("modo"));
                
                //adiciona a lista
                resultado.add(r);
            }       
            return resultado;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }finally{
            Conexao.desconectar(con);
        }
    }

}
