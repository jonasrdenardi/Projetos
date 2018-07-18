package view;

import java.sql.Connection;
import controller.Conexao;
import controller.UsuarioDAO;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import model.Usuario;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        configurarFormulario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSenha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jpfSenha = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnEntrar = new javax.swing.JButton();
        lblusuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblSenha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(208, 92, 5));
        lblSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSenha.setText("Senha");

        txtUsuario.setBackground(new java.awt.Color(214, 217, 223));
        txtUsuario.setFont(new java.awt.Font("Arial Unicode MS", 0, 24)); // NOI18N
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setBorder(null);

        jpfSenha.setBackground(new java.awt.Color(214, 217, 223));
        jpfSenha.setFont(new java.awt.Font("Arial Unicode MS", 0, 24)); // NOI18N
        jpfSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jpfSenha.setBorder(null);
        jpfSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jpfSenhaKeyPressed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnEntrar.setBackground(new java.awt.Color(255, 200, 0));
        btnEntrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 200, 0));
        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login.png"))); // NOI18N
        btnEntrar.setBorder(null);
        btnEntrar.setBorderPainted(false);
        btnEntrar.setContentAreaFilled(false);
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login2.png"))); // NOI18N
        btnEntrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login2.png"))); // NOI18N
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        lblusuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblusuario.setForeground(new java.awt.Color(208, 92, 5));
        lblusuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblusuario.setText("Usuário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblusuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpfSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpfSenhaKeyPressed
        entrar(evt);
    }//GEN-LAST:event_jpfSenhaKeyPressed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        entrar(evt);
    }//GEN-LAST:event_btnEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    //Metodo de entrar com ActionEvent
    private void entrar(ActionEvent evt){
            Conexao con = new Conexao();
            Connection conexao;
            Usuario usuario = new Usuario();
            if (txtUsuario.getText().isEmpty() || String.valueOf(jpfSenha.getPassword()).isEmpty()) {
                JOptionPane.showMessageDialog(null, "Há campo(s) em branco");
            } else {
                usuario.setNome(txtUsuario.getText());
                usuario.setSenha(String.valueOf(jpfSenha.getPassword()));

                conexao = new UsuarioDAO().Logar(usuario);
                if (conexao != null) {
                    Menu men = new Menu(usuario);
                    this.dispose();
                    Conexao.Desconectar(conexao);
                }
            }
    }
    //Metodo de entrar com KeyEvent
    private void entrar(KeyEvent evt){
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Conexao con = new Conexao();
            Connection conexao;
            Usuario usuario = new Usuario();
            if (txtUsuario.getText().isEmpty() || String.valueOf(jpfSenha.getPassword()).isEmpty()) {
                JOptionPane.showMessageDialog(null, "Há campo(s) em branco");
            } else {
                usuario.setNome(txtUsuario.getText());
                usuario.setSenha(String.valueOf(jpfSenha.getPassword()));

                conexao = new UsuarioDAO().Logar(usuario);
                if (conexao != null) {
                    Menu men = new Menu(usuario);
                    this.dispose();
                    Conexao.Desconectar(conexao);
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario(){
        this.setTitle("Login - New Fantasy");
        this.setResizable(false);
        setLocationRelativeTo(null);
 
        getRootPane().setDefaultButton(btnEntrar);
    }
}
