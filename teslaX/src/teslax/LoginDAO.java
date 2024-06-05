package teslax;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LoginDAO {

    public boolean conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdtesla", "root", "123456");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace(); // Você pode querer lidar com a exceção de uma maneira mais apropriada para sua aplicação
            return false;
        }
    }
    
    public void cadastrarUsuario(String nome, String email, String senha) throws SQLException {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdtesla", "root", "")) {
            String sql = "INSERT INTO login (nome, email, senha) VALUES (?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, nome);
            statement.setString(2, email);
            statement.setString(3, senha);
            statement.executeUpdate();
        }
    }
}
