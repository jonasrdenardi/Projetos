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
        jspMenuLateral = new javax.swing.JScrollPane();
        jpMenuLateral = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JSeparator();
        btnCadastroCliente = new javax.swing.JButton();
        btnAlterarEstoque = new javax.swing.JButton();
        btnAbrirVenda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblAlterarEstoque = new javax.swing.JLabel();
        lblAbrirVenda = new javax.swing.JLabel();
        btnAbrirRecebimento = new javax.swing.JButton();
        lblAbrirRecebimento = new javax.swing.JLabel();
        lblReceber = new javax.swing.JLabel();
        btnReceber = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        jcbmiMenuLateral = new javax.swing.JCheckBoxMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
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
        jmiAdmRelatoriosClientes = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jmiAdmRelatoriosEstoque = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jmiAdmRelatoriosVendas = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        jmiFinanceiro = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jmiGerenciarUsuarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jspMenuLateral.setBorder(null);
        jspMenuLateral.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jspMenuLateral.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jpMenuLateral.setBackground(new java.awt.Color(255, 255, 255));

        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblUsuarioMouseReleased(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/face_menu.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setRequestFocusEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));

        btnCadastroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cadastro_cliente_menu_lateral.png"))); // NOI18N
        btnCadastroCliente.setBorder(null);
        btnCadastroCliente.setBorderPainted(false);
        btnCadastroCliente.setContentAreaFilled(false);
        btnCadastroCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastroCliente.setRequestFocusEnabled(false);
        btnCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroClienteActionPerformed(evt);
            }
        });

        btnAlterarEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/alterar_estoque_menu_lateral.png"))); // NOI18N
        btnAlterarEstoque.setBorder(null);
        btnAlterarEstoque.setBorderPainted(false);
        btnAlterarEstoque.setContentAreaFilled(false);
        btnAlterarEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarEstoque.setRequestFocusEnabled(false);
        btnAlterarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarEstoqueActionPerformed(evt);
            }
        });

        btnAbrirVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/abrir_venda_menu_lateral.png"))); // NOI18N
        btnAbrirVenda.setBorder(null);
        btnAbrirVenda.setBorderPainted(false);
        btnAbrirVenda.setContentAreaFilled(false);
        btnAbrirVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbrirVenda.setRequestFocusEnabled(false);
        btnAbrirVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirVendaActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastrar Cliente");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel1MouseReleased(evt);
            }
        });

        lblAlterarEstoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAlterarEstoque.setText("Alterar Estoque");
        lblAlterarEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAlterarEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblAlterarEstoqueMouseReleased(evt);
            }
        });

        lblAbrirVenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAbrirVenda.setText("Abrir Venda");
        lblAbrirVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAbrirVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblAbrirVendaMouseReleased(evt);
            }
        });

        btnAbrirRecebimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/abrir_recebimento_menu_lateral.png"))); // NOI18N
        btnAbrirRecebimento.setBorder(null);
        btnAbrirRecebimento.setBorderPainted(false);
        btnAbrirRecebimento.setContentAreaFilled(false);
        btnAbrirRecebimento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbrirRecebimento.setRequestFocusEnabled(false);
        btnAbrirRecebimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirRecebimentoActionPerformed(evt);
            }
        });

        lblAbrirRecebimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAbrirRecebimento.setText("Abrir Recebimento");
        lblAbrirRecebimento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAbrirRecebimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblAbrirRecebimentoMouseReleased(evt);
            }
        });

        lblReceber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReceber.setText("Receber");
        lblReceber.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblReceber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblReceberMouseReleased(evt);
            }
        });

        btnReceber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/receber_menu_lateral.png"))); // NOI18N
        btnReceber.setBorder(null);
        btnReceber.setBorderPainted(false);
        btnReceber.setContentAreaFilled(false);
        btnReceber.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReceber.setRequestFocusEnabled(false);
        btnReceber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpMenuLateralLayout = new javax.swing.GroupLayout(jpMenuLateral);
        jpMenuLateral.setLayout(jpMenuLateralLayout);
        jpMenuLateralLayout.setHorizontalGroup(
            jpMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLateralLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblReceber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReceber)
                    .addComponent(lblAbrirRecebimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAbrirRecebimento)
                    .addComponent(lblAbrirVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAbrirVenda)
                    .addComponent(lblAlterarEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterarEstoque)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastroCliente)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMenuLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator12)
                .addContainerGap())
        );
        jpMenuLateralLayout.setVerticalGroup(
            jpMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastroCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(btnAlterarEstoque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAlterarEstoque)
                .addGap(32, 32, 32)
                .addComponent(btnAbrirVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAbrirVenda)
                .addGap(32, 32, 32)
                .addComponent(btnAbrirRecebimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAbrirRecebimento)
                .addGap(32, 32, 32)
                .addComponent(btnReceber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblReceber)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jspMenuLateral.setViewportView(jpMenuLateral);

        areaTrabalho.setLayer(jspMenuLateral, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout areaTrabalhoLayout = new javax.swing.GroupLayout(areaTrabalho);
        areaTrabalho.setLayout(areaTrabalhoLayout);
        areaTrabalhoLayout.setHorizontalGroup(
            areaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaTrabalhoLayout.createSequentialGroup()
                .addGap(0, 979, Short.MAX_VALUE)
                .addComponent(jspMenuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        areaTrabalhoLayout.setVerticalGroup(
            areaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspMenuLateral)
        );

        barraMenu.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        barraMenu.setPreferredSize(new java.awt.Dimension(678, 48));

        menuArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/arquivo.png"))); // NOI18N
        menuArquivo.setText("Arquivo    ");
        menuArquivo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jcbmiMenuLateral.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jcbmiMenuLateral.setSelected(true);
        jcbmiMenuLateral.setText("Menu de Acesso Rápido");
        jcbmiMenuLateral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbmiMenuLateralActionPerformed(evt);
            }
        });
        menuArquivo.add(jcbmiMenuLateral);
        menuArquivo.add(jSeparator13);

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
        menuClientes.setText("Clientes    ");
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
        menuProdutos.setText("Estoque    ");
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
        menuVenda.setText("Venda    ");
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

        menuRecebimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/financeiro.png"))); // NOI18N
        menuRecebimento.setText("Financeiro    ");
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
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuRecebimento.add(jMenuItem2);
        menuRecebimento.add(jSeparator10);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/venda_recebimentos.png"))); // NOI18N
        jMenuItem1.setText("Receber");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuRecebimento.add(jMenuItem1);

        barraMenu.add(menuRecebimento);

        menuAdministracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/adm.png"))); // NOI18N
        menuAdministracao.setText("Administração    ");
        menuAdministracao.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jmiAdmRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/adm_relatorio.png"))); // NOI18N
        jmiAdmRelatorios.setText("Relatórios");
        jmiAdmRelatorios.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N

        jmiAdmRelatoriosClientes.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jmiAdmRelatoriosClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/pesquisar_cliente.png"))); // NOI18N
        jmiAdmRelatoriosClientes.setText("Clientes");
        jmiAdmRelatoriosClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAdmRelatoriosClientesActionPerformed(evt);
            }
        });
        jmiAdmRelatorios.add(jmiAdmRelatoriosClientes);
        jmiAdmRelatorios.add(jSeparator4);

        jmiAdmRelatoriosEstoque.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jmiAdmRelatoriosEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/pesquisar_produto.png"))); // NOI18N
        jmiAdmRelatoriosEstoque.setText("Estoque");
        jmiAdmRelatoriosEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAdmRelatoriosEstoqueActionPerformed(evt);
            }
        });
        jmiAdmRelatorios.add(jmiAdmRelatoriosEstoque);
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
        jmiAdmRelatorios.add(jSeparator11);

        jmiFinanceiro.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jmiFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icones/adm_relatorio_recebimentos.png"))); // NOI18N
        jmiFinanceiro.setText("Recebimento");
        jmiFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFinanceiroActionPerformed(evt);
            }
        });
        jmiAdmRelatorios.add(jmiFinanceiro);

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

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        abrirFormulario(new RecebimentoAlterarSelectVenda());
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        abrirFormulario(new RecebimentoReceberSelectVenda());
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmiFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFinanceiroActionPerformed
        abrirFormulario(new RelatorioRecebimento());
    }//GEN-LAST:event_jmiFinanceiroActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        abrirFormulario(new AdministracaoUsuarios());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroClienteActionPerformed
        abrirFormulario(new CadastroCliente());
    }//GEN-LAST:event_btnCadastroClienteActionPerformed

    private void btnAlterarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarEstoqueActionPerformed
        abrirFormulario(new AlterarEstoque());
    }//GEN-LAST:event_btnAlterarEstoqueActionPerformed

    private void btnAbrirVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirVendaActionPerformed
        abrirFormulario(new VendaAbrirSelectCliente());
    }//GEN-LAST:event_btnAbrirVendaActionPerformed

    private void jLabel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseReleased
        abrirFormulario(new CadastroCliente());
    }//GEN-LAST:event_jLabel1MouseReleased

    private void lblAlterarEstoqueMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlterarEstoqueMouseReleased
        abrirFormulario(new AlterarEstoque());
    }//GEN-LAST:event_lblAlterarEstoqueMouseReleased

    private void lblAbrirVendaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAbrirVendaMouseReleased
        abrirFormulario(new VendaAbrirSelectCliente());
    }//GEN-LAST:event_lblAbrirVendaMouseReleased

    private void btnAbrirRecebimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirRecebimentoActionPerformed
        abrirFormulario(new RecebimentoAbrirSelectVenda());
    }//GEN-LAST:event_btnAbrirRecebimentoActionPerformed

    private void lblAbrirRecebimentoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAbrirRecebimentoMouseReleased
        abrirFormulario(new RecebimentoAbrirSelectVenda());
    }//GEN-LAST:event_lblAbrirRecebimentoMouseReleased

    private void btnReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceberActionPerformed
        abrirFormulario(new RecebimentoReceberSelectVenda());
    }//GEN-LAST:event_btnReceberActionPerformed

    private void lblReceberMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReceberMouseReleased
        abrirFormulario(new RecebimentoReceberSelectVenda());
    }//GEN-LAST:event_lblReceberMouseReleased

    private void jcbmiMenuLateralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbmiMenuLateralActionPerformed
        if (jcbmiMenuLateral.isSelected()) {
            jspMenuLateral.setVisible(true);
            jpMenuLateral.setVisible(true);
        } else {
            jspMenuLateral.setVisible(false);
            jpMenuLateral.setVisible(false);
        }
    }//GEN-LAST:event_jcbmiMenuLateralActionPerformed

    private void lblUsuarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuarioMouseReleased
        abrirFormulario(new AdministracaoUsuarios());
    }//GEN-LAST:event_lblUsuarioMouseReleased

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
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
    private javax.swing.JButton btnAbrirRecebimento;
    private javax.swing.JButton btnAbrirVenda;
    private javax.swing.JButton btnAlterarEstoque;
    private javax.swing.JButton btnCadastroCliente;
    private javax.swing.JButton btnReceber;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JCheckBoxMenuItem jcbmiMenuLateral;
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
    private javax.swing.JMenuItem jmiFinanceiro;
    private javax.swing.JMenuItem jmiGerenciarUsuarios;
    private javax.swing.JMenuItem jmiVendaAbrirVenda;
    private javax.swing.JMenuItem jmiVendaAlterarVenda;
    private javax.swing.JPanel jpMenuLateral;
    private javax.swing.JScrollPane jspMenuLateral;
    private javax.swing.JLabel lblAbrirRecebimento;
    private javax.swing.JLabel lblAbrirVenda;
    private javax.swing.JLabel lblAlterarEstoque;
    private javax.swing.JLabel lblReceber;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu menuAdministracao;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenu menuProdutos;
    private javax.swing.JMenu menuRecebimento;
    private javax.swing.JMenu menuVenda;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Home");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        lblUsuario.setText("Usuário: " + getUsuario().getNome());
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
