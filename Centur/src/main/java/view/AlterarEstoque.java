package view;

import controller.ProdutoDAO;
import java.awt.Font;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Produto;
import javax.swing.text.DefaultFormatter;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import model.ApenasNumeros;

/**
 *
 * @author diego
 */
public class AlterarEstoque extends javax.swing.JInternalFrame {

    DecimalFormat dm = new DecimalFormat("###,###,###,###,##0.00");
    SimpleDateFormat sdfNormal = new SimpleDateFormat("dd/MM/yyyy");

    public AlterarEstoque() {
        initComponents();
        configurarFormulario();
        
        txtAdicionar.setDocument(new ApenasNumeros());
        txtSubtrair.setDocument(new ApenasNumeros());

        preencherTabela(new ProdutoDAO().listar(Menu.getUsuario()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSelecione = new javax.swing.JLabel();
        lblAlterarProduto = new javax.swing.JLabel();
        rbId = new javax.swing.JRadioButton();
        rbDescricao = new javax.swing.JRadioButton();
        jSeparator6 = new javax.swing.JSeparator();
        txtPesquisa = new javax.swing.JTextField();
        jspResultados = new javax.swing.JScrollPane();
        tabResultados = new javax.swing.JTable();
        lblAdicionar = new javax.swing.JLabel();
        lblSubtrair = new javax.swing.JLabel();
        btnOkAdicionar = new javax.swing.JButton();
        btnOkSubtrair = new javax.swing.JButton();
        txtAdicionar = new javax.swing.JTextField();
        txtSubtrair = new javax.swing.JTextField();

        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone.png"))); // NOI18N

        lblSelecione.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        lblSelecione.setForeground(new java.awt.Color(101, 96, 168));
        lblSelecione.setText("Pesquise e clique no produto para efetuar a alteração");

        lblAlterarProduto.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        lblAlterarProduto.setForeground(new java.awt.Color(101, 96, 168));
        lblAlterarProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAlterarProduto.setText("ALTERAR ESTOQUE");

        rbId.setForeground(new java.awt.Color(101, 96, 168));
        rbId.setText("ID");
        rbId.setRequestFocusEnabled(false);
        rbId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbIdMouseReleased(evt);
            }
        });

