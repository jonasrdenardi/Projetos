package view;

import controller.UsuarioDAO;
import java.awt.Font;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Produto;
import model.Usuario;

/**
 *
 * @author diego
 */
public class AdministracaoUsuarios extends javax.swing.JInternalFrame {

    public AdministracaoUsuarios() {
        initComponents();
        configurarFormulario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnAlterarSenha = new javax.swing.JButton();
        lblGerenciarUsuarios = new javax.swing.JLabel();
        btnCriar = new javax.swing.JButton();
        lblSenha = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jpfSenha = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblusuario = new javax.swing.JLabel();
        lblGerenciarUsuarios1 = new javax.swing.JLabel();

        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone.png"))); // NOI18N

        tblUsuarios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null}
            },
            new String [] {
                "Usuários"
            }
        ));
        jScrollPane1.setViewportView(tblUsuarios);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir1.png"))); // NOI18N
        btnExcluir.setBorder(null);
        btnExcluir.setBorderPainted(false);
        btnExcluir.setContentAreaFilled(false);
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.setFocusPainted(false);
        btnExcluir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir2.png"))); // NOI18N
        btnExcluir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir2.png"))); // NOI18N
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/atualizarSenha1.png"))); // NOI18N
        btnAlterarSenha.setBorder(null);
        btnAlterarSenha.setBorderPainted(false);
        btnAlterarSenha.setContentAreaFilled(false);
        btnAlterarSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarSenha.setFocusPainted(false);
        btnAlterarSenha.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/atualizarSenha2.png"))); // NOI18N
        btnAlterarSenha.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/atualizarSenha2.png"))); // NOI18N
        btnAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarSenhaActionPerformed(evt);
            }
        });

        lblGerenciarUsuarios.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        lblGerenciarUsuarios.setForeground(new java.awt.Color(101, 96, 168));
        lblGerenciarUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGerenciarUsuarios.setText("GERENCIAR USUÁRIOS");

        btnCriar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/criar1.png"))); // NOI18N
        btnCriar.setBorder(null);
        btnCriar.setBorderPainted(false);
        btnCriar.setContentAreaFilled(false);
        btnCriar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCriar.setFocusPainted(false);
        btnCriar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/criar2.png"))); // NOI18N
        btnCriar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/criar2.png"))); // NOI18N
        btnCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarActionPerformed(evt);
            }
        });

        lblSenha.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(101, 96, 168));
        lblSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSenha.setText("Senha");

        txtNome.setBackground(new java.awt.Color(240, 240, 240));
        txtNome.setFont(new java.awt.Font("Arial Unicode MS", 0, 13)); // NOI18N
        txtNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNome.setBorder(null);

        jpfSenha.setBackground(new java.awt.Color(240, 240, 240));
        jpfSenha.setFont(new java.awt.Font("Arial Unicode MS", 0, 13)); // NOI18N
        jpfSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jpfSenha.setBorder(null);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblusuario.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblusuario.setForeground(new java.awt.Color(101, 96, 168));
        lblusuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblusuario.setText("Usuário");

        lblGerenciarUsuarios1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        lblGerenciarUsuarios1.setForeground(new java.awt.Color(101, 96, 168));
        lblGerenciarUsuarios1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGerenciarUsuarios1.setText("CRIAR NOVO USUÁRIO");
        lblGerenciarUsuarios1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAlterarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jpfSenha)
                                    .addComponent(jSeparator1)
                                    .addComponent(jSeparator2)
                                    .addComponent(lblusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNome)
                                    .addComponent(btnCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lblGerenciarUsuarios1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lblGerenciarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGerenciarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblGerenciarUsuarios1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblusuario)
                        .addGap(18, 18, 18)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSenha)
                        .addGap(18, 18, 18)
                        .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = tblUsuarios.getSelectedRow();
        String usuario = tblUsuarios.getValueAt(linha, 0).toString();

        int retorno = new UsuarioDAO().deletar(Menu.getUsuario(), usuario);

        if (retorno >= 0) {
            JOptionPane.showMessageDialog(null, "Usuário excluido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            preencherTabela(new UsuarioDAO().listar(Menu.getUsuario()));
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao excluir usuário!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarSenhaActionPerformed
        int linha = tblUsuarios.getSelectedRow();
        String usuario = tblUsuarios.getValueAt(linha, 0).toString();

        int retorno = new UsuarioDAO().deletar(Menu.getUsuario(), usuario);

        if (retorno >= 0) {
            String novaSenha = JOptionPane.showInputDialog(null, "Digite a nova senha:");

            int retorno2 = new UsuarioDAO().criar(Menu.getUsuario(), usuario, novaSenha);

            if (retorno2 >= 0) {
                JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                preencherTabela(new UsuarioDAO().listar(Menu.getUsuario()));
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao alterar senha!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao alterar senha!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarSenhaActionPerformed

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed

        if (txtNome.getText().isEmpty() || String.valueOf(jpfSenha.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(null, "Há campos em branco!", "Informação", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int retorno = new UsuarioDAO().criar(Menu.getUsuario(), txtNome.getText(), String.valueOf(jpfSenha.getPassword()));

            if (retorno >= 0) {
                JOptionPane.showMessageDialog(null, "Usuário criado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                txtNome.setText("");
                jpfSenha.setText("");
                preencherTabela(new UsuarioDAO().listar(Menu.getUsuario()));
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao usuário!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCriarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarSenha;
    private javax.swing.JButton btnCriar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JLabel lblGerenciarUsuarios;
    private javax.swing.JLabel lblGerenciarUsuarios1;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
    private void configurarFormulario() {
        this.setTitle("Gerenciar Usuários");
        this.setResizable(false);
        this.setMaximizable(false);
        this.setIconifiable(false);
        this.setClosable(true);

        configurarTabela();
        preencherTabela(new UsuarioDAO().listar(Menu.getUsuario()));
    }

    private void configurarTabela() {
        DefaultTableModel m = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        m.addColumn("Usuários");

        tblUsuarios.setModel(m);

        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        tblUsuarios.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        ((DefaultTableCellRenderer) tblUsuarios.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        tblUsuarios.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 12));
    }

    private void preencherTabela(List<Usuario> lista) {
        configurarTabela();
        if (lista.size() > 0) {
            DefaultTableModel m = (DefaultTableModel) tblUsuarios.getModel();
            for (Usuario u : lista) {
                m.addRow(new Object[]{
                    u.getNome(),});
            }
            tblUsuarios.setModel(m);
        }
    }

}
