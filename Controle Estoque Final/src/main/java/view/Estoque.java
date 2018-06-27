package view;

import controller.ProdutoDAO;
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

/**
 *
 * @author diego
 */
public class Estoque extends javax.swing.JInternalFrame {

    DecimalFormat dm = new DecimalFormat("0.00");
    SimpleDateFormat sdfNormal = new SimpleDateFormat("dd/MM/yyyy");

    public Estoque() {
        initComponents();
        configurarFormulario();

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
        spAdicionar = new javax.swing.JSpinner();
        spSubtrair = new javax.swing.JSpinner();
        btnOkAdicionar = new javax.swing.JButton();
        btnOkSubtrair = new javax.swing.JButton();

        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone.png"))); // NOI18N

        lblSelecione.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        lblSelecione.setForeground(new java.awt.Color(208, 92, 5));
        lblSelecione.setText("Pesquise e selecione o produto para efetuar a alteração");

        lblAlterarProduto.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        lblAlterarProduto.setForeground(new java.awt.Color(208, 92, 5));
        lblAlterarProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAlterarProduto.setText("ALTERAR ESTOQUE");

        rbId.setText("ID");

        rbDescricao.setText("Descrição");

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtPesquisa.setBackground(new java.awt.Color(214, 217, 223));
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
        tabResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabResultadosMouseClicked(evt);
            }
        });
        jspResultados.setViewportView(tabResultados);

        lblAdicionar.setText("Adicionar");

        lblSubtrair.setText("Subtrair");

        spAdicionar.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(999999.0f), Float.valueOf(1.0f)));
        JSpinner.NumberEditor jsEditor = (JSpinner.NumberEditor)spAdicionar.getEditor();
        DefaultFormatter formatter = (DefaultFormatter) jsEditor.getTextField().getFormatter();
        formatter.setAllowsInvalid(false);

        spSubtrair.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(999999.0f), Float.valueOf(1.0f)));
        JSpinner.NumberEditor jsEditorSub = (JSpinner.NumberEditor)spSubtrair.getEditor();
        DefaultFormatter formatterSub = (DefaultFormatter) jsEditorSub.getTextField().getFormatter();
        formatterSub.setAllowsInvalid(false);

        btnOkAdicionar.setText("OK");
        btnOkAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkAdicionarActionPerformed(evt);
            }
        });

        btnOkSubtrair.setText("OK");
        btnOkSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkSubtrairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(rbId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbDescricao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPesquisa)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblSubtrair)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(spSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblAdicionar)
                                        .addGap(18, 18, 18)
                                        .addComponent(spAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnOkAdicionar)
                                    .addComponent(btnOkSubtrair))))
                        .addGap(0, 365, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSelecione, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAlterarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jspResultados))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAlterarProduto)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbId)
                        .addComponent(rbDescricao))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSelecione)
                .addGap(11, 11, 11)
                .addComponent(jspResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdicionar)
                    .addComponent(spAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOkAdicionar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSubtrair)
                    .addComponent(spSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOkSubtrair))
                .addGap(21, 21, 21))
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

            float valorTabela = Float.valueOf(tabResultados.getValueAt(linha, 2).toString().replaceAll("\\,", "."));
            float valorAdc = (float) spAdicionar.getValue();
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

            spAdicionar.setValue(0);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto !");
        }

    }//GEN-LAST:event_btnOkAdicionarActionPerformed

    private void btnOkSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkSubtrairActionPerformed
        Produto p = new Produto();
        int linha = tabResultados.getSelectedRow();

        if (linha != -1) {

            float valorTabela = Float.valueOf(tabResultados.getValueAt(linha, 2).toString().replaceAll("\\,", "."));
            float valorSub = (float) spSubtrair.getValue();

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
            spSubtrair.setValue(0);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto !");
        }
    }//GEN-LAST:event_btnOkSubtrairActionPerformed


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
    private javax.swing.JSpinner spAdicionar;
    private javax.swing.JSpinner spSubtrair;
    private javax.swing.JTable tabResultados;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Estoque");
        this.setResizable(false);
        this.setMaximizable(false);
        this.setIconifiable(false);
        this.setClosable(true);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rbId);
        bg.add(rbDescricao);
        rbDescricao.setSelected(true);

        configurarTabela();

        //preencherTabela(new LivroDAO().listar());
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
        m.addColumn("Ativo");
        tabResultados.setModel(m);

        tabResultados.getColumnModel().getColumn(0).setPreferredWidth(15);
        tabResultados.getColumnModel().getColumn(1).setPreferredWidth(195);
        tabResultados.getColumnModel().getColumn(2).setPreferredWidth(20);
        tabResultados.getColumnModel().getColumn(3).setPreferredWidth(20);
        tabResultados.getColumnModel().getColumn(4).setPreferredWidth(20);
        tabResultados.getColumnModel().getColumn(5).setPreferredWidth(30);
        tabResultados.getColumnModel().getColumn(6).setPreferredWidth(10);
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        tabResultados.getColumnModel().getColumn(2).setCellRenderer(direita);
        tabResultados.getColumnModel().getColumn(3).setCellRenderer(direita);
        tabResultados.getColumnModel().getColumn(4).setCellRenderer(direita);
        tabResultados.getColumnModel().getColumn(5).setCellRenderer(centralizado);
        tabResultados.getColumnModel().getColumn(6).setCellRenderer(centralizado);
    }

    private boolean liberarFormulario() {

        return false;
    }

    private void preencherTabela(List<Produto> lista) {
        configurarTabela();
        if (lista.size() > 0) {
            DefaultTableModel m = (DefaultTableModel) tabResultados.getModel();
            for (Produto p : lista) {
                m.addRow(new Object[]{
                    p.getId(),
                    p.getDescricao(),
                    dm.format(p.getQtd()),
                    dm.format(p.getPrecoCompra()),
                    dm.format(p.getPreco()),
                    sdfNormal.format(p.getData()),
                    (p.getFg_ativo() == true) ? "Sim" : "Não"
                });
            }
            tabResultados.setModel(m);
        }
    }
}
