package view;

import controller.RecebimentoDAO;
import java.awt.Dimension;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import model.Recebimento;

public class FinanceiroReceber extends javax.swing.JInternalFrame {

    SimpleDateFormat sdfNormal = new SimpleDateFormat("dd/MM/yyyy");
    DecimalFormat dm = new DecimalFormat(("###,###,###,###,##0.00"));
    Recebimento recebimento = new Recebimento();
    FinanceiroReceberSelectVenda jiFinanceiroReceberSelectVenda;

    public FinanceiroReceber(Recebimento recebimento, FinanceiroReceberSelectVenda jiFinanceiroReceberSelectVenda) {
        initComponents();

        this.recebimento = recebimento;
        this.jiFinanceiroReceberSelectVenda = jiFinanceiroReceberSelectVenda;
        txtIdRecebimento.setText(String.valueOf(recebimento.getId()));
        txtIdVenda.setText(String.valueOf(recebimento.getId_venda()));
        jdcDataRecebimento.setDate(recebimento.getData_recebimento());
        taObs.setText(recebimento.getObs());
        lblVValorRecebimento.setText(dm.format(recebimento.getValor_recebido()));

        switch (recebimento.getModo_Pgto()) {
            case "Parcelado | Crédito": {
                cbModoPgto.addItem("Crédito");
                cbModoPgto.addItem("Débito");
                cbModoPgto.addItem("Dinheiro");
                cbModoPgto.addItem("Cheque");
                break;
            }
            case "Parcelado | Cheque": {
                cbModoPgto.addItem("Cheque");
                cbModoPgto.addItem("Crédito");
                cbModoPgto.addItem("Débito");
                cbModoPgto.addItem("Dinheiro");
                break;
            }

            case "Parcelado | Indefinido": {
                cbModoPgto.addItem("Indefinido");
                cbModoPgto.addItem("Dinheiro");
                cbModoPgto.addItem("Débito");
                cbModoPgto.addItem("Crédito");
                cbModoPgto.addItem("Cheque");
                break;
            }
            default:
                cbModoPgto.addItem("Dinheiro");
                cbModoPgto.addItem("Débito");
                cbModoPgto.addItem("Crédito");
                cbModoPgto.addItem("Cheque");
        }

        txtIdRecebimento.setEditable(false);
        txtIdRecebimento.setEditable(false);
        txtIdVenda.setEditable(false);
        configurarFormulario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbg = new javax.swing.ButtonGroup();
        jpInformacoesVenda = new javax.swing.JPanel();
        txtIdRecebimento = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        lblProdutosDisponiveis2 = new javax.swing.JLabel();
        txtIdVenda = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        lblProdutosDisponiveis3 = new javax.swing.JLabel();
        jdcDataRecebimento = new com.toedter.calendar.JDateChooser();
        lblProdutosDisponiveis4 = new javax.swing.JLabel();
        cbModoPgto = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        taObs = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        lblTotalVenda = new javax.swing.JLabel();
        lblVValorRecebimento = new javax.swing.JLabel();
        lblProdutosDisponiveis5 = new javax.swing.JLabel();
        lblAbrirRecebimento = new javax.swing.JLabel();
        btnReceber = new javax.swing.JButton();

        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone.png"))); // NOI18N

        jpInformacoesVenda.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Informações do Recebimento", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        txtIdRecebimento.setBackground(new java.awt.Color(240, 240, 240));
        txtIdRecebimento.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        txtIdRecebimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdRecebimento.setBorder(null);

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblProdutosDisponiveis2.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        lblProdutosDisponiveis2.setForeground(new java.awt.Color(101, 96, 168));
        lblProdutosDisponiveis2.setText("ID Recebimento:");

        txtIdVenda.setBackground(new java.awt.Color(240, 240, 240));
        txtIdVenda.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        txtIdVenda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdVenda.setBorder(null);

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblProdutosDisponiveis3.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        lblProdutosDisponiveis3.setForeground(new java.awt.Color(101, 96, 168));
        lblProdutosDisponiveis3.setText("ID Venda:");

        lblProdutosDisponiveis4.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        lblProdutosDisponiveis4.setForeground(new java.awt.Color(101, 96, 168));
        lblProdutosDisponiveis4.setText("Data Recebimento:");

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Observações"));

        taObs.setColumns(20);
        taObs.setRows(5);
        taObs.setBorder(null);
        jScrollPane2.setViewportView(taObs);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lblTotalVenda.setFont(new java.awt.Font("Constantia", 0, 16)); // NOI18N
        lblTotalVenda.setForeground(new java.awt.Color(101, 96, 168));
        lblTotalVenda.setText("Valor da Parcela:");

        lblVValorRecebimento.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        lblVValorRecebimento.setForeground(new java.awt.Color(0, 0, 204));
        lblVValorRecebimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVValorRecebimento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblVValorRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalVenda))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblTotalVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblVValorRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblProdutosDisponiveis5.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        lblProdutosDisponiveis5.setForeground(new java.awt.Color(101, 96, 168));
        lblProdutosDisponiveis5.setText("Método de Recebimento:");

        javax.swing.GroupLayout jpInformacoesVendaLayout = new javax.swing.GroupLayout(jpInformacoesVenda);
        jpInformacoesVenda.setLayout(jpInformacoesVendaLayout);
        jpInformacoesVendaLayout.setHorizontalGroup(
            jpInformacoesVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInformacoesVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpInformacoesVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInformacoesVendaLayout.createSequentialGroup()
                        .addComponent(lblProdutosDisponiveis2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpInformacoesVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(lblProdutosDisponiveis3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpInformacoesVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(lblProdutosDisponiveis4)
                        .addGap(5, 5, 5)
                        .addComponent(jdcDataRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(lblProdutosDisponiveis5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbModoPgto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(jpInformacoesVendaLayout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpInformacoesVendaLayout.setVerticalGroup(
            jpInformacoesVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInformacoesVendaLayout.createSequentialGroup()
                .addGroup(jpInformacoesVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblProdutosDisponiveis2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpInformacoesVendaLayout.createSequentialGroup()
                        .addComponent(txtIdRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblProdutosDisponiveis3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpInformacoesVendaLayout.createSequentialGroup()
                        .addComponent(txtIdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jdcDataRecebimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblProdutosDisponiveis4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblProdutosDisponiveis5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbModoPgto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblAbrirRecebimento.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        lblAbrirRecebimento.setForeground(new java.awt.Color(101, 96, 168));
        lblAbrirRecebimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAbrirRecebimento.setText("RECEBER");

        btnReceber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/receber1.png"))); // NOI18N
        btnReceber.setBorder(null);
        btnReceber.setBorderPainted(false);
        btnReceber.setContentAreaFilled(false);
        btnReceber.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReceber.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/receber2.png"))); // NOI18N
        btnReceber.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/receber2.png"))); // NOI18N
        btnReceber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAbrirRecebimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jpInformacoesVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblAbrirRecebimento)
                .addGap(18, 18, 18)
                .addComponent(jpInformacoesVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceberActionPerformed
        if (cbModoPgto.getSelectedItem() != "Indefinido") {
            if (jdcDataRecebimento.getDate() != null) {
                recebimento.setData_recebimento(jdcDataRecebimento.getDate());
                recebimento.setModo_Pgto("Parcelado" + " | " + cbModoPgto.getSelectedItem());
                recebimento.setObs(taObs.getText());
                recebimento.setFg_ativo(false);

                if (new RecebimentoDAO().atualizar(Menu.getUsuario(), recebimento) != -1) {
                    JOptionPane.showMessageDialog(null, "Parcela n° " + recebimento.getNum_parcela() + " recebida com sucesso! ID Venda: " + recebimento.getId_venda());
                    jiFinanceiroReceberSelectVenda.atualizarTabela();
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao receber Parcela n° " + recebimento.getNum_parcela() + "! ID Venda: " + recebimento.getId_venda());
                }

            } else {
                JOptionPane.showMessageDialog(null, "Data não pode estar em branco!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Modo de pagamento não pode ser Indefinido!");
        }
    }//GEN-LAST:event_btnReceberActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReceber;
    private javax.swing.JComboBox<String> cbModoPgto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator9;
    private com.toedter.calendar.JDateChooser jdcDataRecebimento;
    private javax.swing.JPanel jpInformacoesVenda;
    private javax.swing.JLabel lblAbrirRecebimento;
    private javax.swing.JLabel lblProdutosDisponiveis2;
    private javax.swing.JLabel lblProdutosDisponiveis3;
    private javax.swing.JLabel lblProdutosDisponiveis4;
    private javax.swing.JLabel lblProdutosDisponiveis5;
    private javax.swing.JLabel lblTotalVenda;
    private javax.swing.JLabel lblVValorRecebimento;
    private javax.swing.ButtonGroup rbg;
    private javax.swing.JTextArea taObs;
    private javax.swing.JTextField txtIdRecebimento;
    private javax.swing.JTextField txtIdVenda;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Receber");
        this.setResizable(false);
        this.setMaximizable(false);
        this.setIconifiable(false);
        this.setClosable(true);

        getRootPane().setDefaultButton(btnReceber);
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

}
