package view;

import controller.Conexao;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import model.Usuario;


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
        jmiArquivoDesconectar = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmiArquivoSair = new javax.swing.JMenuItem();
        menuClientes = new javax.swing.JMenu();
        jmiClientesCadastrarCliente = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jmiClientesAlterarCliente = new javax.swing.JMenuItem();
        menuProdutos = new javax.swing.JMenu();
        jmiEstoqueCadastrarProduto = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jmiEstoqueAlterarProduto = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiEstoqueAlterarEstoque = new javax.swing.JMenuItem();
        menuVenda = new javax.swing.JMenu();
        jmiVendaAbrirVenda = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jmiVendaAlterarVenda = new javax.swing.JMenuItem();
        menuRecebimento = new javax.swing.JMenu();
        jmiAlterarRecebimento = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuAdministracao = new javax.swing.JMenu();
        jmiAdmRelatorios = new javax.swing.JMenu();
        jmiAdmRelatoriosEstoque = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jmiAdmRelatoriosClientes = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jmiAdmRelatoriosVendas = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jmiGerenciarUsuarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout areaTrabalhoLayout = new javax.swing.GroupLayout(areaTrabalho);
        areaTrabalho.setLayout(areaTrabalhoLayout);
        areaTrabalhoLayout.setHorizontalGroup(
            areaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 781, Short.MAX_VALUE)
        );
        areaTrabalhoLayout.setVerticalGroup(
            areaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
        );

        barraMenu.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        barraMenu.setPreferredSize(new java.awt.Dimension(678, 50));

        menuArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/arquivo.png"))); // NOI18N
        menuArquivo.setText("Arquivo");
        menuArquivo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jmiArquivoDesconectar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiArquivoDesconectar.setFont(new java.awt.Font("sansserif", 0, 13)); // NOI18N
        jmiArquivoDesconectar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/desconectar.png"))); // NOI18N
        jmiArquivoDesconectar.setText("Desconectar");
        jmiArquivoDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiArquivoDesconectarActionPerformed(evt);
            }
        });
        menuArquivo.add(jmiArquivoDesconectar);
        menuArquivo.add(jSeparator2);

        jmiArquivoSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiArquivoSair.setFont(new java.awt.Font("sansserif", 0, 13)); // NOI18N
        jmiArquivoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/sair.png"))); // NOI18N
        jmiArquivoSair.setText("Sair");
        jmiArquivoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiArquivoSairActionPerformed(evt);
            }
        });
        menuArquivo.add(jmiArquivoSair);

        barraMenu.add(menuArquivo);

        menuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/cliente.png"))); // NOI18N
        menuClientes.setText("Clientes");
        menuClientes.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jmiClientesCadastrarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jmiClientesCadastrarCliente.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jmiClientesCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/cadastro_cliente.png"))); // NOI18N
        jmiClientesCadastrarCliente.setText("Cadastrar Cliente");
        jmiClientesCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiClientesCadastrarClienteActionPerformed(evt);
            }
        });
        menuClientes.add(jmiClientesCadastrarCliente);
        menuClientes.add(jSeparator3);

        jmiClientesAlterarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiClientesAlterarCliente.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jmiClientesAlterarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/cliente_alterar.png"))); // NOI18N
        jmiClientesAlterarCliente.setText("Alterar Cliente");
        jmiClientesAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiClientesAlterarClienteActionPerformed(evt);
            }
        });
        menuClientes.add(jmiClientesAlterarCliente);

        barraMenu.add(menuClientes);

        menuProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/produtos.png"))); // NOI18N
        menuProdutos.setText("Estoque");
        menuProdutos.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jmiEstoqueCadastrarProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jmiEstoqueCadastrarProduto.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jmiEstoqueCadastrarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/produto_cadastro.png"))); // NOI18N
        jmiEstoqueCadastrarProduto.setText("Cadastrar Produto");
        jmiEstoqueCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEstoqueCadastrarProdutoActionPerformed(evt);
            }
        });
        menuProdutos.add(jmiEstoqueCadastrarProduto);
        menuProdutos.add(jSeparator6);

        jmiEstoqueAlterarProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiEstoqueAlterarProduto.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jmiEstoqueAlterarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/produto_cadastro_alterar.png"))); // NOI18N
        jmiEstoqueAlterarProduto.setText("Alterar Produto");
        jmiEstoqueAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEstoqueAlterarProdutoActionPerformed(evt);
            }
        });
        menuProdutos.add(jmiEstoqueAlterarProduto);
        menuProdutos.add(jSeparator1);

        jmiEstoqueAlterarEstoque.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        jmiEstoqueAlterarEstoque.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jmiEstoqueAlterarEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/estoque_alterar.png"))); // NOI18N
        jmiEstoqueAlterarEstoque.setText("Alterar Estoque");
        jmiEstoqueAlterarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEstoqueAlterarEstoqueActionPerformed(evt);
            }
        });
        menuProdutos.add(jmiEstoqueAlterarEstoque);

        barraMenu.add(menuProdutos);

        menuVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/venda.png"))); // NOI18N
        menuVenda.setText("Venda");
        menuVenda.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jmiVendaAbrirVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        jmiVendaAbrirVenda.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jmiVendaAbrirVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/abrir_venda.png"))); // NOI18N
        jmiVendaAbrirVenda.setText("Abrir Venda");
        jmiVendaAbrirVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiVendaAbrirVendaActionPerformed(evt);
            }
        });
        menuVenda.add(jmiVendaAbrirVenda);
        menuVenda.add(jSeparator7);

        jmiVendaAlterarVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiVendaAlterarVenda.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jmiVendaAlterarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/venda_alterar.png"))); // NOI18N
        jmiVendaAlterarVenda.setText("Alterar Venda");
        jmiVendaAlterarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiVendaAlterarVendaActionPerformed(evt);
            }
        });
        menuVenda.add(jmiVendaAlterarVenda);

        barraMenu.add(menuVenda);

        menuRecebimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/venda_recebimentos.png"))); // NOI18N
        menuRecebimento.setText("Financeiro");
        menuRecebimento.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jmiAlterarRecebimento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        jmiAlterarRecebimento.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jmiAlterarRecebimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/recebimento_abrir.png"))); // NOI18N
        jmiAlterarRecebimento.setText("Abrir Recebimento");
        jmiAlterarRecebimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlterarRecebimentoActionPerformed(evt);
            }
        });
        menuRecebimento.add(jmiAlterarRecebimento);
        menuRecebimento.add(jSeparator8);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/recebimento_alterar.png"))); // NOI18N
        jMenuItem2.setText("Alterar Recebimento");
        menuRecebimento.add(jMenuItem2);
        menuRecebimento.add(jSeparator10);

        jMenuItem1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/recebimento_abrir.png"))); // NOI18N
        jMenuItem1.setText("Receber");
        menuRecebimento.add(jMenuItem1);

        barraMenu.add(menuRecebimento);

        menuAdministracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/adm.png"))); // NOI18N
        menuAdministracao.setText("Administração");
        menuAdministracao.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jmiAdmRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/adm_relatorio.png"))); // NOI18N
        jmiAdmRelatorios.setText("Relatórios");
        jmiAdmRelatorios.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N

        jmiAdmRelatoriosEstoque.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jmiAdmRelatoriosEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/pesquisar_produto.png"))); // NOI18N
        jmiAdmRelatoriosEstoque.setText("Estoque");
        jmiAdmRelatoriosEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAdmRelatoriosEstoqueActionPerformed(evt);
            }
        });
        jmiAdmRelatorios.add(jmiAdmRelatoriosEstoque);
        jmiAdmRelatorios.add(jSeparator4);

        jmiAdmRelatoriosClientes.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jmiAdmRelatoriosClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/pesquisar_cliente.png"))); // NOI18N
        jmiAdmRelatoriosClientes.setText("Clientes");
        jmiAdmRelatoriosClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAdmRelatoriosClientesActionPerformed(evt);
            }
        });
        jmiAdmRelatorios.add(jmiAdmRelatoriosClientes);
        jmiAdmRelatorios.add(jSeparator5);

        jmiAdmRelatoriosVendas.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jmiAdmRelatoriosVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/adm_relatorio_vendas.png"))); // NOI18N
        jmiAdmRelatoriosVendas.setText("Vendas");
        jmiAdmRelatoriosVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAdmRelatoriosVendasActionPerformed(evt);
            }
        });
        jmiAdmRelatorios.add(jmiAdmRelatoriosVendas);

        menuAdministracao.add(jmiAdmRelatorios);
        menuAdministracao.add(jSeparator9);

        jmiGerenciarUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        jmiGerenciarUsuarios.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jmiGerenciarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/adm_usuario.png"))); // NOI18N
        jmiGerenciarUsuarios.setText("Gerenciar Usuários");
        jmiGerenciarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGerenciarUsuariosActionPerformed(evt);
            }
        });
        menuAdministracao.add(jmiGerenciarUsuarios);

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

    private void jmiEstoqueCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEstoqueCadastrarProdutoActionPerformed
        abrirFormulario(new CadastroProduto());
    }//GEN-LAST:event_jmiEstoqueCadastrarProdutoActionPerformed

    private void jmiArquivoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiArquivoSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmiArquivoSairActionPerformed

    private void jmiArquivoDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiArquivoDesconectarActionPerformed
        Login lg = new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmiArquivoDesconectarActionPerformed

    private void jmiEstoqueAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEstoqueAlterarProdutoActionPerformed
        abrirFormulario(new AlterarProduto());
    }//GEN-LAST:event_jmiEstoqueAlterarProdutoActionPerformed

    private void jmiAdmRelatoriosEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAdmRelatoriosEstoqueActionPerformed
        abrirFormulario(new RelatorioEstoque());
    }//GEN-LAST:event_jmiAdmRelatoriosEstoqueActionPerformed

    private void jmiEstoqueAlterarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEstoqueAlterarEstoqueActionPerformed
        abrirFormulario(new AlterarEstoque());
    }//GEN-LAST:event_jmiEstoqueAlterarEstoqueActionPerformed

    private void jmiClientesCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiClientesCadastrarClienteActionPerformed
        abrirFormulario(new CadastroCliente());
    }//GEN-LAST:event_jmiClientesCadastrarClienteActionPerformed

    private void jmiClientesAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiClientesAlterarClienteActionPerformed
        abrirFormulario(new AlterarCliente());
    }//GEN-LAST:event_jmiClientesAlterarClienteActionPerformed

    private void jmiAdmRelatoriosClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAdmRelatoriosClientesActionPerformed
        abrirFormulario(new RelatorioCliente());
    }//GEN-LAST:event_jmiAdmRelatoriosClientesActionPerformed

    private void jmiVendaAbrirVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVendaAbrirVendaActionPerformed
        abrirFormulario(new VendaAbrirSelectCliente());
    }//GEN-LAST:event_jmiVendaAbrirVendaActionPerformed

    private void jmiAdmRelatoriosVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAdmRelatoriosVendasActionPerformed
        abrirFormulario(new RelatorioVenda());
    }//GEN-LAST:event_jmiAdmRelatoriosVendasActionPerformed

    private void jmiVendaAlterarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVendaAlterarVendaActionPerformed
        abrirFormulario(new VendaAlterarSelectVenda());
    }//GEN-LAST:event_jmiVendaAlterarVendaActionPerformed

    private void jmiGerenciarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGerenciarUsuariosActionPerformed
        abrirFormulario(new AdministracaoUsuarios());
    }//GEN-LAST:event_jmiGerenciarUsuariosActionPerformed

    private void jmiAlterarRecebimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlterarRecebimentoActionPerformed
        abrirFormulario(new RecebimentoAbrirSelectVenda());
    }//GEN-LAST:event_jmiAlterarRecebimentoActionPerformed


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
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenu jmiAdmRelatorios;
    private javax.swing.JMenuItem jmiAdmRelatoriosClientes;
    private javax.swing.JMenuItem jmiAdmRelatoriosEstoque;
    private javax.swing.JMenuItem jmiAdmRelatoriosVendas;
    private javax.swing.JMenuItem jmiAlterarRecebimento;
    private javax.swing.JMenuItem jmiArquivoDesconectar;
    private javax.swing.JMenuItem jmiArquivoSair;
    private javax.swing.JMenuItem jmiClientesAlterarCliente;
    private javax.swing.JMenuItem jmiClientesCadastrarCliente;
    private javax.swing.JMenuItem jmiEstoqueAlterarEstoque;
    private javax.swing.JMenuItem jmiEstoqueAlterarProduto;
    private javax.swing.JMenuItem jmiEstoqueCadastrarProduto;
    private javax.swing.JMenuItem jmiGerenciarUsuarios;
    private javax.swing.JMenuItem jmiVendaAbrirVenda;
    private javax.swing.JMenuItem jmiVendaAlterarVenda;
    private javax.swing.JMenu menuAdministracao;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenu menuProdutos;
    private javax.swing.JMenu menuRecebimento;
    private javax.swing.JMenu menuVenda;
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
