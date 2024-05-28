/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import teslax.Veiculos;
import teslax.VeiculosDAO;
import java.sql.ResultSet;

/**
 *
 * @author joao
 */
public class TelaVeiculos extends javax.swing.JFrame {

    /**
     * Creates new form TelaVeiculos
     */
    public TelaVeiculos() {
        initComponents();
        mostracampos(false);
    }

    private void limpacampos() {
        txt_id.setText("");
        txt_ano.setText("");
        txt_combustivel.setText("");
        txt_tipocambio.setText("");
        txt_cor.setText("");
        txt_duracaogarantia.setText("");
        txt_km.setText("");
        txt_modelo.setText("");
        txt_preco.setText("");
        txt_descricao.setText("");
        txt_marca.setText("");
        txt_ano.requestFocus();
    }

    public void mostrabotoes(boolean valor) {
        btConsultar.setEnabled(valor);
        btExcluir.setEnabled(valor);
        btAtualizar.setEnabled(valor);
        btEditar.setEnabled(valor);
        btSalvar.setEnabled(valor);
        btRelatorio.setEnabled(valor);
        btNovo.setEnabled(valor);
        btNovaPesquisa.setEnabled(valor);
    }

    public void mostracampos(boolean valor) {
        txt_id.setEnabled(valor);
        txt_ano.setEnabled(valor);
        txt_combustivel.setEnabled(valor);
        txt_tipocambio.setEnabled(valor);
        txt_cor.setEnabled(valor);
        txt_duracaogarantia.setEnabled(valor);
        txt_km.setEnabled(valor);
        txt_modelo.setEnabled(valor);
        txt_preco.setEnabled(valor);
        txt_descricao.setEnabled(valor);
        txt_marca.setEnabled(valor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_ano = new javax.swing.JTextField();
        txt_combustivel = new javax.swing.JTextField();
        txt_tipocambio = new javax.swing.JTextField();
        txt_cor = new javax.swing.JTextField();
        txt_duracaogarantia = new javax.swing.JTextField();
        txt_km = new javax.swing.JTextField();
        txt_modelo = new javax.swing.JTextField();
        txt_preco = new javax.swing.JTextField();
        txt_descricao = new javax.swing.JTextField();
        txt_marca = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        btNovo = new javax.swing.JButton();
        btNovaPesquisa = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_relatorio = new javax.swing.JTextArea();
        btRelatorio = new javax.swing.JButton();
        btCancelar = new javax.swing.JToggleButton();
        btRelatorioManual = new javax.swing.JButton();
        btRelatorioAutomatico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de veículos");
        getContentPane().setLayout(null);

        jLabel2.setText("Ano do veículo:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 90, 90, 16);

        jLabel3.setText("Tipo combustível:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 130, 100, 16);

        jLabel4.setText("Tipo de câmbio:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 170, 110, 16);

        jLabel5.setText("Cor:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 210, 30, 16);

        jLabel6.setText("Duração da garantia:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 250, 130, 16);

        jLabel7.setText("KM:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 290, 21, 16);

        jLabel8.setText("Modelo do veículo:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 330, 110, 16);

        jLabel9.setText("Preço do veículo:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 370, 110, 16);

        jLabel10.setText("Descrição do veículo:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 410, 130, 16);

        jLabel11.setText("Marca:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 450, 36, 16);

        txt_ano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_anoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_ano);
        txt_ano.setBounds(100, 80, 220, 30);
        getContentPane().add(txt_combustivel);
        txt_combustivel.setBounds(110, 120, 210, 30);
        getContentPane().add(txt_tipocambio);
        txt_tipocambio.setBounds(100, 160, 220, 30);
        getContentPane().add(txt_cor);
        txt_cor.setBounds(40, 200, 280, 30);

        txt_duracaogarantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_duracaogarantiaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_duracaogarantia);
        txt_duracaogarantia.setBounds(130, 240, 190, 30);
        getContentPane().add(txt_km);
        txt_km.setBounds(40, 280, 280, 30);

        txt_modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_modeloActionPerformed(evt);
            }
        });
        getContentPane().add(txt_modelo);
        txt_modelo.setBounds(120, 320, 200, 30);
        getContentPane().add(txt_preco);
        txt_preco.setBounds(110, 360, 210, 30);
        getContentPane().add(txt_descricao);
        txt_descricao.setBounds(130, 400, 190, 30);
        getContentPane().add(txt_marca);
        txt_marca.setBounds(60, 440, 260, 30);

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvar);
        btSalvar.setBounds(750, 80, 120, 23);

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btConsultar);
        btConsultar.setBounds(750, 120, 120, 23);

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir);
        btExcluir.setBounds(750, 160, 120, 23);

        jLabel1.setText("ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 50, 20, 16);

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        getContentPane().add(txt_id);
        txt_id.setBounds(40, 40, 50, 30);

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btNovo);
        btNovo.setBounds(750, 200, 120, 23);

        btNovaPesquisa.setText("Nova Pesquisa");
        btNovaPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovaPesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(btNovaPesquisa);
        btNovaPesquisa.setBounds(750, 240, 120, 23);

        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btAtualizar);
        btAtualizar.setBounds(750, 280, 120, 23);

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btEditar);
        btEditar.setBounds(750, 320, 120, 23);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("CADASTRO DE VEÍCULOS");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(370, 10, 180, 20);

        txt_relatorio.setColumns(20);
        txt_relatorio.setRows(5);
        jScrollPane1.setViewportView(txt_relatorio);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 500, 870, 180);

        btRelatorio.setText("Relatório");
        btRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatorioActionPerformed(evt);
            }
        });
        getContentPane().add(btRelatorio);
        btRelatorio.setBounds(750, 360, 120, 23);

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btCancelar);
        btCancelar.setBounds(750, 400, 120, 23);

        btRelatorioManual.setText("Relatório Veículos Manuais");
        btRelatorioManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatorioManualActionPerformed(evt);
            }
        });
        getContentPane().add(btRelatorioManual);
        btRelatorioManual.setBounds(525, 80, 180, 23);

        btRelatorioAutomatico.setText("Relatório Veículos Automáticos");
        btRelatorioAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatorioAutomaticoActionPerformed(evt);
            }
        });
        getContentPane().add(btRelatorioAutomatico);
        btRelatorioAutomatico.setBounds(510, 120, 210, 23);

        setSize(new java.awt.Dimension(902, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_anoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_anoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_anoActionPerformed

    private void txt_duracaogarantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_duracaogarantiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_duracaogarantiaActionPerformed

    private void txt_modeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_modeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_modeloActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        Veiculos veiculo = new Veiculos();
        VeiculosDAO dao;
        int resposta;
        boolean status;
        veiculo.setAno_veiculo(txt_ano.getText());
        veiculo.setCombustivel_veiculo(txt_combustivel.getText());
        veiculo.setTipocambio_veiculo(txt_tipocambio.getText());
        veiculo.setCor_veiculo(txt_cor.getText());
        veiculo.setDuracao_garantia(txt_duracaogarantia.getText());
        veiculo.setKm_veiculo(txt_km.getText());
        veiculo.setModelo_veiculo(txt_modelo.getText());
        veiculo.setPreco_veiculo(txt_preco.getText());
        veiculo.setDescricao_veiculo(txt_descricao.getText());
        veiculo.setMarca_veiculo(txt_marca.getText());
        dao = new VeiculosDAO();
        status = dao.conectar();
        if (status = false) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco de dados");
        } else {
            resposta = dao.salvar(veiculo);
            if (resposta == 1) {
                JOptionPane.showMessageDialog(null, "Dados incluídos com sucesso!");
                limpacampos();
            } else if (resposta == 1062) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar");
                limpacampos();
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao salvar");
                limpacampos();
            }
            dao.desconectar();
        }
        btConsultar.setEnabled(true);
        btExcluir.setEnabled(true);
        btAtualizar.setEnabled(true);
        btEditar.setEnabled(true);
        btSalvar.setEnabled(false);
        btRelatorio.setEnabled(true);
        btNovo.setEnabled(true);
        btNovaPesquisa.setEnabled(true);
        mostracampos(true);
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        int inputDoUsuario;
        inputDoUsuario = Integer.parseInt(txt_id.getText());
        VeiculosDAO dao = new VeiculosDAO();
        boolean status = dao.conectar();
        if (status == true) {
            Veiculos veiculo = dao.consultar(inputDoUsuario);
            if (veiculo == null) {
                JOptionPane.showMessageDialog(null, "Veículo não localizável!");
            } else {
                txt_modelo.setText(veiculo.getModelo_veiculo());
                txt_ano.setText(veiculo.getAno_veiculo());
                txt_combustivel.setText(veiculo.getCombustivel_veiculo());
                txt_tipocambio.setText(veiculo.getTipocambio_veiculo());
                txt_cor.setText(veiculo.getCor_veiculo());
                txt_duracaogarantia.setText(veiculo.getDuracao_garantia());
                txt_km.setText(veiculo.getKm_veiculo());
                txt_preco.setText(veiculo.getPreco_veiculo());
                txt_descricao.setText(veiculo.getDescricao_veiculo());
                txt_marca.setText(veiculo.getMarca_veiculo());
            }
            dao.desconectar();
        } else {
            JOptionPane.showMessageDialog(null, "Erro na conexão com banco de dados");
        }
        btAtualizar.setEnabled(false);
        btCancelar.setEnabled(true);
        mostracampos(false);
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        btSalvar.setEnabled(true);
        btConsultar.setEnabled(false);
        btExcluir.setEnabled(false);
        btAtualizar.setEnabled(false);
        btEditar.setEnabled(false);
        btCancelar.setEnabled(true);
        txt_id.setEnabled(false);
        txt_ano.setEnabled(true);
        txt_combustivel.setEnabled(true);
        txt_tipocambio.setEnabled(true);
        txt_cor.setEnabled(true);
        txt_duracaogarantia.setEnabled(true);
        txt_km.setEnabled(true);
        txt_modelo.setEnabled(true);
        txt_preco.setEnabled(true);
        txt_descricao.setEnabled(true);
        txt_marca.setEnabled(true);
        limpacampos();

    }//GEN-LAST:event_btNovoActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        VeiculosDAO dao = new VeiculosDAO();
        boolean status = dao.conectar();
        if (status == false) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco de dados");
        } else {
            int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir esse registro?");
            if (confirma == 0) {
                status = dao.excluir(Integer.parseInt(txt_id.getText()));
                if (status == true) {
                    JOptionPane.showMessageDialog(null, "Veículo excluído com sucesso");
                    limpacampos();
                } else {
                    JOptionPane.showMessageDialog(null, "Erro na exclusão do veículo");
                }
                dao.desconectar();
            }

        }
        mostracampos(true);
        btConsultar.setEnabled(true);
        btExcluir.setEnabled(true);
        btAtualizar.setEnabled(true);
        btEditar.setEnabled(true);
        btSalvar.setEnabled(false);
        btRelatorio.setEnabled(true);
        btNovo.setEnabled(true);
        btNovaPesquisa.setEnabled(true);
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btNovaPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovaPesquisaActionPerformed
        btConsultar.setEnabled(true);
        btExcluir.setEnabled(true);
        btAtualizar.setEnabled(false);
        btEditar.setEnabled(true);
        btSalvar.setEnabled(false);
        btRelatorio.setEnabled(true);
        btCancelar.setEnabled(true);
        limpacampos();
        txt_id.setEnabled(true);
        txt_id.setText("");     //limpa o campo do id    
        txt_id.requestFocus(); //coloca o cursos para digitar o que vc quiser
        txt_ano.setEnabled(false);
        txt_combustivel.setEnabled(false);
        txt_tipocambio.setEnabled(false);
        txt_cor.setEnabled(false);
        txt_duracaogarantia.setEnabled(false);
        txt_km.setEnabled(false);
        txt_modelo.setEnabled(false);
        txt_preco.setEnabled(false);
        txt_descricao.setEnabled(false);
        txt_marca.setEnabled(false);

    }//GEN-LAST:event_btNovaPesquisaActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdtesla", "root", "zaq12wsxZAQ!@WSX");
            PreparedStatement st = con.prepareStatement("UPDATE veiculos SET ano_veiculo = ?, combustivel_veiculo = ?, tipocambio_veiculo = ?, cor_veiculo = ?, duracao_garantia = ?, km_veiculo = ?, modelo_veiculo = ?, preco_veiculo = ?, descricao_veiculo = ?, marca_veiculo = ? WHERE id_carro = ?");
            st.setString(1, txt_ano.getText());
            st.setString(2, txt_combustivel.getText());
            st.setString(3, txt_tipocambio.getText());
            st.setString(4, txt_cor.getText());
            st.setString(5, txt_duracaogarantia.getText());
            st.setString(6, txt_km.getText());
            st.setString(7, txt_modelo.getText());
            st.setString(8, txt_preco.getText());
            st.setString(9, txt_descricao.getText());
            st.setString(10, txt_marca.getText());
            st.setString(11, txt_id.getText());
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso!");
            limpacampos();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver não está na biblioteca.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão com o banco.");
        }
        btConsultar.setEnabled(true);
        btExcluir.setEnabled(true);
        btAtualizar.setEnabled(true);
        btEditar.setEnabled(true);
        btSalvar.setEnabled(false);
        btRelatorio.setEnabled(true);
        btNovo.setEnabled(true);
        btNovaPesquisa.setEnabled(true);
        mostracampos(true);
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        txt_id.setEnabled(false);
        txt_ano.setEnabled(true);
        txt_combustivel.setEnabled(true);
        txt_tipocambio.setEnabled(true);
        txt_cor.setEnabled(true);
        txt_duracaogarantia.setEnabled(true);
        txt_km.setEnabled(true);
        txt_modelo.setEnabled(true);
        txt_preco.setEnabled(true);
        txt_descricao.setEnabled(true);
        txt_marca.setEnabled(true);
        btSalvar.setEnabled(false);
        btEditar.setEnabled(false);
        btConsultar.setEnabled(false);
        btAtualizar.setEnabled(true);
        btCancelar.setEnabled(true);
    }//GEN-LAST:event_btEditarActionPerformed

    private void btRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatorioActionPerformed
        VeiculosDAO dao = new VeiculosDAO();
        boolean status = dao.conectar();
        if (status == true) {
            txt_relatorio.setText(dao.getRelatorio());
        }
    }//GEN-LAST:event_btRelatorioActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        txt_id.setEnabled(false);
        btConsultar.setEnabled(true);
        btExcluir.setEnabled(true);
        btAtualizar.setEnabled(true);
        btEditar.setEnabled(true);
        btSalvar.setEnabled(false);
        btRelatorio.setEnabled(true);
        btNovo.setEnabled(true);
        btNovaPesquisa.setEnabled(true);
        btCancelar.setEnabled(false);
        limpacampos();
        mostracampos(true);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btRelatorioManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatorioManualActionPerformed
        VeiculosDAO dao = new VeiculosDAO();
        boolean status = dao.conectar();
        if (status == true) {
            txt_relatorio.setText(dao.getRelatorioManual());
        }
    }//GEN-LAST:event_btRelatorioManualActionPerformed

    private void btRelatorioAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatorioAutomaticoActionPerformed
        VeiculosDAO dao = new VeiculosDAO();
        boolean status = dao.conectar();
        if (status == true) {
            txt_relatorio.setText(dao.getRelatorioAutomatico());
        }
    }//GEN-LAST:event_btRelatorioAutomaticoActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVeiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JToggleButton btCancelar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovaPesquisa;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btRelatorio;
    private javax.swing.JButton btRelatorioAutomatico;
    private javax.swing.JButton btRelatorioManual;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_ano;
    private javax.swing.JTextField txt_combustivel;
    private javax.swing.JTextField txt_cor;
    private javax.swing.JTextField txt_descricao;
    private javax.swing.JTextField txt_duracaogarantia;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_km;
    private javax.swing.JTextField txt_marca;
    private javax.swing.JTextField txt_modelo;
    private javax.swing.JTextField txt_preco;
    private javax.swing.JTextArea txt_relatorio;
    private javax.swing.JTextField txt_tipocambio;
    // End of variables declaration//GEN-END:variables
}
