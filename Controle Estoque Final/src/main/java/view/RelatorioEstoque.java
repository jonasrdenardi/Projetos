package view;

import controller.Conexao;
import controller.ProdutoDAO;
import java.awt.Font;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Produto;
import model.Usuario;
import reports.Relatorio;

/**
 *
 * @author diego
 */
public class RelatorioEstoque extends javax.swing.JInternalFrame {

    DecimalFormat dm = new DecimalFormat("###,###,###,###,##0.00");

    public RelatorioEstoque() {
        initComponents();
        configurarFormulario();

        preencherTabela(new ProdutoDAO().listar(Menu.getUsuario()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jspResultados = new javax.swing.JScrollPane();
        tabResultados = new javax.swing.JTable();
        txtPesquisa = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        rbDescricao = new javax.swing.JRadioButton();
        rbId = new javax.swing.JRadioButton();
        lblRelatorioProduto = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rbTodos = new javax.swing.JRadioButton();
        rbAtivos = new javax.swing.JRadioButton();
        rbInativos = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone.png"))); // NOI18N

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
        jspResultados.setViewportView(tabResultados);

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

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rbDescricao.setForeground(new java.awt.Color(101, 96, 168));
        rbDescricao.setText("Descrição");
        rbDescricao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbDescricaoMousePressed(evt);
            }
        });

