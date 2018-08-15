package view;

import controller.RecebimentoDAO;
import java.awt.Dimension;
import java.awt.Font;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Recebimento;
import model.Retorno;

public class RecebimentoReceberSelectRecebimento extends javax.swing.JInternalFrame {

    SimpleDateFormat sdfNormal = new SimpleDateFormat("dd/MM/yyyy");
    DecimalFormat dm = new DecimalFormat(("###,###,###,###,##0.00"));
    Retorno retorno = new Retorno();
    List<Recebimento> recebimentos = new ArrayList<>();

    public RecebimentoReceberSelectRecebimento(Retorno retorno) {
        initComponents();

        this.retorno = retorno;
        txtIdVenda.setText(String.valueOf(retorno.venda.getId()));
        txtCliente.setText(retorno.cliente.getNome());
        txtDataVenda.setText(sdfNormal.format(retorno.venda.getDataVenda()));
        lblVDesconto.setText(String.valueOf(retorno.venda.getDesconto()));
        lblVlTotalVenda.setText(dm.format(retorno.venda.getValor()));
        txtDataVenda.setEditable(false);
        txtIdVenda.setEditable(false);
        txtCliente.setEditable(false);
        txtDataVenda.setEditable(false);
        taObs.setEditable(false);
        configurarFormulario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbg = new javax.swing.ButtonGroup();
        jpInformacoesVenda = new javax.swing.JPanel();
        lblProdutosDisponiveis1 = new javax.swing.JLabel();
        lblDataVenda = new javax.swing.JLabel();
        txtDataVenda = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        txtIdVenda = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        lblProdutosDisponiveis2 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        lblTotalVenda = new javax.swing.JLabel();
        lblVlTotalVenda = new javax.swing.JLabel();
        lblTotalVenda1 = new javax.swing.JLabel();
        lblVDesconto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taObs = new javax.swing.JTextArea();
        lblAbrirRecebimento = new javax.swing.JLabel();
        btnGerar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecebimento = new javax.swing.JTable();

        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone.png"))); // NOI18N

        jpInformacoesVenda.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Informações da Venda", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        lblProdutosDisponiveis1.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        lblProdutosDisponiveis1.setForeground(new java.awt.Color(101, 96, 168));
        lblProdutosDisponiveis1.setText("Cliente:");

        lblDataVenda.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        lblDataVenda.setForeground(new java.awt.Color(101, 96, 168));
        lblDataVenda.setText("Data Venda");

        txtDataVenda.setBackground(new java.awt.Color(240, 240, 240));
        txtDataVenda.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        txtDataVenda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDataVenda.setBorder(null);

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtIdVenda.setBackground(new java.awt.Color(240, 240, 240));
        txtIdVenda.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        txtIdVenda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdVenda.setBorder(null);

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblProdutosDisponiveis2.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        lblProdutosDisponiveis2.setForeground(new java.awt.Color(101, 96, 168));
        lblProdutosDisponiveis2.setText("ID Venda:");

        txtCliente.setBackground(new java.awt.Color(240, 240, 240));
        txtCliente.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        txtCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCliente.setBorder(null);

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lblTotalVenda.setFont(new java.awt.Font("Constantia", 0, 16)); // NOI18N
        lblTotalVenda.setForeground(new java.awt.Color(101, 96, 168));
        lblTotalVenda.setText("Total Venda:");

        lblVlTotalVenda.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        lblVlTotalVenda.setForeground(new java.awt.Color(0, 0, 204));
        lblVlTotalVenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblTotalVenda1.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        lblTotalVenda1.setForeground(new java.awt.Color(101, 96, 168));
        lblTotalVenda1.setText("Desconto:");

        lblVDesconto.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        lblVDesconto.setForeground(new java.awt.Color(0, 0, 204));
        lblVDesconto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblTotalVenda1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblVDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVlTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblVDesconto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblTotalVenda1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblTotalVenda))
                    .addComponent(lblVlTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Observações"));

        taObs.setColumns(20);
        taObs.setRows(5);
        taObs.setBorder(null);
        jScrollPane2.setViewportView(taObs);

        javax.swing.GroupLayout jpInformacoesVendaLayout = new javax.swing.GroupLayout(jpInformacoesVenda);
        jpInformacoesVenda.setLayout(jpInformacoesVendaLayout);
        jpInformacoesVendaLayout.setHorizontalGroup(
            jpInformacoesVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInformacoesVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpInformacoesVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jpInformacoesVendaLayout.createSequentialGroup()
                        .addComponent(lblProdutosDisponiveis2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpInformacoesVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(lblProdutosDisponiveis1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpInformacoesVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCliente)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(lblDataVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpInformacoesVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpInformacoesVendaLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpInformacoesVendaLayout.setVerticalGroup(
            jpInformacoesVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInformacoesVendaLayout.createSequentialGroup()
                .addGroup(jpInformacoesVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInformacoesVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInformacoesVendaLayout.createSequentialGroup()
                            .addGroup(jpInformacoesVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, 0)
                            .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInformacoesVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProdutosDisponiveis1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblProdutosDisponiveis2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInformacoesVendaLayout.createSequentialGroup()
                        .addComponent(txtIdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        lblAbrirRecebimento.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        lblAbrirRecebimento.setForeground(new java.awt.Color(101, 96, 168));
        lblAbrirRecebimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAbrirRecebimento.setText("SELECIONAR PARCELA");

        btnGerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/selecionar1.png"))); // NOI18N
        btnGerar.setBorder(null);
        btnGerar.setBorderPainted(false);
        btnGerar.setContentAreaFilled(false);
        btnGerar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGerar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/selecionar2.png"))); // NOI18N
        btnGerar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/selecionar2.png"))); // NOI18N
        btnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarActionPerformed(evt);
            }
        });

        tblRecebimento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Rebimento", "N° Parcela", "Data Recebimento", "Valor Recebido", "Modo Pgto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRecebimento.setSelectionBackground(new java.awt.Color(168, 193, 221));
        tblRecebimento.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblRecebimento);
        if (tblRecebimento.getColumnModel().getColumnCount() > 0) {
            tblRecebimento.getColumnModel().getColumn(0).setResizable(false);
            tblRecebimento.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAbrirRecebimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpInformacoesVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarActionPerformed
        int indiceLinha = tblRecebimento.getSelectedRow();
        if (indiceLinha != -1) {
            Recebimento recebimento = new Recebimento();

            recebimento.setId_venda(Integer.valueOf(txtIdVenda.getText()));
            recebimento.setObs(taObs.getText());
            recebimento.setId(((int) tblRecebimento.getValueAt(indiceLinha, 0)));
            recebimento.setNum_parcela(((int) tblRecebimento.getValueAt(indiceLinha, 1)));

            try {
                recebimento.setData_recebimento(sdfNormal.parse((String) tblRecebimento.getValueAt(indiceLinha, 2)));
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "ERRO: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);;
            }

            String valorRecebidoString = (String) tblRecebimento.getValueAt(indiceLinha, 3); // pega o valor recebido
            valorRecebidoString = valorRecebidoString.replaceAll("\\.", "").replaceAll("\\,", "."); // substitui virgula por ponto
            recebimento.setValor_recebido(Float.valueOf(valorRecebidoString)); // acrescenta o valor em float

            recebimento.setModo_Pgto((String) tblRecebimento.getValueAt(indiceLinha, 4));

            RecebimentoReceber jiRecebimentoReceber = new RecebimentoReceber(recebimento);
            Menu.areaTrabalho.add(jiRecebimentoReceber);
            jiRecebimentoReceber.setVisible(true);
            jiRecebimentoReceber.setPosicao();  // Centraliza a Tela Interna
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma parcela!");
        }
    }//GEN-LAST:event_btnGerarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel jpInformacoesVenda;
    private javax.swing.JLabel lblAbrirRecebimento;
    private javax.swing.JLabel lblDataVenda;
    private javax.swing.JLabel lblProdutosDisponiveis1;
    private javax.swing.JLabel lblProdutosDisponiveis2;
    private javax.swing.JLabel lblTotalVenda;
    private javax.swing.JLabel lblTotalVenda1;
    private javax.swing.JLabel lblVDesconto;
    private javax.swing.JLabel lblVlTotalVenda;
    private javax.swing.ButtonGroup rbg;
    private javax.swing.JTextArea taObs;
    private javax.swing.JTable tblRecebimento;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtDataVenda;
    private javax.swing.JTextField txtIdVenda;
    // End of variables declaration//GEN-END:variables
    private void configurarFormulario() {
        this.setTitle("Selecionar Parcela");
        this.setResizable(false);
        this.setMaximizable(false);
        this.setIconifiable(false);
        this.setClosable(true);

        getRootPane().setDefaultButton(btnGerar);

        recebimentos = new RecebimentoDAO().pesquisarPorIdVendaOrderParcela(Menu.getUsuario(), retorno.venda.getId());
        taObs.setText(recebimentos.get(0).getObs());
        configurarTabela();
        preencherTabela();
    }

    private void configurarTabela() {

        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        tblRecebimento.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        tblRecebimento.getColumnModel().getColumn(1).setCellRenderer(centralizado);
        tblRecebimento.getColumnModel().getColumn(2).setCellRenderer(centralizado);
        tblRecebimento.getColumnModel().getColumn(3).setCellRenderer(direita);
        tblRecebimento.getColumnModel().getColumn(4).setCellRenderer(centralizado);
        ((DefaultTableCellRenderer) tblRecebimento.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        tblRecebimento.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 10));
    }

    public void preencherTabela() {
        if (recebimentos != null) {

            configurarTabela();
            DefaultTableModel m = (DefaultTableModel) tblRecebimento.getModel();

            for (Recebimento recebimento : recebimentos) {
                if (recebimento.getFg_ativo() == true) {
                    m.addRow(new Object[]{
                        recebimento.getId(),
                        recebimento.getNum_parcela(),
                        sdfNormal.format(recebimento.getData_recebimento()),
                        dm.format(recebimento.getValor_recebido()),
                        recebimento.getModo_Pgto()
                    });
                }
            }

            tblRecebimento.setModel(m);
        }
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

}
