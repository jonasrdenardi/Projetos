package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;

public class Conexao {

    private static final String DATABASE = "newfantasy";
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/" + DATABASE;

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
