package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author diego
 */
public class Conexao {
    
    //PARÂMETROS DE CONEXÃO
    private static final String HOST = "127.0.0.1:3306";
    private static final String DATABASE = "db_controle_estoque";
    private static final String URL = "jdbc:mysql://" + HOST + "/" + DATABASE  + "?useTimezone=true&serverTimezone=Brazil/East";
    private static final String USR = "root";
    private static final String PWD = "senha123";


    //Estabelecer uma conexão com o SGBD
    public static Connection conectar(Usuario usuario) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USR, PWD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
            return null;
        }
    }

    public static void desconectar(Connection con) {
        try {
            con.close();
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }
    
    /*
    //teste de Conexao
    public static void main(String[] args) {
        
        Connection con = Conexao.conectar();
        if(con != null){
            System.out.println("Conexao realizada com sucesso");
            Conexao.desconectar(con);
        }
        
    }*/
    
    
}
