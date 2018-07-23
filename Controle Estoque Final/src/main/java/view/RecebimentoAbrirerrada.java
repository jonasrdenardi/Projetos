package view;

import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Venda;

public class RecebimentoAbrirerrada extends javax.swing.JInternalFrame {

    SimpleDateFormat sdfNormal = new SimpleDateFormat("dd/MM/yyyy");

    public RecebimentoAbrirerrada(Venda venda, String cliente) {
        initComponents();
        configurarFormulario();

        jPanel1.setVisible(false);
        //jPanel2.setVisible(false);

        txtIdVenda.setText(String.valueOf(venda.getId()));
        txtCliente.setText(cliente);
        txtDataVenda.setText(sdfNormal.format(venda.getDataVenda()));
        lblVDesconto.setText(String.valueOf(venda.getDesconto()));
        lblVlTotalVenda.setText(String.valueOf(venda.getValor()));
        txtDataVenda.setEditable(false);
        txtIdVenda.setEditable(false);
        txtCliente.setEditable(false);
        txtDataVenda.setEditable(false);

        jpCredito.setVisible(false);
        jpParceladoIndefinido.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAbrirRecebimento = new javax.swing.JLabel();
        txtIdVenda = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        lblProdutosDisponiveis2 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        lblProdutosDisponiveis1 = new javax.swing.JLabel();
        lblDataVenda = new javax.swing.JLabel();
        txtDataVenda = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        lblTotalVenda = new javax.swing.JLabel();
        lblVlTotalVenda = new javax.swing.JLabel();
        lblTotalVenda1 = new javax.swing.JLabel();
        lblVDesconto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jpParceladoIndefinido = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        btnAdicionar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        jdc = new com.toedter.calendar.JDateChooser();
        rbdAVista = new javax.swing.JRadioButton();
        rbdCredito = new javax.swing.JRadioButton();
        jpAVista = new javax.swing.JPanel();
        jcbAVista = new javax.swing.JComboBox<>();
        rbdParceladoIndefinido = new javax.swing.JRadioButton();
        jpCredito = new javax.swing.JPanel();
        jcbCredito = new javax.swing.JComboBox<>();

        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone.png"))); // NOI18N

        lblAbrirRecebimento.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        lblAbrirRecebimento.setForeground(new java.awt.Color(101, 96, 168));
        lblAbrirRecebimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAbrirRecebimento.setText("ABRIR RECEBIMENTO");

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

        lblTotalVenda.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
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

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Parcela", "Vencimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblData.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblData);
        if (tblData.getColumnModel().getColumnCount() > 0) {
            tblData.getColumnModel().getColumn(0).setResizable(false);
            tblData.getColumnModel().getColumn(1).setResizable(false);
        }

