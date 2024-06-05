package telas;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginView extends javax.swing.JFrame {

    public LoginView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jButtonEntrar = new javax.swing.JButton();
        jButtonRealizarCadastro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPasswordField1.setText("jPasswordField1");
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 240, 20));

        jTextField1.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jTextField1.setText("Usuario");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 240, 30));

        jButtonEntrar.setText("Entrar");
        jButtonEntrar.setContentAreaFilled(false);
        jButtonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 403, 100, 30));

        jButtonRealizarCadastro.setText("Cadastrar");
        jButtonRealizarCadastro.setContentAreaFilled(false);
        jButtonRealizarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRealizarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRealizarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRealizarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 450, 170, 20));

        // Ajuste o caminho da imagem
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/telaLogin.png")));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        pack();
    }

    private void jButtonRealizarCadastroActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("Abrindo tela de cadastro..."); // Mensagem de depuração
        CadastroView telaCadastro = new CadastroView();
        telaCadastro.setVisible(true);
    }

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {
        String usuario = jTextField1.getText();
        String senha = new String(jPasswordField1.getPassword());

        if (verificarLogin(usuario, senha)) {
            TelaVeiculos telaVeiculos = new TelaVeiculos();
            telaVeiculos.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuário ou senha inválidos!", "Erro de Login", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean verificarLogin(String nome, String senha) {
        boolean validado = false;
        String url = "jdbc:mysql://localhost:3306/bdtesla";
        String dbUser = "root";
        String dbPassword = "123456";

        try (Connection connection = DriverManager.getConnection(url, dbUser, dbPassword)) {
            String sql = "SELECT * FROM login WHERE nome = ? AND senha = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nome);
            statement.setString(2, senha);
            ResultSet resultSet = statement.executeQuery();

            validado = resultSet.next();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao conectar ao banco de dados!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return validado;
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonRealizarCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
}
