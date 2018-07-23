package view;

import java.awt.Dimension;
import java.awt.Font;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Produto;
import model.ProdutoVenda;
import model.Venda;

public class RecebimentoAbrir extends javax.swing.JInternalFrame {

    SimpleDateFormat sdfNormal = new SimpleDateFormat("dd/MM/yyyy");
    DecimalFormat dm = new DecimalFormat(("###,###,###,###,##0.00"));
    Venda venda = new Venda();

    public RecebimentoAbrir(Venda venda, String cliente) {
        initComponents();

        this.venda = venda;
        txtIdVenda.setText(String.valueOf(venda.getId()));
        txtCliente.setText(cliente);
        txtDataVenda.setText(sdfNormal.format(venda.getDataVenda()));
        lblVDesconto.setText(String.valueOf(venda.getDesconto()));
        lblVlTotalVenda.setText(String.valueOf(venda.getValor()));
        txtDataVenda.setEditable(false);
        txtIdVenda.setEditable(false);
        txtCliente.setEditable(false);
        txtDataVenda.setEditable(false);
        jpAVista.setVisible(true);
        jpParcelado.setVisible(false);
        configurarFormulario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbg = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblProdutosDisponiveis1 = new javax.swing.JLabel();
        lblDataVenda = new javax.swing.JLabel();
        txtDataVenda = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        lblTotalVenda = new javax.swing.JLabel();
        lblVlTotalVenda = new javax.swing.JLabel();
        txtIdVenda = new javax.swing.JTextField();
        lblTotalVenda1 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        lblVDesconto = new javax.swing.JLabel();
        lblProdutosDisponiveis2 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        lblAbrirRecebimento = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jpParcelado = new javax.swing.JPanel();
        cbModoPgto1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jdc = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        spParcelas = new javax.swing.JSpinner();
        btnParcelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jpAVista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        cbModoPgto = new javax.swing.JComboBox<>();
        rbAVista = new javax.swing.JRadioButton();
        rbParcelado = new javax.swing.JRadioButton();
        btnGerar = new javax.swing.JButton();

        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Informações da Venda", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

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

        txtIdVenda.setBackground(new java.awt.Color(240, 240, 240));
        txtIdVenda.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        txtIdVenda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdVenda.setBorder(null);

        lblTotalVenda1.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        lblTotalVenda1.setForeground(new java.awt.Color(101, 96, 168));
        lblTotalVenda1.setText("Desconto:");

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblVDesconto.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        lblVDesconto.setForeground(new java.awt.Color(0, 0, 204));
        lblVDesconto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblProdutosDisponiveis2.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        lblProdutosDisponiveis2.setForeground(new java.awt.Color(101, 96, 168));
        lblProdutosDisponiveis2.setText("ID Venda:");

        txtCliente.setBackground(new java.awt.Color(240, 240, 240));
        txtCliente.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        txtCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCliente.setBorder(null);

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblProdutosDisponiveis2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdVenda)
                            .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(lblProdutosDisponiveis1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCliente)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDataVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTotalVenda1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblVDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVlTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCliente)
                        .addComponent(lblDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblProdutosDisponiveis1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblProdutosDisponiveis2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblVDesconto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblTotalVenda1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblTotalVenda))
                    .addComponent(lblVlTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lblAbrirRecebimento.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        lblAbrirRecebimento.setForeground(new java.awt.Color(101, 96, 168));
        lblAbrirRecebimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAbrirRecebimento.setText("ABRIR RECEBIMENTO");

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Modo de Recebimento", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        cbModoPgto1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Crédito", "Cheque", "Indefinido" }));

        jLabel1.setText("Data 1° Parcela");

        jLabel2.setText("Parcelas");

        spParcelas.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        btnParcelar.setText("Parcelar");
        btnParcelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParcelarActionPerformed(evt);
            }
        });

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Parcela", "Vencimento", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblData.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblData);
        if (tblData.getColumnModel().getColumnCount() > 0) {
            tblData.getColumnModel().getColumn(0).setPreferredWidth(69);
            tblData.getColumnModel().getColumn(1).setPreferredWidth(130);
            tblData.getColumnModel().getColumn(2).setPreferredWidth(140);
        }

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Observações"));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setBorder(null);
        jScrollPane3.setViewportView(jTextArea2);

        javax.swing.GroupLayout jpParceladoLayout = new javax.swing.GroupLayout(jpParcelado);
        jpParcelado.setLayout(jpParceladoLayout);
        jpParceladoLayout.setHorizontalGroup(
            jpParceladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpParceladoLayout.createSequentialGroup()
                .addGroup(jpParceladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpParceladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jpParceladoLayout.createSequentialGroup()
                            .addGroup(jpParceladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(22, 22, 22)
                            .addGroup(jpParceladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spParcelas)))
                        .addComponent(btnParcelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cbModoPgto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator1)
        );
        jpParceladoLayout.setVerticalGroup(
            jpParceladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpParceladoLayout.createSequentialGroup()
                .addGroup(jpParceladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpParceladoLayout.createSequentialGroup()
                        .addComponent(cbModoPgto1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpParceladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpParceladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnParcelar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Observações"));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        cbModoPgto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Débito", "Cheque" }));

        javax.swing.GroupLayout jpAVistaLayout = new javax.swing.GroupLayout(jpAVista);
        jpAVista.setLayout(jpAVistaLayout);
        jpAVistaLayout.setHorizontalGroup(
            jpAVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
            .addGroup(jpAVistaLayout.createSequentialGroup()
                .addComponent(cbModoPgto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpAVistaLayout.setVerticalGroup(
            jpAVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAVistaLayout.createSequentialGroup()
                .addComponent(cbModoPgto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        rbAVista.setText("À Vista");
        rbAVista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbAVistaMouseReleased(evt);
            }
        });

        rbParcelado.setText("Parcelado");
        rbParcelado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbParceladoMouseReleased(evt);
            }
        });

        jLayeredPane1.setLayer(jpParcelado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jpAVista, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(rbAVista, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(rbParcelado, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(rbAVista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbParcelado))
                    .addComponent(jpAVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpParcelado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbAVista)
                    .addComponent(rbParcelado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpAVista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(jpParcelado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        btnGerar.setText("Gerar");
        btnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLayeredPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblAbrirRecebimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(312, 312, 312))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblAbrirRecebimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGerar, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbAVistaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbAVistaMouseReleased
        jpAVista.setVisible(true);
        jpParcelado.setVisible(false);
    }//GEN-LAST:event_rbAVistaMouseReleased

    private void rbParceladoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbParceladoMouseReleased
        jpAVista.setVisible(false);
        jpParcelado.setVisible(true);
    }//GEN-LAST:event_rbParceladoMouseReleased

    private void btnParcelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParcelarActionPerformed
        while (tblData.getModel().getRowCount() > 0) {
            DefaultTableModel dtm = (DefaultTableModel) tblData.getModel();
            dtm.removeRow(0);
        }
        
        int qtdParcelas = (int) spParcelas.getValue();
        int parcelaAtual = 1;

        if (jdc.getDate() != null) {
            //Converte util.Date em LocalDate
            LocalDate primeiraParcela = jdc.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            while (parcelaAtual <= qtdParcelas) {
                if (parcelaAtual != 1) {
                    preencherData(parcelaAtual, primeiraParcela.plusMonths(parcelaAtual), venda.getValor() / qtdParcelas);
                    parcelaAtual++;
                } else {
                    preencherData(parcelaAtual, primeiraParcela.plusMonths(parcelaAtual), venda.getValor() / qtdParcelas);
                    parcelaAtual++;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Data não pode estar em branco!");
        }
//        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }//GEN-LAST:event_btnParcelarActionPerformed

    private void btnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarActionPerformed
        if (rbAVista.isSelected()) {
            
        }else if (rbParcelado.isSelected()) {
            
        }
    }//GEN-LAST:event_btnGerarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerar;
    private javax.swing.JButton btnParcelar;
    private javax.swing.JComboBox<String> cbModoPgto;
    private javax.swing.JComboBox<String> cbModoPgto1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private com.toedter.calendar.JDateChooser jdc;
    private javax.swing.JPanel jpAVista;
    private javax.swing.JPanel jpParcelado;
    private javax.swing.JLabel lblAbrirRecebimento;
    private javax.swing.JLabel lblDataVenda;
    private javax.swing.JLabel lblProdutosDisponiveis1;
    private javax.swing.JLabel lblProdutosDisponiveis2;
    private javax.swing.JLabel lblTotalVenda;
    private javax.swing.JLabel lblTotalVenda1;
    private javax.swing.JLabel lblVDesconto;
    private javax.swing.JLabel lblVlTotalVenda;
    private javax.swing.JRadioButton rbAVista;
    private javax.swing.JRadioButton rbParcelado;
    private javax.swing.ButtonGroup rbg;
    private javax.swing.JSpinner spParcelas;
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

        rbg.add(rbAVista);
        rbg.add(rbParcelado);
        rbAVista.setSelected(true);

        configurarTabela();
    }

    private void configurarTabela() {

        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        tblData.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        tblData.getColumnModel().getColumn(1).setCellRenderer(centralizado);
        tblData.getColumnModel().getColumn(2).setCellRenderer(direita);
        ((DefaultTableCellRenderer) tblData.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        tblData.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 12));
    }

    public void preencherData(int numeroParcela, LocalDate vencimento, float valor) {
        //Converte LocalDate em util.Date depois em String
        String stringVencimento = sdfNormal.format(Date.from(vencimento.atStartOfDay(ZoneId.systemDefault()).toInstant()));

        configurarTabela();
        DefaultTableModel m = (DefaultTableModel) tblData.getModel();

        m.addRow(new Object[]{
            numeroParcela,
            stringVencimento,
            dm.format(valor),});

        tblData.setModel(m);

    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

}
