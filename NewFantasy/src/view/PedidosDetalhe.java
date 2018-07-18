package view;

import controller.PedidoDAO;
import java.awt.Dimension;
import java.text.DecimalFormat;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Pedido;

public class PedidosDetalhe extends javax.swing.JInternalFrame {

    public PedidosDetalhe(int idPedido) {
        initComponents();
        configurarFormulario();
        // Chama o metodo listarDetalhes do PedidoDAO passando o usuário de login e id dp pedido como parametro
        preencherTabela(new PedidoDAO().listarDetalhes(Menu.getUsuario(), idPedido));
        // Preenche o label pedido com o pedido selecionado na tela PedidosAberto
        lblVPedido.setText(String.valueOf(idPedido));

        setValorPedido(new PedidoDAO().listarDetalhes(Menu.getUsuario(), idPedido));
        setValorGarcom(new PedidoDAO().listarDetalhes(Menu.getUsuario(), idPedido));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalhesPedido = new javax.swing.JTable();
        lblPedido = new javax.swing.JLabel();
        lblVPedido = new javax.swing.JLabel();
        lblVTotalPedido = new javax.swing.JLabel();
        lblTotalPedido = new javax.swing.JLabel();
        lblVGarcom = new javax.swing.JLabel();
        lblGacom = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/java_icon.png"))); // NOI18N

        tblDetalhesPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód. Item", "Descrição Item", "Qtd Item", "Valor Un.", "Valor Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
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
        tblDetalhesPedido.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tblDetalhesPedido);
        if (tblDetalhesPedido.getColumnModel().getColumnCount() > 0) {
            tblDetalhesPedido.getColumnModel().getColumn(0).setPreferredWidth(2);
            tblDetalhesPedido.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblDetalhesPedido.getColumnModel().getColumn(2).setPreferredWidth(1);
            tblDetalhesPedido.getColumnModel().getColumn(3).setPreferredWidth(5);
            tblDetalhesPedido.getColumnModel().getColumn(4).setPreferredWidth(5);
        }

        lblPedido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPedido.setText("Pedido:");

        lblVPedido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lblVTotalPedido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblVTotalPedido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblTotalPedido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotalPedido.setText("Total Pedido:");

        lblVGarcom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblVGarcom.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblGacom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGacom.setText("Garçom:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblGacom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVGarcom, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTotalPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPedido)
                        .addComponent(lblVPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblGacom)
                        .addComponent(lblVGarcom, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalPedido)
                    .addComponent(lblVTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGacom;
    private javax.swing.JLabel lblPedido;
    private javax.swing.JLabel lblTotalPedido;
    private javax.swing.JLabel lblVGarcom;
    private javax.swing.JLabel lblVPedido;
    private javax.swing.JLabel lblVTotalPedido;
    private javax.swing.JTable tblDetalhesPedido;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Detalhes do Pedido - New Fantasy");
        this.setResizable(false);
        this.setClosable(true);
        this.setIconifiable(true);
    }

    public void preencherTabela(Pedido p) {
        if (p != null) {

            //Configura a tabela
            DefaultTableModel m = (DefaultTableModel) tblDetalhesPedido.getModel();
            tblDetalhesPedido.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblDetalhesPedido.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblDetalhesPedido.getColumnModel().getColumn(2).setPreferredWidth(50);
            tblDetalhesPedido.getColumnModel().getColumn(3).setPreferredWidth(50);
            tblDetalhesPedido.getColumnModel().getColumn(4).setPreferredWidth(100);
            DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
            esquerda.setHorizontalAlignment(SwingConstants.LEFT);
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            direita.setHorizontalAlignment(SwingConstants.RIGHT);
            tblDetalhesPedido.getColumnModel().getColumn(0).setCellRenderer(esquerda);
            tblDetalhesPedido.getColumnModel().getColumn(2).setCellRenderer(esquerda);
            tblDetalhesPedido.getColumnModel().getColumn(3).setCellRenderer(direita);
            tblDetalhesPedido.getColumnModel().getColumn(4).setCellRenderer(direita);

            for (int i = 0; i < p.getItem().length; i++) {
                m.addRow(new Object[]{p.getItem(i).getId(), p.getItem(i).getDesc(), p.getQtdItem(i).getQtdItem(), String.format("%.2f", p.getItem(i).getValor()), String.format("%.2f", (p.getQtdItem(i).getQtdItem() * p.getItem(i).getValor()))});
            }
            tblDetalhesPedido.setModel(m);

        }
    }

    // Centraliza o JInternalFrame quando chamado
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    private void setValorPedido(Pedido p) {
        float valorPedido = 0;

        DecimalFormat df = new DecimalFormat("0.00");

        for (int i = 0; i < tblDetalhesPedido.getRowCount(); i++) {
            valorPedido += p.getQtdItem(i).getQtdItem() * p.getItem(i).getValor();
        }

        lblVTotalPedido.setText(df.format(valorPedido));
    }

    private void setValorGarcom(Pedido p) {
        float valorPedido = 0;

        DecimalFormat df = new DecimalFormat("0.00");

        valorPedido = p.getGarcom10();

        lblVGarcom.setText(df.format(valorPedido));
    }
}
