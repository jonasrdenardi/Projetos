package view;

import controller.Conexao;
import controller.ItemPedidoDAO;
import controller.MesaDAO;
import controller.UsuarioDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Usuario;

public class CadastroLogin extends javax.swing.JInternalFrame {

    public CadastroLogin() {
        initComponents();
        configurarFormulario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnCadastrar = new javax.swing.JButton();
        lblusuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jpfSenha = new javax.swing.JPasswordField();

        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/java_icon.png"))); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastrarLogin.png"))); // NOI18N
        btnCadastrar.setBorder(null);
        btnCadastrar.setBorderPainted(false);
        btnCadastrar.setContentAreaFilled(false);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastrarLogin2.png"))); // NOI18N
        btnCadastrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastrarLogin2.png"))); // NOI18N
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lblusuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblusuario.setForeground(new java.awt.Color(208, 92, 5));
        lblusuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblusuario.setText("Usuário");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addComponent(lblusuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addComponent(jpfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addComponent(lblSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Usuario u = new Usuario();
        if (txtUsuario.getText().isEmpty() || String.valueOf(jpfSenha.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(null, "Há campo(s) em branco");
        } else {
            u.setNome(txtUsuario.getText());
            u.setSenha(String.valueOf(jpfSenha.getPassword()));
            
            int retorno  = new UsuarioDAO().criar(Menu.getUsuario(), u);
            
            if (retorno != -1) {
                JOptionPane.showMessageDialog(null, "Usuário " + u.getNome() + " cadastrado com sucesso");
                txtUsuario.setText("");
                jpfSenha.setText("");
            }
        }

    }//GEN-LAST:event_btnCadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Cadastrar Usuário - New Fantasy");
        this.setResizable(false);
        this.setClosable(true);
        this.setIconifiable(true);

        getRootPane().setDefaultButton(btnCadastrar);
    }
}
