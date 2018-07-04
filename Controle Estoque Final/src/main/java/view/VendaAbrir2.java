package view;

import controller.ProdutoDAO;
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
import model.Produto;
import model.ProdutoVenda;
import model.Venda;

public class VendaAbrir2 extends javax.swing.JInternalFrame {

    DecimalFormat dm = new DecimalFormat("0.00");

    public VendaAbrir2() {
        initComponents();
        configurarFormulario();

        txtDesconto.setDocument(new ApenasNumeros());
        System.out.println("teste");
        preencherTabelaProduto(new ProdutoDAO().listarAtivos(Menu.getUsuario()));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProdutoVenda = new javax.swing.JTable();
        lblItensDisp = new javax.swing.JLabel();
        lblItensIncPedido = new javax.swing.JLabel();
        btnExcluirItem = new javax.swing.JButton();
        lblTotalVenda = new javax.swing.JLabel();
        lblVTotalVenda = new javax.swing.JLabel();
        btnAddItem = new javax.swing.JButton();
        spQtd = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        lblDesconto = new javax.swing.JLabel();
        rdbDesc = new javax.swing.JRadioButton();
        rdbId = new javax.swing.JRadioButton();
        txtPesquisa = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtDesconto = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/java_icon.png"))); // NOI18N

        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descrição", "Qtde", "Preco"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProduto.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tblProduto);

        tblProdutoVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descrição", "Qtde", "Valor Un.", "Valor Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProdutoVenda.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane2.setViewportView(tblProdutoVenda);

        lblItensDisp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblItensDisp.setText("Produtos Disponíveis");

        lblItensIncPedido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblItensIncPedido.setText("Itens incluidos na venda");

        btnExcluirItem.setText("Excluir Item");
        btnExcluirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirItemActionPerformed(evt);
            }
        });

        lblTotalVenda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotalVenda.setText("Total Venda:");

        lblVTotalVenda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnAddItem.setText("ADICIONAR");
        btnAddItem.setBorder(null);
        btnAddItem.setBorderPainted(false);
        btnAddItem.setContentAreaFilled(false);
        btnAddItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddItem.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionarItem2.png"))); // NOI18N
        btnAddItem.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionarItem2.png"))); // NOI18N
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        spQtd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        spQtd.setModel(new javax.swing.SpinnerNumberModel(1, 0, 10000, 1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Quantidade:");

        lblDesconto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDesconto.setText("Desconto:");

        rdbDesc.setText("Descrição");

        rdbId.setText("Cód Item");

        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pesquisar produto");

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtDesconto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescontoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblItensIncPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluirItem)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(rdbId)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rdbDesc)
                                        .addGap(25, 25, 25))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(spQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtPesquisa)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAddItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(lblItensDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 28, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTotalVenda)
                            .addComponent(lblDesconto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblVTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDesconto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblItensDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdbId)
                            .addComponent(rdbDesc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblItensIncPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluirItem)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDesconto)
                            .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTotalVenda)
                            .addComponent(lblVTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        // Pega o indice da linha selecionada
        int indiceLinha = tblProduto.getSelectedRow();
        if (indiceLinha != -1) {
            if (verificaExistenciaProdutoItem((int) tblProduto.getValueAt(indiceLinha, 0)) == false) {

                Produto p = new Produto();
                // Obtem os valores do item selecionado
                p.setId((int) tblProduto.getValueAt(indiceLinha, 0));
                p.setDescricao((String) tblProduto.getValueAt(indiceLinha, 1));

                String valorProduto = (String) tblProduto.getValueAt(indiceLinha, 2); // pega o valor do item e tranforma numa string
                valorProduto = valorProduto.replaceAll("\\,", "."); // substitui virgula por ponto
                p.setPreco(Float.valueOf(valorProduto)); // acrescenta o valor em float

                ProdutoVenda pv = new ProdutoVenda();
                pv.setQtdProduto((int) spQtd.getValue());

                preencherTabelaProdutoVenda(p, pv);
                
                setTotalVenda();

            } else {
                JOptionPane.showMessageDialog(null, "Item já incluido !");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um item !");
        }
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnExcluirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirItemActionPerformed
        if (tblProdutoVenda.getSelectedRow() != -1) {
            // Remove item selecionado da tabel itemPedido 
            ((DefaultTableModel) tblProdutoVenda.getModel()).removeRow(tblProdutoVenda.getSelectedRow());
            setTotalVenda();
        }
    }//GEN-LAST:event_btnExcluirItemActionPerformed

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased

    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void txtDescontoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescontoKeyReleased
        setTotalVenda();
    }//GEN-LAST:event_txtDescontoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnExcluirItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblDesconto;
    private javax.swing.JLabel lblItensDisp;
    private javax.swing.JLabel lblItensIncPedido;
    private javax.swing.JLabel lblTotalVenda;
    private javax.swing.JLabel lblVTotalVenda;
    private javax.swing.JRadioButton rdbDesc;
    private javax.swing.JRadioButton rdbId;
    private javax.swing.JSpinner spQtd;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTable tblProdutoVenda;
    private javax.swing.JTextField txtDesconto;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Abrir Venda - New Fantasy");
        this.setResizable(false);
        this.setClosable(true);
        this.setIconifiable(true);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rdbId);
        bg.add(rdbDesc);
        rdbDesc.setSelected(true);
    }

    public void configurarTabelaItem() {
        //Configura a tabela e a posição dos itens na coluna
        DefaultTableModel m = (DefaultTableModel) tblProduto.getModel();

        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(15);
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(165);
        tblProduto.getColumnModel().getColumn(2).setPreferredWidth(15);
        tblProduto.getColumnModel().getColumn(3).setPreferredWidth(15);
        tblProduto.getColumnModel().getColumn(4).setPreferredWidth(40);
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        tblProduto.getColumnModel().getColumn(2).setCellRenderer(direita);
        tblProduto.getColumnModel().getColumn(3).setCellRenderer(direita);
        tblProduto.getColumnModel().getColumn(4).setCellRenderer(centralizado);

        tblProduto.setModel(m);
    }

    public void configurarTabelaItemPedido() {
        //Configura a tabela e a posição dos itens na coluna
        DefaultTableModel m = (DefaultTableModel) tblProdutoVenda.getModel();
        tblProdutoVenda.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblProdutoVenda.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblProdutoVenda.getColumnModel().getColumn(2).setPreferredWidth(50);
        tblProdutoVenda.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblProdutoVenda.getColumnModel().getColumn(4).setPreferredWidth(100);
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        tblProdutoVenda.getColumnModel().getColumn(2).setCellRenderer(direita);
        tblProdutoVenda.getColumnModel().getColumn(3).setCellRenderer(direita);
        tblProdutoVenda.getColumnModel().getColumn(4).setCellRenderer(direita);

        tblProdutoVenda.setModel(m);
    }

    public void preencherTabelaProdutoVenda(Produto p, ProdutoVenda pv) {
        if (p != null) {

            configurarTabelaItemPedido();
            DefaultTableModel m = (DefaultTableModel) tblProdutoVenda.getModel();

            m.addRow(new Object[]{p.getId(), p.getDescricao(), pv.getQtdProduto(), dm.format(p.getPreco()), dm.format(pv.getQtdProduto() * p.getPreco())});

            tblProdutoVenda.setModel(m);

        }
    }

    public void setTotalVenda() {
        int count = tblProdutoVenda.getRowCount();
        float totalVenda = 0;

        String valorDescontoString = txtDesconto.getText(); // pega o valor do item e tranforma numa string

        if ((!valorDescontoString.equals(null)) || !valorDescontoString.equals(",")) {
            valorDescontoString = valorDescontoString.replaceAll("\\,", "."); // substitui virgula por ponto
            float valorDescontoFloat = Float.valueOf(valorDescontoString); // acrescenta o valor em float   
            
            for (int x = 0; x < count; x++) {
                    String valorTotalvenda = (String) tblProdutoVenda.getValueAt(x, 4); // pega o valor do item e tranforma numa string
                    valorTotalvenda = valorTotalvenda.replaceAll("\\,", "."); // substitui virgula por ponto
                    totalVenda += Float.valueOf(valorTotalvenda); // acrescenta o valor em float            
                }

            if (valorDescontoFloat == 0) {                 
                lblVTotalVenda.setText(dm.format(totalVenda));
            }else{
                totalVenda -= valorDescontoFloat; 
                lblVTotalVenda.setText(dm.format(totalVenda));
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
                m.addRow(new Object[]{p.getId(), p.getDescricao(), dm.format(p.getPreco())});

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

}
