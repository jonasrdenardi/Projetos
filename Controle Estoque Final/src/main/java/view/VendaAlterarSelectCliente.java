package view;

import controller.ClienteDAO;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Cliente;

/**
 *
 * @author diego
 */
public class VendaAlterarSelectCliente extends javax.swing.JInternalFrame {
    int idVenda;
    
    public VendaAlterarSelectCliente(int idVenda, String cliente) {
        initComponents();
        configurarFormulario();
        this.idVenda = idVenda;
        txtClienteAtual.setText(cliente);

        preencherTabela(new ClienteDAO().listar(Menu.getUsuario()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPesquisa = new javax.swing.JTextField();
        lblSelecione = new javax.swing.JLabel();
        rdbPorId = new javax.swing.JRadioButton();
        rdbPorDescricao = new javax.swing.JRadioButton();
        lblAlterarCliente = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabCliente = new javax.swing.JTable();
        txtClienteAtual = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        lblProdutosDisponiveis1 = new javax.swing.JLabel();

        setIconifiable(true);
        setResizable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone.png"))); // NOI18N
        setRequestFocusEnabled(false);

        txtPesquisa.setBackground(new java.awt.Color(240, 240, 240));
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
        lblSelecione.setForeground(new java.awt.Color(101, 96, 168));
        lblSelecione.setText("Pesquise o Cliente e clique 2x para iniciar um Venda");

        rdbPorId.setForeground(new java.awt.Color(101, 96, 168));
        rdbPorId.setText("ID");

        rdbPorDescricao.setForeground(new java.awt.Color(101, 96, 168));
        rdbPorDescricao.setText("Descrição");

        lblAlterarCliente.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        lblAlterarCliente.setForeground(new java.awt.Color(101, 96, 168));
        lblAlterarCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAlterarCliente.setText("SELECIONAR CLIENTE");

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        tabCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabCliente);

        txtClienteAtual.setBackground(new java.awt.Color(240, 240, 240));
        txtClienteAtual.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        txtClienteAtual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtClienteAtual.setBorder(null);

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblProdutosDisponiveis1.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        lblProdutosDisponiveis1.setForeground(new java.awt.Color(101, 96, 168));
        lblProdutosDisponiveis1.setText("Cliente Atual:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAlterarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSelecione)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdbPorId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbPorDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPesquisa)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblProdutosDisponiveis1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtClienteAtual)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAlterarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                .addComponent(lblProdutosDisponiveis1))
                            .addComponent(rdbPorDescricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(rdbPorId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtClienteAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(lblSelecione, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased

        String chave = txtPesquisa.getText();

        if (chave.isEmpty()) {
            preencherTabela(new ClienteDAO().listar(Menu.getUsuario()));
        } else if (rdbPorId.isSelected()) {
            preencherTabela(new ClienteDAO().pesquisarPorId(Menu.getUsuario(), Integer.parseInt(chave)));
        } else if (rdbPorDescricao.isSelected()) {
            preencherTabela(new ClienteDAO().pesquisarPorNome(Menu.getUsuario(), chave));
        }
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void txtPesquisaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPesquisaMousePressed
        txtPesquisa.setText("");
        txtPesquisa.setForeground(java.awt.Color.BLACK);
    }//GEN-LAST:event_txtPesquisaMousePressed

    private void tabClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabClienteMouseClicked

        if (evt.getClickCount() == 2) {
            int indiceLinha = tabCliente.getSelectedRow();
            Cliente cliente = new Cliente();

            if (indiceLinha != -1) {
                cliente.setId((int) tabCliente.getValueAt(indiceLinha, 0));
                cliente.setNome((String) tabCliente.getValueAt(indiceLinha, 1));

                VendaAlterar jiVendaAlterar = new VendaAlterar(cliente, idVenda);
                Menu.areaTrabalho.add(jiVendaAlterar);
                jiVendaAlterar.setVisible(true);
                jiVendaAlterar.setPosicao();  // Centraliza a Tela Interna
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um cliente!");
            }
        }

    }//GEN-LAST:event_tabClienteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblAlterarCliente;
    private javax.swing.JLabel lblProdutosDisponiveis1;
    private javax.swing.JLabel lblSelecione;
    private javax.swing.JRadioButton rdbPorDescricao;
    private javax.swing.JRadioButton rdbPorId;
    public static javax.swing.JTable tabCliente;
    private javax.swing.JTextField txtClienteAtual;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
    private void configurarFormulario() {
        this.setTitle("Selecionar Cliente");
        this.setResizable(false);
        this.setIconifiable(false);
        this.setClosable(true);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rdbPorId);
        bg.add(rdbPorDescricao);
        rdbPorDescricao.setSelected(true);

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
        m.addColumn("Nome");
        m.addColumn("Telefone");
        m.addColumn("CPF");
        tabCliente.setModel(m);

        tabCliente.getColumnModel().getColumn(0).setPreferredWidth(15);
        tabCliente.getColumnModel().getColumn(1).setPreferredWidth(165);
        tabCliente.getColumnModel().getColumn(2).setPreferredWidth(50);
        tabCliente.getColumnModel().getColumn(3).setPreferredWidth(50);
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        tabCliente.getColumnModel().getColumn(2).setCellRenderer(esquerda);
        tabCliente.getColumnModel().getColumn(3).setCellRenderer(esquerda);
        ((DefaultTableCellRenderer) tabCliente.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        tabCliente.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 12));
    }

    private void preencherTabela(List<Cliente> lista) {
        configurarTabela();
        if (lista.size() > 0) {
            DefaultTableModel m = (DefaultTableModel) tabCliente.getModel();
            for (Cliente c : lista) {
                if (c.getFg_ativo() == true) {
                    m.addRow(new Object[]{
                        c.getId(),
                        c.getNome(),
                        c.getTelefone(),
                        c.getCpf()
                    });
                }
            }
            tabCliente.setModel(m);
        }
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }
}
