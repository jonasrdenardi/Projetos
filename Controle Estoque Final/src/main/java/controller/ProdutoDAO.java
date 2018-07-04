package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Produto;
import model.Usuario;

/**
 *
 * @author diego
 */
public class ProdutoDAO {
    
    private Connection con; //estabelecer a conexao
    private PreparedStatement cmd; //enviar comando SQL
    
    public ProdutoDAO(){
        
    }
    
    public int inserir(Usuario usuario, Produto p){
        try {
            
            final String SQL = "insert into db_controle_estoque.produto (descricao,qtd,preco_compra,preco,vencimento,fg_ativo) values (?,?,?,?,?,?)";
            
            con = controller.Conexao.conectar(usuario);
            //a execucao da instrucao retornara o valor da chave gerada pelo SGBD
            cmd = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            
            //configurar os parametros da intrucao SQL, sao especificados com o simbolo de interrogacao
            cmd.setString(1, p.getDescricao());
            cmd.setFloat(2, p.getQtd());
            cmd.setFloat(3, p.getPrecoCompra());
            cmd.setFloat(4, p.getPreco());
            cmd.setDate(5,  new Date(p.getData().getTime()));
            cmd.setBoolean(6, true);
            
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
    
    public int atualizar(Usuario usuario, Produto p){
        try {
            
            final String SQL = "update db_controle_estoque.produto set descricao=?,qtd=?,preco_compra=?,preco=?, vencimento=?, fg_ativo=? where id=?";
            
            con = controller.Conexao.conectar(usuario);
            //a execucao da instrucao retornara o valor da chave gerada pelo SGBD
            cmd = con.prepareStatement(SQL);
            
            //configurar os parametros da intrucao SQL, sao especificados com o simbolo de interrogacao
            cmd.setString(1, p.getDescricao());
            cmd.setFloat(2, p.getQtd());
            cmd.setFloat(3, p.getPrecoCompra());
            cmd.setFloat(4, p.getPreco());
            cmd.setDate(5,  new Date(p.getData().getTime()));
            cmd.setBoolean(6, p.getFg_ativo());            
            cmd.setInt(7, p.getId());
                        
            //enviar a instrucao SQL para o SGBD
            //resultado maior que 0 significa que o comando foi executado corretamente
            if(cmd.executeUpdate()>0){
                return p.getId();
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
    
    public int atualizarEstoque(Usuario usuario, Produto p){
        try {
            
            final String SQL = "update db_controle_estoque.produto set qtd=? where id=?";
            
            con = controller.Conexao.conectar(usuario);
            //a execucao da instrucao retornara o valor da chave gerada pelo SGBD
            cmd = con.prepareStatement(SQL);
            
            //configurar os parametros da intrucao SQL, sao especificados com o simbolo de interrogacao
            cmd.setFloat(1, p.getQtd());        
            cmd.setInt(2, p.getId());
                        
            //enviar a instrucao SQL para o SGBD
            //resultado maior que 0 significa que o comando foi executado corretamente
            if(cmd.executeUpdate()>0){
                return p.getId();
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
    public List<Produto> listar(Usuario usuario){
        try {
            String SQL = "select * from db_controle_estoque.produto order by id";
            
            con = controller.Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);
            
            //retornar o resultado da consulta
            ResultSet rs = cmd.executeQuery();
            
            //declarar uma lista dinamica para armazenar os resultados
            List<Produto> resultado = new ArrayList<>();
            
            //percorrer os dados no resultset
            //se rs.next() = true significa que dados foram retornados
            while(rs.next()){
                
                //criar um objeto produto
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setQtd(rs.getFloat("qtd"));
                produto.setPrecoCompra(rs.getFloat("preco_compra"));
                produto.setPreco(rs.getFloat("preco"));
                
                //Valor do banco esta vindo com 1 dia a menos por conta da timezone
                java.util.Date dataSomada = rs.getDate("vencimento");
                dataSomada.setDate(dataSomada.getDate() + 1);
                produto.setData(dataSomada);
                
                produto.setFg_ativo(rs.getBoolean("fg_ativo"));
                //adiciona a lista
                resultado.add(produto);
            }       
            return resultado;
            
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return null;
        }finally{
            Conexao.desconectar(con);
        }
    }
    
    //LISTAR TODOS OS REGISTROS ATIVOS DA TABELA
    public List<Produto> listarAtivos(Usuario usuario){
        try {
            String SQL = "select * from db_controle_estoque.produto where fg_ativo = true order by id;" ;
            
            con = controller.Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);
            
            //retornar o resultado da consulta
            ResultSet rs = cmd.executeQuery();
            
            //declarar uma lista dinamica para armazenar os resultados
            List<Produto> resultado = new ArrayList<>();
            
            //percorrer os dados no resultset
            //se rs.next() = true significa que dados foram retornados
            while(rs.next()){
                
                //criar um objeto produto
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setQtd(rs.getFloat("qtd"));
                produto.setPrecoCompra(rs.getFloat("preco_compra"));
                produto.setPreco(rs.getFloat("preco"));
                
                //Valor do banco esta vindo com 1 dia a menos por conta da timezone
                java.util.Date dataSomada = rs.getDate("vencimento");
                dataSomada.setDate(dataSomada.getDate() + 1);
                produto.setData(dataSomada);
                
                produto.setFg_ativo(rs.getBoolean("fg_ativo"));
                //adiciona a lista
                resultado.add(produto);
            }       
            return resultado;
            
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return null;
        }finally{
            Conexao.desconectar(con);
        }
    }
    
    public List<Produto> pesquisarPorDescricao(Usuario usuario, String descricao){
        try {
            String SQL = "select * from db_controle_estoque.produto where descricao like ?";
            
            con = controller.Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, "%" + descricao + "%");
            
            //retornar o resultado da consulta
            ResultSet rs = cmd.executeQuery();
            
            //declarar uma lista dinamica para armazenar os resultados
            List<Produto> resultado = new ArrayList<>();
            
            //percorrer os dados no resultset
            //se rs.next() = true significa que dados foram retornados
            while(rs.next()){
                
                //criar um objeto produto
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setQtd(rs.getFloat("qtd"));
                produto.setPrecoCompra(rs.getFloat("preco_compra"));
                produto.setPreco(rs.getFloat("preco"));
                
                //Valor do banco esta vindo com 1 dia a menos por conta da timezone
                java.util.Date dataSomada = rs.getDate("vencimento");
                dataSomada.setDate(dataSomada.getDate() + 1);
                produto.setData(dataSomada);
                
                produto.setFg_ativo(rs.getBoolean("fg_ativo"));
                
                //adiciona a lista
                resultado.add(produto);
            }       
            return resultado;
            
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return null;
        }finally{
            Conexao.desconectar(con);
        }
    }
    
    public List<Produto> pesquisarPorId(Usuario usuario, int id){
        try {
            String SQL = "select * from db_controle_estoque.produto where id=?";
            
            con = controller.Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, id);
            
            //retornar o resultado da consulta
            ResultSet rs = cmd.executeQuery();
            
            //declarar uma lista dinamica para armazenar os resultados
            List<Produto> resultado = new ArrayList<>();
            
            //percorrer os dados no resultset
            //se rs.next() = true significa que dados foram retornados
            while(rs.next()){
                
                //criar um objeto produto
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setQtd(rs.getFloat("qtd"));
                produto.setPrecoCompra(rs.getFloat("preco_compra"));
                produto.setPreco(rs.getFloat("preco"));
                
                //Valor do banco esta vindo com 1 dia a menos por conta da timezone
                java.util.Date dataSomada = rs.getDate("vencimento");
                dataSomada.setDate(dataSomada.getDate() + 1);
                produto.setData(dataSomada);
                
                produto.setFg_ativo(rs.getBoolean("fg_ativo"));
                
                //adiciona a lista
                resultado.add(produto);
            }       
            return resultado;
            
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return null;
        }finally{
            Conexao.desconectar(con);
        }
    }
    
    public Produto get(Usuario usuario, String id){
        try {
            String SQL = "select * from db_controle_estoque.produto where id=?";
            
            con = controller.Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, id);
            
            //retornar o resultado da consulta
            ResultSet rs = cmd.executeQuery();
            
            //percorrer os dados no resultset
            //se rs.next() = true significa que dados foram retornados
            while(rs.next()){
                
                //criar um objeto produto
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setQtd(rs.getFloat("qtd"));
                produto.setPrecoCompra(rs.getFloat("preco_compra"));
                produto.setPreco(rs.getFloat("preco"));
                
                //Valor do banco esta vindo com 1 dia a menos por conta da timezone
                java.util.Date dataSomada = rs.getDate("vencimento");
                dataSomada.setDate(dataSomada.getDate() + 1);
                produto.setData(dataSomada);
                
                produto.setFg_ativo(rs.getBoolean("fg_ativo"));
                
                //adiciona a lista
                return produto;
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
