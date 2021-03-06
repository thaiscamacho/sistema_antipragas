/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.view;

import sistema.controller.Usuario;

/**
 *
 * @author thais
 */
public class MenuGUI extends javax.swing.JFrame {
    private Usuario usuario;
    /**
     * Creates new form TelaPrincipal
     */
    public MenuGUI(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        this.btnHome.setEnabled(false);
        if(usuario.getTipo().equals("1")){
            this.btnUsuario.setVisible(false);
        }
        PrincipalGUI Principal = new PrincipalGUI(this.usuario);
        Principal.setVisible(true);
        Desktop1.add(Principal);
    }
    
    public void ativarBotoes(){
        if(this.usuario.getTipo().equals("0")){
            this.btnUsuario.setEnabled(true);
        }
        this.btnCliente.setEnabled(true);
        this.btnProposta.setEnabled(true);
        this.btnFunc.setEnabled(true);
        this.btnProduto.setEnabled(true);
        this.btnHome.setEnabled(true);
        this.btnGerais.setEnabled(true);
        this.btnFornecedor.setEnabled(true);
        this.btnServicos.setEnabled(false);
        this.btnServicos.setEnabled(true);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        Desktop1 = new javax.swing.JDesktopPane();
        BarraDeMenu = new javax.swing.JMenuBar();
        btnHome = new javax.swing.JMenu();
        btnPessoas = new javax.swing.JMenu();
        btnCliente = new javax.swing.JMenuItem();
        btnFunc = new javax.swing.JMenuItem();
        btnProduto = new javax.swing.JMenu();
        btnServicos = new javax.swing.JMenu();
        btnProposta = new javax.swing.JMenu();
        btnUsuario = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        btnGerais = new javax.swing.JMenuItem();
        btnFornecedor = new javax.swing.JMenuItem();
        btnSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/home.png"))); // NOI18N
        btnHome.setText("HOME");
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHomeMousePressed(evt);
            }
        });
        BarraDeMenu.add(btnHome);

        btnPessoas.setForeground(new java.awt.Color(10, 55, 57));
        btnPessoas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user.png"))); // NOI18N
        btnPessoas.setText("PESSOAS");

        btnCliente.setText("CLIENTES");
        btnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnClienteMousePressed(evt);
            }
        });
        btnPessoas.add(btnCliente);

        btnFunc.setText("FUNCIONÁRIOS");
        btnFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFuncMousePressed(evt);
            }
        });
        btnPessoas.add(btnFunc);

        BarraDeMenu.add(btnPessoas);

        btnProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/truck.png"))); // NOI18N
        btnProduto.setText("ESTOQUE");
        btnProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnProdutoMousePressed(evt);
            }
        });
        BarraDeMenu.add(btnProduto);

        btnServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/serv.png"))); // NOI18N
        btnServicos.setText("SERVIÇOS");
        btnServicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnServicosMousePressed(evt);
            }
        });
        BarraDeMenu.add(btnServicos);

        btnProposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Clipboard.png"))); // NOI18N
        btnProposta.setText("PROPOSTAS");
        btnProposta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPropostaMousePressed(evt);
            }
        });
        BarraDeMenu.add(btnProposta);

        btnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user.png"))); // NOI18N
        btnUsuario.setText("USUÁRIO");
        btnUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUsuarioMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsuarioMouseClicked(evt);
            }
        });
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });
        BarraDeMenu.add(btnUsuario);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Psettings.png"))); // NOI18N
        jMenu4.setText("OUTROS");

        btnGerais.setText("GERAIS");
        btnGerais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGeraisMousePressed(evt);
            }
        });
        jMenu4.add(btnGerais);

        btnFornecedor.setText("FORNECEDORES");
        btnFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFornecedorMousePressed(evt);
            }
        });
        jMenu4.add(btnFornecedor);

        BarraDeMenu.add(jMenu4);

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        btnSair.setText("SAIR");
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSairMousePressed(evt);
            }
        });
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        BarraDeMenu.add(btnSair);

        setJMenuBar(BarraDeMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Desktop1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMousePressed
        // TODO add your handling code here:
        Desktop1.removeAll();
        PrincipalGUI Principal = new PrincipalGUI(this.usuario);
        Principal.setVisible(true);
        this.ativarBotoes();
        btnHome.setEnabled(false);
        Desktop1.add(Principal);
    }//GEN-LAST:event_btnHomeMousePressed

    private void btnProdutoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdutoMousePressed
        // TODO add your handling code here:
        ProdutoGUI TelaProduto = new ProdutoGUI();
        TelaProduto.setVisible(true);
        this.ativarBotoes();
        btnProduto.setEnabled(false);
        Desktop1.removeAll();
        Desktop1.add(TelaProduto);
    }//GEN-LAST:event_btnProdutoMousePressed

    private void btnUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuarioMousePressed
        // TODO add your handling code here:
        UsuarioGUI TelaUsuario = new UsuarioGUI(this.usuario);
        TelaUsuario.setVisible(true);
        this.ativarBotoes();
        btnUsuario.setEnabled(false);
        Desktop1.removeAll();
        Desktop1.add(TelaUsuario);
    }//GEN-LAST:event_btnUsuarioMousePressed

    private void btnClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMousePressed
        // TODO add your handling code here:
        ClienteGUI TelaCliente = new ClienteGUI();
        TelaCliente.setVisible(true);
        this.ativarBotoes();
        btnCliente.setEnabled(false);
        Desktop1.removeAll();
        Desktop1.add(TelaCliente);
    }//GEN-LAST:event_btnClienteMousePressed

    private void btnFuncMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFuncMousePressed
        // TODO add your handling code here:
        FuncionarioGUI TelaFuncionario = new FuncionarioGUI();
        TelaFuncionario.setVisible(true);
        this.ativarBotoes();
        btnFunc.setEnabled(false);
        Desktop1.removeAll();
        Desktop1.add(TelaFuncionario);
    }//GEN-LAST:event_btnFuncMousePressed

    private void btnUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuarioMouseClicked
        // TODO add your handling code here:
        /*TelaCrudUsuario TelaUsuario = new TelaCrudUsuario(this.usuario);
        TelaUsuario.setVisible(true);
        this.ativarBotoes();
        btnUsuario.setEnabled(false);
        Desktop1.removeAll();
        Desktop1.add(TelaUsuario);*/
    }//GEN-LAST:event_btnUsuarioMouseClicked

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        // TODO add your handling code here:
        /*TelaCrudUsuario TelaUsuario = new TelaCrudUsuario(this.usuario);
        TelaUsuario.setVisible(true);
        this.ativarBotoes();
        btnUsuario.setEnabled(false);
        Desktop1.removeAll();
        Desktop1.add(TelaUsuario);*/
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnGeraisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGeraisMousePressed
        // TODO add your handling code here:
        GeraisGUI TelaPraga = new GeraisGUI();
        TelaPraga.setVisible(true);
        this.ativarBotoes();
        btnGerais.setEnabled(false);
        Desktop1.removeAll();
        Desktop1.add(TelaPraga);
    }//GEN-LAST:event_btnGeraisMousePressed

    private void btnFornecedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFornecedorMousePressed
        // TODO add your handling code here:
        FornecedorGUI TelaFornecedor = new FornecedorGUI();
        TelaFornecedor.setVisible(true);
        this.ativarBotoes();
        btnFornecedor.setEnabled(false);
        Desktop1.removeAll();
        Desktop1.add(TelaFornecedor);
    }//GEN-LAST:event_btnFornecedorMousePressed

    private void btnPropostaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPropostaMousePressed
        // TODO add your handling code here:
        PropostaGUI telaCrudProposta = new PropostaGUI();
        telaCrudProposta.setVisible(true);
        this.ativarBotoes();
        btnProposta.setEnabled(false);
        Desktop1.removeAll();
        Desktop1.add(telaCrudProposta);
    }//GEN-LAST:event_btnPropostaMousePressed

    private void btnSairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMousePressed
        LoginGUI telaLogin = new LoginGUI();
        this.dispose();
        telaLogin.setVisible(true);
    }//GEN-LAST:event_btnSairMousePressed

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSairMouseClicked

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnServicosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnServicosMousePressed
        // TODO add your handling code here:
        ServicoGUI telaCrudServico = new ServicoGUI();
        telaCrudServico.setVisible(true);
        this.ativarBotoes();
        btnServicos.setEnabled(false);
        Desktop1.removeAll();
        Desktop1.add(telaCrudServico);
    }//GEN-LAST:event_btnServicosMousePressed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraDeMenu;
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JDesktopPane Desktop1;
    private javax.swing.JMenuItem btnCliente;
    private javax.swing.JMenuItem btnFornecedor;
    private javax.swing.JMenuItem btnFunc;
    private javax.swing.JMenuItem btnGerais;
    private javax.swing.JMenu btnHome;
    private javax.swing.JMenu btnPessoas;
    private javax.swing.JMenu btnProduto;
    private javax.swing.JMenu btnProposta;
    private javax.swing.JMenu btnSair;
    private javax.swing.JMenu btnServicos;
    private javax.swing.JMenu btnUsuario;
    private javax.swing.JMenu jMenu4;
    // End of variables declaration//GEN-END:variables
}

/*
TelaCrudUsuario TelaUsuario = new TelaCrudUsuario(this.usuario);
        TelaUsuario.setVisible(true);
        this.ativarBotoes();
        btnUsuario.setEnabled(false);
        Desktop.removeAll();
        Desktop.add(TelaUsuario);

*/