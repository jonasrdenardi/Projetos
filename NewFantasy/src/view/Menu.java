package view;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import model.Usuario;

public class Menu extends javax.swing.JFrame {

    private static Usuario usuario;

    public Menu(Usuario usuario) {
        this.usuario = usuario;
        initComponents();
        configurarFormulario();
        
        // Esconde a opcao de usuários e cadastro de usuários
        jmiUsuarios.setVisible(false);
        jmiCadastroUsuario.setVisible(false);
        
        setVisible(true);
        // Se o usuário for postgres ou o saulo mostra a opcao de usuários e cadastro de usuários
        if (usuario.getNome().equals("saulo") || usuario.getNome().equals("postgres")) {
            jmiUsuarios.setVisible(true);
            jmiCadastroUsuario.setVisible(true);
        }

        //para a imagem do fundo ficar do tamanho da tela que o software abrir
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        ImageIcon img = new ImageIcon("src/imagens/fundotopo2.jpg");
        Icon icone = new ImageIcon(img.getImage().getScaledInstance(d.width, d.height, Image.SCALE_SMOOTH));
        lblFundo.setIcon(icone);
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaTrabalho = new javax.swing.JDesktopPane();
        lblFundo = new javax.swing.JLabel();
        JmenuBar = new javax.swing.JMenuBar();
        jmArquivo = new javax.swing.JMenu();
        jmiDesconectar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiSair = new javax.swing.JMenuItem();
        jmPedidos = new javax.swing.JMenu();
        jmiAbrir = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmiAberto = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jmiFechado = new javax.swing.JMenuItem();
        jmItens = new javax.swing.JMenu();
        jmiCadastrarItem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jmAlterarItem = new javax.swing.JMenuItem();
        jmAdm = new javax.swing.JMenu();
        jmiRelatorio = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jmiUsuarios = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jmiCadastroUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        areaTrabalho.setLayer(lblFundo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout areaTrabalhoLayout = new javax.swing.GroupLayout(areaTrabalho);
        areaTrabalho.setLayout(areaTrabalhoLayout);
        areaTrabalhoLayout.setHorizontalGroup(
            areaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
        );
        areaTrabalhoLayout.setVerticalGroup(
            areaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
        );

        jmArquivo.setBorder(null);
        jmArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arquivo.png"))); // NOI18N
        jmArquivo.setText("Arquivo");
        jmArquivo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jmiDesconectar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiDesconectar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/desconectar.png"))); // NOI18N
        jmiDesconectar.setText("  Desconectar");
        jmiDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDesconectarActionPerformed(evt);
            }
        });
        jmArquivo.add(jmiDesconectar);
        jmArquivo.add(jSeparator1);

        jmiSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        jmiSair.setText("  Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        jmArquivo.add(jmiSair);

        JmenuBar.add(jmArquivo);

        jmPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pedidos.png"))); // NOI18N
        jmPedidos.setText("Pedidos");
        jmPedidos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jmiAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jmiAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/abrirPedido.png"))); // NOI18N
        jmiAbrir.setText("  Abrir");
        jmiAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAbrirActionPerformed(evt);
            }
        });
        jmPedidos.add(jmiAbrir);
        jmPedidos.add(jSeparator2);

        jmiAberto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        jmiAberto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pedidosAbertos.png"))); // NOI18N
        jmiAberto.setText("  Abertos");
        jmiAberto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAbertoActionPerformed(evt);
            }
        });
        jmPedidos.add(jmiAberto);
        jmPedidos.add(jSeparator6);

        jmiFechado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        jmiFechado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pedidosAbertos.png"))); // NOI18N
        jmiFechado.setText("Fechados");
        jmiFechado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFechadoActionPerformed(evt);
            }
        });
        jmPedidos.add(jmiFechado);

        JmenuBar.add(jmPedidos);

        jmItens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastro.png"))); // NOI18N
        jmItens.setText("Itens");
        jmItens.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jmiCadastrarItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jmiCadastrarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastrarItem.png"))); // NOI18N
        jmiCadastrarItem.setText("  Cadastrar Item");
        jmiCadastrarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastrarItemActionPerformed(evt);
            }
        });
        jmItens.add(jmiCadastrarItem);
        jmItens.add(jSeparator3);

        jmAlterarItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        jmAlterarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/modificarItem.png"))); // NOI18N
        jmAlterarItem.setText("  Alterar Item");
        jmAlterarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAlterarItemActionPerformed(evt);
            }
        });
        jmItens.add(jmAlterarItem);

        JmenuBar.add(jmItens);

        jmAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adm.png"))); // NOI18N
        jmAdm.setText("Administração");
        jmAdm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jmiRelatorio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        jmiRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio.png"))); // NOI18N
        jmiRelatorio.setText("  Relatório");
        jmAdm.add(jmiRelatorio);
        jmAdm.add(jSeparator4);

        jmiUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        jmiUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuarios.png"))); // NOI18N
        jmiUsuarios.setText("  Usuários");
        jmiUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiUsuariosActionPerformed(evt);
            }
        });
        jmAdm.add(jmiUsuarios);
        jmAdm.add(jSeparator5);

        jmiCadastroUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastrarUsuario.png"))); // NOI18N
        jmiCadastroUsuario.setText("  Cadastro de Usuário");
        jmiCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastroUsuarioActionPerformed(evt);
            }
        });
        jmAdm.add(jmiCadastroUsuario);

        JmenuBar.add(jmAdm);

        setJMenuBar(JmenuBar);

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

    private void jmiAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAbrirActionPerformed
        abrirFormulario(new PedidosAbrir());
    }//GEN-LAST:event_jmiAbrirActionPerformed

    private void jmiAbertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAbertoActionPerformed
        abrirFormulario(new PedidosAberto());
    }//GEN-LAST:event_jmiAbertoActionPerformed

    private void jmAlterarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAlterarItemActionPerformed
        abrirFormulario(new ItensAlterar());
    }//GEN-LAST:event_jmAlterarItemActionPerformed

    private void jmiCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastroUsuarioActionPerformed
        abrirFormulario(new UsuarioCadastro());
    }//GEN-LAST:event_jmiCadastroUsuarioActionPerformed

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmiSairActionPerformed

    private void jmiDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDesconectarActionPerformed
        Login lg = new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmiDesconectarActionPerformed

    private void jmiCadastrarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastrarItemActionPerformed
        abrirFormulario(new ItensCadastrar());

    }//GEN-LAST:event_jmiCadastrarItemActionPerformed

    private void jmiFechadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFechadoActionPerformed
        abrirFormulario(new PedidosFechado());
    }//GEN-LAST:event_jmiFechadoActionPerformed

    private void jmiUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiUsuariosActionPerformed
        abrirFormulario(new UsuarioLista());
    }//GEN-LAST:event_jmiUsuariosActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Usuario usuario = null;
                new Menu(usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar JmenuBar;
    public static javax.swing.JDesktopPane areaTrabalho;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JMenu jmAdm;
    private javax.swing.JMenuItem jmAlterarItem;
    private javax.swing.JMenu jmArquivo;
    private javax.swing.JMenu jmItens;
    private javax.swing.JMenu jmPedidos;
    private javax.swing.JMenuItem jmiAberto;
    private javax.swing.JMenuItem jmiAbrir;
    private javax.swing.JMenuItem jmiCadastrarItem;
    private javax.swing.JMenuItem jmiCadastroUsuario;
    private javax.swing.JMenuItem jmiDesconectar;
    private javax.swing.JMenuItem jmiFechado;
    private javax.swing.JMenuItem jmiRelatorio;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JMenuItem jmiUsuarios;
    private javax.swing.JLabel lblFundo;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("New Fantasy");

        //carregar formulário maximizado
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
