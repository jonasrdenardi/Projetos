package view;

import controller.ClienteDAO;
import controller.ProdutoDAO;
import controller.ProdutoVendaDAO;
import controller.VendaDAO;
import java.awt.Dimension;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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

    DecimalFormat dm = new DecimalFormat("0.00");
    float descontoFinal = 0;
    Cliente cliente = new Cliente();

    public VendaAbrir(Cliente cliente) {
        initComponents();
        configurarFormulario();

        this.cliente = cliente;
        txtCliente.setText(cliente.getNome());
        txtCliente.setEditable(false);
        txtDesconto.setDocument(new ApenasNumeros());
        preencherTabelaProduto(new ProdutoDAO().listarAtivos(Menu.getUsuario()));

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
        spQtd = new javax.swing.JSpinner();
        btnAdicionar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProdutoVenda = new javax.swing.JTable();
        lblPordutosIncVenda = new javax.swing.JLabel();
        btnExcluirItem = new javax.swing.JButton();
        btnGerarVenda = new javax.swing.JButton();
        lblDesconto = new javax.swing.JLabel();
        lblTotalVenda = new javax.swing.JLabel();
        lblVlTotalVenda = new javax.swing.JLabel();
        jdcData = new com.toedter.calendar.JDateChooser();
        lblData = new javax.swing.JLabel();
        lblAlterarCliente = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        txtPesquisa = new javax.swing.JTextField();
        lblSelecione = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        txtDesconto = new javax.swing.JTextField();
        rdbDescValor = new javax.swing.JRadioButton();
        rdbDescPorcentagem = new javax.swing.JRadioButton();
        txtCliente = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        lblProdutosDisponiveis1 = new javax.swing.JLabel();

        setIconifiable(true);
        setResizable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone.png"))); // NOI18N

        lblProdutosDisponiveis.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        lblProdutosDisponiveis.setForeground(new java.awt.Color(208, 92, 5));
        lblProdutosDisponiveis.setText("Produtos Disponiveis");

        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descrição", "Qtde", "Preço"
            }
        ));
        jScrollPane1.setViewportView(tblProduto);

        buttonGroup1.add(rdbPorId);
        rdbPorId.setText("ID");

        buttonGroup1.add(rdbPorDescricao);
        rdbPorDescricao.setText("Descrição");

        lblPesquisarPRoduto1.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        lblPesquisarPRoduto1.setForeground(new java.awt.Color(208, 92, 5));
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
        lblPordutosIncVenda.setForeground(new java.awt.Color(208, 92, 5));
        lblPordutosIncVenda.setText("Produtos incluidos na venda");

        btnExcluirItem.setText("Excluir Produto");
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

        lblDesconto.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        lblDesconto.setForeground(new java.awt.Color(208, 92, 5));
        lblDesconto.setText("Desconto:");

        lblTotalVenda.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        lblTotalVenda.setForeground(new java.awt.Color(208, 92, 5));
        lblTotalVenda.setText("Total Venda:");

        lblVlTotalVenda.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        lblVlTotalVenda.setForeground(new java.awt.Color(0, 0, 204));

        lblData.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        lblData.setForeground(new java.awt.Color(208, 92, 5));
        lblData.setText("Data da Venda");

        lblAlterarCliente.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        lblAlterarCliente.setForeground(new java.awt.Color(208, 92, 5));
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
        lblSelecione.setForeground(new java.awt.Color(208, 92, 5));
        lblSelecione.setText("Pesquise e clique 2x no Produto para incluir na venda");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtDesconto.setBackground(new java.awt.Color(214, 217, 223));
        txtDesconto.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        txtDesconto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDesconto.setBorder(null);
        txtDesconto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescontoKeyReleased(evt);
            }
        });

        rdbDescValor.setText("Valor");

        rdbDescPorcentagem.setText("Porcentagem");

        txtCliente.setBackground(new java.awt.Color(214, 217, 223));
        txtCliente.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        txtCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCliente.setBorder(null);

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblProdutosDisponiveis1.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        lblProdutosDisponiveis1.setForeground(new java.awt.Color(208, 92, 5));
        lblProdutosDisponiveis1.setText("Cliente:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAlterarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rdbPorId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbPorDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPesquisa)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblProdutosDisponiveis1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCliente)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPesquisarPRoduto1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(35, Short.MAX_VALUE))
                            .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnExcluirItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdbDescValor, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdbDescPorcentagem))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblVlTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDesconto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(206, 206, 206)
                        .addComponent(btnGerarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPordutosIncVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jdcData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(lblSelecione)
                            .addComponent(lblProdutosDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAlterarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rdbPorId)
                                .addComponent(rdbPorDescricao))
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProdutosDisponiveis1)))
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSelecione, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(lblProdutosDisponiveis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPesquisarPRoduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblDesconto)
                                .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblVlTotalVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblTotalVenda))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPordutosIncVenda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblData)
                                        .addGap(7, 7, 7)
                                        .addComponent(jdcData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExcluirItem)
                                .addGap(0, 42, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnGerarVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(rdbDescValor)
                                            .addComponent(rdbDescPorcentagem))
                                        .addGap(46, 46, 46)))))
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
                qtdString = qtdString.replaceAll("\\,", "."); // substitui virgula por ponto
                float qtdFloat = Float.valueOf(qtdString); // acrescenta o valor em float

                if (((int) spQtd.getValue()) > 0 && ((int) spQtd.getValue()) <= qtdFloat) {
                    Produto p = new Produto();
                    // Obtem os valores do item selecionado
                    p.setId((int) tblProduto.getValueAt(indiceLinha, 0));
                    p.setDescricao((String) tblProduto.getValueAt(indiceLinha, 1));

                    String valorProduto = (String) tblProduto.getValueAt(indiceLinha, 3); // pega o valor do item e tranforma numa string
                    valorProduto = valorProduto.replaceAll("\\,", "."); // substitui virgula por ponto
                    p.setPreco(Float.valueOf(valorProduto)); // acrescenta o valor em float

                    String Qtdproduto = (String) tblProduto.getValueAt(indiceLinha, 2); // pega o valor do item e tranforma numa string
                    Qtdproduto = Qtdproduto.replaceAll("\\,", "."); // substitui virgula por ponto
                    p.setQtd(Float.valueOf(Qtdproduto)); // acrescenta o valor em float

                    ProdutoVenda pv = new ProdutoVenda();
                    pv.setQtdProduto((int) spQtd.getValue());

                    preencherTabelaProdutoVenda(p, pv);

                    setTotalVenda();
                } else {
                    JOptionPane.showMessageDialog(null, "Selecione uma quantidade entre 1 e " + tblProduto.getValueAt(indiceLinha, 2));
                }
            } else {
                JOptionPane.showMessageDialog(null, "Item já incluido !");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um item !");
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnExcluirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirItemActionPerformed
        if (tblProdutoVenda.getSelectedRow() != -1) {
            // Remove item selecionado da tabel itemPedido 
            ((DefaultTableModel) tblProdutoVenda.getModel()).removeRow(tblProdutoVenda.getSelectedRow());
            setTotalVenda();
        }
    }//GEN-LAST:event_btnExcluirItemActionPerformed

    private void btnGerarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarVendaActionPerformed
        if (tblProdutoVenda.getRowCount() != 0) {
            int count;
            // Conta quantos itens serao adicionados
            count = tblProdutoVenda.getRowCount();

            Venda v = new Venda();
            v.setIdCliente(cliente.getId());
            v.setDataVenda(jdcData.getDate());

            v.setDesconto(descontoFinal); // acrescenta o valor em float  

            String TotalString = lblVlTotalVenda.getText(); // pega o valor do total do pedido
            TotalString = TotalString.replaceAll("\\,", "."); // substitui virgula por ponto
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
                qtdDispString = qtdDispString.replaceAll("\\,", "."); // substitui virgula por ponto
                p[x].setQtd(Float.valueOf(qtdDispString)); // acrescenta o valor em float 

                String qtdString = (String) tblProdutoVenda.getValueAt(x, 3); // pega a qtd do produto e tranforma numa string
                qtdString = qtdString.replaceAll("\\,", "."); // substitui virgula por ponto
                pv[x].setQtdProduto(Float.valueOf(qtdString)); // acrescenta o valor em float

                String valoUnString = (String) tblProdutoVenda.getValueAt(x, 4); // pega o valor do produto e tranforma numa string
                valoUnString = valoUnString.replaceAll("\\,", "."); // substitui virgula por ponto
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
                    spQtd.setValue(1);
                    jdcData.setDate(null);
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Nenhum produto adicionado ao pedido  !");
        }
    }//GEN-LAST:event_btnGerarVendaActionPerformed

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased

        String chave = txtPesquisa.getText();

        if (chave.isEmpty()) {
            preencherTabela(new ProdutoDAO().listar(Menu.getUsuario()));
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnExcluirItem;
    private javax.swing.JButton btnGerarVenda;
    private javax.swing.ButtonGroup buttonGroup1;
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
    private javax.swing.JSpinner spQtd;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTable tblProdutoVenda;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtDesconto;
    private javax.swing.JTextField txtPesquisa;
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

        configurarTabela();
    }

    public void configurarTabelaItem() {
        //Configura a tabela e a posição dos itens na coluna
        DefaultTableModel m = (DefaultTableModel) tblProduto.getModel();

        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(15);
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(150);
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

        tblProduto.setModel(m);
    }

    public void configurarTabelaItemPedido() {
        //Configura a tabela e a posição dos itens na coluna
        DefaultTableModel m = (DefaultTableModel) tblProdutoVenda.getModel();
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

        tblProdutoVenda.setModel(m);
    }

    public void preencherTabelaProdutoVenda(Produto p, ProdutoVenda pv) {
        if (p != null) {

            configurarTabelaItemPedido();
            DefaultTableModel m = (DefaultTableModel) tblProdutoVenda.getModel();

            m.addRow(new Object[]{p.getId(), p.getDescricao(), dm.format(p.getQtd()), dm.format(pv.getQtdProduto()), dm.format(p.getPreco()), dm.format(pv.getQtdProduto() * p.getPreco())});

            tblProdutoVenda.setModel(m);

        }
    }

    public void setTotalVenda() {
        int count = tblProdutoVenda.getRowCount();
        float totalVenda = 0;
        String DescontoString = txtDesconto.getText(); // pega o valor do item e tranforma numa string
        for (int x = 0; x < count; x++) {
            String valorTotalvenda = (String) tblProdutoVenda.getValueAt(x, 4); // pega o valor do item e tranforma numa string
            valorTotalvenda = valorTotalvenda.replaceAll("\\,", "."); // substitui virgula por ponto
            totalVenda += Float.valueOf(valorTotalvenda); // acrescenta o valor em float    
        }

        if ((DescontoString.isEmpty()) || DescontoString.equals(",")) {
            lblVlTotalVenda.setText(dm.format(totalVenda));
        } else if (rdbDescValor.isSelected()) {
            DescontoString = DescontoString.replaceAll("\\,", "."); // substitui virgula por ponto
            float valorDescontoFloat = Float.valueOf(DescontoString); // acrescenta o valor em float   

            if (valorDescontoFloat == 0) {
                lblVlTotalVenda.setText(dm.format(totalVenda));
            } else {
                totalVenda -= valorDescontoFloat;
                lblVlTotalVenda.setText(dm.format(totalVenda));
                descontoFinal = valorDescontoFloat;
            }
        } else {
            DescontoString = DescontoString.replaceAll("\\,", "."); // substitui virgula por ponto
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
            configurarTabelaItem();
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
        m.addColumn("Preço");

        tblProduto.setModel(m);

        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(15);
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(165);
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
    }

    private void preencherTabela(List<Produto> lista) {
        configurarTabela();
        if (lista.size() > 0) {
            DefaultTableModel m = (DefaultTableModel) tblProduto.getModel();
            for (Produto p : lista) {
                m.addRow(new Object[]{
                    p.getId(),
                    p.getDescricao(),
                    dm.format(p.getQtd()),
                    dm.format(p.getPreco()),});
            }
            tblProduto.setModel(m);
        }
    }

}