        rbId.setForeground(new java.awt.Color(101, 96, 168));
        rbId.setText("ID");
        rbId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbIdMousePressed(evt);
            }
        });

        lblRelatorioProduto.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        lblRelatorioProduto.setForeground(new java.awt.Color(101, 96, 168));
        lblRelatorioProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRelatorioProduto.setText("RELATÓRIO ESTOQUE");

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imprimir1.png"))); // NOI18N
        btnImprimir.setBorder(null);
        btnImprimir.setBorderPainted(false);
        btnImprimir.setContentAreaFilled(false);
        btnImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImprimir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imprimir2.png"))); // NOI18N
        btnImprimir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imprimir2.png"))); // NOI18N
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        lblTotal.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(101, 96, 168));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(101, 96, 168));
        jLabel2.setText("Valor do Estoque:");

        rbTodos.setForeground(new java.awt.Color(101, 96, 168));
        rbTodos.setText("Todos");
        rbTodos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbTodosStateChanged(evt);
            }
        });

        rbAtivos.setForeground(new java.awt.Color(101, 96, 168));
        rbAtivos.setText("Ativos");
        rbAtivos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbAtivosStateChanged(evt);
            }
        });

        rbInativos.setForeground(new java.awt.Color(101, 96, 168));
        rbInativos.setText("Inativos");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(101, 96, 168));
        jLabel3.setText("R$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRelatorioProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jspResultados, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPesquisa)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                        .addComponent(rbTodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbAtivos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbInativos)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRelatorioProduto)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(rbDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbAtivos)
                                .addComponent(rbInativos))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbTodos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        HashMap param = new HashMap();

        if (txtPesquisa.getText().isEmpty() || txtPesquisa.getText().equalsIgnoreCase("Digite sua pesquisa aqui!")) {
            if (rbAtivos.isSelected()) {
                param.put("PARAM", "WHERE fg_ativo = 1");
            } else if (rbInativos.isSelected()) {
                param.put("PARAM", "WHERE fg_ativo = 0");
            }
        } else {
            if (rbId.isSelected()) {
                if (rbAtivos.isSelected()) {
                    param.put("PARAM", "WHERE fg_ativo = 1 AND id = " + txtPesquisa.getText());
                } else if (rbInativos.isSelected()) {
                    param.put("PARAM", "WHERE fg_ativo = 0 AND id = " + txtPesquisa.getText());
                }
            } else if (rbDescricao.isSelected()) {
                if (rbAtivos.isSelected()) {
                    param.put("PARAM", "WHERE fg_ativo = 1 AND descricao like " + "'%" + txtPesquisa.getText() + "%'");
                } else if (rbInativos.isSelected()) {
                    param.put("PARAM", "WHERE fg_ativo = 0 AND descricao like " + "'%" + txtPesquisa.getText() + "%'");
                }
            }
        }

        if (rbTodos.isSelected()) {
            if (txtPesquisa.getText().isEmpty() || txtPesquisa.getText().equalsIgnoreCase("Digite sua pesquisa aqui!")) {
                param.put("PARAM", "");
                new Relatorio(
                    "rpt_produtos", //nome do relatório
                    Conexao.conectar(Menu.getUsuario()), //conexão com o sgbd
                    param //parâmetros
                ).show();
            } else{
                if (rbId.isSelected()) {
                    param.put("PARAM", "WHERE id = " + txtPesquisa.getText());
                    new Relatorio(
                        "rpt_produtos", //nome do relatório
                        Conexao.conectar(Menu.getUsuario()), //conexão com o sgbd
                        param //parâmetros
                    ).show();
                } else if (rbDescricao.isSelected()) {
                    param.put("PARAM", "WHERE descricao like " + "'%" + txtPesquisa.getText() + "%'");
                    new Relatorio(
                        "rpt_produtos", //nome do relatório
                        Conexao.conectar(Menu.getUsuario()), //conexão com o sgbd
                        param //parâmetros
                    ).show();
                }
            }     
        } else {
            new Relatorio(
                    "rpt_produtos", //nome do relatório
                    Conexao.conectar(Menu.getUsuario()), //conexão com o sgbd
                    param //parâmetros
            ).show();
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void rbTodosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbTodosStateChanged
        preencherTabela(new ProdutoDAO().listar(Menu.getUsuario()));
    }//GEN-LAST:event_rbTodosStateChanged

    private void rbAtivosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbAtivosStateChanged
        preencherTabela(new ProdutoDAO().listar(Menu.getUsuario()));
    }//GEN-LAST:event_rbAtivosStateChanged

    private void rbDescricaoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbDescricaoMousePressed
        preencherTabela(new ProdutoDAO().listar(Menu.getUsuario()));
        txtPesquisa.setText("");
    }//GEN-LAST:event_rbDescricaoMousePressed

    private void rbIdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbIdMousePressed
        preencherTabela(new ProdutoDAO().listar(Menu.getUsuario()));
        txtPesquisa.setText("");
    }//GEN-LAST:event_rbIdMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JScrollPane jspResultados;
    private javax.swing.JLabel lblRelatorioProduto;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JRadioButton rbAtivos;
    private javax.swing.JRadioButton rbDescricao;
    private javax.swing.JRadioButton rbId;
    private javax.swing.JRadioButton rbInativos;
    private javax.swing.JRadioButton rbTodos;
    private javax.swing.JTable tabResultados;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Relatório Estoque");
        this.setResizable(false);
        this.setMaximizable(false);
        this.setIconifiable(false);
        this.setClosable(true);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rbId);
        bg.add(rbDescricao);
        rbDescricao.setSelected(true);

        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(rbTodos);
        bg2.add(rbAtivos);
        bg2.add(rbInativos);
        rbTodos.setSelected(true);

        configurarTabela();
        
        getRootPane().setDefaultButton(btnImprimir);

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
        m.addColumn("Valor Total");
        m.addColumn("Ativo");
        tabResultados.setModel(m);

        tabResultados.getColumnModel().getColumn(0).setPreferredWidth(15);
        tabResultados.getColumnModel().getColumn(1).setPreferredWidth(160);
        tabResultados.getColumnModel().getColumn(2).setPreferredWidth(15);
        tabResultados.getColumnModel().getColumn(3).setPreferredWidth(50);
        tabResultados.getColumnModel().getColumn(4).setPreferredWidth(15);
        tabResultados.getColumnModel().getColumn(5).setPreferredWidth(35);
        tabResultados.getColumnModel().getColumn(6).setPreferredWidth(15);
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        tabResultados.getColumnModel().getColumn(2).setCellRenderer(direita);
        tabResultados.getColumnModel().getColumn(3).setCellRenderer(direita);
        tabResultados.getColumnModel().getColumn(4).setCellRenderer(direita);
        tabResultados.getColumnModel().getColumn(5).setCellRenderer(direita);
        tabResultados.getColumnModel().getColumn(6).setCellRenderer(centralizado);
        ((DefaultTableCellRenderer) tabResultados.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        tabResultados.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 12));
    }

    private void preencherTabela(List<Produto> lista) {
        configurarTabela();
        float total = 0;
        if (lista.size() > 0) {
            DefaultTableModel m = (DefaultTableModel) tabResultados.getModel();
            for (Produto p : lista) {

                if (rbTodos.isSelected()) {
                    m.addRow(new Object[]{
                        p.getId(),
                        p.getDescricao(),
                        dm.format(p.getQtd()),
                        dm.format(p.getPrecoCompra()),
                        dm.format(p.getPreco()),
                        dm.format(p.getQtd() * p.getPreco()),
                        (p.getFg_ativo() == true) ? "Sim" : "Não"
                    });
                    total += p.getPreco() * p.getQtd();
                } else if (rbAtivos.isSelected()) {
                    if (p.getFg_ativo() == true) {
                        m.addRow(new Object[]{
                            p.getId(),
                            p.getDescricao(),
                            dm.format(p.getQtd()),
                            dm.format(p.getPrecoCompra()),
                            dm.format(p.getPreco()),
                            dm.format(p.getQtd() * p.getPreco()),
                            "Sim"
                        });
                        total += p.getPreco() * p.getQtd();
                    }
                } else if (p.getFg_ativo() == false) {
                    m.addRow(new Object[]{
                        p.getId(),
                        p.getDescricao(),
                        dm.format(p.getQtd()),
                        dm.format(p.getPrecoCompra()),
                        dm.format(p.getPreco()),
                        dm.format(p.getQtd() * p.getPreco()),
                        "Não"
                    });
                    total += p.getPreco() * p.getQtd();
                }

            }
            lblTotal.setText(String.valueOf(dm.format(total)));
            tabResultados.setModel(m);
        }
    }

}
