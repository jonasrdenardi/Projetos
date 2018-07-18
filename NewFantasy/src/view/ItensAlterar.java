package view;

import controller.ItemDAO;
import java.awt.Dimension;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.ApenasNumeros;
import model.Item;

public class ItensAlterar extends javax.swing.JInternalFrame {

    DecimalFormat dm = new DecimalFormat("0.00");

    public ItensAlterar() {
        initComponents();
        txtCodItem.setEditable(false);
        configurarFormulario();
        preencherTabelaItem(new ItemDAO().listarTodos(Menu.getUsuario()));
        txtValor.setDocument(new ApenasNumeros());//Permite o usuario digitar apenas numeros ou virgula

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();
        lblItens = new javax.swing.JLabel();
        rdbDesc = new javax.swing.JRadioButton();
        rdbId = new javax.swing.JRadioButton();
        txtPesquisa = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        lblCodItem = new javax.swing.JLabel();
        txtCodItem = new javax.swing.JTextField();
        lblDescItem = new javax.swing.JLabel();
        txtDescItem = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        lblAtivo = new javax.swing.JLabel();
        jcbAtivo = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/java_icon.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(804, 450));

        tblItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód. Item", "Descrição Item", "Valor Un.", "Ativo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblItem.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblItem);

        lblItens.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblItens.setText("Itens");

        rdbDesc.setText("Descrição");

        rdbId.setText("ID");

        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jSeparator1.setPreferredSize(new java.awt.Dimension(0, 1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pesquisar Item");

        lblCodItem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCodItem.setText("Cód. Item");

        lblDescItem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDescItem.setText("Descrição do Item");

        lblValor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblValor.setText("Valor");

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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(rdbId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdbDesc)
                                .addGap(25, 25, 25))
                            .addComponent(txtPesquisa)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 35, Short.MAX_VALUE))
                    .addComponent(lblItens, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCodItem, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCodItem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDescItem)
                                    .addComponent(txtDescItem, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblValor)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAtivo)
                            .addComponent(jcbAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblItens, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rdbId)
                                    .addComponent(rdbDesc))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblCodItem, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCodItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblDescItem, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDescItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        if (rdbId.isSelected()) {
            if (txtPesquisa.getText().isEmpty() == true) {
                //Exclui todas as linhas da tabela
                while (tblItem.getModel().getRowCount() > 0) {
                    DefaultTableModel m = (DefaultTableModel) tblItem.getModel();
                    m.removeRow(0);
                }
                preencherTabelaItem(new ItemDAO().listarAtivos(Menu.getUsuario()));
            } else {
                //Exclui todas as linhas da tabela
                while (tblItem.getModel().getRowCount() > 0) {
                    DefaultTableModel m = (DefaultTableModel) tblItem.getModel();
                    m.removeRow(0);
                }
                try {
                    int id = Integer.parseInt(txtPesquisa.getText());
                    preencherTabelaItem(new ItemDAO().pesquisarPorId(Menu.getUsuario(), id));

                } catch (Exception e) {
                }
            }
        } else if (rdbDesc.isSelected()) {
            if (txtPesquisa.getText().isEmpty() == true) {
                //Exclui todas as linhas da tabela
                while (tblItem.getModel().getRowCount() > 0) {
                    DefaultTableModel m = (DefaultTableModel) tblItem.getModel();
                    m.removeRow(0);
                }
                preencherTabelaItem(new ItemDAO().listarAtivos(Menu.getUsuario()));
            } else {
                //Exclui todas as linhas da tabela
                while (tblItem.getModel().getRowCount() > 0) {
                    DefaultTableModel m = (DefaultTableModel) tblItem.getModel();
                    m.removeRow(0);
                }
                try {
                    String desc = txtPesquisa.getText();
                    preencherTabelaItem(new ItemDAO().pesquisarPorNome(Menu.getUsuario(), desc));
                } catch (Exception e) {
                }
            }

        }
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void jcbAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAtivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbAtivoActionPerformed

    private void tblItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemMouseClicked
        // Pega o indice da linha selecionada
        int indiceLinha = tblItem.getSelectedRow();
        if (indiceLinha != -1) {
            txtCodItem.setText(tblItem.getValueAt(indiceLinha, 0).toString());
            txtDescItem.setText(tblItem.getValueAt(indiceLinha, 1).toString());
            txtValor.setText(tblItem.getValueAt(indiceLinha, 2).toString());
            // adiciona com combo box primeiro o status ativo que o item ja está
            if (tblItem.getValueAt(indiceLinha, 3) == "sim") {
                jcbAtivo.removeAllItems(); // remove as opcoes do jcombobox para nao ir adicionando a cada novo clique nos itens
                jcbAtivo.addItem("sim");
                jcbAtivo.addItem("não");
            } else if (tblItem.getValueAt(indiceLinha, 3) == "não") {
                jcbAtivo.removeAllItems();
                jcbAtivo.addItem("não");
                jcbAtivo.addItem("sim");
            }
        }
    }//GEN-LAST:event_tblItemMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            // Verifica se há campos em branco
            if (txtDescItem.getText() == null || txtValor.getText() == null) {
                JOptionPane.showMessageDialog(this, "Há campos em branco");
            } else {
                // se não houver abre uma tela de confirmacao se realmente deseja inserir o item
                int resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente alterar este item ? ", "Confirma ?", JOptionPane.YES_NO_OPTION);

                //se a resposta for sim, altera o item na tabela
                if (resposta == JOptionPane.YES_OPTION) {
                    Item i = new Item();
                    i.setId(Integer.parseInt(txtCodItem.getText()));
                    i.setDesc(txtDescItem.getText());

                    String valorItem = (String) txtValor.getText(); // pega o valor do item e tranforma numa string
                    valorItem = valorItem.replaceAll("\\,", "."); // substitui virgula por ponto
                    i.setValor(Float.parseFloat(valorItem));

                    // se o item estiver ativo adiciona true senão adiciona false
                    if (jcbAtivo.getSelectedItem() == "sim") {
                        i.setFg_ativo(true);
                    } else if (jcbAtivo.getSelectedItem() == "não") {
                        i.setFg_ativo(false);
                    }

                    int retorno;
                    retorno = new ItemDAO().atualizar(Menu.getUsuario(), i);

                    if (retorno != -1) {
                        JOptionPane.showMessageDialog(null, "Item " + i.getDesc() + " alterado com sucesso\n" + "Cód.: " + i.getId());
                        txtDescItem.setText("");
                        txtValor.setText("");
                        jcbAtivo.removeAllItems();

                        //Exclui todas as linhas da tabela para atualizar novamente depois
                        while (tblItem.getModel().getRowCount() > 0) {
                            DefaultTableModel m = (DefaultTableModel) tblItem.getModel();
                            m.removeRow(0);
                        }
                        preencherTabelaItem(new ItemDAO().listarTodos(Menu.getUsuario()));
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> jcbAtivo;
    private javax.swing.JLabel lblAtivo;
    private javax.swing.JLabel lblCodItem;
    private javax.swing.JLabel lblDescItem;
    private javax.swing.JLabel lblItens;
    private javax.swing.JLabel lblValor;
    private javax.swing.JRadioButton rdbDesc;
    private javax.swing.JRadioButton rdbId;
    private javax.swing.JTable tblItem;
    private javax.swing.JTextField txtCodItem;
    private javax.swing.JTextField txtDescItem;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Alterar Item - New Fantasy");
        this.setResizable(false);
        this.setClosable(true);
        this.setIconifiable(true);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rdbId);
        bg.add(rdbDesc);
        rdbDesc.setSelected(true);
    }

    public void configurarTabelaItem() {
        //Configura a tabela e a posição dos itens na coluna
        DefaultTableModel m = (DefaultTableModel) tblItem.getModel();
        tblItem.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblItem.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblItem.getColumnModel().getColumn(2).setPreferredWidth(100);
        tblItem.getColumnModel().getColumn(3).setPreferredWidth(50);
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        tblItem.getColumnModel().getColumn(2).setCellRenderer(direita);
        tblItem.getColumnModel().getColumn(3).setCellRenderer(centralizado);

        tblItem.setModel(m);
    }

    public void preencherTabelaItem(List<Object> lista) {
        if (lista != null) {

            //Configura a tabela e a posição dos itens na coluna
            configurarTabelaItem();
            DefaultTableModel m = (DefaultTableModel) tblItem.getModel();

            for (Object obj : lista) {
                Item i = (Item) obj;
                m.addRow(new Object[]{i.getId(), i.getDesc(), dm.format(i.getValor()), (i.getFg_ativo()) ? "sim" : "não"});

            }
            tblItem.setModel(m);

        }
    }

    // Centraliza o JInternalFrame quando chamado
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

}
