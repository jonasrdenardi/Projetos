package view;

import controller.ClienteDAO;
import controller.Conexao;
import controller.VendaDAO;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Usuario;
import model.Venda;
import reports.Relatorio;


/**
 *
 * @author diego
 */
public class RelatorioVenda extends javax.swing.JInternalFrame {

    public RelatorioVenda() {
        initComponents();
        configurarFormulario();
        
        preencherTabela(new VendaDAO().listar(Menu.getUsuario()));
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
        lblRelatorioVenda = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        btnDetalhes = new javax.swing.JButton();

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
        jspResultados.setViewportView(tabResultados);

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

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rbDescricao.setText("Data");

        rbId.setText("ID");

        lblRelatorioVenda.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        lblRelatorioVenda.setForeground(new java.awt.Color(208, 92, 5));
        lblRelatorioVenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRelatorioVenda.setText("RELATÓRIO DE VENDAS");

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imprimir1.png"))); // NOI18N
        btnImprimir.setBorder(null);
        btnImprimir.setBorderPainted(false);
        btnImprimir.setContentAreaFilled(false);
        btnImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImprimir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imprimir2.png"))); // NOI18N
        btnImprimir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imprimir2.png"))); // NOI18N
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnDetalhes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/detalhes1.png"))); // NOI18N
        btnDetalhes.setBorder(null);
        btnDetalhes.setBorderPainted(false);
        btnDetalhes.setContentAreaFilled(false);
        btnDetalhes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDetalhes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/detalhes2.png"))); // NOI18N
        btnDetalhes.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/detalhes2.png"))); // NOI18N
        btnDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhesActionPerformed(evt);
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
                        .addComponent(rbId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPesquisa)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(171, 327, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRelatorioVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jspResultados, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRelatorioVenda)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbId)
                        .addComponent(rbDescricao))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
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
            preencherTabela(new VendaDAO().listar(Menu.getUsuario()));
        } else {
            if(rbId.isSelected()){
                preencherTabela(new VendaDAO().pesquisarPorId(Menu.getUsuario(), Integer.parseInt(chave)));
            }else if(rbDescricao.isSelected()){
                preencherTabela(new VendaDAO().pesquisarPorData(Menu.getUsuario(), chave));
            }
        }
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        Usuario u = new Usuario();

        new Relatorio(
            "rpt_vendas", //nome do relatório
            Conexao.conectar(u), //conexão com o sgbd
            null //parâmetros
        ).show();
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhesActionPerformed
        
        
        
    }//GEN-LAST:event_btnDetalhesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetalhes;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JScrollPane jspResultados;
    private javax.swing.JLabel lblRelatorioVenda;
    private javax.swing.JRadioButton rbDescricao;
    private javax.swing.JRadioButton rbId;
    private javax.swing.JTable tabResultados;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Relatório Venda");
        this.setResizable(false);
        this.setMaximizable(false);
        this.setIconifiable(false);
        this.setClosable(true);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rbId);
        bg.add(rbDescricao);
        rbDescricao.setSelected(true);

        configurarTabela();

    }

    private void configurarTabela() {
        DefaultTableModel m = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        m.addColumn("Id");
        m.addColumn("Id_cliente");
        m.addColumn("Data da Venda");
        m.addColumn("Desconto");
        m.addColumn("Valor");
        m.addColumn("Ativo");
        tabResultados.setModel(m);

        tabResultados.getColumnModel().getColumn(0).setPreferredWidth(8);
        tabResultados.getColumnModel().getColumn(1).setPreferredWidth(8);
        tabResultados.getColumnModel().getColumn(2).setPreferredWidth(60);
        tabResultados.getColumnModel().getColumn(3).setPreferredWidth(60);
        tabResultados.getColumnModel().getColumn(4).setPreferredWidth(20);

    }

    private void preencherTabela(List<Venda> lista) {
        configurarTabela();
        if (lista.size() > 0) {
            DefaultTableModel m = (DefaultTableModel) tabResultados.getModel();
            for (Venda v : lista) {
                m.addRow(new Object[]{
                    v.getId(),
                    v.getIdCliente(),
                    v.getDataVenda(),
                    v.getDesconto(),
                    v.getValor(),
                    (v.isFg_ativo() == true) ? "Sim" : "Não"
                });
            }
            tabResultados.setModel(m);
        }
    }
}
