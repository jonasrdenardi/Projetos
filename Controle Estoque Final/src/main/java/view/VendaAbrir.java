package view;

import controller.ProdutoDAO;
import controller.ProdutoVendaDAO;
import controller.VendaDAO;
import java.awt.Dimension;
import java.awt.Font;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.ApenasNumeros;
import model.Cliente;
import model.Produto;
import model.ProdutoVenda;
import model.Venda;

public class VendaAbrir extends javax.swing.JInternalFrame {

    DecimalFormat dm = new DecimalFormat(("###,###,###,###,##0.00"));
    float descontoFinal = 0;
    Cliente cliente = new Cliente();

    public VendaAbrir(Cliente cliente) {
        initComponents();
        configurarFormulario();

        this.cliente = cliente;
        txtCliente.setText(cliente.getNome());
        txtCliente.setEditable(false);
        txtDesconto.setDocument(new ApenasNumeros());
        txtQtd.setDocument(new ApenasNumeros());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblProdutosDisponiveis = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        rdbPorId = new javax.swing.JRadioButton();
        rdbPorDescricao = new javax.swing.JRadioButton();
        lblPesquisarPRoduto1 = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProdutoVenda = new javax.swing.JTable();
        lblPordutosIncVenda = new javax.swing.JLabel();
        btnExcluirItem = new javax.swing.JButton();
        btnGerarVenda = new javax.swing.JButton();
        jdcData = new com.toedter.calendar.JDateChooser();
        lblData = new javax.swing.JLabel();
        lblAlterarCliente = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        txtPesquisa = new javax.swing.JTextField();
        lblSelecione = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtCliente = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        lblProdutosDisponiveis1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtDesconto = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        lblDesconto = new javax.swing.JLabel();
        rdbDescValor = new javax.swing.JRadioButton();
        lblTotalVenda = new javax.swing.JLabel();
        rdbDescPorcentagem = new javax.swing.JRadioButton();
        lblVlTotalVenda = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();

        setIconifiable(true);
        setResizable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone.png"))); // NOI18N
        setRequestFocusEnabled(false);

        lblProdutosDisponiveis.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        lblProdutosDisponiveis.setForeground(new java.awt.Color(101, 96, 168));
        lblProdutosDisponiveis.setText("Produtos Disponiveis");

        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descrição", "Qtde", "Preço"
            }
        ));
        tblProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblProdutoMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblProduto);

        buttonGroup1.add(rdbPorId);
        rdbPorId.setForeground(new java.awt.Color(101, 96, 168));
        rdbPorId.setText("ID");

        buttonGroup1.add(rdbPorDescricao);
        rdbPorDescricao.setForeground(new java.awt.Color(101, 96, 168));
        rdbPorDescricao.setText("Descrição");

        lblPesquisarPRoduto1.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        lblPesquisarPRoduto1.setForeground(new java.awt.Color(101, 96, 168));
        lblPesquisarPRoduto1.setText("Quantidade:");

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adc1.png"))); // NOI18N
        btnAdicionar.setBorder(null);
        btnAdicionar.setBorderPainted(false);
        btnAdicionar.setContentAreaFilled(false);
        btnAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adc2.png"))); // NOI18N
        btnAdicionar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adc2.png"))); // NOI18N
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        tblProdutoVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descrição", "Qtde Disp", "Qtde", "Preço Un", "Preço Total"
            }
        ));
        jScrollPane2.setViewportView(tblProdutoVenda);

        lblPordutosIncVenda.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        lblPordutosIncVenda.setForeground(new java.awt.Color(101, 96, 168));
        lblPordutosIncVenda.setText("Produtos incluidos na venda");

        btnExcluirItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir1.png"))); // NOI18N
        btnExcluirItem.setBorder(null);
        btnExcluirItem.setBorderPainted(false);
        btnExcluirItem.setContentAreaFilled(false);
        btnExcluirItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirItem.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir2.png"))); // NOI18N
        btnExcluirItem.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir2.png"))); // NOI18N
        btnExcluirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirItemActionPerformed(evt);
            }
        });

        btnGerarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gerar1.png"))); // NOI18N
        btnGerarVenda.setBorder(null);
        btnGerarVenda.setBorderPainted(false);
        btnGerarVenda.setContentAreaFilled(false);
        btnGerarVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGerarVenda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gerar2.png"))); // NOI18N
        btnGerarVenda.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gerar2.png"))); // NOI18N
        btnGerarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarVendaActionPerformed(evt);
            }
        });

        lblData.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        lblData.setForeground(new java.awt.Color(101, 96, 168));
        lblData.setText("Data da Venda:");

        lblAlterarCliente.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        lblAlterarCliente.setForeground(new java.awt.Color(101, 96, 168));
        lblAlterarCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAlterarCliente.setText("ABRIR VENDA");

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtPesquisa.setBackground(new java.awt.Color(214, 217, 223));
        txtPesquisa.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        txtPesquisa.setForeground(new java.awt.Color(153, 153, 153));
        txtPesquisa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPesquisa.setText("Digite sua pesquisa aqui!");
        txtPesquisa.setBorder(null);
        txtPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPesquisaMousePressed(evt);
            }
        });
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        lblSelecione.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        lblSelecione.setForeground(new java.awt.Color(101, 96, 168));
        lblSelecione.setText("Pesquise e clique sobre o Produto para adicionar na venda");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        txtCliente.setBackground(new java.awt.Color(214, 217, 223));
        txtCliente.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        txtCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCliente.setBorder(null);

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblProdutosDisponiveis1.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        lblProdutosDisponiveis1.setForeground(new java.awt.Color(101, 96, 168));
        lblProdutosDisponiveis1.setText("Cliente:");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtDesconto.setBackground(new java.awt.Color(214, 217, 223));
        txtDesconto.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        txtDesconto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDesconto.setBorder(null);
        txtDesconto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescontoKeyReleased(evt);
            }
        });

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblDesconto.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        lblDesconto.setForeground(new java.awt.Color(101, 96, 168));
        lblDesconto.setText("Desconto:");

        rdbDescValor.setForeground(new java.awt.Color(101, 96, 168));
        rdbDescValor.setText("Valor");
        rdbDescValor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rdbDescValorMousePressed(evt);
            }
        });

        lblTotalVenda.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        lblTotalVenda.setForeground(new java.awt.Color(101, 96, 168));
        lblTotalVenda.setText("Total Venda:");

        rdbDescPorcentagem.setForeground(new java.awt.Color(101, 96, 168));
        rdbDescPorcentagem.setText("Porcentagem");
        rdbDescPorcentagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rdbDescPorcentagemMousePressed(evt);
            }
        });

        lblVlTotalVenda.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        lblVlTotalVenda.setForeground(new java.awt.Color(0, 0, 204));
        lblVlTotalVenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDesconto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdbDescValor, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbDescPorcentagem))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVlTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbDescValor)
                    .addComponent(rdbDescPorcentagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDesconto)
                        .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblVlTotalVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblTotalVenda)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtQtd.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAlterarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPesquisarPRoduto1)
                                            .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnExcluirItem, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(260, 260, 260)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnGerarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblData)
                                            .addComponent(jdcData, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdbPorId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdbPorDescricao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPesquisa)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblProdutosDisponiveis1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCliente)
                                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPordutosIncVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSelecione)
                                    .addComponent(lblProdutosDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblAlterarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(rdbPorDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdbPorId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblProdutosDisponiveis1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSelecione, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(lblProdutosDisponiveis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPesquisarPRoduto1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPordutosIncVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdcData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnGerarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirItem, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 98, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // Pega o indice da linha selecionada
        int indiceLinha = tblProduto.getSelectedRow();
        if (indiceLinha != -1) {
            if (verificaExistenciaProdutoItem((int) tblProduto.getValueAt(indiceLinha, 0)) == false) {

                String qtdString = (String) tblProduto.getValueAt(indiceLinha, 2); // pega o valor do item e tranforma numa string
                qtdString = qtdString.replaceAll("\\.", "").replaceAll("\\,", "."); // substitui virgula por ponto
                float qtdFloat = Float.valueOf(qtdString); // acrescenta o valor em float

                if (Float.parseFloat(txtQtd.getText().replaceAll("\\.", "").replaceAll("\\,", ".")) > 0 && (Float.parseFloat(txtQtd.getText().replaceAll("\\.", "").replaceAll("\\,", "."))) <= qtdFloat) {
                    Produto p = new Produto();
                    // Obtem os valores do item selecionado
                    p.setId((int) tblProduto.getValueAt(indiceLinha, 0));
                    p.setDescricao((String) tblProduto.getValueAt(indiceLinha, 1));

                    String valorProduto = (String) tblProduto.getValueAt(indiceLinha, 3); // pega o valor do item e tranforma numa string
                    valorProduto = valorProduto.replaceAll("\\.", "").replaceAll("\\,", "."); // substitui virgula por ponto

                    p.setPreco(Float.valueOf(valorProduto)); // acrescenta o valor em float

                    String Qtdproduto = (String) tblProduto.getValueAt(indiceLinha, 2); // pega o valor do item e tranforma numa string
                    Qtdproduto = Qtdproduto.replaceAll("\\.", "").replaceAll("\\,", "."); // substitui virgula por ponto
                    p.setQtd(Float.valueOf(Qtdproduto)); // acrescenta o valor em float

                    ProdutoVenda pv = new ProdutoVenda();
                    String qtd = txtQtd.getText().replaceAll("\\.", "").replaceAll("\\,", ".");
                    float qtd2 = Float.valueOf(qtd);
                    pv.setQtdProduto(qtd2);

                    preencherTabelaProdutoVenda(p, pv);

                    setTotalVenda();
                } else {
                    JOptionPane.showMessageDialog(null, "Quantidade não permitida!");
                    txtQtd.setText("1");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Item já incluido!");
                txtQtd.setText("1");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um item!");
            txtQtd.setText("1");
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnExcluirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirItemActionPerformed
        int indiceLinha = tblProdutoVenda.getSelectedRow();
        if (indiceLinha != -1) {
            if (tblProdutoVenda.getSelectedRow() != -1) {
                // Remove item selecionado da tabel itemPedido 
                ((DefaultTableModel) tblProdutoVenda.getModel()).removeRow(tblProdutoVenda.getSelectedRow());
                txtDesconto.setText("");
                setTotalVenda();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um item para exclui-lo!");
        }
    }//GEN-LAST:event_btnExcluirItemActionPerformed

    private void btnGerarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarVendaActionPerformed
        if (tblProdutoVenda.getRowCount() != 0) {
            if (jdcData.getDate() != null) {
                int count;
                // Conta quantos itens serao adicionados
                count = tblProdutoVenda.getRowCount();

                Venda v = new Venda();
                v.setIdCliente(cliente.getId());
                v.setDataVenda(jdcData.getDate());

                v.setDesconto(descontoFinal); // acrescenta o valor em float  

                String TotalString = lblVlTotalVenda.getText(); // pega o valor do total do pedido
                TotalString = TotalString.replaceAll("\\.", "").replaceAll("\\,", "."); // substitui virgula por ponto
                v.setValor(Float.valueOf(TotalString)); // acrescenta o valor em float

                ProdutoVenda pv[] = new ProdutoVenda[count];
                Produto p[] = new Produto[count];

                // For para acrescentar os itens as variáveis
                for (int x = 0; x < count; x++) {
                    pv[x] = new ProdutoVenda();
                    p[x] = new Produto();

                    pv[x].setIdProduto((int) tblProdutoVenda.getValueAt(x, 0)); // pega o id do produto
                    p[x].setId((int) tblProdutoVenda.getValueAt(x, 0)); // pega o id do produto                  

                    String qtdDispString = (String) tblProdutoVenda.getValueAt(x, 2); // pega a qtd disponivel do produto e tranforma numa string
                    qtdDispString = qtdDispString.replaceAll("\\.", "").replaceAll("\\,", "."); // substitui virgula por ponto
                    p[x].setQtd(Float.valueOf(qtdDispString)); // acrescenta o valor em float 

                    String qtdString = (String) tblProdutoVenda.getValueAt(x, 3); // pega a qtd do produto e tranforma numa string
                    qtdString = qtdString.replaceAll("\\.", "").replaceAll("\\,", "."); // substitui virgula por ponto
                    pv[x].setQtdProduto(Float.valueOf(qtdString)); // acrescenta o valor em float

                    String valoUnString = (String) tblProdutoVenda.getValueAt(x, 4); // pega o valor do produto e tranforma numa string
                    valoUnString = valoUnString.replaceAll("\\.", "").replaceAll("\\,", "."); // substitui virgula por ponto
                    pv[x].setValorProduto(Float.valueOf(valoUnString)); // acrescenta o valor em float  
                }

                v.setId(new VendaDAO().inserir(Menu.getUsuario(), v));

                System.out.println(v.getId());

                if (v.getId() != -1) {
                    for (int i = 0; i < pv.length; i++) {
                        pv[i].setIdVenda(v.getId());
                    }
                    int res = (new ProdutoVendaDAO().inserir(Menu.getUsuario(), pv));
                    if (res != -1) {
                        for (int i = 0; i < p.length; i++) {
                            p[i].setQtd(p[i].getQtd() - pv[i].getQtdProduto());
                            new ProdutoDAO().atualizarEstoque(Menu.getUsuario(), p[i]);
                        }
                        JOptionPane.showMessageDialog(null, "Venda " + v.getId() + " gerado com sucesso");
                        while (tblProdutoVenda.getModel().getRowCount() > 0) {
                            DefaultTableModel dtm = (DefaultTableModel) tblProdutoVenda.getModel();
                            dtm.removeRow(0);
                        }
                        while (tblProduto.getModel().getRowCount() > 0) {
                            DefaultTableModel dtm = (DefaultTableModel) tblProduto.getModel();
                            dtm.removeRow(0);
                        }
                        preencherTabelaProduto(new ProdutoDAO().listarAtivos(Menu.getUsuario()));
                        txtDesconto.setText("");
                        lblVlTotalVenda.setText("0,00");
                        txtQtd.setText("1");
                        jdcData.setDate(null);
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "Data não pode estar em branco!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum produto adicionado ao pedido!");
        }
    }//GEN-LAST:event_btnGerarVendaActionPerformed

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased

        String chave = txtPesquisa.getText();

        if (chave.isEmpty()) {
            preencherTabela(new ProdutoDAO().listarAtivos(Menu.getUsuario()));
        } else if (rdbPorId.isSelected()) {
            preencherTabela(new ProdutoDAO().pesquisarPorId(Menu.getUsuario(), Integer.parseInt(chave)));
        } else if (rdbPorDescricao.isSelected()) {
            preencherTabela(new ProdutoDAO().pesquisarPorDescricao(Menu.getUsuario(), chave));
        }
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void txtDescontoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescontoKeyReleased
        setTotalVenda();
    }//GEN-LAST:event_txtDescontoKeyReleased

    private void txtPesquisaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPesquisaMousePressed
        txtPesquisa.setText("");
        txtPesquisa.setForeground(java.awt.Color.BLACK);
    }//GEN-LAST:event_txtPesquisaMousePressed

    private void tblProdutoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutoMousePressed
        int indiceLinha = tblProduto.getSelectedRow();
        txtQtd.setText("1");

        if (indiceLinha != -1) {
            String qtdString = (String) tblProduto.getValueAt(indiceLinha, 2); // pega o valor do item e tranforma numa string
            qtdString = qtdString.replaceAll("\\.", "").replaceAll("\\,", "."); // substitui virgula por ponto
            float qtdFloat = Float.valueOf(qtdString); // acrescenta o valor em float
            if (qtdFloat != 0) {
                //txtQtd.setModel(new javax.swing.SpinnerNumberModel(1, 1, (int) qtdFloat, 1));
            } else {
                //txtQtd.setModel(new javax.swing.SpinnerNumberModel(0, 0, 0, 0));
            }
        }

    }//GEN-LAST:event_tblProdutoMousePressed

    private void rdbDescValorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbDescValorMousePressed
        txtDesconto.setText("");
        setTotalVenda();
    }//GEN-LAST:event_rdbDescValorMousePressed

    private void rdbDescPorcentagemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbDescPorcentagemMousePressed
        txtDesconto.setText("");
        setTotalVenda();
    }//GEN-LAST:event_rdbDescPorcentagemMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnExcluirItem;
    private javax.swing.JButton btnGerarVenda;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private com.toedter.calendar.JDateChooser jdcData;
    private javax.swing.JLabel lblAlterarCliente;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDesconto;
    private javax.swing.JLabel lblPesquisarPRoduto1;
    private javax.swing.JLabel lblPordutosIncVenda;
    private javax.swing.JLabel lblProdutosDisponiveis;
    private javax.swing.JLabel lblProdutosDisponiveis1;
    private javax.swing.JLabel lblSelecione;
    private javax.swing.JLabel lblTotalVenda;
    private javax.swing.JLabel lblVlTotalVenda;
    private javax.swing.JRadioButton rdbDescPorcentagem;
    private javax.swing.JRadioButton rdbDescValor;
    private javax.swing.JRadioButton rdbPorDescricao;
    private javax.swing.JRadioButton rdbPorId;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTable tblProdutoVenda;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtDesconto;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Abrir Venda");
        this.setResizable(false);
        this.setClosable(true);
        this.setIconifiable(true);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rdbPorId);
        bg.add(rdbPorDescricao);
        rdbPorDescricao.setSelected(true);

        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(rdbDescValor);
        bg2.add(rdbDescPorcentagem);
        rdbDescValor.setSelected(true);

        configurarTabelaProduto();
        configurarTabelaProdutoVenda();
        preencherTabelaProduto(new ProdutoDAO().listarAtivos(Menu.getUsuario()));
    }

    public void configurarTabelaProdutoVenda() {
        //Configura a tabela e a posição dos itens na coluna
        DefaultTableModel m = (DefaultTableModel) tblProdutoVenda.getModel();

        tblProdutoVenda.setModel(m);

        tblProdutoVenda.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblProdutoVenda.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblProdutoVenda.getColumnModel().getColumn(2).setPreferredWidth(50);
        tblProdutoVenda.getColumnModel().getColumn(3).setPreferredWidth(50);
        tblProdutoVenda.getColumnModel().getColumn(4).setPreferredWidth(100);
        tblProdutoVenda.getColumnModel().getColumn(5).setPreferredWidth(100);
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        tblProdutoVenda.getColumnModel().getColumn(2).setCellRenderer(direita);
        tblProdutoVenda.getColumnModel().getColumn(3).setCellRenderer(direita);
        tblProdutoVenda.getColumnModel().getColumn(4).setCellRenderer(direita);
        tblProdutoVenda.getColumnModel().getColumn(5).setCellRenderer(direita);
        ((DefaultTableCellRenderer) tblProdutoVenda.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        tblProdutoVenda.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 12));
    }

    public void preencherTabelaProdutoVenda(Produto p, ProdutoVenda pv) {
        if (p != null) {

            configurarTabelaProdutoVenda();
            DefaultTableModel m = (DefaultTableModel) tblProdutoVenda.getModel();

            m.addRow(new Object[]{
                p.getId(),
                p.getDescricao(),
                dm.format(p.getQtd()),
                dm.format(pv.getQtdProduto()),
                dm.format(p.getPreco()),
                dm.format(pv.getQtdProduto() * p.getPreco())
            });

            tblProdutoVenda.setModel(m);
        }
    }

    public void setTotalVenda() {
        int count = tblProdutoVenda.getRowCount();
        float totalVenda = 0;
        String DescontoString = txtDesconto.getText(); // pega o valor do item e tranforma numa string
        for (int x = 0; x < count; x++) {
            String valorTotalvenda = (String) tblProdutoVenda.getValueAt(x, 5); // pega o valor do item e tranforma numa string
            valorTotalvenda = valorTotalvenda.replaceAll("\\.", "").replaceAll("\\,", "."); // substitui virgula por ponto
            totalVenda += Float.valueOf(valorTotalvenda); // acrescenta o valor em float    
        }

        if ((DescontoString.isEmpty()) || DescontoString.equals(",")) {
            lblVlTotalVenda.setText(dm.format(totalVenda));
        } else if (rdbDescValor.isSelected()) {
            DescontoString = DescontoString.replaceAll("\\.", "").replaceAll("\\,", "."); // substitui virgula por ponto
            float valorDescontoFloat = Float.valueOf(DescontoString); // acrescenta o valor em float   

            if (valorDescontoFloat == 0) {
                lblVlTotalVenda.setText(dm.format(totalVenda));
            } else {
                totalVenda -= valorDescontoFloat;
                lblVlTotalVenda.setText(dm.format(totalVenda));
                descontoFinal = valorDescontoFloat;
            }
        } else {
            DescontoString = DescontoString.replaceAll("\\.", "").replaceAll("\\,", "."); // substitui virgula por ponto
            float valorDescontoFloat = Float.valueOf(DescontoString); // acrescenta o valor em float   

            if (valorDescontoFloat < 0 || valorDescontoFloat > 100) {
                JOptionPane.showMessageDialog(null, "Valor de porcentagem não permitida !");
                txtDesconto.setText("");
            } else {
                descontoFinal = (totalVenda / 100) * valorDescontoFloat;
                totalVenda -= descontoFinal;
                lblVlTotalVenda.setText(dm.format(totalVenda));
            }
        }
    }

    public void preencherTabelaProduto(List<Produto> lista) {
        if (lista != null) {

            //Configura a tabela e a posição dos itens na coluna
            configurarTabelaProduto();
            DefaultTableModel m = (DefaultTableModel) tblProduto.getModel();

            for (Object obj : lista) {
                Produto p = (Produto) obj;
                m.addRow(new Object[]{p.getId(), p.getDescricao(), dm.format(p.getQtd()), dm.format(p.getPreco())});

            }
            tblProduto.setModel(m);

        }
    }

    public boolean verificaExistenciaProdutoItem(int idItem) {
        int totalLinhas = tblProdutoVenda.getRowCount();
        boolean jaExiste = false;

        // Verifica se existem itens adicionados
        if (totalLinhas != -1) {
            // Se houver itens adicionados da tabela item pedido verifica se o id do item a ser adicionado é igual a algum id já adicionado
            for (int i = 0; i < totalLinhas; i++) {
                if (idItem == (int) (tblProdutoVenda.getValueAt(i, 0))) {
                    jaExiste = true;
                }
            }
            return jaExiste;
        } else {
            return false;
        }

    }

    // Centraliza o JInternalFrame quando chamado
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    private void configurarTabelaProduto() {
        DefaultTableModel m = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        m.addColumn("Id");
        m.addColumn("Descrição");
        m.addColumn("Qtde");
        m.addColumn("Preço");
        
        tblProduto.setModel(m);

        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(10);
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(350);
        tblProduto.getColumnModel().getColumn(2).setPreferredWidth(15);
        tblProduto.getColumnModel().getColumn(3).setPreferredWidth(15);
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        tblProduto.getColumnModel().getColumn(2).setCellRenderer(direita);
        tblProduto.getColumnModel().getColumn(3).setCellRenderer(direita);
        ((DefaultTableCellRenderer) tblProduto.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        tblProduto.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 12));
    }

    private void preencherTabela(List<Produto> lista) {
        configurarTabelaProduto();
        if (lista.size() > 0) {
            DefaultTableModel m = (DefaultTableModel) tblProduto.getModel();
            for (Produto p : lista) {
                if (p.getFg_ativo() == true) {
                    m.addRow(new Object[]{
                        p.getId(),
                        p.getDescricao(),
                        dm.format(p.getQtd()),
                        dm.format(p.getPreco())
                    });
                }
            }
            tblProduto.setModel(m);
        }
    }

}