        btnAdicionar.setText("Adicionar");
        btnAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jpParceladoIndefinidoLayout = new javax.swing.GroupLayout(jpParceladoIndefinido);
        jpParceladoIndefinido.setLayout(jpParceladoIndefinidoLayout);
        jpParceladoIndefinidoLayout.setHorizontalGroup(
            jpParceladoIndefinidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jdc, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
        );
        jpParceladoIndefinidoLayout.setVerticalGroup(
            jpParceladoIndefinidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpParceladoIndefinidoLayout.createSequentialGroup()
                .addComponent(jdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdicionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemover)
                .addContainerGap())
        );

        rbdAVista.setText("À Vista");
        rbdAVista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rbdAVista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbdAVistaMouseReleased(evt);
            }
        });

        rbdCredito.setText("Crédito");
        rbdCredito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbdCreditoMouseReleased(evt);
            }
        });

        jcbAVista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Débito" }));

        javax.swing.GroupLayout jpAVistaLayout = new javax.swing.GroupLayout(jpAVista);
        jpAVista.setLayout(jpAVistaLayout);
        jpAVistaLayout.setHorizontalGroup(
            jpAVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcbAVista, 0, 82, Short.MAX_VALUE)
        );
        jpAVistaLayout.setVerticalGroup(
            jpAVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcbAVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        rbdParceladoIndefinido.setText("Parcelado Indefinido");
        rbdParceladoIndefinido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbdParceladoIndefinidoMouseReleased(evt);
            }
        });

        jcbCredito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1x", "2x", "3x", "4x", "5x", "6x", "7x", "8x", "9x", "10x", "11x", "12x" }));

        javax.swing.GroupLayout jpCreditoLayout = new javax.swing.GroupLayout(jpCredito);
        jpCredito.setLayout(jpCreditoLayout);
        jpCreditoLayout.setHorizontalGroup(
            jpCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcbCredito, 0, 52, Short.MAX_VALUE)
        );
        jpCreditoLayout.setVerticalGroup(
            jpCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcbCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpParceladoIndefinido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbdAVista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpAVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbdCredito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rbdParceladoIndefinido))
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpAVista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbdAVista, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpCredito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbdCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(rbdParceladoIndefinido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpParceladoIndefinido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAbrirRecebimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProdutosDisponiveis2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdVenda)
                            .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(lblProdutosDisponiveis1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCliente)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(lblDataVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblTotalVenda1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblVDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblVlTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblAbrirRecebimento)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCliente)
                        .addComponent(lblDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblProdutosDisponiveis1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblProdutosDisponiveis2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblVDesconto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblTotalVenda1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblTotalVenda))
                    .addComponent(lblVlTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        preencherTabelaData(sdfNormal.format(jdc.getDate()));
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void rbdAVistaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbdAVistaMouseReleased
        jpAVista.setVisible(true);
        jpCredito.setVisible(false);
        jpParceladoIndefinido.setVisible(false);
    }//GEN-LAST:event_rbdAVistaMouseReleased

    private void rbdCreditoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbdCreditoMouseReleased
        jpCredito.setVisible(true);
        jpAVista.setVisible(false);
        jpParceladoIndefinido.setVisible(false);
    }//GEN-LAST:event_rbdCreditoMouseReleased

    private void rbdParceladoIndefinidoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbdParceladoIndefinidoMouseReleased
        jpCredito.setVisible(false);
        jpAVista.setVisible(false);
        jpParceladoIndefinido.setVisible(true);
    }//GEN-LAST:event_rbdParceladoIndefinidoMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JComboBox<String> jcbAVista;
    private javax.swing.JComboBox<String> jcbCredito;
    private com.toedter.calendar.JDateChooser jdc;
    private javax.swing.JPanel jpAVista;
    private javax.swing.JPanel jpCredito;
    private javax.swing.JPanel jpParceladoIndefinido;
    private javax.swing.JLabel lblAbrirRecebimento;
    private javax.swing.JLabel lblDataVenda;
    private javax.swing.JLabel lblProdutosDisponiveis1;
    private javax.swing.JLabel lblProdutosDisponiveis2;
    private javax.swing.JLabel lblTotalVenda;
    private javax.swing.JLabel lblTotalVenda1;
    private javax.swing.JLabel lblVDesconto;
    private javax.swing.JLabel lblVlTotalVenda;
    private javax.swing.JRadioButton rbdAVista;
    private javax.swing.JRadioButton rbdCredito;
    private javax.swing.JRadioButton rbdParceladoIndefinido;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtDataVenda;
    private javax.swing.JTextField txtIdVenda;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Abrir Recebimento");
        this.setResizable(false);
        this.setMaximizable(false);
        this.setIconifiable(false);
        this.setClosable(true);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rbdAVista);
        bg.add(rbdCredito);
        bg.add(rbdParceladoIndefinido);
        rbdAVista.setSelected(true);

        configurarTabela();
    }

    private void configurarTabela() {
        DefaultTableModel m = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        m.addColumn("Parcela");
        m.addColumn("Vencimento");

        tblData.setModel(m);

        tblData.getColumnModel().getColumn(0).setPreferredWidth(30);
        tblData.getColumnModel().getColumn(1).setPreferredWidth(62);
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        tblData.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        tblData.getColumnModel().getColumn(1).setCellRenderer(centralizado);
        ((DefaultTableCellRenderer) tblData.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        tblData.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 12));
    }

    public void preencherTabelaData(String data) {
        DefaultTableModel m = (DefaultTableModel) tblData.getModel();

        m.addRow(new Object[]{
            0, data,});

        tblData.setModel(m);

    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }
}