        rbDescricao.setForeground(new java.awt.Color(101, 96, 168));
        rbDescricao.setText("Descrição");
        rbDescricao.setRequestFocusEnabled(false);
        rbDescricao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbDescricaoMouseReleased(evt);
            }
        });

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtPesquisa.setBackground(new java.awt.Color(240, 240, 240));
        txtPesquisa.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        txtPesquisa.setForeground(new java.awt.Color(153, 153, 153));
        txtPesquisa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPesquisa.setText("Digite sua pesquisa aqui!");
        txtPesquisa.setBorder(null);
        txtPesquisa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPesquisaFocusGained(evt);
            }
        });
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        tabResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabResultados.setSelectionBackground(new java.awt.Color(168, 193, 221));
        tabResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabResultadosMouseClicked(evt);
            }
        });
        jspResultados.setViewportView(tabResultados);

        lblAdicionar.setForeground(new java.awt.Color(101, 96, 168));
        lblAdicionar.setText("ADICIONAR:");

        lblSubtrair.setForeground(new java.awt.Color(101, 96, 168));
        lblSubtrair.setText("SUBTRAIR:");

        btnOkAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add1.png"))); // NOI18N
        btnOkAdicionar.setBorder(null);
        btnOkAdicionar.setBorderPainted(false);
        btnOkAdicionar.setContentAreaFilled(false);
        btnOkAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOkAdicionar.setFocusPainted(false);
        btnOkAdicionar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnOkAdicionar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnOkAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkAdicionarActionPerformed(evt);
            }
        });

        btnOkSubtrair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sub1.png"))); // NOI18N
        btnOkSubtrair.setBorder(null);
        btnOkSubtrair.setBorderPainted(false);
        btnOkSubtrair.setContentAreaFilled(false);
        btnOkSubtrair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOkSubtrair.setFocusPainted(false);
        btnOkSubtrair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sub.png"))); // NOI18N
        btnOkSubtrair.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sub.png"))); // NOI18N
        btnOkSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkSubtrairActionPerformed(evt);
            }
        });

        txtAdicionar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAdicionarKeyReleased(evt);
            }
        });

        txtSubtrair.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSubtrairKeyReleased(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbDescricao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblSelecione, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 497, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSubtrair)
                            .addComponent(lblAdicionar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(txtSubtrair))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnOkAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOkSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(709, 709, 709))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAlterarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jspResultados)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAlterarProduto)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSelecione)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblAdicionar)
                        .addGap(46, 46, 46)
                        .addComponent(lblSubtrair))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnOkAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addComponent(btnOkSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPesquisaFocusGained

        txtPesquisa.setText("");
        txtPesquisa.setForeground(java.awt.Color.BLACK);

    }//GEN-LAST:event_txtPesquisaFocusGained

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased

        String chave = txtPesquisa.getText();

        if (chave.isEmpty()) {
            preencherTabela(new ProdutoDAO().listar(Menu.getUsuario()));
        } else if (rbId.isSelected()) {
            preencherTabela(new ProdutoDAO().pesquisarPorId(Menu.getUsuario(), Integer.parseInt(chave)));
        } else if (rbDescricao.isSelected()) {
            preencherTabela(new ProdutoDAO().pesquisarPorDescricao(Menu.getUsuario(), chave));
        }

    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void tabResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabResultadosMouseClicked

        if (evt.getClickCount() == 2) {

            int linha = tabResultados.getSelectedRow();
            String id = tabResultados.getValueAt(linha, 0).toString();
        }

    }//GEN-LAST:event_tabResultadosMouseClicked

    private void btnOkAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkAdicionarActionPerformed
        Produto p = new Produto();
        int linha = tabResultados.getSelectedRow();

        if (linha != -1) {

            float valorTabela = Float.valueOf(tabResultados.getValueAt(linha, 2).toString().replaceAll("\\.", "").replaceAll("\\,", "."));
            float valorAdc = Float.parseFloat(txtAdicionar.getText().replaceAll("\\.", "").replaceAll("\\,", "."));
            p.setId((int) tabResultados.getValueAt(linha, 0));
            p.setQtd(valorTabela + valorAdc);

            int res = -1;

            res = new ProdutoDAO().atualizarEstoque(Menu.getUsuario(), p);

            if (res != -1) {
                JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!.", "Controle Estoque", JOptionPane.INFORMATION_MESSAGE);
                preencherTabela(new ProdutoDAO().listar(Menu.getUsuario()));
            } else {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro durante a operação", "Controle Estoque", JOptionPane.ERROR_MESSAGE);
            }
            txtAdicionar.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto !");
        }

    }//GEN-LAST:event_btnOkAdicionarActionPerformed

    private void btnOkSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkSubtrairActionPerformed
        Produto p = new Produto();
        int linha = tabResultados.getSelectedRow();

        if (linha != -1) {

            float valorTabela = Float.valueOf(tabResultados.getValueAt(linha, 2).toString().replaceAll("\\.", "").replaceAll("\\,", "."));
            float valorSub = Float.parseFloat(txtSubtrair.getText().replaceAll("\\.", "").replaceAll("\\,", "."));

            if (valorTabela - valorSub >= 0) {

                p.setId((int) tabResultados.getValueAt(linha, 0));
                p.setQtd(valorTabela - valorSub);

                int res = -1;

                res = new ProdutoDAO().atualizarEstoque(Menu.getUsuario(), p);

                if (res != -1) {
                    JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!.", "Controle Estoque", JOptionPane.INFORMATION_MESSAGE);
                    preencherTabela(new ProdutoDAO().listar(Menu.getUsuario()));

                } else {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro durante a operação", "Controle Estoque", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Não é possível deixar o estoque negativo !", "Controle Estoque", JOptionPane.ERROR_MESSAGE);
            }
            txtSubtrair.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto !");
        }
    }//GEN-LAST:event_btnOkSubtrairActionPerformed

    private void txtAdicionarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdicionarKeyReleased
        txtSubtrair.setText("");
    }//GEN-LAST:event_txtAdicionarKeyReleased

    private void txtSubtrairKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSubtrairKeyReleased
        txtAdicionar.setText("");
    }//GEN-LAST:event_txtSubtrairKeyReleased

    private void rbIdMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbIdMouseReleased
        txtPesquisa.setText("Digite sua pesquisa aqui!");
        txtPesquisa.setForeground(new java.awt.Color(153, 153, 153));
        preencherTabela(new ProdutoDAO().listar(Menu.getUsuario()));
    }//GEN-LAST:event_rbIdMouseReleased

    private void rbDescricaoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbDescricaoMouseReleased
        txtPesquisa.setText("Digite sua pesquisa aqui!");
        txtPesquisa.setForeground(new java.awt.Color(153, 153, 153));
        preencherTabela(new ProdutoDAO().listar(Menu.getUsuario()));
    }//GEN-LAST:event_rbDescricaoMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOkAdicionar;
    private javax.swing.JButton btnOkSubtrair;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JScrollPane jspResultados;
    private javax.swing.JLabel lblAdicionar;
    private javax.swing.JLabel lblAlterarProduto;
    private javax.swing.JLabel lblSelecione;
    private javax.swing.JLabel lblSubtrair;
    private javax.swing.JRadioButton rbDescricao;
    private javax.swing.JRadioButton rbId;
    private javax.swing.JTable tabResultados;
    private javax.swing.JTextField txtAdicionar;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtSubtrair;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Alterar Estoque");
        this.setResizable(false);
        this.setMaximizable(false);
        this.setIconifiable(false);
        this.setClosable(true);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rbId);
        bg.add(rbDescricao);
        rbDescricao.setSelected(true);

        configurarTabela();

        liberarFormulario();  

    }

    private void configurarTabela() {
        DefaultTableModel m = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        m.addColumn("Id");
        m.addColumn("Descrição");
        m.addColumn("Qtde");
        m.addColumn("Preço Compra");
        m.addColumn("Preço");
        m.addColumn("Vencimento");
        tabResultados.setModel(m);

        tabResultados.getColumnModel().getColumn(0).setPreferredWidth(15);
        tabResultados.getColumnModel().getColumn(1).setPreferredWidth(195);
        tabResultados.getColumnModel().getColumn(2).setPreferredWidth(20);
        tabResultados.getColumnModel().getColumn(3).setPreferredWidth(20);
        tabResultados.getColumnModel().getColumn(4).setPreferredWidth(20);
        tabResultados.getColumnModel().getColumn(5).setPreferredWidth(30);
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        tabResultados.getColumnModel().getColumn(2).setCellRenderer(direita);
        tabResultados.getColumnModel().getColumn(3).setCellRenderer(direita);
        tabResultados.getColumnModel().getColumn(4).setCellRenderer(direita);
        tabResultados.getColumnModel().getColumn(5).setCellRenderer(centralizado);
        ((DefaultTableCellRenderer) tabResultados.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        tabResultados.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 12));
    }

    private boolean liberarFormulario() {

        return false;
    }

    private void preencherTabela(List<Produto> lista) {
        configurarTabela();
        if (lista.size() > 0) {
            DefaultTableModel m = (DefaultTableModel) tabResultados.getModel();
            for (Produto p : lista) {
                if (p.getFg_ativo() == true) {
                    m.addRow(new Object[]{
                        p.getId(),
                        p.getDescricao(),
                        dm.format(p.getQtd()),
                        dm.format(p.getPrecoCompra()),
                        dm.format(p.getPreco()),
                        sdfNormal.format(p.getData())
                    });
                }
            }
            tabResultados.setModel(m);
        }
    }
}
