package view;

import controller.PedidoDAO;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Pedido;

public class PedidosAberto extends javax.swing.JInternalFrame {

    public PedidosAberto() {
        initComponents();
        this.setTitle("Pedido Aberto - New Fantasy");
        // Chama o metodo listar do PedidoDAO passando o usuário de login como parametro
        preencherTabela(new PedidoDAO().listarAberto(Menu.getUsuario()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPedido = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        btnDetalhes = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/java_icon.png"))); // NOI18N

        tblPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pedido", "Mesa", "Data", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPedido.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tblPedido);
        if (tblPedido.getColumnModel().getColumnCount() > 0) {
            tblPedido.getColumnModel().getColumn(0).setPreferredWidth(20);
            tblPedido.getColumnModel().getColumn(1).setPreferredWidth(10);
            tblPedido.getColumnModel().getColumn(2).setPreferredWidth(50);
            tblPedido.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnDetalhes.setText("Detalhes");
        btnDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhesActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(btnDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // Pega o indice da linha selecionada
        int indiceLinha = tblPedido.getSelectedRow();
        if (indiceLinha != -1) {
            //Passa como parametro o id do pedido que gostaria de ver os detalhes
            PedidosAlterar jiPedidosAlterar = new PedidosAlterar((int) tblPedido.getValueAt(indiceLinha, 0));
            Menu.areaTrabalho.add(jiPedidosAlterar);
            jiPedidosAlterar.setVisible(true);
            jiPedidosAlterar.setPosicao();  // Centraliza a Tela Interna
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um pedido !");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhesActionPerformed
        // Pega o indice da linha selecionada
        int indiceLinha = tblPedido.getSelectedRow();
        if (indiceLinha != -1) {
            //Passa como parametro o id do pedido que gostaria de ver os detalhes
            PedidosDetalhe jiPedidosDetalhe = new PedidosDetalhe((int) tblPedido.getValueAt(indiceLinha, 0));
            Menu.areaTrabalho.add(jiPedidosDetalhe);
            jiPedidosDetalhe.setVisible(true);
            jiPedidosDetalhe.setPosicao();  // Centraliza a Tela Interna
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um pedido !");
        }
    }//GEN-LAST:event_btnDetalhesActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // Pega o indice da linha selecionada
        int indiceLinha = tblPedido.getSelectedRow();
        if (indiceLinha != -1) {
            //Pega o numero do pedido
            int idPedido = (int) tblPedido.getValueAt(indiceLinha, 0);
            int resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir o pedido " + idPedido + " ?", "Confirma ?", JOptionPane.YES_NO_OPTION);

            //Se a resposta for sim, tenta excluir o pedido
            if (resposta == JOptionPane.YES_OPTION) {
                //Passa como parametro o id do pedido que gostaria de excluir
                int retorno = new PedidoDAO().deletar(Menu.getUsuario(), idPedido);

                //Se o pedido foi excluido mostra mengsagem de sucesso dentro do if, se nao mostra mensagem de erro do metodo de deletar pedido
                if (retorno > 0) {
                    JOptionPane.showMessageDialog(this, "Pedido excluido com sucesso !");

                    //Exclui o pedido da lista
                    if (tblPedido.getSelectedRow() != -1) {
                        // Remove item selecionado da tabel itemPedido 
                        ((DefaultTableModel) tblPedido.getModel()).removeRow(indiceLinha);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um pedido !");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnDetalhes;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPedido;
    // End of variables declaration//GEN-END:variables

    public void preencherTabela(List<Object> lista) {
        if (lista != null) {
            if (lista.size() > 0) {

                //Configura a tabela
                DefaultTableModel m = (DefaultTableModel) tblPedido.getModel();
                tblPedido.getColumnModel().getColumn(0).setPreferredWidth(50);
                tblPedido.getColumnModel().getColumn(1).setPreferredWidth(50);
                tblPedido.getColumnModel().getColumn(2).setPreferredWidth(100);
                tblPedido.getColumnModel().getColumn(3).setPreferredWidth(100);
                DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
                DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
                DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
                esquerda.setHorizontalAlignment(SwingConstants.LEFT);
                centralizado.setHorizontalAlignment(SwingConstants.CENTER);
                direita.setHorizontalAlignment(SwingConstants.RIGHT);
                tblPedido.getColumnModel().getColumn(0).setCellRenderer(esquerda);
                tblPedido.getColumnModel().getColumn(1).setCellRenderer(esquerda);
                tblPedido.getColumnModel().getColumn(3).setCellRenderer(direita);

                for (Object obj : lista) {
                    Pedido p = (Pedido) obj;
                    m.addRow(new Object[]{p.getId(), p.getMesa().getDesc(), p.getData(), String.format("%.2f", p.getValor())});

                }
                tblPedido.setModel(m);
            }

        }
    }

    // Centraliza o JInternalFrame quando chamado
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

}
