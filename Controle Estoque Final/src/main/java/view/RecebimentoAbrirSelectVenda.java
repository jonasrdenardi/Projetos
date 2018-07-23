package view;

import controller.Conexao;
import controller.VendaDAO;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Retorno;
import model.Venda;
import reports.Relatorio;

public class RecebimentoAbrirSelectVenda extends javax.swing.JInternalFrame {

    List<Retorno> retornos = new ArrayList<Retorno>();

    DecimalFormat dm = new DecimalFormat("###,###,###,###,##0.00");
    SimpleDateFormat sdfNormal = new SimpleDateFormat("dd/MM/yyyy");

    public RecebimentoAbrirSelectVenda() {
        initComponents();
        configurarFormulario();

        retornos = new VendaDAO().listarClienteVenda(Menu.getUsuario());

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
        btnDetalhes = new javax.swing.JButton();
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
        jButton1 = new javax.swing.JButton();

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

        rbData.setForeground(new java.awt.Color(101, 96, 168));
        rbData.setText("Data");
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
        lblRelatorioVenda.setText("ABRIR RECEBIMENTO");

        btnDetalhes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/detalhes1.png"))); // NOI18N
        btnDetalhes.setBorder(null);
        btnDetalhes.setBorderPainted(false);
        btnDetalhes.setContentAreaFilled(false);
        btnDetalhes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDetalhes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/detalhes2.png"))); // NOI18N
        btnDetalhes.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/detalhes2.png"))); // NOI18N
        btnDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhesActionPerformed(evt);
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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/receber1.png"))); // NOI18N
        jButton1.setText("Abrir recebimento");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/receber2.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/receber2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
                        .addGap(0, 62, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRelatorioVenda)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jpPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(2, 2, 2))
                    .addComponent(jpData, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jspResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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
            retornos = new VendaDAO().listarClienteVenda(Menu.getUsuario());
            preencherTabela();
        } else if (rbId.isSelected()) {
            retornos = new VendaDAO().pesquisarClienteVendaPorId(Menu.getUsuario(), Integer.valueOf(txtPesquisa.getText()));
            preencherTabela();
        } else if (rbNome.isSelected()) {
            retornos = new VendaDAO().pesquisarClienteVendaPorNome(Menu.getUsuario(), txtPesquisa.getText());
            preencherTabela();
        }
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void btnDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhesActionPerformed
        // Pega o indice da linha selecionada
        int indiceLinha = tabResultados.getSelectedRow();

