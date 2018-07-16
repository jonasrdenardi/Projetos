package view;

import controller.Conexao;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import model.Usuario;
import reports.Relatorio;

/**
 *
 * @author diego
 */
public class Menu extends javax.swing.JFrame {
    
    private static Usuario usuario;

    public Menu(Usuario usuario) {
        this.usuario = usuario;
        initComponents();
        configurarFormulario();
        
        // Esconde a opcao administracao de usuários comuns
        menuAdministracao.setVisible(false);
        
        setVisible(true);
        // Se o usuário for root ou o diego mostra o menu administração
        if (usuario.getNome().equals("pamela") || usuario.getNome().equals("root")) {
            menuAdministracao.setVisible(true);
        }
        
        //mudar icone do aplicativo
        this.setIconImage(new ImageIcon(getClass().getResource("/images/icone.png")).getImage());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaTrabalho = new util.JDesktopPanePersonalizado("fundo.png");
        barraMenu = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuitemDesconectar = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuitemSair = new javax.swing.JMenuItem();
        menuClientes = new javax.swing.JMenu();
        jmiCadasrtarCliente = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jmiAlterarCliente = new javax.swing.JMenuItem();
        menuProdutos = new javax.swing.JMenu();
        jmiCadastrarProduto = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jmiAlterarProduto = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiEstoque = new javax.swing.JMenuItem();
        jmVenda = new javax.swing.JMenu();
        jmiAbrirVenda = new javax.swing.JMenuItem();
        menuAdministracao = new javax.swing.JMenu();
        jmiRelEstoque = new javax.swing.JMenu();
        menuitemRelProdutos = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout areaTrabalhoLayout = new javax.swing.GroupLayout(areaTrabalho);
        areaTrabalho.setLayout(areaTrabalhoLayout);
        areaTrabalhoLayout.setHorizontalGroup(
            areaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 781, Short.MAX_VALUE)
        );
        areaTrabalhoLayout.setVerticalGroup(
            areaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
        );

