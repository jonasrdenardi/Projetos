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
    private static final String URL = "jdbc:mysql://" + HOST + "/" + DATABASE + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";

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

    public int criar(Usuario u, Usuario uc) {
        try {
            String SQL = "CREATE user ?@localhost IDENTIFIED BY ?; \n"+
                        "GRANT all ON db_controle_estoque.* TO ?@?;";

            con = Conexao.conectar(u);
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, uc.getNome());
            cmd.setString(2, uc.getSenha());
            cmd.setString(3, uc.getNome());
            cmd.setString(4, "localhost");
            

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

    public List<Object> listar(Usuario usuario) {
        try {
            String SQL = "SELECT s.usename, a.rolconnlimit\n"
                    + "from pg_authid a\n"
                    + "INNER JOIN pg_shadow s ON (s.usename = a.rolname);";

            con = Conexao.conectar(usuario);
            cmd = con.prepareStatement(SQL);
            ResultSet rs = cmd.executeQuery();

            List<Object> lista = new ArrayList<>();

            while (rs.next()) {
                // if para não mostrar o usuário postgres pois ele é o administrador do banco de dados        
                if (!rs.getString("usename").equals("postgres")) {
                    Usuario u = new Usuario();
                    u.setNome(rs.getString("usename"));
                    u.setLimiteCon(rs.getInt("rolconnlimit"));

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
            String SQL = "DROP USER " + usuarioEx + " ;";

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
}
