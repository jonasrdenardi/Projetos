package view;

import controller.RecebimentoDAO;
import controller.VendaDAO;
import java.awt.Dimension;
import java.awt.Font;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Recebimento;
import model.Retorno;

public class RecebimentoAlterar extends javax.swing.JInternalFrame {

    SimpleDateFormat sdfNormal = new SimpleDateFormat("dd/MM/yyyy");
    DecimalFormat dm = new DecimalFormat(("###,###,###,###,##0.00"));
    Retorno retorno = new Retorno();
    List<Recebimento> recebimentos = new ArrayList<>();

    public RecebimentoAlterar(Retorno retorno) {
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
        
        
        
        
        
        
        jpAVista.setVisible(true);
        jpParcelado.setVisible(false);
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
        lblAbrirRecebimento = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jpAVista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taAVista = new javax.swing.JTextArea();
        cbModoPgtoAVista = new javax.swing.JComboBox<>();
        jpParcelado = new javax.swing.JPanel();
        cbModoPgtoParcelado = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jdc = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        spParcelas = new javax.swing.JSpinner();
        btnParcelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        taParcelado = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        rbAVista = new javax.swing.JRadioButton();
        rbParcelado = new javax.swing.JRadioButton();
        btnGerar = new javax.swing.JButton();

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
                    .addComponent(lblVlTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpInformacoesVendaLayout = new javax.swing.GroupLayout(jpInformacoesVenda);
        jpInformacoesVenda.setLayout(jpInformacoesVendaLayout);
        jpInformacoesVendaLayout.setHorizontalGroup(
            jpInformacoesVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInformacoesVendaLayout.createSequentialGroup()
                .addGroup(jpInformacoesVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInformacoesVendaLayout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpInformacoesVendaLayout.createSequentialGroup()
                        .addContainerGap()
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDataVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpInformacoesVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jpInformacoesVendaLayout.setVerticalGroup(
            jpInformacoesVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInformacoesVendaLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
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
                        .addComponent(lblProdutosDisponiveis2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInformacoesVendaLayout.createSequentialGroup()
                        .addComponent(txtIdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblAbrirRecebimento.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        lblAbrirRecebimento.setForeground(new java.awt.Color(101, 96, 168));
        lblAbrirRecebimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAbrirRecebimento.setText("ALTERAR RECEBIMENTO");

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Modo de Recebimento", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Observações"));

        taAVista.setColumns(20);
        taAVista.setRows(5);
        taAVista.setBorder(null);
        jScrollPane1.setViewportView(taAVista);

        cbModoPgtoAVista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Débito", "Cheque" }));

        javax.swing.GroupLayout jpAVistaLayout = new javax.swing.GroupLayout(jpAVista);
        jpAVista.setLayout(jpAVistaLayout);
        jpAVistaLayout.setHorizontalGroup(
            jpAVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
            .addGroup(jpAVistaLayout.createSequentialGroup()
                .addComponent(cbModoPgtoAVista, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpAVistaLayout.setVerticalGroup(
            jpAVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAVistaLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(cbModoPgtoAVista, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cbModoPgtoParcelado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Crédito", "Cheque", "Indefinido" }));

        jLabel1.setText("Data 1° Parcela");

        jLabel2.setText("Parcelas");

        spParcelas.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        btnParcelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/parcelar1.png"))); // NOI18N
        btnParcelar.setBorder(null);
        btnParcelar.setBorderPainted(false);
        btnParcelar.setContentAreaFilled(false);
        btnParcelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnParcelar.setFocusPainted(false);
        btnParcelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/parcelar2.png"))); // NOI18N
        btnParcelar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/parcelar2.png"))); // NOI18N
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
        tblData.setSelectionBackground(new java.awt.Color(168, 193, 221));
        tblData.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblData);
        if (tblData.getColumnModel().getColumnCount() > 0) {
            tblData.getColumnModel().getColumn(0).setPreferredWidth(69);
            tblData.getColumnModel().getColumn(1).setPreferredWidth(130);
            tblData.getColumnModel().getColumn(2).setPreferredWidth(140);
        }

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Observações"));

        taParcelado.setColumns(20);
        taParcelado.setRows(5);
        taParcelado.setBorder(null);
        jScrollPane3.setViewportView(taParcelado);

        javax.swing.GroupLayout jpParceladoLayout = new javax.swing.GroupLayout(jpParcelado);
        jpParcelado.setLayout(jpParceladoLayout);
        jpParceladoLayout.setHorizontalGroup(
            jpParceladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpParceladoLayout.createSequentialGroup()
                .addGroup(jpParceladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpParceladoLayout.createSequentialGroup()
                        .addGroup(jpParceladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jpParceladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spParcelas)))
                    .addGroup(jpParceladoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnParcelar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbModoPgtoParcelado, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
            .addComponent(jSeparator1)
        );
        jpParceladoLayout.setVerticalGroup(
            jpParceladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpParceladoLayout.createSequentialGroup()
                .addGroup(jpParceladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpParceladoLayout.createSequentialGroup()
                        .addComponent(cbModoPgtoParcelado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpParceladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpParceladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnParcelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3))
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

        jLayeredPane1.setLayer(jpAVista, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jpParcelado, javax.swing.JLayeredPane.DEFAULT_LAYER);
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
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbParcelado)
                    .addComponent(rbAVista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpAVista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap(32, Short.MAX_VALUE)
                    .addComponent(jpParcelado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        btnGerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/alterar1.png"))); // NOI18N
        btnGerar.setBorder(null);
        btnGerar.setBorderPainted(false);
        btnGerar.setContentAreaFilled(false);
        btnGerar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGerar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/alterar2.png"))); // NOI18N
        btnGerar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/alterar2.png"))); // NOI18N
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAbrirRecebimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLayeredPane1)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jpInformacoesVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblAbrirRecebimento)
                .addGap(1, 1, 1)
                .addComponent(jpInformacoesVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        int somarData = 0;

        if (jdc.getDate() != null) {
            //Converte util.Date em LocalDate
            LocalDate primeiraParcela = jdc.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            while (parcelaAtual <= qtdParcelas) {
                preencherData(parcelaAtual, primeiraParcela.plusMonths(somarData), retorno.venda.getValor() / qtdParcelas);
                parcelaAtual++;
                somarData++;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Data não pode estar em branco!");
        }
//        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }//GEN-LAST:event_btnParcelarActionPerformed

    private void btnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarActionPerformed
        int qtdLinhas = tblData.getRowCount();
        int indiceLinha = 0;
        boolean gerouErro = false;

        if (rbAVista.isSelected()) {

            Recebimento recebimento = new Recebimento();

            recebimento.setNum_parcela(1);
            recebimento.setData_recebimento(new Date());

            String valorString = lblVlTotalVenda.getText(); // pega o valor
            valorString = valorString.replaceAll("\\.", "").replaceAll("\\,", "."); // substitui virgula por ponto
            recebimento.setValor_recebido(Float.valueOf(valorString)); // acrescenta o valor em float   

            recebimento.setModo_Pgto(rbAVista.getText() + " | " + cbModoPgtoAVista.getSelectedItem());
            recebimento.setObs(taAVista.getText());
            recebimento.setFg_ativo(false);

            recebimento.setId_venda(Integer.valueOf(txtIdVenda.getText()));
            recebimento.setId(new RecebimentoDAO().inserir(Menu.getUsuario(), recebimento));

            if (recebimento.getId() == -1) {
                JOptionPane.showMessageDialog(null, "Erro ao gerar Recebimento! ID Venda: " + recebimento.getId_venda());
            } else if (new VendaDAO().alterarFg_ativo(Menu.getUsuario(), recebimento.getId_venda(), false) == -1) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar fg_ativo de Venda! ID Venda: " + recebimento.getId_venda());
            } else {
                JOptionPane.showMessageDialog(null, "Recebimento(s) gerado(s) com sucesso!");
                dispose();
            }

        } else if (rbParcelado.isSelected()) {
            while (indiceLinha < qtdLinhas) {
                Recebimento recebimento = new Recebimento();

                recebimento.setNum_parcela((int) tblData.getValueAt(indiceLinha, 0));
                try {
                    recebimento.setData_recebimento(sdfNormal.parse(String.valueOf(tblData.getValueAt(indiceLinha, 1))));
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(null, "ERRO: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }

                String valorString = (String) tblData.getValueAt(indiceLinha, 2); // pega o valor
                valorString = valorString.replaceAll("\\.", "").replaceAll("\\,", "."); // substitui virgula por ponto
                recebimento.setValor_recebido(Float.valueOf(valorString)); // acrescenta o valor em float   

                recebimento.setModo_Pgto(rbParcelado.getText() + " | " + cbModoPgtoParcelado.getSelectedItem());
                recebimento.setObs(taParcelado.getText());
                recebimento.setFg_ativo((cbModoPgtoParcelado.getSelectedItem() != "Crédito"));

                recebimento.setId(Integer.valueOf(txtIdVenda.getText()));
                recebimento.setId_venda(Integer.valueOf(txtIdVenda.getText()));
                recebimento.setId(new RecebimentoDAO().inserir(Menu.getUsuario(), recebimento));

                if (recebimento.getId() == -1) {
                    JOptionPane.showMessageDialog(null, "Erro ao gerar recebimento! ID Venda: " + recebimento.getId_venda());
                    gerouErro = true;
                    break;
                }
                indiceLinha++;
            }

            if (new VendaDAO().alterarFg_ativo(Menu.getUsuario(), Integer.valueOf(txtIdVenda.getText()), false) == -1) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar fg_ativo de Venda! ID Venda: " + Integer.valueOf(txtIdVenda.getText()));
            } else if (!gerouErro) {
                JOptionPane.showMessageDialog(null, "Recebimento(s) gerado(s) com sucesso!");
                dispose();
            }
        }
    }//GEN-LAST:event_btnGerarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerar;
    private javax.swing.JButton btnParcelar;
    private javax.swing.JComboBox<String> cbModoPgtoAVista;
    private javax.swing.JComboBox<String> cbModoPgtoParcelado;
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
    private com.toedter.calendar.JDateChooser jdc;
    private javax.swing.JPanel jpAVista;
    private javax.swing.JPanel jpInformacoesVenda;
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
    private javax.swing.JTextArea taAVista;
    private javax.swing.JTextArea taParcelado;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtDataVenda;
    private javax.swing.JTextField txtIdVenda;
    // End of variables declaration//GEN-END:variables
    private void configurarFormulario() {
        this.setTitle("Alterar Recebimento");
        this.setResizable(false);
        this.setMaximizable(false);
        this.setIconifiable(false);
        this.setClosable(true);

        rbg.add(rbAVista);
        rbg.add(rbParcelado);
        rbAVista.setSelected(true);

        getRootPane().setDefaultButton(btnGerar);

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
        tblData.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 10));
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
