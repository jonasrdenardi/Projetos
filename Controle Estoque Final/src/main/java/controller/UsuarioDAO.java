package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Usuario;

public class UsuarioDAO {

    private Connection con;
    private PreparedStatement cmd;
    private static final String HOST = "127.0.0.1:3306";
    private static final String DATABASE = "db_controle_estoque";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://" + HOST + "/" + DATABASE + "?useTimezone=true&serverTimezone=Brazil/East";

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

    public int criar(Usuario u, String usuario, String senha) {
        try {
            String SQL = "CREATE user ?@'localhost' IDENTIFIED BY ?";

            con = Conexao.conectar(u);
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, usuario);
            cmd.setString(2, senha);

            int retorno = cmd.executeUpdate();

            SQL = "GRANT all ON db_controle_estoque.* to ?@'localhost';";

            cmd = con.prepareStatement(SQL);
            cmd.setString(1, usuario);

            retorno = cmd.executeUpdate();

            if (retorno >= 0) {
                return retorno;
            } else {
                return -1;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
            return -1;
        } finally {
            Conexao.desconectar(con);
        }
    }

    public List<Usuario> listar(Usuario usuario) {
        try {
            String SQL = "SELECT * FROM mysql.user ORDER BY UPPER(User);";

            con = Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);
            ResultSet rs = cmd.executeQuery();

            List<Usuario> lista = new ArrayList<>();

            while (rs.next()) {
                // if para não mostrar o usuário root pois ele é o administrador do banco de dados        
                if (!rs.getString("User").equals("root")) {
                    Usuario u = new Usuario();
                    u.setNome(rs.getString("User"));

                    lista.add(u);
                }

            }

            return lista;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problema ao listar usuários: " + e.getMessage());
            return null;

        } finally {
            Conexao.desconectar(con);
        }
    }

    public int deletar(Usuario usuario, String usuarioEx) {
        try {
            String SQL = "DROP USER " + usuarioEx + "@localhost;";

            con = Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);

            int retorno = cmd.executeUpdate();

            if (retorno >= 0) {
                System.out.println(retorno);
                return retorno;
            } else {
                return -1;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            return -1;

        } finally {
            Conexao.desconectar(con);
        }
    }

    public int atualizar(Usuario u, Usuario ual) {
        try {
            String SQL = "ALTER USER " + ual.getNome() + " CONNECTION LIMIT " + ual.getLimiteCon() + ";";

            con = Conexao.conectar(u);
            cmd = con.prepareStatement(SQL);

            int retorno = cmd.executeUpdate();

            if (retorno >= 0) {
                return retorno;
            } else {
                return -1;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
            return -1;
        } finally {
            Conexao.desconectar(con);
        }
    }

    public int atualizarSenha(Usuario u, String usuario, String novaSenha) {
        try {
            String SQL = "UPDATE mysql.user SET password='" + novaSenha + "' WHERE User ='" + usuario + "';";

            con = Conexao.conectar(u);
            cmd = con.prepareStatement(SQL);

            int retorno = cmd.executeUpdate();

            SQL = "FLUSH PRIVILEGES;";

            cmd = con.prepareStatement(SQL);
            retorno = cmd.executeUpdate();

            if (retorno >= 0) {
                return retorno;
            } else {
                return -1;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
            return -1;
        } finally {
            Conexao.desconectar(con);
        }
    }
}
