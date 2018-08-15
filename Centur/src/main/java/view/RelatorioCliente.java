package view;

import controller.ClienteDAO;
import controller.Conexao;
import java.awt.Font;
import java.util.HashMap;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Usuario;
import reports.Relatorio;

/**
 *
 * @author diego
 */
public class RelatorioCliente extends javax.swing.JInternalFrame {

    public RelatorioCliente() {
        initComponents();
        configurarFormulario();

        preencherTabela(new ClienteDAO().listar(Menu.getUsuario()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jspResultados = new javax.swing.JScrollPane();
        tabResultados = new javax.swing.JTable();
        txtPesquisa = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        rbDescricao = new javax.swing.JRadioButton();
        rbId = new javax.swing.JRadioButton();
        lblRelatorioClientes = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        rbAtivos = new javax.swing.JRadioButton();
        rbInativos = new javax.swing.JRadioButton();
        rbTodos = new javax.swing.JRadioButton();

        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone.png"))); // NOI18N

        tabResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabResultados.setSelectionBackground(new java.awt.Color(168, 193, 221));
        jspResultados.setViewportView(tabResultados);

        txtPesquisa.setBackground(new java.awt.Color(240, 240, 240));
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

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rbDescricao.setForeground(new java.awt.Color(101, 96, 168));
        rbDescricao.setText("Nome");
        rbDescricao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbDescricaoMouseReleased(evt);
            }
        });