        if (indiceLinha != -1) {
            int idVenda = ((int) tabResultados.getValueAt(indiceLinha, 0));

            RecebimentoAbrirDetalhe jiVendaDetalhes = new RecebimentoAbrirDetalhe(idVenda);
            Menu.areaTrabalho.add(jiVendaDetalhes);
            jiVendaDetalhes.setVisible(true);
            jiVendaDetalhes.setPosicao();  // Centraliza a Tela Interna
            //this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma venda!");
        }
    }//GEN-LAST:event_btnDetalhesActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        if (jdcData1.getDate() == null || jdcData2.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Preencha as datas corretamente!", "Erro", JOptionPane.WARNING_MESSAGE);
        } else {
            retornos = new VendaDAO().pesquisarClienteVendaPorData(Menu.getUsuario(), jdcData1.getDate(), jdcData2.getDate());
            preencherTabela();
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void rbNomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbNomeMousePressed
        jpData.setVisible(false);
        jpPesquisa.setVisible(true);
        txtPesquisa.setText("Digite sua pesquisa aqui!");
        txtPesquisa.setForeground(new java.awt.Color(153, 153, 153));
        retornos = new VendaDAO().listarClienteVenda(Menu.getUsuario());
        preencherTabela();

    }//GEN-LAST:event_rbNomeMousePressed

    private void rbDataMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbDataMousePressed
        jpData.setVisible(true);
        jpPesquisa.setVisible(false);
        jdcData1.setDate(null);
        jdcData2.setDate(null);
        retornos = new VendaDAO().listarClienteVenda(Menu.getUsuario());
        preencherTabela();
    }//GEN-LAST:event_rbDataMousePressed

    private void rbIdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbIdMousePressed
        jpData.setVisible(false);
        jpPesquisa.setVisible(true);
        txtPesquisa.setText("Digite sua pesquisa aqui!");
        txtPesquisa.setForeground(new java.awt.Color(153, 153, 153));
        retornos = new VendaDAO().listarClienteVenda(Menu.getUsuario());
        preencherTabela();
    }//GEN-LAST:event_rbIdMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Pega o indice da linha selecionada
        int indiceLinha = tabResultados.getSelectedRow();

        if (indiceLinha != -1) {
            Venda venda = new Venda();
            venda.setId(((int) tabResultados.getValueAt(indiceLinha, 0)));
            String cliente = ((String) tabResultados.getValueAt(indiceLinha, 1));
            String dataVenda = (String) tabResultados.getValueAt(indiceLinha, 2);
            
            try {
                venda.setDataVenda(sdfNormal.parse(dataVenda));
            } catch (ParseException ex) {
                Logger.getLogger(RecebimentoAbrirSelectVenda.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            String descontoString = (String) tabResultados.getValueAt(indiceLinha, 3); // pega o valor
            descontoString = descontoString.replaceAll("\\.", "").replaceAll("\\,", "."); // substitui virgula por ponto
            venda.setDesconto(Float.valueOf(descontoString)); // acrescenta o valor em float
            
            String valorString = (String) tabResultados.getValueAt(indiceLinha, 4); // pega o valor
            valorString = valorString.replaceAll("\\.", "").replaceAll("\\,", "."); // substitui virgula por ponto
            venda.setValor(Float.valueOf(valorString)); // acrescenta o valor em float     

            RecebimentoAbrir jiRecebimentoAbrir = new RecebimentoAbrir(venda, cliente);
            Menu.areaTrabalho.add(jiRecebimentoAbrir);
            jiRecebimentoAbrir.setVisible(true);
            jiRecebimentoAbrir.setPosicao();  // Centraliza a Tela Interna
            //this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma venda!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetalhes;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator6;
    private com.toedter.calendar.JDateChooser jdcData1;
    private com.toedter.calendar.JDateChooser jdcData2;
    private javax.swing.JPanel jpData;
    private javax.swing.JPanel jpPesquisa;
    private javax.swing.JScrollPane jspResultados;
    private javax.swing.JLabel lblRelatorioVenda;
    private javax.swing.JRadioButton rbData;
    private javax.swing.JRadioButton rbId;
    private javax.swing.JRadioButton rbNome;
    private javax.swing.JTable tabResultados;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Receber Venda");
        this.setResizable(false);
        this.setMaximizable(false);
        this.setIconifiable(false);
        this.setClosable(true);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rbId);
        bg.add(rbData);
        bg.add(rbNome);
        rbNome.setSelected(true);

        configurarTabela();

    }

    private void configurarTabela() {
        DefaultTableModel m = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        m.addColumn("ID Venda");
        m.addColumn("Cliente");
        m.addColumn("Data da Venda");
        m.addColumn("Desconto");
        m.addColumn("Valor");
        tabResultados.setModel(m);

        tabResultados.getColumnModel().getColumn(0).setPreferredWidth(8);
        tabResultados.getColumnModel().getColumn(1).setPreferredWidth(60);
        tabResultados.getColumnModel().getColumn(2).setPreferredWidth(60);
        tabResultados.getColumnModel().getColumn(3).setPreferredWidth(30);
        tabResultados.getColumnModel().getColumn(4).setPreferredWidth(30);
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        tabResultados.getColumnModel().getColumn(2).setCellRenderer(centralizado);
        tabResultados.getColumnModel().getColumn(3).setCellRenderer(direita);
        tabResultados.getColumnModel().getColumn(4).setCellRenderer(direita);
        ((DefaultTableCellRenderer) tabResultados.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        tabResultados.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 12));
    }

    private void preencherTabela() {
        configurarTabela();
        if (retornos.size() > 0) {
            DefaultTableModel m = (DefaultTableModel) tabResultados.getModel();
            for (Retorno retorno : retornos) {
                m.addRow(new Object[]{
                    retorno.venda.getId(),
                    retorno.cliente.getNome(),
                    sdfNormal.format(retorno.venda.getDataVenda()),
                    dm.format(retorno.venda.getDesconto()),
                    dm.format(retorno.venda.getValor())
                });
            }
            tabResultados.setModel(m);
        }
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

}
