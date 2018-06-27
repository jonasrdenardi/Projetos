package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;

public class Conexao {

    private static final String DATABASE = "pizzaria";
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/" + DATABASE;

    public Connection Logar(Usuario usuario) {
        try {
            Class.forName(DRIVER);
            Connection con = DriverManager.getConnection(URL, usuario.getNome(), usuario.getSenha());
            JOptionPane.showMessageDialog(null, "Conexão realizada com sucesso.");
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }

    public static Connection Conectar(Usuario usuario) {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, usuario.getNome(), usuario.getSenha());

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }

    public static void Desconectar(Connection con) {
        try {
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }

}
