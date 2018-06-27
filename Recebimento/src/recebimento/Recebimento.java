package recebimento;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo T.I
 */
public class Recebimento extends javax.swing.JFrame {

    Login JFLogin = new Login();
    String descricao = null;
    public Connection conexao;
    private int resultset;
    String conferente;

    public Recebimento() {
        initComponents();
        setResizable(false);
    }

    public Recebimento(String conferente) {
        this.conferente = conferente;
        Date data = new Date();
        SimpleDateFormat dtFormatador = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat hrFormatador = new SimpleDateFormat("HH:mm");
        String stData = dtFormatador.format(data);
        String stHora = hrFormatador.format(data);

        initComponents();
        txtConferente.setEditable(false);
        txtData.setEditable(false);
        txtHora.setEditable(false);
        txtDescricao.setEditable(false);
        txtConferente.setText(conferente);
        txtData.setText(stData);
        txtHora.setText(stHora);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblItem = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        txtItem = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        btnEnter = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        lblConferente = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        txtConferente = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        lblOu = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblEan = new javax.swing.JLabel();
        txtEan = new javax.swing.JTextField();
        btnOkEan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Supermercado São Sebastiao - Recebimento");
        setName("Recebimento - São Sebastião"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 22, 32));
        lblTitulo.setText("Controle de Recebimento");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, 32));

        lblItem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblItem.setText("Cod. Item");
        getContentPane().add(lblItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 93, -1));

        lblQuantidade.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblQuantidade.setText("Quantidade");
        getContentPane().add(lblQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        lblPeso.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblPeso.setText("Peso");
        getContentPane().add(lblPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 49, -1));

        txtItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemActionPerformed(evt);
            }
        });
        getContentPane().add(txtItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 102, 29));

        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });
        getContentPane().add(txtQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 122, 29));

        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });
        getContentPane().add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 98, 29));

        btnEnter.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnEnter.setText("Enter");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 260, 110, 50));

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 82, -1));

        lblConferente.setText("Conferente:");
        getContentPane().add(lblConferente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 70, 20));

        lblData.setText("Data:");
        getContentPane().add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        lblHora.setText("Hora:");
        getContentPane().add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        txtConferente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(txtConferente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 110, -1));
        getContentPane().add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 80, -1));
        getContentPane().add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 60, -1));

        lblOu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblOu.setText("ou");
        getContentPane().add(lblOu, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));

        txtDescricao.setForeground(new java.awt.Color(102, 102, 102));
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });
        getContentPane().add(txtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 360, 30));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        lblEan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEan.setText("EAN:");
        getContentPane().add(lblEan, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 30, 20));

        txtEan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEanActionPerformed(evt);
            }
        });
        getContentPane().add(txtEan, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 200, -1));

        btnOkEan.setText("OK");
        btnOkEan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkEanActionPerformed(evt);
            }
        });
        getContentPane().add(btnOkEan, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        Date dataAtual = new Date();
        SimpleDateFormat dtFormatador = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat hrFormatador = new SimpleDateFormat("HH:mm");
        String stDataAtual = dtFormatador.format(dataAtual);
        String stHoraAtual = hrFormatador.format(dataAtual);
        
        String psProd, qtdProd, sql;
        double psProduto = 0;
        int qtdProduto, codItem = 0;
        String descricao;
        
        
        try {
            codItem = Integer.parseInt(txtItem.getText());
            descricao = txtDescricao.getText();
            psProd = txtPeso.getText();
            qtdProd = txtQuantidade.getText();
            psProduto = 0;
            qtdProduto = 0;

            if (psProd.isEmpty()) {
                psProduto = 0;
            } else {
                psProduto = Double.parseDouble(txtPeso.getText());
            }
            if (qtdProd.isEmpty()) {
                qtdProduto = 0;
            } else {
                qtdProduto = Integer.parseInt(txtQuantidade.getText());
            }
                        
            Class.forName("org.postgresql.Driver");
            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/HORTFRUTT", "postgres", "147258");
            PreparedStatement stm = conexao.prepareStatement("INSERT INTO tb_registro VALUES(?,?,?,?,?,?,?,?,?)");
            stm.setInt(1,codItem);
            stm.setString(2, descricao);
            stm.setInt(3, qtdProduto);
            stm.setDouble(4, psProduto);
            stm.setDate(5,(stDataAtual));
            stm.setDate(6, stHoraAtual);
            stm.setString(7, conferente);
            stm.setInt(8, 0);
            stm.setString(9, null);            
            stm.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro incluido com sucesso.");

            txtItem.setText("");
            txtQuantidade.setText("");
            txtPeso.setText("");
            txtDescricao.setText("");
            txtEan.setText("");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro SQL: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Erro Classe: " + e.getMessage());
        }

        try {
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(Recebimento.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnEnterActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int Cod = 0;
        try {
            int codProduto = Integer.parseInt(txtItem.getText());
            String sql = "SELECT * FROM tb_produto WHERE cod_produto = " + codProduto;
            Class.forName("org.postgresql.Driver");
            //Construindo a conexão com o SGBD PostgreSql
            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/HORTFRUTT", "postgres", "147258");
            PreparedStatement statement = conexao.prepareStatement(sql);
            ResultSet resultset = statement.executeQuery();

            while (resultset.next()) {
                Cod = resultset.getInt("cod_produto");
                descricao = resultset.getString("produto");
            }

            if (Cod == codProduto) {
                txtDescricao.setText(descricao);
            } else {
                JOptionPane.showMessageDialog(this, "Produto não encontrado");
            }
            conexao.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro SQL: " + e.getMessage());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Recebimento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Código inválido");

        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "" + ex.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed

        int codItem = Integer.parseInt(txtItem.getText());
        int qtdProduto = Integer.parseInt(txtQuantidade.getText());
        String update = "UPDATE tb_produto SET quantidade =";
        String where = " WHERE cod_produto =";
        String sql = update + qtdProduto + where + codItem;


    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed

        int codItem = Integer.parseInt(txtItem.getText());
        float psProduto = Integer.parseInt(txtPeso.getText());
        String update = "UPDATE tb_produto SET peso =";
        String where = " WHERE cod_produto =";
        String sql = update + psProduto + where + codItem;
    }//GEN-LAST:event_txtPesoActionPerformed

    private void txtEanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEanActionPerformed

        long numEan = Integer.parseInt(txtEan.getText());
        String upEan = "INSER INTO num_ean VALUES(" + numEan + ");";

    }//GEN-LAST:event_txtEanActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed

        txtItem.setText("");
        txtQuantidade.setText("");
        txtPeso.setText("");
        txtDescricao.setText("");
        txtEan.setText("");

    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnOkEanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkEanActionPerformed

        long numEan = Integer.parseInt(txtEan.getText());

        String upEan = "INSERT INTO tb_ean VALUES(?)";

        try {
            Class.forName("org.postgresql.Driver");
            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/HORTFRUTT", "postgres", "147258");
            PreparedStatement statement = conexao.prepareStatement(upEan);
            statement.setLong(1, numEan);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro incluido com sucesso.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro SQL: " + ex.getMessage());

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Erro Classe" + ex.getMessage());
        }
    }//GEN-LAST:event_btnOkEanActionPerformed

    private void txtItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemActionPerformed

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
            java.util.logging.Logger.getLogger(Recebimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recebimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recebimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recebimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recebimento().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnOkEan;
    private javax.swing.JLabel lblConferente;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblEan;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblItem;
    private javax.swing.JLabel lblOu;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtConferente;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEan;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtItem;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
