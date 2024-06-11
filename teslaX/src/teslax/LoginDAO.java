package teslax;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {

    public boolean conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdtesla", "root", "");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean login(String nome, String senha) {
        String sql = "SELECT * FROM login WHERE nome = ? AND senha = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdtesla", "root", "");
             PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, nome);
            statement.setString(2, senha);
            try (ResultSet rs = statement.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
