package view;

import controller.ProdutoDAO;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import model.Produto;
import model.ApenasNumeros;

/**
 *
 * @author diego
 */
public class CadastroProduto extends javax.swing.JInternalFrame {
    
    DecimalFormat df = new DecimalFormat("0.00");

    public CadastroProduto() {
        initComponents();
        configurarFormulario();
        txtPreco.setDocument(new ApenasNumeros());
        txtQtd.setDocument(new ApenasNumeros());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCadastrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        lblDescricao = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblPreco = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        lblQtd = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lblCadastroPet = new javax.swing.JLabel();
        lblVencimento = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jdcVencimento = new com.toedter.calendar.JDateChooser();
        txtPrecoCompra = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lblPrecoCompra = new javax.swing.JLabel();

        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone.png"))); // NOI18N

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cadastrarLogin.png"))); // NOI18N
        btnCadastrar.setBorder(null);
        btnCadastrar.setBorderPainted(false);
        btnCadastrar.setContentAreaFilled(false);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCadastrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cadastrarLogin2.png"))); // NOI18N
        btnCadastrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cadastrarLogin2.png"))); // NOI18N
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblDescricao.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        lblDescricao.setForeground(new java.awt.Color(101, 96, 168));
        lblDescricao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescricao.setText("Descrição");

        txtQtd.setBackground(new java.awt.Color(214, 217, 223));
        txtQtd.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        txtQtd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQtd.setBorder(null);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblPreco.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        lblPreco.setForeground(new java.awt.Color(101, 96, 168));
        lblPreco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPreco.setText("Preço");

        txtDescricao.setBackground(new java.awt.Color(214, 217, 223));
        txtDescricao.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        txtDescricao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDescricao.setBorder(null);

        lblId.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        lblId.setForeground(new java.awt.Color(153, 153, 153));
        lblId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblId.setText("ID");

        txtPreco.setBackground(new java.awt.Color(214, 217, 223));
        txtPreco.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        txtPreco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPreco.setBorder(null);

        lblQtd.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        lblQtd.setForeground(new java.awt.Color(101, 96, 168));
        lblQtd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQtd.setText("Quantidade");

        txtId.setBackground(new java.awt.Color(214, 217, 223));
        txtId.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        txtId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtId.setBorder(null);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCadastroPet.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        lblCadastroPet.setForeground(new java.awt.Color(101, 96, 168));
        lblCadastroPet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadastroPet.setText("CADASTRAR PRODUTO");

        lblVencimento.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        lblVencimento.setForeground(new java.awt.Color(101, 96, 168));
        lblVencimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVencimento.setText("Vencimento");

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtPrecoCompra.setBackground(new java.awt.Color(214, 217, 223));
        txtPrecoCompra.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        txtPrecoCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecoCompra.setBorder(null);

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblPrecoCompra.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        lblPrecoCompra.setForeground(new java.awt.Color(101, 96, 168));
        lblPrecoCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecoCompra.setText("Preço Compra");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCadastroPet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(txtId)
                            .addComponent(lblDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtDescricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblQtd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtQtd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGap(137, 137, 137)
                                                    .addComponent(jdcVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(127, 127, 127))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblPreco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblVencimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(lblPrecoCompra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtPrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(0, 42, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblCadastroPet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblId)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblQtd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPrecoCompra)
                .addGap(3, 3, 3)
                .addComponent(txtPrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(lblPreco)
                .addGap(3, 3, 3)
                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblVencimento)
                .addGap(1, 1, 1)
                .addComponent(jdcVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        if (txtDescricao.getText().isEmpty() || txtQtd.getText().isEmpty() || txtPreco.getText().isEmpty() || txtPrecoCompra.getText().isEmpty() || jdcVencimento.getDate() == null ) {
            JOptionPane.showMessageDialog(null, "Há campos sem serem preenchido!", "Controle Estoque", JOptionPane.WARNING_MESSAGE);
            txtDescricao.requestFocus();
        } else {
            Produto produto = new Produto();
            produto.setUsuario(Menu.getUsuario());

            produto.setDescricao(txtDescricao.getText());
            
            String qtd = txtQtd.getText(); // Pega a quantidade 
            qtd = qtd.replaceAll("\\,", "."); // troca a virgula por ponto se houver
            produto.setQtd(Float.valueOf(df.format(Float.valueOf(qtd)).replaceAll("\\,", "."))); // formata e acrescenta o valor em float
            
            String precoCompra = txtPrecoCompra.getText(); // Pega a quantidade             
            precoCompra = precoCompra.replaceAll("\\,", "."); // troca a virgula por ponto se houver
            produto.setPrecoCompra(Float.valueOf(df.format(Float.valueOf(precoCompra)).replaceAll("\\,", "."))); // formata e acrescenta o valor em float
            
            String preco = txtPreco.getText(); // Pega a quantidade             
            preco = preco.replaceAll("\\,", "."); // troca a virgula por ponto se houver
            produto.setPreco(Float.valueOf(df.format(Float.valueOf(preco)).replaceAll("\\,", "."))); // formata e acrescenta o valor em float
            
            produto.setData(jdcVencimento.getDate());

            long res = -1;

            if(txtId.getText().isEmpty()){
                res = new ProdutoDAO().inserir(Menu.getUsuario(), produto);
            }else{
                produto.setId(Integer.parseInt(txtId.getText()));
                res = new ProdutoDAO().atualizar(Menu.getUsuario(), produto);
            }

            if(res != -1){
                txtId.setText(Long.toString(res));
                JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!.", "Controle Estoque", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Ocorreu um erro durante a operação", "Controle Estoque", JOptionPane.ERROR_MESSAGE);
            }

            txtId.setText("");
            txtDescricao.setText("");
            txtQtd.setText("");
            txtPrecoCompra.setText("");
            txtPreco.setText("");
            jdcVencimento.setDate(null);

        }

    }//GEN-LAST:event_btnCadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private com.toedter.calendar.JDateChooser jdcVencimento;
    private javax.swing.JLabel lblCadastroPet;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblPrecoCompra;
    private javax.swing.JLabel lblQtd;
    private javax.swing.JLabel lblVencimento;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtPrecoCompra;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario(){
        this.setTitle("Cadastrar Produto");
        this.setResizable(false);
        this.setMaximizable(false);
        this.setIconifiable(false);
        this.setClosable(true);
        
        txtId.setEditable(false);
        
        getRootPane().setDefaultButton(btnCadastrar);
        
    }
    
    
    
}
