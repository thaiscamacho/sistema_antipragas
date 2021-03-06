/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.view;

import javax.swing.JOptionPane;
import sistema.model.DAOPragas;
import sistema.controller.Pragas;
import javax.swing.table.DefaultTableModel;
import sistema.controller.Endereco;
import sistema.model.DAOEndereco;

/**
 *
 * @author thais
 */
public class GeraisGUI extends javax.swing.JInternalFrame {
    private Pragas praga;
    private Endereco endereco;
    /**
     * Creates new form CrudCliente
     */
    public GeraisGUI() {
        initComponents();
        atualizarTabelaPragas();
        atualizarTabelaEnd();
        this.desativarBotoesPragas();
        this.desativarBotoesEnd();
        this.btnSave.setEnabled(true);
        this.btnSave1.setEnabled(true);
    }
   
    private void limpaCamposPragas(){
        txtNome.setText("");
    }
    
    private void limpaCamposEnd(){
        txtCEP.setText("");
        txtComp.setText("");
        txtNum.setText("");
        txtEnd.setText("");
    }
    
    private boolean verificaCamposPragas(){
        boolean nome = false;
        if(!txtNome.getText().isEmpty()){
            nome = true;
        }
        return nome;
    }
    
    private boolean verificaCamposEnd(){
        boolean rua_av = false, num = false, cep = false, comp = false;
        if(!txtCEP.getText().isEmpty()){
            cep = true;
        }
        if(!txtNum.getText().isEmpty()){
            num = true;
        }
        if(!txtComp.getText().isEmpty()){
            comp = true;
        }
        if(!txtEnd.getText().isEmpty()){
            rua_av = true;
        }
        return rua_av && num;
    }
    
    
    private void atualizarTabelaPragas(){
        limparTabelaPragas();
        DAOPragas dAOPragas = new DAOPragas();
        DefaultTableModel modelo = (DefaultTableModel) tblPragas.getModel();
        dAOPragas.listar(modelo);
    }
    
    private void atualizarTabelaEnd(){
        limparTabelaEnd();
        DAOEndereco dAOEnd = new DAOEndereco();
        DefaultTableModel modelo = (DefaultTableModel) tblEnd.getModel();
        dAOEnd.listar(modelo);
    }
    
    
    public void limparTabelaPragas(){
        DefaultTableModel modelo = (DefaultTableModel) tblPragas.getModel();
        modelo.setNumRows(0);
        tblPragas.setModel(modelo);
    }
    
    public void limparTabelaEnd(){
        DefaultTableModel modelo = (DefaultTableModel) tblEnd.getModel();
        modelo.setNumRows(0);
        tblEnd.setModel(modelo);
    }
    
    private void PesquisarPragas(){
        DAOPragas dAOPragas = new DAOPragas();
        DefaultTableModel modelo = (DefaultTableModel) tblPragas.getModel();
        dAOPragas.listarComLike(BarraDeBusca.getText(), modelo);
    }
    
    private void PesquisarEnd(){
        DAOEndereco dAOEnd = new DAOEndereco();
        DefaultTableModel modelo = (DefaultTableModel) tblEnd.getModel();
        dAOEnd.listarComLike(BarraDeBuscaEnd.getText(), modelo);
    }
    
    private void setPragas(int idPragas){
        DAOPragas dAOPragas = new DAOPragas();
        this.praga = dAOPragas.buscarComID(idPragas);
        txtNome.setText(this.praga.getNome());
    }
    
    private void setEnd(int idEnd){
        DAOEndereco dAOEnd = new DAOEndereco();
        this.endereco = dAOEnd.buscarComID(idEnd);
        txtCEP.setText(this.endereco.getCep());
        txtComp.setText(this.endereco.getComplemento());
        txtEnd.setText(this.endereco.getRuaAven());
        txtNum.setText(this.endereco.getNumero().toString());
    }
    
    private void ativarBotoesPragas(){
        this.btnDelete.setEnabled(true);
        this.btnMerge.setEnabled(true);
        this.btnSave.setEnabled(true);
    }
    
    private void desativarBotoesPragas(){
        this.btnDelete.setEnabled(false);
        this.btnMerge.setEnabled(false);
        this.btnSave.setEnabled(false);
    }
    
    private void ativarBotoesEnd(){
        this.btnDelete1.setEnabled(true);
        this.btnMerge1.setEnabled(true);
        this.btnSave1.setEnabled(true);
    }
    
    private void desativarBotoesEnd(){
        this.btnDelete1.setEnabled(false);
        this.btnMerge1.setEnabled(false);
        this.btnSave1.setEnabled(false);
    }
    
    private Pragas criarPraga(){
        Pragas praga = new Pragas();
        praga.setNome(txtNome.getText());
        return praga;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPragas = new javax.swing.JTable();
        BarraDeBusca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnMerge = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BarraDeBuscaEnd = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEnd = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnSave1 = new javax.swing.JButton();
        btnMerge1 = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        txtEnd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCEP = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtComp = new javax.swing.JTextField();

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Informações de Endereço");

        jTextField9.setText("jTextField8");

        setPreferredSize(new java.awt.Dimension(1050, 550));

        jLabel1.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gerais");

        tblPragas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPragas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPragasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblPragas);

        BarraDeBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BarraDeBuscaKeyReleased(evt);
            }
        });

        jLabel2.setText("Pesquisar Pragas");

        jLabel5.setText("Nome da Praga");

        btnMerge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_Compose_2190985.png"))); // NOI18N
        btnMerge.setText("Alterar");
        btnMerge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMergeActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_Plus_2190977.png"))); // NOI18N
        btnSave.setText("Adicionar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_Close_2190987.png"))); // NOI18N
        btnDelete.setText("Excluir");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtNome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMerge)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnMerge)
                    .addComponent(btnDelete))
                .addGap(47, 47, 47))
        );

        jLabel3.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pragas");

        jLabel4.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Endereço");

        jLabel6.setText("Pesquisar Endereço");

        BarraDeBuscaEnd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BarraDeBuscaEndKeyReleased(evt);
            }
        });

        tblEnd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Rua/Ave", "Numero", "CEP", "Complemento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEnd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblEndMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblEnd);

        jLabel7.setText("Rua/Ave");

        btnSave1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_Plus_2190977.png"))); // NOI18N
        btnSave1.setText("Adicionar");
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });

        btnMerge1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_Compose_2190985.png"))); // NOI18N
        btnMerge1.setText("Alterar");
        btnMerge1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMerge1ActionPerformed(evt);
            }
        });

        btnDelete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_Close_2190987.png"))); // NOI18N
        btnDelete1.setText("Excluir");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        jLabel8.setText("CEP");

        jLabel9.setText("Numero");

        jLabel10.setText("Complemento");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(167, 167, 167)
                                .addComponent(jLabel8))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtEnd, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtComp)))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSave1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMerge1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete1)
                .addGap(110, 110, 110))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave1)
                    .addComponent(btnMerge1)
                    .addComponent(btnDelete1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BarraDeBusca))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel6))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BarraDeBuscaEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2)))))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BarraDeBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(BarraDeBuscaEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMergeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMergeActionPerformed
        // TODO add your handling code here:
       if(verificaCamposPragas()){
           Pragas p = new Pragas();
           p.setNome(this.txtNome.getText());
           p.setIdPragas(this.praga.getIdPragas());
           p.alterar();
       }
        limpaCamposPragas();
        this.praga = null;
        this.btnDelete.setEnabled(false);
        this.btnMerge.setEnabled(false);
        atualizarTabelaPragas();
    }//GEN-LAST:event_btnMergeActionPerformed

    private void tblPragasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPragasMousePressed
        // TODO add your handling code here:
        int linhaTabelaPragas = tblPragas.getSelectedRow();
        String id = tblPragas.getModel().getValueAt(linhaTabelaPragas, 0).toString();
        setPragas(Integer.parseInt(id));
        this.ativarBotoesPragas();
        
    }//GEN-LAST:event_tblPragasMousePressed

    private void BarraDeBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BarraDeBuscaKeyReleased
        // TODO add your handling code here:
        limparTabelaPragas();
        PesquisarPragas();
    }//GEN-LAST:event_BarraDeBuscaKeyReleased

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if(verificaCamposPragas()){
            Pragas pragas = criarPraga();
            pragas.armazenar();
        }
        limpaCamposPragas();
        this.praga = null;
        this.btnDelete.setEnabled(false);
        this.btnMerge.setEnabled(false);
        atualizarTabelaPragas();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        this.praga.excluir();
        limpaCamposPragas();
        this.praga = null;
        this.btnDelete.setEnabled(false);
        this.btnMerge.setEnabled(false);
        atualizarTabelaPragas();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void BarraDeBuscaEndKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BarraDeBuscaEndKeyReleased
        // TODO add your handling code here:
        limparTabelaEnd();
        PesquisarEnd();
    }//GEN-LAST:event_BarraDeBuscaEndKeyReleased

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
        // TODO add your handling code here:
        Endereco end;
        if(verificaCamposEnd()){
            try {
                String rua_av = txtEnd.getText();
                int num = Integer.parseInt(txtNum.getText());
                String cep = txtCEP.getText();
                String comp = txtComp.getText();

                end = new Endereco();
                end.setNumero(num);
                end.setComplemento(comp);
                end.setCep(cep);
                end.setRuaAven(rua_av);
                end.armazenar();
                
                limpaCamposEnd();
                this.endereco = null;
                this.btnDelete1.setEnabled(false);
                this.btnMerge1.setEnabled(false);
                atualizarTabelaEnd();
        atualizarTabelaPragas();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Número do endereço deve ser númerico");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Campos em branco");
        }
    }//GEN-LAST:event_btnSave1ActionPerformed

    private void btnMerge1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMerge1ActionPerformed
        // TODO add your handling code here:
        if(verificaCamposEnd()){
           Endereco end = new Endereco();
           end.setIdEndereco(endereco.getIdEndereco());
           end.setRuaAven(this.txtEnd.getText());
           end.setCep(this.txtCEP.getText());
           end.setComplemento(this.txtComp.getText());
           end.setNumero(Integer.parseInt(this.txtNum.getText()));
           end.alterar();
       }
        limpaCamposEnd();
        this.endereco = null;
        this.btnDelete1.setEnabled(false);
        this.btnMerge1.setEnabled(false);
        atualizarTabelaEnd();
    }//GEN-LAST:event_btnMerge1ActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        // TODO add your handling code here:
        this.endereco.excluir();
        limpaCamposEnd();
        this.endereco = null;
        this.btnDelete1.setEnabled(false);
        this.btnMerge1.setEnabled(false);
        atualizarTabelaEnd();
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void tblEndMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEndMousePressed
        // TODO add your handling code here:
        int linhaTabelaEnd = tblEnd.getSelectedRow();
        String id = tblEnd.getModel().getValueAt(linhaTabelaEnd, 0).toString();
        setEnd(Integer.parseInt(id));
        this.ativarBotoesEnd();
    }//GEN-LAST:event_tblEndMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BarraDeBusca;
    private javax.swing.JTextField BarraDeBuscaEnd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnMerge;
    private javax.swing.JButton btnMerge1;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSave1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable tblEnd;
    private javax.swing.JTable tblPragas;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtComp;
    private javax.swing.JTextField txtEnd;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNum;
    // End of variables declaration//GEN-END:variables
}
