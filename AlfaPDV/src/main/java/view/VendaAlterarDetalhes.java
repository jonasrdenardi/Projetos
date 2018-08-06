package view;

import controller.Conexao;
import controller.ProdutoVendaDAO;
import java.awt.Dimension;
import java.awt.Font;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Retorno;
import model.Venda;
import reports.Relatorio;

public class VendaAlterarDetalhes extends javax.swing.JInternalFrame {

    List<Retorno> retornos = new ArrayList<Retorno>();
    int idVenda;
    
    DecimalFormat dm = new DecimalFormat("###,###,###,###,##0.00");
    SimpleDateFormat sdfNormal = new SimpleDateFormat("dd/MM/yyyy");

    public VendaAlterarDetalhes(int idVenda) {
        initComponents();
        this.idVenda = idVenda;
        configurarFormulario();
        retornos = new ProdutoVendaDAO().listar(Menu.getUsuario(), idVenda);

        txtIdVenda.setText(String.valueOf(idVenda));
        txtDataVenda.setText(sdfNormal.format(retornos.get(0).venda.getDataVenda()));
        txtCliente.setText(retornos.get(0).cliente.getNome());
        txtDesconto.setText(String.valueOf(dm.format(retornos.get(0).venda.getDesconto())));
        txtTotal.setText(String.valueOf(dm.format(retornos.get(0).venda.getValor())));

        preencherTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRelatorioVenda = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabResultados = new javax.swing.JTable();
        txtCliente = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        lblProdutosDisponiveis1 = new javax.swing.JLabel();
        txtIdVenda = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        lblProdutosDisponiveis2 = new javax.swing.JLabel();
        txtDataVenda = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        lblProdutosDisponiveis3 = new javax.swing.JLabel();
        lblProdutosDisponiveis4 = new javax.swing.JLabel();
        txtDesconto = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        lblProdutosDisponiveis5 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();

        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone.png"))); // NOI18N

        lblRelatorioVenda.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        lblRelatorioVenda.setForeground(new java.awt.Color(101, 96, 168));
        lblRelatorioVenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRelatorioVenda.setText("DETALHES DA VENDA");

        tabResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Produto", "Produto", "Quantidade", "Preço", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabResultados.setSelectionBackground(new java.awt.Color(168, 193, 221));
        jScrollPane1.setViewportView(tabResultados);
        if (tabResultados.getColumnModel().getColumnCount() > 0) {
            tabResultados.getColumnModel().getColumn(0).setResizable(false);
            tabResultados.getColumnModel().getColumn(1).setResizable(false);
            tabResultados.getColumnModel().getColumn(2).setResizable(false);
            tabResultados.getColumnModel().getColumn(4).setResizable(false);
        }

        txtCliente.setBackground(new java.awt.Color(240, 240, 240));
        txtCliente.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        txtCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCliente.setBorder(null);
        txtCliente.setFocusable(false);

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblProdutosDisponiveis1.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        lblProdutosDisponiveis1.setForeground(new java.awt.Color(101, 96, 168));
        lblProdutosDisponiveis1.setText("Cliente:");

        txtIdVenda.setBackground(new java.awt.Color(240, 240, 240));
        txtIdVenda.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        txtIdVenda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdVenda.setBorder(null);
        txtIdVenda.setFocusable(false);

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblProdutosDisponiveis2.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        lblProdutosDisponiveis2.setForeground(new java.awt.Color(101, 96, 168));
        lblProdutosDisponiveis2.setText("ID Venda:");

        txtDataVenda.setBackground(new java.awt.Color(240, 240, 240));
        txtDataVenda.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        txtDataVenda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDataVenda.setBorder(null);
        txtDataVenda.setFocusable(false);

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblProdutosDisponiveis3.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        lblProdutosDisponiveis3.setForeground(new java.awt.Color(101, 96, 168));
        lblProdutosDisponiveis3.setText("Data da Venda:");

        lblProdutosDisponiveis4.setFont(new java.awt.Font("Constantia", 1, 15)); // NOI18N
        lblProdutosDisponiveis4.setForeground(new java.awt.Color(101, 96, 168));
        lblProdutosDisponiveis4.setText("Total da Venda:");

        txtDesconto.setBackground(new java.awt.Color(240, 240, 240));
        txtDesconto.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        txtDesconto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDesconto.setBorder(null);
        txtDesconto.setFocusable(false);

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblProdutosDisponiveis5.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        lblProdutosDisponiveis5.setForeground(new java.awt.Color(101, 96, 168));
        lblProdutosDisponiveis5.setText("Desconto na Venda:");

        txtTotal.setBackground(new java.awt.Color(240, 240, 240));
        txtTotal.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(0, 0, 204));
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setBorder(null);
        txtTotal.setFocusable(false);

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(lblRelatorioVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProdutosDisponiveis5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDesconto, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jSeparator11))
                        .addGap(675, 675, 675))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProdutosDisponiveis4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jSeparator12))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProdutosDisponiveis2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator9)
                            .addComponent(txtIdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addComponent(lblProdutosDisponiveis3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator10)
                            .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addComponent(lblProdutosDisponiveis1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCliente)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRelatorioVenda)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblProdutosDisponiveis3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblProdutosDisponiveis1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtIdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblProdutosDisponiveis2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblProdutosDisponiveis5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblProdutosDisponiveis4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblProdutosDisponiveis1;
    private javax.swing.JLabel lblProdutosDisponiveis2;
    private javax.swing.JLabel lblProdutosDisponiveis3;
    private javax.swing.JLabel lblProdutosDisponiveis4;
    private javax.swing.JLabel lblProdutosDisponiveis5;
    private javax.swing.JLabel lblRelatorioVenda;
    private javax.swing.JTable tabResultados;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtDataVenda;
    private javax.swing.JTextField txtDesconto;
    private javax.swing.JTextField txtIdVenda;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
    private void configurarFormulario() {
        this.setTitle("Detalhe Venda");
        this.setResizable(false);
        this.setMaximizable(false);
        this.setIconifiable(false);
        this.setClosable(true);

        configurarTabela();
    }

    private void configurarTabela() {
        DefaultTableModel m = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        m.addColumn("ID Produto");
        m.addColumn("Produto");
        m.addColumn("Quantidade");
        m.addColumn("Preço");
        m.addColumn("Total");
        tabResultados.setModel(m);

        tabResultados.getColumnModel().getColumn(0).setPreferredWidth(8);
        tabResultados.getColumnModel().getColumn(1).setPreferredWidth(180);
        tabResultados.getColumnModel().getColumn(2).setPreferredWidth(10);
        tabResultados.getColumnModel().getColumn(3).setPreferredWidth(20);
        tabResultados.getColumnModel().getColumn(4).setPreferredWidth(20);
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        tabResultados.getColumnModel().getColumn(2).setCellRenderer(direita);
        tabResultados.getColumnModel().getColumn(3).setCellRenderer(direita);
        tabResultados.getColumnModel().getColumn(4).setCellRenderer(direita);
        ((DefaultTableCellRenderer) tabResultados.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        tabResultados.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 12));
    }

    private void preencherTabela() {
        configurarTabela();
        if (retornos.size() > 0) {
            DefaultTableModel m = (DefaultTableModel) tabResultados.getModel();
            for (Retorno r : retornos) {
                m.addRow(new Object[]{
                    r.produto.getId(),
                    r.produto.getDescricao(),
                    dm.format(r.produtoVenda.getQtdProduto()),
                    dm.format(r.produtoVenda.getValorProduto()),
                    dm.format(r.produtoVenda.getQtdProduto() * r.produtoVenda.getValorProduto())
                });
            }
            tabResultados.setModel(m);
        }
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

}
