package view;

import controller.ItemDAO;
import controller.ItemPedidoDAO;
import controller.MesaDAO;
import controller.PedidoDAO;
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
import model.Item;
import model.ItemPedido;
import model.Mesa;
import model.Pedido;

public class PedidosAbrir extends javax.swing.JInternalFrame {

    DecimalFormat dm = new DecimalFormat("0.00");

    public PedidosAbrir() {
        initComponents();
        configurarFormulario();
        preencherTabelaItem(new ItemDAO().listarAtivos(Menu.getUsuario()));
        setMesas(new MesaDAO().listarAtiva(Menu.getUsuario()));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblItemPedido = new javax.swing.JTable();
        lblItensDisp = new javax.swing.JLabel();
        lblItensIncPedido = new javax.swing.JLabel();
        btnGerarPedido = new javax.swing.JButton();
        btnExcluirItem = new javax.swing.JButton();
        lblTotalPedido = new javax.swing.JLabel();
        lblVTotalPedido = new javax.swing.JLabel();
        btnAddItem = new javax.swing.JButton();
        spQtd = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        lblV10Garcom = new javax.swing.JLabel();
        lbl10Garcom = new javax.swing.JLabel();
        lblMesa = new javax.swing.JLabel();
        rdbDesc = new javax.swing.JRadioButton();
        rdbId = new javax.swing.JRadioButton();
        cbMesa = new javax.swing.JComboBox<>();
        txtPesquisa = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jcb10Garcom = new javax.swing.JCheckBox();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/java_icon.png"))); // NOI18N

        tblItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód. Item", "Descrição Item", "Valor Un."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblItem.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tblItem);

        tblItemPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód. Item", "Descrição Item", "Qtd Item", "Valor Un.", "Valor Total"
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
        tblItemPedido.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane2.setViewportView(tblItemPedido);

        lblItensDisp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblItensDisp.setText("Itens Disponíveis");

        lblItensIncPedido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblItensIncPedido.setText("Itens incluidos no Pedido");

        btnGerarPedido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGerarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gerarPedido.png"))); // NOI18N
        btnGerarPedido.setBorder(null);
        btnGerarPedido.setBorderPainted(false);
        btnGerarPedido.setContentAreaFilled(false);
        btnGerarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGerarPedido.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gerarPedido2.png"))); // NOI18N
        btnGerarPedido.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gerarPedido2.png"))); // NOI18N
        btnGerarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarPedidoActionPerformed(evt);
            }
        });

        btnExcluirItem.setText("Excluir Item");
        btnExcluirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirItemActionPerformed(evt);
            }
        });

        lblTotalPedido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotalPedido.setText("Total Pedido:");

        lblVTotalPedido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnAddItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionarItem.png"))); // NOI18N
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

        lblV10Garcom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbl10Garcom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl10Garcom.setText("10% Garçom:");

        lblMesa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMesa.setText("N° da Mesa");

        rdbDesc.setText("Descrição");

        rdbId.setText("Cód Item");

        cbMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMesaActionPerformed(evt);
            }
        });

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
        jLabel2.setText("Pesquisar Item");

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jcb10Garcom.setText("10% garçom");
        jcb10Garcom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb10GarcomItemStateChanged(evt);
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
                            .addComponent(lblItensDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblItensIncPedido)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblMesa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbMesa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnGerarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnExcluirItem)
                                            .addComponent(jcb10Garcom))
                                        .addGap(0, 24, Short.MAX_VALUE)))))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotalPedido, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbl10Garcom)
                                .addGap(4, 4, 4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblV10Garcom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblVTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblItensIncPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnExcluirItem)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMesa)
                            .addComponent(cbMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jcb10Garcom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGerarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl10Garcom)
                            .addComponent(lblV10Garcom, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTotalPedido)
                            .addComponent(lblVTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        int indiceLinha = tblItem.getSelectedRow();
        if (indiceLinha != -1) {
            if (verificaExistenciaItemPedido((int) tblItem.getValueAt(indiceLinha, 0)) == false) {

                Pedido p = new Pedido();
                Item[] i = new Item[1];
                i[0] = new Item();
                ItemPedido[] ip = new ItemPedido[1];
                ip[0] = new ItemPedido();
                String valorItem = ""; // criada para converter string em float        

                // Obtem os valores do item selecionado
                i[0].setId((int) tblItem.getValueAt(indiceLinha, 0));
                i[0].setDesc((String) tblItem.getValueAt(indiceLinha, 1));

                valorItem = (String) tblItem.getValueAt(indiceLinha, 2); // pega o valor do item e tranforma numa string
                valorItem = valorItem.replaceAll("\\,", "."); // substitui virgula por ponto
                i[0].setValor(Float.valueOf(valorItem)); // acrescenta o valor em float

                ip[0].setQtdItem((int) spQtd.getValue());

                // Caso o valor do item seja 0 o usuário deverá digitar o valor do item
                if (i[0].getValor() == 0) {
                    while (i[0].getValor() == 0) {
                        try {
                            String valorItem0 = JOptionPane.showInputDialog("Digite o valor do item desejado(separando casas decimais por .)");
                            if (valorItem0 != null) {
                                i[0].setValor(Float.parseFloat(valorItem0));
                            } else {
                                //caso a pessoa aperte cancelar inclui no valor -1 para o item não ser inserido na tabela item pedido
                                i[0].setValor(-1);
                            }

                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Informe apenas números e com o formato correto");
                            i[0].setValor(0);
                        }
                    }
                }

                if (i[0].getValor() != -1) {
                    p.setItem(i);
                    p.setQtdItem(ip);

                    preencherTabelaItemPedido(p);
                    if (jcb10Garcom.isSelected()) {
                        set10GarcomETotal();
                    } else {
                        setTotalSemGarcom();
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "Item já incluido !");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um item !");
        }
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnExcluirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirItemActionPerformed
        if (tblItemPedido.getSelectedRow() != -1) {
            // Remove item selecionado da tabel itemPedido 
            ((DefaultTableModel) tblItemPedido.getModel()).removeRow(tblItemPedido.getSelectedRow());
            set10GarcomETotal();
        }
    }//GEN-LAST:event_btnExcluirItemActionPerformed

    private void btnGerarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarPedidoActionPerformed
        if (tblItemPedido.getRowCount() != 0) {
            int count;
            // Conta quantos itens serao adicionados
            count = tblItemPedido.getRowCount();

            Pedido p = new Pedido();
            Mesa m = new Mesa();
            Item i[] = new Item[count];
            ItemPedido ip[] = new ItemPedido[count];
            Date data = new Date(); // criada para receber a data
            String valorString = ""; // criada para converter string em float

            // For para acrescentar os itens as variáveis
            for (int x = 0; x < count; x++) {
                i[x] = new Item();
                ip[x] = new ItemPedido();

                i[x].setId((int) tblItemPedido.getValueAt(x, 0)); // pega o id do item
                i[x].setDesc((String) tblItemPedido.getValueAt(x, 1)); // pega a descricao do item
                ip[x].setQtdItem((int) tblItemPedido.getValueAt(x, 2)); // pega a quantidade do item

                valorString = (String) tblItemPedido.getValueAt(x, 3); // pega o valor do item e tranforma numa string
                valorString = valorString.replaceAll("\\,", "."); // substitui virgula por ponto
                i[x].setValor(Float.valueOf(valorString)); // acrescenta o valor em float            
            }
            m.setDesc((cbMesa.getSelectedItem().toString())); // pega a mesa selecionada

            p.setItem(i);
            p.setQtdItem(ip);
            p.setMesa(m);
            p.setUsuario(Menu.getUsuario());

            SimpleDateFormat dtFormatador = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            p.setData(dtFormatador.format(data));

            valorString = lblV10Garcom.getText(); // pega o valor dos 10% do garcom
            valorString = valorString.replaceAll("\\,", "."); // substitui virgula por ponto
            p.setGarcom10(Float.valueOf(valorString)); // acrescenta o valor em float

            valorString = lblVTotalPedido.getText(); // pega o valor do total do pedido
            valorString = valorString.replaceAll("\\,", "."); // substitui virgula por ponto
            p.setValor(Float.valueOf(valorString)); // acrescenta o valor em float

            p.setId(new PedidoDAO().inserir(p.getUsuario(), p));

            if (p.getId() != -1) {
                int res = (new ItemPedidoDAO().inserir(Menu.getUsuario(), p));
                if (res != -1) {
                    JOptionPane.showMessageDialog(null, "Pedido " + p.getId() + " gerado com sucesso");
                    while (tblItemPedido.getModel().getRowCount() > 0) {
                        DefaultTableModel dtm = (DefaultTableModel) tblItemPedido.getModel();
                        dtm.removeRow(0);
                        lblV10Garcom.setText("0,00");
                        lblVTotalPedido.setText("0,00");
                        jcb10Garcom.setSelected(false);
                        spQtd.setValue(1);
                        cbMesa.removeAllItems();
                        setMesas(new MesaDAO().listarAtiva(Menu.getUsuario()));
                    }
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Nenhum item adicionado ao pedido  !");
        }
    }//GEN-LAST:event_btnGerarPedidoActionPerformed

    private void cbMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMesaActionPerformed

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        if (rdbId.isSelected()) {
            if (txtPesquisa.getText().isEmpty() == true) {
                //Exclui todas as linhas da tabela
                while (tblItem.getModel().getRowCount() > 0) {
                    DefaultTableModel m = (DefaultTableModel) tblItem.getModel();
                    m.removeRow(0);
                }
                preencherTabelaItem(new ItemDAO().listarAtivos(Menu.getUsuario()));
            } else {
                //Exclui todas as linhas da tabela
                while (tblItem.getModel().getRowCount() > 0) {
                    DefaultTableModel m = (DefaultTableModel) tblItem.getModel();
                    m.removeRow(0);
                }
                try {
                    int id = Integer.parseInt(txtPesquisa.getText());
                    preencherTabelaItem(new ItemDAO().pesquisarPorId(Menu.getUsuario(), id));

                } catch (Exception e) {
                }
            }
        } else if (rdbDesc.isSelected()) {
            if (txtPesquisa.getText().isEmpty() == true) {
                //Exclui todas as linhas da tabela
                while (tblItem.getModel().getRowCount() > 0) {
                    DefaultTableModel m = (DefaultTableModel) tblItem.getModel();
                    m.removeRow(0);
                }
                preencherTabelaItem(new ItemDAO().listarAtivos(Menu.getUsuario()));
            } else {
                //Exclui todas as linhas da tabela
                while (tblItem.getModel().getRowCount() > 0) {
                    DefaultTableModel m = (DefaultTableModel) tblItem.getModel();
                    m.removeRow(0);
                }
                try {
                    String desc = txtPesquisa.getText();
                    preencherTabelaItem(new ItemDAO().pesquisarPorNome(Menu.getUsuario(), desc));
                } catch (Exception e) {
                }
            }

        }
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void jcb10GarcomItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb10GarcomItemStateChanged
        if (jcb10Garcom.isSelected()) {
            set10GarcomETotal();
        } else {
            setTotalSemGarcom();
        }
    }//GEN-LAST:event_jcb10GarcomItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnExcluirItem;
    private javax.swing.JButton btnGerarPedido;
    private javax.swing.JComboBox<String> cbMesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JCheckBox jcb10Garcom;
    private javax.swing.JLabel lbl10Garcom;
    private javax.swing.JLabel lblItensDisp;
    private javax.swing.JLabel lblItensIncPedido;
    private javax.swing.JLabel lblMesa;
    private javax.swing.JLabel lblTotalPedido;
    private javax.swing.JLabel lblV10Garcom;
    private javax.swing.JLabel lblVTotalPedido;
    private javax.swing.JRadioButton rdbDesc;
    private javax.swing.JRadioButton rdbId;
    private javax.swing.JSpinner spQtd;
    private javax.swing.JTable tblItem;
    private javax.swing.JTable tblItemPedido;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Abrir Pedido - New Fantasy");
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
        DefaultTableModel m = (DefaultTableModel) tblItem.getModel();
        tblItem.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblItem.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblItem.getColumnModel().getColumn(2).setPreferredWidth(100);
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        tblItem.getColumnModel().getColumn(2).setCellRenderer(direita);

        tblItem.setModel(m);
    }

    public void configurarTabelaItemPedido() {
        //Configura a tabela e a posição dos itens na coluna
        DefaultTableModel m = (DefaultTableModel) tblItemPedido.getModel();
        tblItemPedido.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblItemPedido.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblItemPedido.getColumnModel().getColumn(2).setPreferredWidth(50);
        tblItemPedido.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblItemPedido.getColumnModel().getColumn(4).setPreferredWidth(100);
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        tblItemPedido.getColumnModel().getColumn(2).setCellRenderer(direita);
        tblItemPedido.getColumnModel().getColumn(3).setCellRenderer(direita);
        tblItemPedido.getColumnModel().getColumn(4).setCellRenderer(direita);

        tblItemPedido.setModel(m);
    }

    public void preencherTabelaItemPedido(Pedido p) {
        if (p != null) {

            configurarTabelaItemPedido();
            DefaultTableModel m = (DefaultTableModel) tblItemPedido.getModel();

            m.addRow(new Object[]{p.getItem(0).getId(), p.getItem(0).getDesc(), p.getQtdItem(0).getQtdItem(), dm.format(p.getItem(0).getValor()), dm.format(p.getQtdItem(0).getQtdItem() * p.getItem(0).getValor())});

            tblItemPedido.setModel(m);

        }
    }

    public void preencherTabelaItem(List<Object> lista) {
        if (lista != null) {

            //Configura a tabela e a posição dos itens na coluna
            configurarTabelaItem();
            DefaultTableModel m = (DefaultTableModel) tblItem.getModel();

            for (Object obj : lista) {
                Item i = (Item) obj;
                m.addRow(new Object[]{i.getId(), i.getDesc(), dm.format(i.getValor())});

            }
            tblItem.setModel(m);

        }
    }

    public void setMesas(List<Object> lista) {
        if (lista != null) {
            if (lista.size() > 0) {

                for (Object obj : lista) {
                    Mesa m = (Mesa) obj;
                    cbMesa.addItem(m.getDesc());
                }
            }
        }
    }

    public void set10GarcomETotal() {
        String aux = "";
        float garcom10 = 0;
        float totalPedido = 0;
        int count = 0;

        DefaultTableModel m = (DefaultTableModel) tblItemPedido.getModel();
        count = tblItemPedido.getRowCount();

        for (int i = 0; i < count; i++) {
            aux = (String) tblItemPedido.getValueAt(i, 4); // pega o valor do item e tranforma numa string
            aux = aux.replaceAll("\\,", "."); // substitui virgula por ponto
            totalPedido += Float.valueOf(aux); // Soma o aux ao valor do pedido
        }

        garcom10 = (float) (totalPedido * 0.10);
        totalPedido += garcom10;

        lblV10Garcom.setText(dm.format(garcom10));
        lblVTotalPedido.setText(dm.format(totalPedido));
    }

    public void setTotalSemGarcom() {
        String aux = "";
        float garcom10 = 0;
        float totalPedido = 0;
        int count = 0;

        DefaultTableModel m = (DefaultTableModel) tblItemPedido.getModel();
        count = tblItemPedido.getRowCount();

        for (int i = 0; i < count; i++) {
            aux = (String) tblItemPedido.getValueAt(i, 4); // pega o valor do item e tranforma numa string
            aux = aux.replaceAll("\\,", "."); // substitui virgula por ponto
            totalPedido += Float.valueOf(aux); // Soma o aux ao valor do pedido
        }

        lblV10Garcom.setText("0,00");
        lblVTotalPedido.setText(dm.format(totalPedido));
    }

    public boolean verificaExistenciaItemPedido(int idItem) {
        int totalLinhas = tblItemPedido.getRowCount();
        boolean jaExiste = false;

        // Verifica se existem itens adicionados
        if (totalLinhas != -1) {
            // Se houver itens adicionados da tabela item pedido verifica se o id do item a ser adicionado é igual a algum id já adicionado
            for (int i = 0; i < totalLinhas; i++) {
                if (idItem == (int) (tblItemPedido.getValueAt(i, 0))) {
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