        barraMenu.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        menuArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/arquivo.png"))); // NOI18N
        menuArquivo.setText("Arquivo");
        menuArquivo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        menuitemDesconectar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuitemDesconectar.setFont(new java.awt.Font("sansserif", 0, 13)); // NOI18N
        menuitemDesconectar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/desconectar.png"))); // NOI18N
        menuitemDesconectar.setText("Desconectar");
        menuitemDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemDesconectarActionPerformed(evt);
            }
        });
        menuArquivo.add(menuitemDesconectar);
        menuArquivo.add(jSeparator2);

        menuitemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuitemSair.setFont(new java.awt.Font("sansserif", 0, 13)); // NOI18N
        menuitemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/sair.png"))); // NOI18N
        menuitemSair.setText("Sair");
        menuitemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemSairActionPerformed(evt);
            }
        });
        menuArquivo.add(menuitemSair);

        barraMenu.add(menuArquivo);

        menuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/cliente.png"))); // NOI18N
        menuClientes.setText("Clientes");
        menuClientes.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jmiCadasrtarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jmiCadasrtarCliente.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jmiCadasrtarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/cadastro_cliente.png"))); // NOI18N
        jmiCadasrtarCliente.setText("Cadastrar Cliente");
        jmiCadasrtarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadasrtarClienteActionPerformed(evt);
            }
        });
        menuClientes.add(jmiCadasrtarCliente);
        menuClientes.add(jSeparator3);

        jmiAlterarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiAlterarCliente.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jmiAlterarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/cadastro.png"))); // NOI18N
        jmiAlterarCliente.setText("Alterar Cliente");
        jmiAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlterarClienteActionPerformed(evt);
            }
        });
        menuClientes.add(jmiAlterarCliente);

        barraMenu.add(menuClientes);

        menuProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/produtos.png"))); // NOI18N
        menuProdutos.setText("Produtos");
        menuProdutos.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jmiCadastrarProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jmiCadastrarProduto.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jmiCadastrarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/produto_cadastro.png"))); // NOI18N
        jmiCadastrarProduto.setText("Cadastrar Produto");
        jmiCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastrarProdutoActionPerformed(evt);
            }
        });
        menuProdutos.add(jmiCadastrarProduto);
        menuProdutos.add(jSeparator6);

        jmiAlterarProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiAlterarProduto.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jmiAlterarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/produto_cadastro_alterar.png"))); // NOI18N
        jmiAlterarProduto.setText("Alterar Produto");
        jmiAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlterarProdutoActionPerformed(evt);
            }
        });
        menuProdutos.add(jmiAlterarProduto);
        menuProdutos.add(jSeparator1);

        jmiEstoque.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        jmiEstoque.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jmiEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/cadastro_alterar_cliente_pet.png"))); // NOI18N
        jmiEstoque.setText("Alterar Estoque");
        jmiEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEstoqueActionPerformed(evt);
            }
        });
        menuProdutos.add(jmiEstoque);

        barraMenu.add(menuProdutos);

        jmVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/venda.png"))); // NOI18N
        jmVenda.setText("Venda");
        jmVenda.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jmiAbrirVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        jmiAbrirVenda.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jmiAbrirVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/abrir_venda.png"))); // NOI18N
        jmiAbrirVenda.setText("Abrir Venda");
        jmiAbrirVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAbrirVendaActionPerformed(evt);
            }
        });
        jmVenda.add(jmiAbrirVenda);

        barraMenu.add(jmVenda);

        menuAdministracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/adm.png"))); // NOI18N
        menuAdministracao.setText("Administração");
        menuAdministracao.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jmiRelEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/adm_relatorio.png"))); // NOI18N
        jmiRelEstoque.setText("Relatórios");
        jmiRelEstoque.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N

        menuitemRelProdutos.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        menuitemRelProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/pesquisar_produto.png"))); // NOI18N
        menuitemRelProdutos.setText("Estoque");
        menuitemRelProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemRelProdutosActionPerformed(evt);
            }
        });
        jmiRelEstoque.add(menuitemRelProdutos);
        jmiRelEstoque.add(jSeparator4);

        jMenuItem1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/pesquisar_cliente.png"))); // NOI18N
        jMenuItem1.setText("Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmiRelEstoque.add(jMenuItem1);
        jmiRelEstoque.add(jSeparator5);

        jMenuItem2.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/adm_relatorio_vendas.png"))); // NOI18N
        jMenuItem2.setText("Vendas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jmiRelEstoque.add(jMenuItem2);

        menuAdministracao.add(jmiRelEstoque);

        barraMenu.add(menuAdministracao);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(areaTrabalho)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(areaTrabalho)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastrarProdutoActionPerformed
        abrirFormulario(new CadastroProduto());
    }//GEN-LAST:event_jmiCadastrarProdutoActionPerformed

    private void menuitemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuitemSairActionPerformed

    private void menuitemDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemDesconectarActionPerformed
        Login lg = new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuitemDesconectarActionPerformed

    private void jmiAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlterarProdutoActionPerformed
        abrirFormulario(new AlterarProduto());
    }//GEN-LAST:event_jmiAlterarProdutoActionPerformed

    private void menuitemRelProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemRelProdutosActionPerformed
        abrirFormulario(new RelatorioEstoque());
    }//GEN-LAST:event_menuitemRelProdutosActionPerformed

    private void jmiEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEstoqueActionPerformed
        abrirFormulario(new AlterarEstoque());
    }//GEN-LAST:event_jmiEstoqueActionPerformed

    private void jmiCadasrtarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadasrtarClienteActionPerformed
        abrirFormulario(new CadastroCliente());
    }//GEN-LAST:event_jmiCadasrtarClienteActionPerformed

    private void jmiAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlterarClienteActionPerformed
        abrirFormulario(new AlterarCliente());
    }//GEN-LAST:event_jmiAlterarClienteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        abrirFormulario(new RelatorioCliente());
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmiAbrirVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAbrirVendaActionPerformed
        abrirFormulario(new VendaAbrirSelecCliente());
    }//GEN-LAST:event_jmiAbrirVendaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        abrirFormulario(new RelatorioVenda());
    }//GEN-LAST:event_jMenuItem2ActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Usuario usuario = null;
                new Menu(usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane areaTrabalho;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JMenu jmVenda;
    private javax.swing.JMenuItem jmiAbrirVenda;
    private javax.swing.JMenuItem jmiAlterarCliente;
    private javax.swing.JMenuItem jmiAlterarProduto;
    private javax.swing.JMenuItem jmiCadasrtarCliente;
    private javax.swing.JMenuItem jmiCadastrarProduto;
    private javax.swing.JMenuItem jmiEstoque;
    private javax.swing.JMenu jmiRelEstoque;
    private javax.swing.JMenu menuAdministracao;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenu menuProdutos;
    private javax.swing.JMenuItem menuitemDesconectar;
    private javax.swing.JMenuItem menuitemRelProdutos;
    private javax.swing.JMenuItem menuitemSair;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario(){
        this.setTitle("Home");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    private void abrirFormulario(JInternalFrame f) {
        //garantir que apenas 1 (uma) janela seja aberta por vez.
        if (areaTrabalho.getAllFrames().length == 0) {
            areaTrabalho.add(f);

            //centralizar o JInternalFrame
            Dimension d = areaTrabalho.getSize();
            f.setLocation(
                    (d.width - f.getWidth()) / 2,
                    (d.height - f.getHeight()) / 2
            );

            f.setVisible(true);
        }
    }

    public static Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


}
