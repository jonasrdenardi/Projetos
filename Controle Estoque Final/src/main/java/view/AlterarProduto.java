package view;

import controller.ProdutoDAO;
import java.beans.PropertyVetoException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.ApenasNumeros;
import model.Produto;
import model.Usuario;

/**
 *
 * @author diego
 */
public class AlterarProduto extends javax.swing.JInternalFrame {

    DecimalFormat dm = new DecimalFormat("0.00");
    SimpleDateFormat sdfNormal = new SimpleDateFormat("dd/MM/yyyy");

    public AlterarProduto() {
        initComponents();
        configurarFormulario();
        txtPreco.setDocument(new ApenasNumeros());
        txtQtd.setDocument(new ApenasNumeros());

        preencherTabela(new ProdutoDAO().listar(Menu.getUsuario()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSelecione = new javax.swing.JLabel();
        jpFormulario = new javax.swing.JPanel();
        txtQtd = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        lblDescricao = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtDescricao = new javax.swing.JTextField();
        lblqtd = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        cbAtivo = new javax.swing.JComboBox<>();
        lblPreco1 = new javax.swing.JLabel();
        lblVencimento = new javax.swing.JLabel();
        jdcVencimento = new com.toedter.calendar.JDateChooser();
        lblPrecoCompra = new javax.swing.JLabel();
        txtPrecoCompra = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lblAlterarProduto = new javax.swing.JLabel();
        rbId = new javax.swing.JRadioButton();
        rbDescricao = new javax.swing.JRadioButton();
        jSeparator6 = new javax.swing.JSeparator();
        txtPesquisa = new javax.swing.JTextField();
        jspResultados = new javax.swing.JScrollPane();
        tabResultados = new javax.swing.JTable();
        rbTodos = new javax.swing.JRadioButton();
        rbAtivos = new javax.swing.JRadioButton();
        rbInativos = new javax.swing.JRadioButton();

        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone.png"))); // NOI18N

        lblSelecione.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        lblSelecione.setForeground(new java.awt.Color(101, 96, 168));
        lblSelecione.setText("Pesquise e clique 2x no produto para efetuar a alteração");

        txtQtd.setBackground(new java.awt.Color(214, 217, 223));
        txtQtd.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        txtQtd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQtd.setBorder(null);

        lblPreco.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        lblPreco.setForeground(new java.awt.Color(101, 96, 168));
        lblPreco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPreco.setText("Preço");

        lblId.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        lblId.setForeground(new java.awt.Color(153, 153, 153));
        lblId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblId.setText("ID");

        txtPreco.setBackground(new java.awt.Color(214, 217, 223));
        txtPreco.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        txtPreco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPreco.setBorder(null);

        txtId.setBackground(new java.awt.Color(214, 217, 223));
        txtId.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        txtId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtId.setBorder(null);

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/alterar1.png"))); // NOI18N
        btnAlterar.setBorder(null);
        btnAlterar.setBorderPainted(false);
        btnAlterar.setContentAreaFilled(false);
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAlterar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/alterar2.png"))); // NOI18N
        btnAlterar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/alterar2.png"))); // NOI18N
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
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

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtDescricao.setBackground(new java.awt.Color(214, 217, 223));
        txtDescricao.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        txtDescricao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDescricao.setBorder(null);

        lblqtd.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        lblqtd.setForeground(new java.awt.Color(101, 96, 168));
        lblqtd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblqtd.setText("Quantidade");

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblPreco1.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        lblPreco1.setForeground(new java.awt.Color(101, 96, 168));
        lblPreco1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPreco1.setText("Cadastro Ativo?");

        lblVencimento.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        lblVencimento.setForeground(new java.awt.Color(101, 96, 168));
        lblVencimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVencimento.setText("Vencimento");

        lblPrecoCompra.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        lblPrecoCompra.setForeground(new java.awt.Color(101, 96, 168));
        lblPrecoCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecoCompra.setText("Preço Compra");

        txtPrecoCompra.setBackground(new java.awt.Color(214, 217, 223));
        txtPrecoCompra.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        txtPrecoCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecoCompra.setBorder(null);

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jpFormularioLayout = new javax.swing.GroupLayout(jpFormulario);
        jpFormulario.setLayout(jpFormularioLayout);
        jpFormularioLayout.setHorizontalGroup(
            jpFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFormularioLayout.createSequentialGroup()
                        .addGroup(jpFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpFormularioLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jpFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPreco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpFormularioLayout.createSequentialGroup()
                                .addGroup(jpFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPreco1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jpFormularioLayout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(cbAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFormularioLayout.createSequentialGroup()
                                        .addComponent(jdcVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30))))
                            .addComponent(lblPrecoCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFormularioLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jpFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSeparator1)
                                        .addComponent(txtId)
                                        .addComponent(lblDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jpFormularioLayout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addGroup(jpFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jpFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtDescricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblqtd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtQtd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecoCompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpFormularioLayout.setVerticalGroup(
            jpFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblId)
                    .addGroup(jpFormularioLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblqtd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPrecoCompra)
                .addGap(3, 3, 3)
                .addComponent(txtPrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPreco)
                .addGap(3, 3, 3)
                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpFormularioLayout.createSequentialGroup()
                        .addGroup(jpFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPreco1)
                            .addComponent(lblVencimento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jdcVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblAlterarProduto.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        lblAlterarProduto.setForeground(new java.awt.Color(101, 96, 168));
        lblAlterarProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAlterarProduto.setText("ALTERAR PRODUTO");

        rbId.setForeground(new java.awt.Color(101, 96, 168));
        rbId.setText("ID");

        rbDescricao.setForeground(new java.awt.Color(101, 96, 168));
        rbDescricao.setText("Descrição");

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtPesquisa.setBackground(new java.awt.Color(214, 217, 223));
        txtPesquisa.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        txtPesquisa.setForeground(new java.awt.Color(153, 153, 153));
        txtPesquisa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPesquisa.setText("Digite sua pesquisa aqui!");
        txtPesquisa.setBorder(null);
        txtPesquisa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPesquisaFocusGained(evt);
            }
        });
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        tabResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tabResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabResultadosMouseClicked(evt);
            }
        });
        jspResultados.setViewportView(tabResultados);

        rbTodos.setForeground(new java.awt.Color(101, 96, 168));
        rbTodos.setText("Todos");
        rbTodos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbTodosStateChanged(evt);
            }
        });

        rbAtivos.setForeground(new java.awt.Color(101, 96, 168));
        rbAtivos.setText("Ativos");
        rbAtivos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbAtivosStateChanged(evt);
            }
        });

        rbInativos.setForeground(new java.awt.Color(101, 96, 168));
        rbInativos.setText("Inativos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 199, Short.MAX_VALUE)
                .addComponent(jpFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblAlterarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPesquisa)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jspResultados)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSelecione, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbTodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbAtivos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbInativos)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAlterarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbId)
                        .addComponent(rbDescricao)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelecione, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbTodos)
                    .addComponent(rbAtivos)
                    .addComponent(rbInativos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        Produto produto = new Produto();

        produto.setDescricao(txtDescricao.getText());
        produto.setQtd(Float.parseFloat(txtQtd.getText().replaceAll("\\,", ".")));
        produto.setPrecoCompra(Float.parseFloat(txtPrecoCompra.getText().replaceAll("\\,", ".")));
        produto.setPreco(Float.parseFloat(txtPreco.getText().replaceAll("\\,", ".")));

        //Por conta dos problemas com time zone tenho q subtrair 1
        java.util.Date dataSubtraida = jdcVencimento.getDate();
        dataSubtraida.setDate(dataSubtraida.getDate() - 1);
        produto.setData(dataSubtraida);

        produto.setFg_ativo((cbAtivo.getSelectedItem() == "Sim") ? true : false);

        int res = -1;

        if (!txtId.getText().isEmpty()) {
            produto.setId(Integer.parseInt(txtId.getText()));
            res = new ProdutoDAO().atualizar(Menu.getUsuario(), produto);
        }

        if (res != -1) {
            txtId.setText(Integer.toString(res));
            JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!.", "Controle Estoque", JOptionPane.INFORMATION_MESSAGE);
            preencherTabela(new ProdutoDAO().listar(Menu.getUsuario()));
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro durante a operação", "Controle Estoque", JOptionPane.ERROR_MESSAGE);
        }

        txtId.setText("");
        txtDescricao.setText("");
        txtQtd.setText("");
        txtPrecoCompra.setText("");
        txtPreco.setText("");

        jpFormulario.setVisible(false);

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtPesquisaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPesquisaFocusGained

        txtPesquisa.setText("");
        txtPesquisa.setForeground(java.awt.Color.BLACK);

    }//GEN-LAST:event_txtPesquisaFocusGained

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased

        String chave = txtPesquisa.getText();

        if (chave.isEmpty()) {
            preencherTabela(new ProdutoDAO().listar(Menu.getUsuario()));
        } else if (rbId.isSelected()) {
            preencherTabela(new ProdutoDAO().pesquisarPorId(Menu.getUsuario(), Integer.parseInt(chave)));
        } else if (rbDescricao.isSelected()) {
            preencherTabela(new ProdutoDAO().pesquisarPorDescricao(Menu.getUsuario(), chave));
        }

    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void tabResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabResultadosMouseClicked

        if (evt.getClickCount() == 2) {

            int linha = tabResultados.getSelectedRow();
            String id = tabResultados.getValueAt(linha, 0).toString();

            alterarProduto(id);

            jpFormulario.setVisible(true);
        }

    }//GEN-LAST:event_tabResultadosMouseClicked

    private void rbTodosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbTodosStateChanged
        preencherTabela(new ProdutoDAO().listar(Menu.getUsuario()));
    }//GEN-LAST:event_rbTodosStateChanged

    private void rbAtivosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbAtivosStateChanged
        preencherTabela(new ProdutoDAO().listar(Menu.getUsuario()));
    }//GEN-LAST:event_rbAtivosStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JComboBox<String> cbAtivo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private com.toedter.calendar.JDateChooser jdcVencimento;
    private javax.swing.JPanel jpFormulario;
    private javax.swing.JScrollPane jspResultados;
    private javax.swing.JLabel lblAlterarProduto;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblPreco1;
    private javax.swing.JLabel lblPrecoCompra;
    private javax.swing.JLabel lblSelecione;
    private javax.swing.JLabel lblVencimento;
    private javax.swing.JLabel lblqtd;
    private javax.swing.JRadioButton rbAtivos;
    private javax.swing.JRadioButton rbDescricao;
    private javax.swing.JRadioButton rbId;
    private javax.swing.JRadioButton rbInativos;
    private javax.swing.JRadioButton rbTodos;
    private javax.swing.JTable tabResultados;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtPrecoCompra;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Alterar Produto");
        this.setResizable(false);
        this.setMaximizable(false);
        this.setIconifiable(false);
        this.setClosable(true);

        txtId.setEditable(false);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rbId);
        bg.add(rbDescricao);
        rbDescricao.setSelected(true);

        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(rbTodos);
        bg2.add(rbAtivos);
        bg2.add(rbInativos);
        rbTodos.setSelected(true);

        configurarTabela();

        //preencherTabela(new LivroDAO().listar());
        liberarFormulario();

        getRootPane().setDefaultButton(btnAlterar);

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
        m.addColumn("Preço Compra");
        m.addColumn("Preço");
        m.addColumn("Vencimento");
        m.addColumn("Ativo");
        tabResultados.setModel(m);

        tabResultados.getColumnModel().getColumn(0).setPreferredWidth(15);
        tabResultados.getColumnModel().getColumn(1).setPreferredWidth(165);
        tabResultados.getColumnModel().getColumn(2).setPreferredWidth(15);
        tabResultados.getColumnModel().getColumn(3).setPreferredWidth(15);
        tabResultados.getColumnModel().getColumn(4).setPreferredWidth(15);
        tabResultados.getColumnModel().getColumn(5).setPreferredWidth(40);
        tabResultados.getColumnModel().getColumn(6).setPreferredWidth(15);
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        tabResultados.getColumnModel().getColumn(2).setCellRenderer(direita);
        tabResultados.getColumnModel().getColumn(3).setCellRenderer(direita);
        tabResultados.getColumnModel().getColumn(4).setCellRenderer(direita);
        tabResultados.getColumnModel().getColumn(5).setCellRenderer(centralizado);
        tabResultados.getColumnModel().getColumn(6).setCellRenderer(centralizado);
    }

    private boolean liberarFormulario() {

        jpFormulario.setVisible(false);

        return false;
    }

    private void preencherTabela(List<Produto> lista) {
        configurarTabela();
        if (lista.size() > 0) {
            DefaultTableModel m = (DefaultTableModel) tabResultados.getModel();
            for (Produto p : lista) {
                if (rbTodos.isSelected()) {
                    m.addRow(new Object[]{
                        p.getId(),
                        p.getDescricao(),
                        dm.format(p.getQtd()),
                        dm.format(p.getPrecoCompra()),
                        dm.format(p.getPreco()),
                        sdfNormal.format(p.getData()),
                        (p.getFg_ativo() == true) ? "Sim" : "Não"
                    });
                } else if (rbAtivos.isSelected()) {
                    if (p.getFg_ativo() == true) {
                        m.addRow(new Object[]{
                            p.getId(),
                            p.getDescricao(),
                            dm.format(p.getQtd()),
                            dm.format(p.getPrecoCompra()),
                            dm.format(p.getPreco()),
                            sdfNormal.format(p.getData()),
                            "Sim"
                        });
                    }
                } else if (p.getFg_ativo() == false) {
                    m.addRow(new Object[]{
                        p.getId(),
                        p.getDescricao(),
                        dm.format(p.getQtd()),
                        dm.format(p.getPrecoCompra()),
                        dm.format(p.getPreco()),
                        sdfNormal.format(p.getData()),
                        "Não"
                    });
                }
            }
            tabResultados.setModel(m);
        }
    }

    private void alterarProduto(String id) {

        //pesquisar produto
        Produto produto = new ProdutoDAO().get(Menu.getUsuario(), id);
        if (produto != null) {
            txtId.setText(Integer.toString(produto.getId()));
            txtDescricao.setText(produto.getDescricao());
            txtQtd.setText(Float.toString(produto.getQtd()).replaceAll("\\.", ","));
            txtPrecoCompra.setText(Float.toString(produto.getPrecoCompra()).replaceAll("\\.", ","));
            txtPreco.setText(Float.toString(produto.getPreco()).replaceAll("\\.", ","));
            jdcVencimento.setDate(produto.getData());

            cbAtivo.removeAllItems();
            if (produto.getFg_ativo() == true) {
                cbAtivo.addItem("Sim");
                cbAtivo.addItem("Não");
            } else {
                cbAtivo.addItem("Não");
                cbAtivo.addItem("Sim");
            }

            lblId.setVisible(false);
            txtId.setVisible(false);
            jSeparator1.setVisible(false);
            jSeparator2.setVisible(false);
            lblDescricao.setVisible(false);
            txtDescricao.setVisible(false);
            jSeparator3.setVisible(false);
            lblqtd.setVisible(false);
            txtQtd.setVisible(false);
        }

    }
}