        rbId.setForeground(new java.awt.Color(101, 96, 168));
        rbId.setText("ID");
        rbId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbIdMouseReleased(evt);
            }
        });

        lblRelatorioClientes.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        lblRelatorioClientes.setForeground(new java.awt.Color(101, 96, 168));
        lblRelatorioClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRelatorioClientes.setText("RELATÓRIO CLIENTES");

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imprimir1.png"))); // NOI18N
        btnImprimir.setBorder(null);
        btnImprimir.setBorderPainted(false);
        btnImprimir.setContentAreaFilled(false);
        btnImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImprimir.setFocusPainted(false);
        btnImprimir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imprimir2.png"))); // NOI18N
        btnImprimir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imprimir2.png"))); // NOI18N
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        rbAtivos.setForeground(new java.awt.Color(101, 96, 168));
        rbAtivos.setText("Ativos");
        rbAtivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbAtivosMouseReleased(evt);
            }
        });

        rbInativos.setForeground(new java.awt.Color(101, 96, 168));
        rbInativos.setText("Inativos");
        rbInativos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbInativosMouseReleased(evt);
            }
        });

        rbTodos.setForeground(new java.awt.Color(101, 96, 168));
        rbTodos.setText("Todos");
        rbTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbTodosMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRelatorioClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jspResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPesquisa)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbTodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbAtivos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbInativos))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRelatorioClientes)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rbDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbTodos)
                            .addComponent(rbAtivos)
                            .addComponent(rbInativos))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        HashMap param = new HashMap();

        if (txtPesquisa.getText().isEmpty() || txtPesquisa.getText().equalsIgnoreCase("Digite sua pesquisa aqui!")) {
            if (rbAtivos.isSelected()) {
                param.put("PARAM", "WHERE fg_ativo = 1");
            } else if (rbInativos.isSelected()) {
                param.put("PARAM", "WHERE fg_ativo = 0");
            }
        } else {
            if (rbId.isSelected()) {
                if (rbAtivos.isSelected()) {
                    param.put("PARAM", "WHERE fg_ativo = 1 AND id = " + txtPesquisa.getText());
                } else if (rbInativos.isSelected()) {
                    param.put("PARAM", "WHERE fg_ativo = 0 AND id = " + txtPesquisa.getText());
                }
            } else if (rbDescricao.isSelected()) {
                if (rbAtivos.isSelected()) {
                    param.put("PARAM", "WHERE fg_ativo = 1 AND nome like " + "'%" + txtPesquisa.getText() + "%'");
                } else if (rbInativos.isSelected()) {
                    param.put("PARAM", "WHERE fg_ativo = 0 AND nome like " + "'%" + txtPesquisa.getText() + "%'");
                }
            }
        }

        if (rbTodos.isSelected()) {
            if (txtPesquisa.getText().isEmpty() || txtPesquisa.getText().equalsIgnoreCase("Digite sua pesquisa aqui!")) {
                param.put("PARAM", "");
                new Relatorio(
                    "rpt_clientes", //nome do relatório
                    Conexao.conectar(Menu.getUsuario()), //conexão com o sgbd
                    param //parâmetros
                ).show();
            } else{
                if (rbId.isSelected()) {
                    param.put("PARAM", "WHERE id = " + txtPesquisa.getText());
                    new Relatorio(
                        "rpt_clientes", //nome do relatório
                        Conexao.conectar(Menu.getUsuario()), //conexão com o sgbd
                        param //parâmetros
                    ).show();
                } else if (rbDescricao.isSelected()) {
                    param.put("PARAM", "WHERE nome like " + "'%" + txtPesquisa.getText() + "%'");
                    new Relatorio(
                        "rpt_clientes", //nome do relatório
                        Conexao.conectar(Menu.getUsuario()), //conexão com o sgbd
                        param //parâmetros
                    ).show();
                }
            }     
        } else {
            new Relatorio(
                    "rpt_clientes", //nome do relatório
                    Conexao.conectar(Menu.getUsuario()), //conexão com o sgbd
                    param //parâmetros
            ).show();
        }

    }//GEN-LAST:event_btnImprimirActionPerformed

    private void rbDescricaoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbDescricaoMouseReleased
        txtPesquisa.setText("Digite sua pesquisa aqui!");
        txtPesquisa.setForeground(new java.awt.Color(153, 153, 153));
        preencherTabela(new ClienteDAO().listar(Menu.getUsuario()));
    }//GEN-LAST:event_rbDescricaoMouseReleased

    private void rbIdMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbIdMouseReleased
        txtPesquisa.setText("Digite sua pesquisa aqui!");
        txtPesquisa.setForeground(new java.awt.Color(153, 153, 153));
        preencherTabela(new ClienteDAO().listar(Menu.getUsuario()));
    }//GEN-LAST:event_rbIdMouseReleased

    private void rbTodosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbTodosMouseReleased
        txtPesquisa.setText("Digite sua pesquisa aqui!");
        txtPesquisa.setForeground(new java.awt.Color(153, 153, 153));
        preencherTabela(new ClienteDAO().listar(Menu.getUsuario()));
    }//GEN-LAST:event_rbTodosMouseReleased

    private void rbAtivosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbAtivosMouseReleased
        txtPesquisa.setText("Digite sua pesquisa aqui!");
        txtPesquisa.setForeground(new java.awt.Color(153, 153, 153));
        preencherTabela(new ClienteDAO().listar(Menu.getUsuario()));
    }//GEN-LAST:event_rbAtivosMouseReleased

    private void rbInativosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbInativosMouseReleased
        txtPesquisa.setText("Digite sua pesquisa aqui!");
        txtPesquisa.setForeground(new java.awt.Color(153, 153, 153));
        preencherTabela(new ClienteDAO().listar(Menu.getUsuario()));
    }//GEN-LAST:event_rbInativosMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimir;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JScrollPane jspResultados;
    private javax.swing.JLabel lblRelatorioClientes;
    private javax.swing.JRadioButton rbAtivos;
    private javax.swing.JRadioButton rbDescricao;
    private javax.swing.JRadioButton rbId;
    private javax.swing.JRadioButton rbInativos;
    private javax.swing.JRadioButton rbTodos;
    private javax.swing.JTable tabResultados;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Relatório Clientes");
        this.setResizable(false);
        this.setMaximizable(false);
        this.setIconifiable(false);
        this.setClosable(true);

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
        
        getRootPane().setDefaultButton(btnImprimir);

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
        tabResultados.setModel(m);

        tabResultados.getColumnModel().getColumn(0).setPreferredWidth(8);
        tabResultados.getColumnModel().getColumn(1).setPreferredWidth(150);
        tabResultados.getColumnModel().getColumn(2).setPreferredWidth(60);
        tabResultados.getColumnModel().getColumn(3).setPreferredWidth(60);
        tabResultados.getColumnModel().getColumn(4).setPreferredWidth(30);
        ((DefaultTableCellRenderer) tabResultados.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        tabResultados.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 12));
    }

    private void preencherTabela(List<Cliente> lista) {
        configurarTabela();
        if (lista.size() > 0) {
            DefaultTableModel m = (DefaultTableModel) tabResultados.getModel();
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
            tabResultados.setModel(m);
        }
    }
}
