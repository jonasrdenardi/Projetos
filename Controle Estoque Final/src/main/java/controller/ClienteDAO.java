package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import model.Produto;
import model.Usuario;

/**
 *
 * @author diego
 */
public class ClienteDAO {
    
    private Connection con; //estabelecer a conexao
    private PreparedStatement cmd; //enviar comando SQL
    
    public ClienteDAO(){
        
    }
    
    public int inserir(Usuario usuario, Cliente c){
        try {
            
            final String SQL = "insert into db_controle_estoque.cliente (nome,telefone,cpf,fg_ativo) values (?,?,?,?)";
            
            con = controller.Conexao.conectar(usuario);
            //a execucao da instrucao retornara o valor da chave gerada pelo SGBD
            cmd = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            
            //configurar os parametros da intrucao SQL, sao especificados com o simbolo de interrogacao
            cmd.setString(1, c.getNome());
            cmd.setString(2, c.getTelefone());
            cmd.setString(3, c.getCpf());
            cmd.setBoolean(4, true);
            
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
            System.out.println("ERRO: " + e.getMessage());
            return -1;
        }finally{
            controller.Conexao.desconectar(con);
        }
    }
    
    public int atualizar(Usuario usuario, Cliente c){
        try {
            
            final String SQL = "update db_controle_estoque.cliente set nome=?,telefone=?,cpf=?, fg_ativo=? where id=?";
            
            con = controller.Conexao.conectar(usuario);
            //a execucao da instrucao retornara o valor da chave gerada pelo SGBD
            cmd = con.prepareStatement(SQL);
            
            //configurar os parametros da intrucao SQL, sao especificados com o simbolo de interrogacao
            cmd.setString(1, c.getNome());
            cmd.setString(2, c.getTelefone());
            cmd.setString(3, c.getCpf());
            cmd.setBoolean(4, c.getFg_ativo());            
            cmd.setInt(5, c.getId());
                        
            //enviar a instrucao SQL para o SGBD
            //resultado maior que 0 significa que o comando foi executado corretamente
            if(cmd.executeUpdate()>0){
                return c.getId();
            }
            
            //algo de errado aconteceu, a instrucao nao foi executada.
            return -1;
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return -1;
        }finally{
            Conexao.desconectar(con);
        }
    }
    
    public int remover(Usuario usuario, int id){
        try {
            
            final String SQL = "delete from db_controle_estoque.produto where id=?";
            
            con = controller.Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, id);
 
            return cmd.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return -1;
        }finally{
            Conexao.desconectar(con);
        }
    }
    
    //LISTAR TODOS OS REGISTROS DA TABELA
    public List<Cliente> listar(Usuario usuario){
        try {
            String SQL = "select * from db_controle_estoque.cliente order by nome";
            
            con = controller.Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);
            
            //retornar o resultado da consulta
            ResultSet rs = cmd.executeQuery();
            
            //declarar uma lista dinamica para armazenar os resultados
            List<Cliente> resultado = new ArrayList<>();
            
            //percorrer os dados no resultset
            //se rs.next() = true significa que dados foram retornados
            while(rs.next()){
                
                //criar um objeto produto
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setFg_ativo(rs.getBoolean("fg_ativo"));
                
                //adiciona a lista
                resultado.add(cliente);
            }       
            return resultado;
            
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return null;
        }finally{
            Conexao.desconectar(con);
        }
    }
    
    public List<Cliente> pesquisarPorNome(Usuario usuario, String descricao){
        try {
            String SQL = "select * from db_controle_estoque.cliente where nome like ? order by nome";
            
            con = controller.Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, "%" + descricao + "%");
            
            //retornar o resultado da consulta
            ResultSet rs = cmd.executeQuery();
            
            //declarar uma lista dinamica para armazenar os resultados
            List<Cliente> resultado = new ArrayList<>();
            
            //percorrer os dados no resultset
            //se rs.next() = true significa que dados foram retornados
            while(rs.next()){
                
                //criar um objeto cliente
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setFg_ativo(rs.getBoolean("fg_ativo"));
                
                //adiciona a lista
                resultado.add(cliente);
            }       
            return resultado;
            
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return null;
        }finally{
            Conexao.desconectar(con);
        }
    }
    
    public List<Cliente> pesquisarPorId(Usuario usuario, int id){
        try {
            String SQL = "select * from db_controle_estoque.cliente where id=? order by nome";
            
            con = controller.Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, id);
            
            //retornar o resultado da consulta
            ResultSet rs = cmd.executeQuery();
            
            //declarar uma lista dinamica para armazenar os resultados
            List<Cliente> resultado = new ArrayList<>();
            
            //percorrer os dados no resultset
            //se rs.next() = true significa que dados foram retornados
            while(rs.next()){
                
                //criar um objeto cliente
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setFg_ativo(rs.getBoolean("fg_ativo"));
                
                //adiciona a lista
                resultado.add(cliente);
            }       
            return resultado;
            
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return null;
        }finally{
            Conexao.desconectar(con);
        }
    }
    
    public Cliente get(Usuario usuario, String id){
        try {
            String SQL = "select * from db_controle_estoque.cliente where id=? order by nome";
            
            con = controller.Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, id);
            
            //retornar o resultado da consulta
            ResultSet rs = cmd.executeQuery();
            
            //percorrer os dados no resultset
            //se rs.next() = true significa que dados foram retornados
            while(rs.next()){
                
                //criar um objeto produto
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setFg_ativo(rs.getBoolean("fg_ativo"));
                
                //adiciona a lista
                return cliente;
            }       
            return null;
            
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return null;
        }finally{
            Conexao.desconectar(con);
        }
    }
    
}
