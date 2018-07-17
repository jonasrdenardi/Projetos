package view;

import controller.ClienteDAO;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.FormatoCpf;
import model.FormatoTelefone;

/**
 *
 * @author diego
 */
public class AlterarCliente extends javax.swing.JInternalFrame {

    public AlterarCliente() {
        initComponents();
        configurarFormulario();
        txtTelefone.setDocument(new FormatoTelefone());
        txtCpf.setDocument(new FormatoCpf());

        preencherTabela(new ClienteDAO().listar(Menu.getUsuario()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSelecione = new javax.swing.JLabel();
        jpFormulario = new javax.swing.JPanel();
        txtTelefone = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        lblNome = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtNome = new javax.swing.JTextField();
        lbTelefone = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        cbAtivo = new javax.swing.JComboBox<>();
        lblPreco1 = new javax.swing.JLabel();
        lblAlterarCliente = new javax.swing.JLabel();
        rbId = new javax.swing.JRadioButton();
        rbDescricao = new javax.swing.JRadioButton();
        jSeparator6 = new javax.swing.JSeparator();
        txtPesquisa = new javax.swing.JTextField();
        jspResultados = new javax.swing.JScrollPane();
        tabResultadosAlt = new javax.swing.JTable();
        rbAtivos = new javax.swing.JRadioButton();
        rbInativos = new javax.swing.JRadioButton();
        rbTodos = new javax.swing.JRadioButton();

        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone.png"))); // NOI18N

        lblSelecione.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        lblSelecione.setForeground(new java.awt.Color(101, 96, 168));
        lblSelecione.setText("Pesquise e clique 2x no Cliente para efetuar a alteração");

        txtTelefone.setBackground(new java.awt.Color(214, 217, 223));
        txtTelefone.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        txtTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefone.setBorder(null);

        lblCPF.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(101, 96, 168));
        lblCPF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCPF.setText("CPF");

        lblId.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        lblId.setForeground(new java.awt.Color(153, 153, 153));
        lblId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblId.setText("ID");

        txtCpf.setBackground(new java.awt.Color(214, 217, 223));
        txtCpf.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        txtCpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCpf.setBorder(null);

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

        lblNome.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        lblNome.setForeground(new java.awt.Color(101, 96, 168));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNome.setText("Nome");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtNome.setBackground(new java.awt.Color(214, 217, 223));
        txtNome.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        txtNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNome.setBorder(null);

        lbTelefone.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        lbTelefone.setForeground(new java.awt.Color(101, 96, 168));
        lbTelefone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTelefone.setText("Telefone");

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblPreco1.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        lblPreco1.setForeground(new java.awt.Color(101, 96, 168));
        lblPreco1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPreco1.setText("Cadastro Ativo?");

        javax.swing.GroupLayout jpFormularioLayout = new javax.swing.GroupLayout(jpFormulario);
        jpFormulario.setLayout(jpFormularioLayout);
        jpFormularioLayout.setHorizontalGroup(
            jpFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFormularioLayout.createSequentialGroup()
                        .addGroup(jpFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(txtId)
                            .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jpFormularioLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jpFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jpFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbTelefone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTelefone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCpf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPreco1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jpFormularioLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(cbAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpFormularioLayout.setVerticalGroup(
            jpFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFormularioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblId)
                    .addGroup(jpFormularioLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCPF)
                .addGap(3, 3, 3)
                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPreco1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblAlterarCliente.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        lblAlterarCliente.setForeground(new java.awt.Color(101, 96, 168));
        lblAlterarCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAlterarCliente.setText("ALTERAR CLIENTE");

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

        tabResultadosAlt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabResultadosAlt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabResultadosAltMouseClicked(evt);
            }
        });
        jspResultados.setViewportView(tabResultadosAlt);

        rbAtivos.setForeground(new java.awt.Color(101, 96, 168));
        rbAtivos.setText("Ativos");
        rbAtivos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbAtivosStateChanged(evt);
            }
        });

        rbInativos.setForeground(new java.awt.Color(101, 96, 168));
        rbInativos.setText("Inativos");

        rbTodos.setForeground(new java.awt.Color(101, 96, 168));
        rbTodos.setText("Todos");
        rbTodos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbTodosStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 187, Short.MAX_VALUE)
                .addComponent(jpFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAlterarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jspResultados)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPesquisa)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSelecione, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(lblAlterarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbId)
                        .addComponent(rbDescricao)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelecione, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbTodos)
                    .addComponent(rbAtivos)
                    .addComponent(rbInativos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        Cliente cliente = new Cliente();

        cliente.setNome(txtNome.getText());
        cliente.setTelefone(txtTelefone.getText());
        cliente.setCpf(txtCpf.getText());
        cliente.setFg_ativo((cbAtivo.getSelectedItem() == "Sim") ? true : false);

        int res = -1;

        if (!txtId.getText().isEmpty()) {
            cliente.setId(Integer.parseInt(txtId.getText()));
            res = new ClienteDAO().atualizar(Menu.getUsuario(), cliente);
        }

        if (res != -1) {
            txtId.setText(Integer.toString(res));
            JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!.", "Controle Estoque", JOptionPane.INFORMATION_MESSAGE);
            preencherTabela(new ClienteDAO().listar(Menu.getUsuario()));
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro durante a operação", "Controle Estoque", JOptionPane.ERROR_MESSAGE);
        }

        txtId.setText("");
        txtNome.setText("");
        txtTelefone.setText("");
        txtCpf.setText("");

        jpFormulario.setVisible(false);

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtPesquisaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPesquisaFocusGained

        txtPesquisa.setText("");
        txtPesquisa.setForeground(java.awt.Color.BLACK);

    }//GEN-LAST:event_txtPesquisaFocusGained

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased

        String chave = txtPesquisa.getText();

        if (chave.isEmpty()) {
            preencherTabela(new ClienteDAO().listar(Menu.getUsuario()));
        } else if (rbId.isSelected()) {
            preencherTabela(new ClienteDAO().pesquisarPorId(Menu.getUsuario(), Integer.parseInt(chave)));
        } else if (rbDescricao.isSelected()) {
            preencherTabela(new ClienteDAO().pesquisarPorNome(Menu.getUsuario(), chave));
        }

    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void tabResultadosAltMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabResultadosAltMouseClicked

        if (evt.getClickCount() == 2) {

            int linha = tabResultadosAlt.getSelectedRow();
            String id = tabResultadosAlt.getValueAt(linha, 0).toString();

            alterarCliente(id);

            jpFormulario.setVisible(true);
        }

    }//GEN-LAST:event_tabResultadosAltMouseClicked

    private void rbAtivosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbAtivosStateChanged
        preencherTabela(new ClienteDAO().listar(Menu.getUsuario()));
    }//GEN-LAST:event_rbAtivosStateChanged

    private void rbTodosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbTodosStateChanged
        preencherTabela(new ClienteDAO().listar(Menu.getUsuario()));
    }//GEN-LAST:event_rbTodosStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JComboBox<String> cbAtivo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JPanel jpFormulario;
    private javax.swing.JScrollPane jspResultados;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lblAlterarCliente;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPreco1;
    private javax.swing.JLabel lblSelecione;
    private javax.swing.JRadioButton rbAtivos;
    private javax.swing.JRadioButton rbDescricao;
    private javax.swing.JRadioButton rbId;
    private javax.swing.JRadioButton rbInativos;
    private javax.swing.JRadioButton rbTodos;
    private javax.swing.JTable tabResultadosAlt;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Alterar Cliente");
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
        m.addColumn("Nome");
        m.addColumn("Telefone");
        m.addColumn("CPF");
        m.addColumn("Ativo");
        tabResultadosAlt.setModel(m);

        tabResultadosAlt.getColumnModel().getColumn(0).setPreferredWidth(15);
        tabResultadosAlt.getColumnModel().getColumn(1).setPreferredWidth(165);
        tabResultadosAlt.getColumnModel().getColumn(2).setPreferredWidth(50);
        tabResultadosAlt.getColumnModel().getColumn(3).setPreferredWidth(50);
        tabResultadosAlt.getColumnModel().getColumn(4).setPreferredWidth(15);
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        tabResultadosAlt.getColumnModel().getColumn(2).setCellRenderer(esquerda);
        tabResultadosAlt.getColumnModel().getColumn(3).setCellRenderer(esquerda);
        tabResultadosAlt.getColumnModel().getColumn(4).setCellRenderer(centralizado);
    }

    private boolean liberarFormulario() {

        jpFormulario.setVisible(false);

        return false;
    }

    private void preencherTabela(List<Cliente> lista) {
        configurarTabela();
        if (lista.size() > 0) {
            DefaultTableModel m = (DefaultTableModel) tabResultadosAlt.getModel();
            for (Cliente c : lista) {
                if (rbTodos.isSelected()) {
                    m.addRow(new Object[]{
                        c.getId(),
                        c.getNome(),
                        c.getTelefone(),
                        c.getCpf(),
                        (c.getFg_ativo() == true) ? "Sim" : "Não"
                    });
                } else if (rbAtivos.isSelected()) {
                    if (c.getFg_ativo() == true) {
                        m.addRow(new Object[]{
                            c.getId(),
                            c.getNome(),
                            c.getTelefone(),
                            c.getCpf(),
                            "Sim"
                        });
                    }
                } else if (c.getFg_ativo() == false) {
                    m.addRow(new Object[]{
                        c.getId(),
                        c.getNome(),
                        c.getTelefone(),
                        c.getCpf(),
                        "Não"
                    });
                }
            }
            tabResultadosAlt.setModel(m);
        }
    }

    private void alterarCliente(String id) {

        //pesquisar cliente
        Cliente cliente = new ClienteDAO().get(Menu.getUsuario(), id);
        if (cliente != null) {
            txtId.setText(Integer.toString(cliente.getId()));
            txtNome.setText(cliente.getNome());
            txtTelefone.setText(cliente.getTelefone());
            txtCpf.setText(cliente.getCpf());

            cbAtivo.removeAllItems();
            if (cliente.getFg_ativo() == true) {
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
            lblNome.setVisible(false);
            txtNome.setVisible(false);
        }

    }
}
