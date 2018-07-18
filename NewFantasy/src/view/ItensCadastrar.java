package view;

import controller.ItemDAO;
import controller.PedidoDAO;
import java.awt.Dimension;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ApenasNumeros;
import model.Item;
import model.Pedido;

public class ItensCadastrar extends javax.swing.JInternalFrame {

    public ItensCadastrar() {
        initComponents();
        this.setTitle("Cadastrar Item - New Fantasy");
        this.setResizable(false);
        this.setClosable(true);
        this.setIconifiable(true);
        txtValorItem.setDocument(new ApenasNumeros());//Permite o usuario digitar apenas numeros ou virgula
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDescricaoItem = new javax.swing.JLabel();
        lblValorItem = new javax.swing.JLabel();
        txtDescricaoItem = new javax.swing.JTextField();
        txtValorItem = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/java_icon.png"))); // NOI18N

        lblDescricaoItem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDescricaoItem.setText("Descrição do Item");

        lblValorItem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblValorItem.setText("Valor");

        txtDescricaoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoItemActionPerformed(evt);
            }
        });

        txtValorItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorItemActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
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
                        .addComponent(lblDescricaoItem, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDescricaoItem)
                        .addGap(86, 86, 86)))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValorItem)
                    .addComponent(txtValorItem, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(143, 143, 143))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(274, Short.MAX_VALUE)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricaoItem, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValorItem, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescricaoItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescricaoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoItemActionPerformed

    private void txtValorItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorItemActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try{
        // Verifica se há campos em branco
        if (txtDescricaoItem.getText() == null || txtValorItem.getText() == null) {
            JOptionPane.showMessageDialog(this, "Há campos em branco");
        } else {
            // se não houver abre uma tela de confirmacao se realmente desja inserir o item
            int resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente cadastrar o item:\n" + txtDescricaoItem.getText() + " no valor de: " + txtValorItem.getText(), "Confirma ?", JOptionPane.YES_NO_OPTION);

            //se a resposta for sim, insere o item na tabela
            if (resposta == JOptionPane.YES_OPTION) {
                Item i = new Item();
                i.setDesc(txtDescricaoItem.getText());
                
                String valorItem = (String) txtValorItem.getText(); // pega o valor do item e tranforma numa string
                valorItem = valorItem.replaceAll("\\,", "."); // substitui virgula por ponto
                i.setValor(Float.parseFloat(valorItem));

                i.setId(new ItemDAO().inserir(Menu.getUsuario(), i));

                if (i.getId() != -1) {
                    JOptionPane.showMessageDialog(null, "Item " + i.getDesc() + " inserido com sucesso\n" + "Cód.: " + i.getId());
                    txtDescricaoItem.setText("");
                    txtValorItem.setText("");
                }
            }
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel lblDescricaoItem;
    private javax.swing.JLabel lblValorItem;
    private javax.swing.JTextField txtDescricaoItem;
    private javax.swing.JTextField txtValorItem;
    // End of variables declaration//GEN-END:variables

}
