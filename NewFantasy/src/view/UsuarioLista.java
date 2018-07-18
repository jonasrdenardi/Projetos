package view;

import controller.PedidoDAO;
import controller.UsuarioDAO;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Pedido;
import model.Usuario;

public class UsuarioLista extends javax.swing.JInternalFrame {

    public UsuarioLista() {
        initComponents();
        this.setTitle("Usuários - New Fantasy");
        // Chama o metodo listar do PedidoDAO passando o usuário de login como parametro
        preencherTabelauUsuario(new UsuarioDAO().listar(Menu.getUsuario()));
        txtUsuario.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuario = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblAtivo = new javax.swing.JLabel();
        jcbAtivo = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/java_icon.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(480, 430));

        tblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuário", "Ativo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuario.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuario);
        if (tblUsuario.getColumnModel().getColumnCount() > 0) {
            tblUsuario.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblUsuario.getColumnModel().getColumn(1).setPreferredWidth(25);
        }

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsuario.setText("Usuario");

        lblAtivo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAtivo.setText("Ativo");

        jcbAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAtivoActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(lblAtivo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jcbAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jcbAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(190, 190, 190))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // Pega o indice da linha selecionada
        int indiceLinha = tblUsuario.getSelectedRow();
        if (indiceLinha != -1) {
            //Pega o nome do usuario
            String nomeUsuario = (String) tblUsuario.getValueAt(indiceLinha, 0);
            int resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir o usuario " + nomeUsuario + " ?", "Confirma ?", JOptionPane.YES_NO_OPTION);

            //Se a resposta for sim, tenta excluir o usuario
            if (resposta == JOptionPane.YES_OPTION) {
                //Passa como parametro nome do usuario que gostaria de excluir
                int retorno = new UsuarioDAO().deletar(Menu.getUsuario(), nomeUsuario);

                //Se o usuário foi excluido mostra mengsagem de sucesso dentro do if, se nao mostra mensagem de erro do metodo de deletar usuario
                if (retorno >= 0) {
                    JOptionPane.showMessageDialog(this, "Usuario " + nomeUsuario + " excluido com sucesso !");

                    //Exclui o usuario da lista
                    if (tblUsuario.getSelectedRow() != -1) {
                        // Remove item selecionado da tabela usuario 
                        ((DefaultTableModel) tblUsuario.getModel()).removeRow(indiceLinha);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um usuario !");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jcbAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAtivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbAtivoActionPerformed

    private void tblUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuarioMouseClicked
        // Pega o indice da linha selecionada
        int indiceLinha = tblUsuario.getSelectedRow();
        if (indiceLinha != -1) {
            txtUsuario.setText(tblUsuario.getValueAt(indiceLinha, 0).toString());
            // adiciona com combo box primeiro o status ativo que o item ja está
            if (tblUsuario.getValueAt(indiceLinha, 1) == "sim") {
                jcbAtivo.removeAllItems(); // remove as opcoes do jcombobox para nao ir adicionando a cada novo clique nos itens
                jcbAtivo.addItem("sim");
                jcbAtivo.addItem("não");
            } else if (tblUsuario.getValueAt(indiceLinha, 1) == "não") {
                jcbAtivo.removeAllItems();
                jcbAtivo.addItem("não");
                jcbAtivo.addItem("sim");
            }
        }
    }//GEN-LAST:event_tblUsuarioMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            // Verifica se há campos em branco
            if (txtUsuario.getText() == null) {
                JOptionPane.showMessageDialog(this, "Selecione um usuário");
            } else {
                // se não houver abre uma tela de confirmacao se realmente deseja alterar usuario
                int resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente alterar este usuário ? ", "Confirma ?", JOptionPane.YES_NO_OPTION);

                //se a resposta for sim, altera o usuario
                if (resposta == JOptionPane.YES_OPTION) {
                    Usuario u = new Usuario();
                    
                    u.setNome(txtUsuario.getText());
                    // Se o usuario ativo for sim passa -1 se nao passa 0
                    if (jcbAtivo.getSelectedItem() == "sim") {
                        u.setLimiteCon(-1);
                    } else if (jcbAtivo.getSelectedItem() == "não") {
                        u.setLimiteCon(0);
                    }

                    int retorno;
                    retorno = new UsuarioDAO().atualizar(Menu.getUsuario(), u);

                    if (retorno != -1) {
                        JOptionPane.showMessageDialog(null, "Usuario " + u.getNome() +" alterado com sucesso");
                        txtUsuario.setText("");
                        jcbAtivo.removeAllItems();

                        //Exclui todas as linhas da tabela para atualizar novamente depois
                        while (tblUsuario.getModel().getRowCount() > 0) {
                            DefaultTableModel m = (DefaultTableModel) tblUsuario.getModel();
                            m.removeRow(0);
                        }
                       preencherTabelauUsuario(new UsuarioDAO().listar(Menu.getUsuario()));
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbAtivo;
    private javax.swing.JLabel lblAtivo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tblUsuario;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    // Preenche tabela usuarios
    public void preencherTabelauUsuario(List<Object> lista) {
        if (lista != null) {
            if (lista.size() > 0) {
                configurarTabelaUsuario();
                DefaultTableModel m = (DefaultTableModel) tblUsuario.getModel();
                for (Object obj : lista) {
                    Usuario u = (Usuario) obj;
                    m.addRow(new Object[]{u.getNome(),(u.getLimiteCon()== 0) ? "não" : "sim"});

                }

            }

        }
    }

    // Configura tabela usuarios
    public void configurarTabelaUsuario() {
        //Configura a tabela
        DefaultTableModel m = (DefaultTableModel) tblUsuario.getModel();
        tblUsuario.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblUsuario.getColumnModel().getColumn(1).setPreferredWidth(50);
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        tblUsuario.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        tblUsuario.getColumnModel().getColumn(1).setCellRenderer(centralizado);

        tblUsuario.setModel(m);
    }

    // Centraliza o JInternalFrame quando chamado
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

}
