package view;

import controller.Conexao;
import controller.RetornoDAO;
import java.awt.Font;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Retorno;
import reports.Relatorio;

public class RelatorioRecebimento extends javax.swing.JInternalFrame {

    List<Retorno> retornos = new ArrayList<>();

    DecimalFormat dm = new DecimalFormat("###,###,###,###,##0.00");
    SimpleDateFormat sdfNormal = new SimpleDateFormat("dd/MM/yyyy");

    public RelatorioRecebimento() {
        initComponents();
        configurarFormulario();

        retornos = new RetornoDAO().listarRelatorioVendaEClienteERecebimento(Menu.getUsuario());

        jpData.setVisible(false);

        preencherTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jspResultados = new javax.swing.JScrollPane();
        tabResultados = new javax.swing.JTable();
        rbData = new javax.swing.JRadioButton();
        rbId = new javax.swing.JRadioButton();
        lblRelatorioVenda = new javax.swing.JLabel();
        btnDetalhesVenda = new javax.swing.JButton();
        rbNome = new javax.swing.JRadioButton();
        jpPesquisa = new javax.swing.JPanel();
        txtPesquisa = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jpData = new javax.swing.JPanel();
        jdcData1 = new com.toedter.calendar.JDateChooser();
        btnOk = new javax.swing.JButton();
        jdcData2 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        btnDetalhesRecebimento = new javax.swing.JButton();
        rbNao = new javax.swing.JRadioButton();
        rbSim = new javax.swing.JRadioButton();
        rbTodos = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone.png"))); // NOI18N

        tabResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Recebimento", "ID Venda", "N° Parcela", "Cliente", "Data Venda", "Data Recebimento", "Valor Recebido", "Modo Pgto", "Recebido?"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabResultados.setSelectionBackground(new java.awt.Color(168, 193, 221));
        tabResultados.getTableHeader().setReorderingAllowed(false);
        jspResultados.setViewportView(tabResultados);

        rbData.setForeground(new java.awt.Color(101, 96, 168));
        rbData.setText("Data Recebimento");
        rbData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbDataMousePressed(evt);
            }
        });

        rbId.setForeground(new java.awt.Color(101, 96, 168));
        rbId.setText("ID Venda");
        rbId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbIdMousePressed(evt);
            }
        });

        lblRelatorioVenda.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        lblRelatorioVenda.setForeground(new java.awt.Color(101, 96, 168));
        lblRelatorioVenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRelatorioVenda.setText("RELATÓRIO DE RECEBIMENTOS");

        btnDetalhesVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/detalhes_venda1.png"))); // NOI18N
        btnDetalhesVenda.setBorder(null);
        btnDetalhesVenda.setBorderPainted(false);
        btnDetalhesVenda.setContentAreaFilled(false);
        btnDetalhesVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDetalhesVenda.setFocusPainted(false);
        btnDetalhesVenda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/detalhes_venda2.png"))); // NOI18N
        btnDetalhesVenda.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/detalhes_venda2.png"))); // NOI18N
        btnDetalhesVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhesVendaActionPerformed(evt);
            }
        });

        rbNome.setForeground(new java.awt.Color(101, 96, 168));
        rbNome.setText("Nome");
        rbNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbNomeMousePressed(evt);
            }
        });

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

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jpPesquisaLayout = new javax.swing.GroupLayout(jpPesquisa);
        jpPesquisa.setLayout(jpPesquisaLayout);
        jpPesquisaLayout.setHorizontalGroup(
            jpPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPesquisa)
            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jpPesquisaLayout.setVerticalGroup(
            jpPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPesquisaLayout.createSequentialGroup()
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ok1.png"))); // NOI18N
        btnOk.setBorder(null);
        btnOk.setBorderPainted(false);
        btnOk.setContentAreaFilled(false);
        btnOk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOk.setFocusPainted(false);
        btnOk.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ok2.png"))); // NOI18N
        btnOk.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ok2.png"))); // NOI18N
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(101, 96, 168));
        jLabel1.setText("Data Inicial");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(101, 96, 168));
        jLabel2.setText("Data Final");

        javax.swing.GroupLayout jpDataLayout = new javax.swing.GroupLayout(jpData);
        jpData.setLayout(jpDataLayout);
        jpDataLayout.setHorizontalGroup(
            jpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDataLayout.createSequentialGroup()
                .addGroup(jpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcData1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcData2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpDataLayout.setVerticalGroup(
            jpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDataLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpDataLayout.createSequentialGroup()
                        .addGroup(jpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdcData2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jdcData1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imprimir1.png"))); // NOI18N
        btnImprimir.setBorder(null);
        btnImprimir.setBorderPainted(false);
        btnImprimir.setContentAreaFilled(false);
        btnImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImprimir.setFocusPainted(false);
        btnImprimir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imprimir2.png"))); // NOI18N
        btnImprimir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imprimir2.png"))); // NOI18N
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnDetalhesRecebimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/detalhes_recebimento1.png"))); // NOI18N
        btnDetalhesRecebimento.setBorder(null);
        btnDetalhesRecebimento.setBorderPainted(false);
        btnDetalhesRecebimento.setContentAreaFilled(false);
        btnDetalhesRecebimento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDetalhesRecebimento.setRequestFocusEnabled(false);
        btnDetalhesRecebimento.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/detalhes_recebimento2.png"))); // NOI18N
        btnDetalhesRecebimento.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/detalhes_recebimento2.png"))); // NOI18N
        btnDetalhesRecebimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhesRecebimentoActionPerformed(evt);
            }
        });

        rbNao.setForeground(new java.awt.Color(101, 96, 168));
        rbNao.setText("Não");
        rbNao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbNaoMouseReleased(evt);
            }
        });

        rbSim.setForeground(new java.awt.Color(101, 96, 168));
        rbSim.setText("Sim");
        rbSim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbSimMouseReleased(evt);
            }
        });

        rbTodos.setForeground(new java.awt.Color(101, 96, 168));
        rbTodos.setText("Todos");
        rbTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbTodosMouseReleased(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(101, 96, 168));
        jLabel3.setText("Recebido?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jspResultados, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRelatorioVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(rbTodos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbSim))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbNao))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(324, 324, 324)
                        .addComponent(btnDetalhesRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDetalhesVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRelatorioVenda)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jpData, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rbData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rbId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jpPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 10, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbTodos)
                            .addComponent(rbSim)
                            .addComponent(rbNao))
                        .addGap(18, 18, 18)))
                .addComponent(jspResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDetalhesVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnDetalhesRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(27, 27, 27))
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
            retornos = new RetornoDAO().listarRelatorioVendaEClienteERecebimento(Menu.getUsuario());
            preencherTabela();
        } else if (rbId.isSelected()) {
            retornos = new RetornoDAO().listarRelatorioVendaEClienteERecebimentoPorIdVenda(Menu.getUsuario(), Integer.valueOf(txtPesquisa.getText()));
            preencherTabela();
        } else if (rbNome.isSelected()) {
            retornos = new RetornoDAO().listarRelatorioVendaEClienteERecebimentoPorNome(Menu.getUsuario(), txtPesquisa.getText());
            preencherTabela();
        }
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void btnDetalhesVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhesVendaActionPerformed
        // Pega o indice da linha selecionada
        int indiceLinha = tabResultados.getSelectedRow();

        if (indiceLinha != -1) {
            int idVenda = ((int) tabResultados.getValueAt(indiceLinha, 1));

            RelatorioRecebimentoVendaDetalhes jiRelatorioRecebimentoVendaDetalhes = new RelatorioRecebimentoVendaDetalhes(idVenda);
            Menu.areaTrabalho.add(jiRelatorioRecebimentoVendaDetalhes);
            jiRelatorioRecebimentoVendaDetalhes.setVisible(true);
            jiRelatorioRecebimentoVendaDetalhes.setPosicao();  // Centraliza a Tela Interna
            //this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma venda!");
        }
    }//GEN-LAST:event_btnDetalhesVendaActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        if (jdcData1.getDate() == null || jdcData2.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Preencha as datas corretamente!", "Erro", JOptionPane.WARNING_MESSAGE);
        } else {
            retornos = new RetornoDAO().listarRelatorioVendaEClienteERecebimentoPorData(Menu.getUsuario(), jdcData1.getDate(), jdcData2.getDate());
            preencherTabela();
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void rbNomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbNomeMousePressed
        jpData.setVisible(false);
        jpPesquisa.setVisible(true);
        txtPesquisa.setText("Digite sua pesquisa aqui!");
        txtPesquisa.setForeground(new java.awt.Color(153, 153, 153));
        retornos = new RetornoDAO().listarRelatorioVendaEClienteERecebimento(Menu.getUsuario());
        preencherTabela();

    }//GEN-LAST:event_rbNomeMousePressed

    private void rbDataMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbDataMousePressed
        txtPesquisa.setText(".");
        jpData.setVisible(true);
        jpPesquisa.setVisible(false);
        jdcData1.setDate(null);
        jdcData2.setDate(null);
        retornos = new RetornoDAO().listarRelatorioVendaEClienteERecebimento(Menu.getUsuario());
        preencherTabela();
    }//GEN-LAST:event_rbDataMousePressed

    private void rbIdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbIdMousePressed
        jpData.setVisible(false);
        jpPesquisa.setVisible(true);
        txtPesquisa.setText("Digite sua pesquisa aqui!");
        txtPesquisa.setForeground(new java.awt.Color(153, 153, 153));
        retornos = new RetornoDAO().listarRelatorioVendaEClienteERecebimento(Menu.getUsuario());
        preencherTabela();
    }//GEN-LAST:event_rbIdMousePressed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        HashMap param = new HashMap();

        if (rbId.isSelected()) {
            if (rbTodos.isSelected()) {
                if (txtPesquisa.getText().isEmpty() || txtPesquisa.getText().equalsIgnoreCase("Digite sua pesquisa aqui!")) {
                    param.put("PARAM", "");
                    new Relatorio(
                            "rpt_recebimento", //todas as vendas
                            Conexao.conectar(Menu.getUsuario()), //conexão com o sgbd
                            param //parâmetros
                    ).show();
                } else {
                    param.put("PARAM", "WHERE v.id = " + txtPesquisa.getText());
                    new Relatorio(
                            "rpt_recebimento", //nome do relatório
                            Conexao.conectar(Menu.getUsuario()), //conexão com o sgbd
                            param //parâmetros
                    ).show();
                }
            } else if (rbSim.isSelected()) {
                if (txtPesquisa.getText().isEmpty() || txtPesquisa.getText().equalsIgnoreCase("Digite sua pesquisa aqui!")) {
                    param.put("PARAM", "WHERE r.fg_ativo = false");
                    new Relatorio(
                            "rpt_recebimento", //todas as vendas
                            Conexao.conectar(Menu.getUsuario()), //conexão com o sgbd
                            param //parâmetros
                    ).show();
                } else {
                    param.put("PARAM", "WHERE v.id = " + txtPesquisa.getText() + "AND r.fg_ativo = false");
                    new Relatorio(
                            "rpt_recebimento", //nome do relatório
                            Conexao.conectar(Menu.getUsuario()), //conexão com o sgbd
                            param //parâmetros
                    ).show();
                }
            } else if (rbNao.isSelected()) {
                if (txtPesquisa.getText().isEmpty() || txtPesquisa.getText().equalsIgnoreCase("Digite sua pesquisa aqui!")) {
                    param.put("PARAM", "WHERE r.fg_ativo = true");
                    new Relatorio(
                            "rpt_recebimento", //todas as vendas
                            Conexao.conectar(Menu.getUsuario()), //conexão com o sgbd
                            param //parâmetros
                    ).show();
                } else {
                    param.put("PARAM", "WHERE v.id = " + txtPesquisa.getText() + "AND r.fg_ativo = true");
                    new Relatorio(
                            "rpt_recebimento", //nome do relatório
                            Conexao.conectar(Menu.getUsuario()), //conexão com o sgbd
                            param //parâmetros
                    ).show();
                }
            }

        } else if (rbData.isSelected()) {
            if (rbTodos.isSelected()) {
                if (jdcData1.getDate() == null || jdcData2.getDate() == null) {
                    JOptionPane.showMessageDialog(null, "Preencha as datas corretamente!", "Erro", JOptionPane.WARNING_MESSAGE);
                } else {
                    param.put("PARAM", "WHERE v.data_venda BETWEEN '" + new Date(jdcData1.getDate().getTime()) + "' AND '" + new Date(jdcData2.getDate().getTime()) + "'");
                    new Relatorio(
                            "rpt_recebimento", //nome do relatório
                            Conexao.conectar(Menu.getUsuario()), //conexão com o sgbd
                            param //parâmetros
                    ).show();
                }
            } else if (rbSim.isSelected()) {
                if (jdcData1.getDate() == null || jdcData2.getDate() == null) {
                    JOptionPane.showMessageDialog(null, "Preencha as datas corretamente!", "Erro", JOptionPane.WARNING_MESSAGE);
                } else {
                    param.put("PARAM", "WHERE v.data_venda BETWEEN '" + new Date(jdcData1.getDate().getTime()) + "' AND '" + new Date(jdcData2.getDate().getTime()) + "'" + "AND r.fg_ativo = false");
                    new Relatorio(
                            "rpt_recebimento", //nome do relatório
                            Conexao.conectar(Menu.getUsuario()), //conexão com o sgbd
                            param //parâmetros
                    ).show();
                }
            } else if (rbNao.isSelected()) {
                if (jdcData1.getDate() == null || jdcData2.getDate() == null) {
                    JOptionPane.showMessageDialog(null, "Preencha as datas corretamente!", "Erro", JOptionPane.WARNING_MESSAGE);
                } else {
                    param.put("PARAM", "WHERE v.data_venda BETWEEN '" + new Date(jdcData1.getDate().getTime()) + "' AND '" + new Date(jdcData2.getDate().getTime()) + "'" + "AND r.fg_ativo = true");
                    new Relatorio(
                            "rpt_recebimento", //nome do relatório
                            Conexao.conectar(Menu.getUsuario()), //conexão com o sgbd
                            param //parâmetros
                    ).show();
                }
            }

        } else if (rbNome.isSelected()) {
            if (rbTodos.isSelected()) {
                if (txtPesquisa.getText().isEmpty() || txtPesquisa.getText().equalsIgnoreCase("Digite sua pesquisa aqui!")) {
                    param.put("PARAM", "");
                    new Relatorio(
                            "rpt_recebimento", //todas as vendas
                            Conexao.conectar(Menu.getUsuario()), //conexão com o sgbd
                            param //parâmetros
                    ).show();
                } else {
                    param.put("PARAM", "WHERE c.nome like " + "'%" + txtPesquisa.getText() + "%'");
                    new Relatorio(
                            "rpt_recebimento", //nome do relatório
                            Conexao.conectar(Menu.getUsuario()), //conexão com o sgbd
                            param //parâmetros
                    ).show();
                }
            } else if (rbSim.isSelected()) {
                if (txtPesquisa.getText().isEmpty() || txtPesquisa.getText().equalsIgnoreCase("Digite sua pesquisa aqui!")) {
                    param.put("PARAM", "WHERE r.fg_ativo = false");
                    new Relatorio(
                            "rpt_recebimento", //todas as vendas
                            Conexao.conectar(Menu.getUsuario()), //conexão com o sgbd
                            param //parâmetros
                    ).show();
                } else {
                    param.put("PARAM", "WHERE c.nome like " + "'%" + txtPesquisa.getText() + "%'" + "AND r.fg_ativo = false");
                    new Relatorio(
                            "rpt_recebimento", //nome do relatório
                            Conexao.conectar(Menu.getUsuario()), //conexão com o sgbd
                            param //parâmetros
                    ).show();
                }
            } else if (rbNao.isSelected()) {
                if (txtPesquisa.getText().isEmpty() || txtPesquisa.getText().equalsIgnoreCase("Digite sua pesquisa aqui!")) {
                    param.put("PARAM", "WHERE r.fg_ativo = true");
                    new Relatorio(
                            "rpt_recebimento", //todas as vendas
                            Conexao.conectar(Menu.getUsuario()), //conexão com o sgbd
                            param //parâmetros
                    ).show();
                } else {
                    param.put("PARAM", "WHERE c.nome like " + "'%" + txtPesquisa.getText() + "%'" + "AND r.fg_ativo = true");
                    new Relatorio(
                            "rpt_recebimento", //nome do relatório
                            Conexao.conectar(Menu.getUsuario()), //conexão com o sgbd
                            param //parâmetros
                    ).show();
                }
            }

        }

    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnDetalhesRecebimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhesRecebimentoActionPerformed
        // Pega o indice da linha selecionada
        int indiceLinha = tabResultados.getSelectedRow();

        if (indiceLinha != -1) {
            Retorno retorno = new Retorno();
            retorno.recebimento.setId(((int) tabResultados.getValueAt(indiceLinha, 0)));
            retorno.venda.setId(((int) tabResultados.getValueAt(indiceLinha, 1)));
            retorno.recebimento.setNum_parcela(((int) tabResultados.getValueAt(indiceLinha, 2)));
            retorno.cliente.setNome((String) tabResultados.getValueAt(indiceLinha, 3));

            try {
                retorno.venda.setDataVenda(sdfNormal.parse((String) tabResultados.getValueAt(indiceLinha, 4)));
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "ERRO: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);;
            }
            try {
                retorno.recebimento.setData_recebimento(sdfNormal.parse((String) tabResultados.getValueAt(indiceLinha, 5)));
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "ERRO: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);;
            }

            retorno.recebimento.setModo_Pgto((String) tabResultados.getValueAt(indiceLinha, 7));

            retorno.recebimento.setFg_ativo((((String) tabResultados.getValueAt(indiceLinha, 8)) == "Não"));

            RelatorioRecebimentoDetalhesRecebimento jiRelatorioRecebimentoDetalhesRecebimento = new RelatorioRecebimentoDetalhesRecebimento(retorno);
            Menu.areaTrabalho.add(jiRelatorioRecebimentoDetalhesRecebimento);
            jiRelatorioRecebimentoDetalhesRecebimento.setVisible(true);
            jiRelatorioRecebimentoDetalhesRecebimento.setPosicao();  // Centraliza a Tela Interna
            //this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma venda!");
        }
    }//GEN-LAST:event_btnDetalhesRecebimentoActionPerformed

    private void rbTodosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbTodosMouseReleased
        txtPesquisa.setText("Digite sua pesquisa aqui!");
        txtPesquisa.setForeground(new java.awt.Color(153, 153, 153));
        jdcData1.setDate(null);
        jdcData2.setDate(null);
        retornos = new RetornoDAO().listarRelatorioVendaEClienteERecebimento(Menu.getUsuario());
        preencherTabela();
    }//GEN-LAST:event_rbTodosMouseReleased

    private void rbSimMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbSimMouseReleased
        txtPesquisa.setText("Digite sua pesquisa aqui!");
        txtPesquisa.setForeground(new java.awt.Color(153, 153, 153));
        jdcData1.setDate(null);
        jdcData2.setDate(null);
        retornos = new RetornoDAO().listarRelatorioVendaEClienteERecebimento(Menu.getUsuario());
        preencherTabela();
    }//GEN-LAST:event_rbSimMouseReleased

    private void rbNaoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbNaoMouseReleased
        txtPesquisa.setText("Digite sua pesquisa aqui!");
        txtPesquisa.setForeground(new java.awt.Color(153, 153, 153));
        jdcData1.setDate(null);
        jdcData2.setDate(null);
        retornos = new RetornoDAO().listarRelatorioVendaEClienteERecebimento(Menu.getUsuario());
        preencherTabela();
    }//GEN-LAST:event_rbNaoMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetalhesRecebimento;
    private javax.swing.JButton btnDetalhesVenda;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator6;
    private com.toedter.calendar.JDateChooser jdcData1;
    private com.toedter.calendar.JDateChooser jdcData2;
    private javax.swing.JPanel jpData;
    private javax.swing.JPanel jpPesquisa;
    private javax.swing.JScrollPane jspResultados;
    private javax.swing.JLabel lblRelatorioVenda;
    private javax.swing.JRadioButton rbData;
    private javax.swing.JRadioButton rbId;
    private javax.swing.JRadioButton rbNao;
    private javax.swing.JRadioButton rbNome;
    private javax.swing.JRadioButton rbSim;
    private javax.swing.JRadioButton rbTodos;
    private javax.swing.JTable tabResultados;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Relatório Recebimento");
        this.setResizable(false);
        this.setMaximizable(false);
        this.setIconifiable(false);
        this.setClosable(true);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rbId);
        bg.add(rbData);
        bg.add(rbNome);
        rbNome.setSelected(true);

        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(rbTodos);
        bg2.add(rbSim);
        bg2.add(rbNao);
        rbTodos.setSelected(true);

        configurarTabela();

    }

    private void configurarTabela() {
        while (tabResultados.getModel().getRowCount() > 0) {
            DefaultTableModel dtm = (DefaultTableModel) tabResultados.getModel();
            dtm.removeRow(0);
        }
        tabResultados.getColumnModel().getColumn(0).setPreferredWidth(130);
        tabResultados.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabResultados.getColumnModel().getColumn(2).setPreferredWidth(80);
        tabResultados.getColumnModel().getColumn(3).setPreferredWidth(181);
        tabResultados.getColumnModel().getColumn(4).setPreferredWidth(120);
        tabResultados.getColumnModel().getColumn(5).setPreferredWidth(150);
        tabResultados.getColumnModel().getColumn(6).setPreferredWidth(110);
        tabResultados.getColumnModel().getColumn(7).setPreferredWidth(150);
        tabResultados.getColumnModel().getColumn(8).setPreferredWidth(80);
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        tabResultados.getColumnModel().getColumn(0).setCellRenderer(esquerda);
        tabResultados.getColumnModel().getColumn(1).setCellRenderer(esquerda);
        tabResultados.getColumnModel().getColumn(2).setCellRenderer(centralizado);
        tabResultados.getColumnModel().getColumn(3).setCellRenderer(esquerda);
        tabResultados.getColumnModel().getColumn(4).setCellRenderer(centralizado);
        tabResultados.getColumnModel().getColumn(5).setCellRenderer(centralizado);
        tabResultados.getColumnModel().getColumn(6).setCellRenderer(direita);
        tabResultados.getColumnModel().getColumn(7).setCellRenderer(centralizado);
        tabResultados.getColumnModel().getColumn(8).setCellRenderer(centralizado);

        ((DefaultTableCellRenderer) tabResultados.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        tabResultados.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 12));
    }

    private void preencherTabela() {
        configurarTabela();
        if (retornos.size() > 0) {
            DefaultTableModel m = (DefaultTableModel) tabResultados.getModel();
            for (Retorno retorno : retornos) {
                if (rbTodos.isSelected()) {
                    m.addRow(new Object[]{
                        retorno.recebimento.getId(),
                        retorno.recebimento.getId_venda(),
                        retorno.recebimento.getNum_parcela(),
                        retorno.cliente.getNome(),
                        sdfNormal.format(retorno.venda.getDataVenda()),
                        sdfNormal.format(retorno.recebimento.getData_recebimento()),
                        dm.format(retorno.recebimento.getValor_recebido()),
                        retorno.recebimento.getModo_Pgto(),
                        (retorno.recebimento.getFg_ativo() == true) ? "Não" : "Sim",});
                } else if (rbSim.isSelected()) {
                    if (retorno.recebimento.getFg_ativo() == false) {
                        m.addRow(new Object[]{
                            retorno.recebimento.getId(),
                            retorno.recebimento.getId_venda(),
                            retorno.recebimento.getNum_parcela(),
                            retorno.cliente.getNome(),
                            sdfNormal.format(retorno.venda.getDataVenda()),
                            sdfNormal.format(retorno.recebimento.getData_recebimento()),
                            dm.format(retorno.recebimento.getValor_recebido()),
                            retorno.recebimento.getModo_Pgto(),
                            "Sim"});
                    }
                } else if (rbNao.isSelected()) {
                    if (retorno.recebimento.getFg_ativo() == true) {
                        m.addRow(new Object[]{
                            retorno.recebimento.getId(),
                            retorno.recebimento.getId_venda(),
                            retorno.recebimento.getNum_parcela(),
                            retorno.cliente.getNome(),
                            sdfNormal.format(retorno.venda.getDataVenda()),
                            sdfNormal.format(retorno.recebimento.getData_recebimento()),
                            dm.format(retorno.recebimento.getValor_recebido()),
                            retorno.recebimento.getModo_Pgto(),
                            "Não"});
                    }
                }
            }
            tabResultados.setModel(m);
        }
    }
}
