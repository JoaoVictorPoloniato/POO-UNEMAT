package teslax;

import telas.TelaVeiculos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TeslaX {

    private static final Logger LOGGER = Logger.getLogger(TeslaX.class.getName());

public static void main(String[] args) {
    // Carregar o driver JDBC
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        LOGGER.info("Driver JDBC carregado com sucesso.");
    } catch (ClassNotFoundException ex) {
        LOGGER.log(Level.SEVERE, "Driver JDBC não encontrado.", ex);
        return;
    }

    // Conectar ao banco de dados
    String url = "jdbc:mysql://localhost:3306/bdtesla"; // Substitua 'nome_do_banco' pelo nome real do seu banco de dados
    String user = "root"; // Substitua 'usuario' pelo seu usuário do banco de dados
    String password = ""; // Substitua 'senha' pela sua senha do banco de dados

    try (Connection connection = DriverManager.getConnection(url, user, password)) {
        if (connection != null) {
            LOGGER.info("Conexão estabelecida com sucesso.");
            // Criar e exibir a tela de cadastro de veículos
            java.awt.EventQueue.invokeLater(() -> {
                new TelaVeiculos().setVisible(true);
            });
        } else {
            LOGGER.warning("Falha ao estabelecer conexão.");
        }
    } catch (SQLException ex) {
        LOGGER.log(Level.SEVERE, "Erro ao estabelecer conexão com o banco de dados.", ex);
    }
    }
}
