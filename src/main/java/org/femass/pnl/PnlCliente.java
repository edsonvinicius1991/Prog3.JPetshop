package org.femass.pnl;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.femass.dao.AnimalDao;
import org.femass.dao.ClienteDao;
import org.femass.gui.GuiClienteAnimal;
import org.femass.model.Celular;
import org.femass.model.Cliente;
import org.femass.model.ResidencialEComercial;
import org.femass.model.Selecionar;
import org.femass.model.TipoContato;
import org.femass.model.WebServiceCep;


public class PnlCliente extends javax.swing.JPanel {

    private boolean alterando;
    private Cliente cliente;
    
    
    
    public PnlCliente(){
        initComponents();
        try{
            LstCliente.setListData(new ClienteDao().getClientes().toArray());
        }catch(SQLException e){
            Logger.getLogger(PnlCliente.class.getName()).log(Level.SEVERE, null, e);
        }
        preencherCombosTipoContato();
        
    }
    
    private void preencherCombosTipoContato(){
        for(TipoContato tipo1: TipoContato.values()){
            CbolTipoContato.addItem(tipo1);
        }
    }
    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        TxtNomeCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TxtIdCliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TxtCpf = new javax.swing.JFormattedTextField();
        CbolTipoContato = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TxtTelefone = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        TxtEmail = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        TxtLogradouro = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        TxtBairro = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        TxtCidade = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        TxtCep = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        TxtUf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        LstCliente = new javax.swing.JList();
        BtnAlterar = new javax.swing.JButton();
        BtnExcluir = new javax.swing.JButton();
        BtnAnimal = new javax.swing.JButton();
        BtnGravar = new javax.swing.JButton();
        BtnIncluir = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));

        jLabel8.setText("Nome");

        TxtNomeCliente.setEditable(false);

        jLabel9.setText("ID");

        TxtIdCliente.setEditable(false);

        jLabel10.setText("CPF");

        TxtCpf.setEditable(false);
        try {
            TxtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        CbolTipoContato.setEnabled(false);
        CbolTipoContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbolTipoContatoActionPerformed(evt);
            }
        });

        jLabel11.setText("Tipo de Contato");

        jLabel12.setText("Telefone");

        TxtTelefone.setEditable(false);
        try {
            TxtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTelefoneActionPerformed(evt);
            }
        });

        jLabel13.setText("Email");

        TxtEmail.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(TxtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(TxtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(TxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(CbolTipoContato, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(TxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(TxtEmail))))
                .addGap(12, 12, 12))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtCpf, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbolTipoContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        jLabel14.setText("CEP");

        jLabel15.setText("Logradouro");

        TxtLogradouro.setEditable(false);

        jLabel17.setText("Bairro");

        TxtBairro.setEditable(false);

        jLabel18.setText("Cidade");

        TxtCidade.setEditable(false);

        jLabel19.setText("UF");

        TxtCep.setEditable(false);
        try {
            TxtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TxtUf.setEditable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(TxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(TxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(TxtUf, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(TxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(354, 354, 354))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(TxtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LstCliente.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                LstClienteValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(LstCliente);

        BtnAlterar.setText("Alterar");
        BtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAlterarActionPerformed(evt);
            }
        });

        BtnExcluir.setText("Excluir");
        BtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluirActionPerformed(evt);
            }
        });

        BtnAnimal.setText("Animal");
        BtnAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnimalActionPerformed(evt);
            }
        });

        BtnGravar.setText("Gravar");
        BtnGravar.setEnabled(false);
        BtnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGravarActionPerformed(evt);
            }
        });

        BtnIncluir.setText("Incluir");
        BtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIncluirActionPerformed(evt);
            }
        });

        BtnCancelar.setText("Cancelar");
        BtnCancelar.setEnabled(false);
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnAnimal)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnAlterar)
                            .addComponent(BtnExcluir)
                            .addComponent(BtnGravar)
                            .addComponent(BtnIncluir)
                            .addComponent(BtnCancelar))
                        .addContainerGap(28, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGravarActionPerformed
        cliente.setCpfCliente(TxtCpf.getText());
        cliente.setNomeCliente(TxtNomeCliente.getText());
        cliente.setTipoContato((TipoContato)CbolTipoContato.getSelectedItem());
        cliente.setTelefone(TxtTelefone.getText());
        cliente.setCep(TxtCep.getText());
        cliente.setLogradouro(TxtLogradouro.getText());
        cliente.setBairro(TxtBairro.getText());
        cliente.setCidade(TxtCidade.getText());
        cliente.setTipoUf(TxtUf.getText());
        cliente.setEmail(TxtEmail.getText());

        try {
            if(alterando){
                new ClienteDao().alterar(cliente);
            }else{
                new ClienteDao().gravar(cliente);
                TxtIdCliente.setText(cliente.getIdCliente().toString());
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        try {
            LstCliente.setListData(new ClienteDao().getClientes().toArray());
        } catch (SQLException ex) {
            Logger.getLogger(PnlCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        desabilitarTela();
        
    }//GEN-LAST:event_BtnGravarActionPerformed

    private void BtnAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnimalActionPerformed
        this.cliente = (Cliente)LstCliente.getSelectedValue();
        new GuiClienteAnimal(null, true, this.cliente).setVisible(true);
    }//GEN-LAST:event_BtnAnimalActionPerformed

    private void BtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Deseja excluir o Registro?","Pergunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)== JOptionPane.YES_OPTION){
            Cliente cliente = (Cliente)LstCliente.getSelectedValue();
            try {
                new ClienteDao().excluir(cliente);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }
            try {
                LstCliente.setListData(new ClienteDao().getClientes().toArray());
            } catch (SQLException ex) {
                Logger.getLogger(PnlCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            limparTela();
        }
    }//GEN-LAST:event_BtnExcluirActionPerformed

    private void LstClienteValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_LstClienteValueChanged
        
        AnimalDao animalDao = new AnimalDao();
        
        if(!LstCliente.isSelectionEmpty()){
            try {
                Cliente cliente = (Cliente)LstCliente.getSelectedValue();
                TxtIdCliente.setText(cliente.getIdCliente().toString());
                TxtCpf.setText(cliente.getCpfCliente());
                TxtNomeCliente.setText(cliente.getNomeCliente());
//                String tel = cliente.getTelefone();
//                cliente.setTelefone(tel.replace("(", "").replace(")", "").replace("-", ""));
//                System.out.println("Telefone: " + telEdt);
                TxtTelefone.setText(cliente.getTelefone());
                CbolTipoContato.setSelectedItem(cliente.getTipoContato());
                TxtCep.setText(cliente.getCep());
                TxtLogradouro.setText(cliente.getLogradouro());
                TxtBairro.setText(cliente.getBairro());
                TxtCidade.setText(cliente.getCidade());
                TxtUf.setText(cliente.getTipoUf());
                TxtEmail.setText(cliente.getEmail());
                
                cliente.setAnimais(animalDao.getAnimais(cliente));
                
                
            } catch (SQLException ex) {
                Logger.getLogger(PnlCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_LstClienteValueChanged

    private void BtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAlterarActionPerformed
        
        if(!LstCliente.isSelectionEmpty()){
            this.cliente = (Cliente) LstCliente.getSelectedValue();
            alterando = true;
            habilitarTela();
            TxtNomeCliente.requestFocus();
        }
        else{
            JOptionPane.showMessageDialog(null, "Selecione um usuário");
        }
    }//GEN-LAST:event_BtnAlterarActionPerformed

    private void BtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIncluirActionPerformed
        this.cliente = new Cliente();
        alterando = false;
        habilitarTela();
        TxtNomeCliente.requestFocus();
        limparTela();
    }//GEN-LAST:event_BtnIncluirActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        desabilitarTela();
        limparTela();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Faz a busca para o cep 58043-280
        WebServiceCep webServiceCep = WebServiceCep.searchCep(TxtCep.getText());
        //A ferramenta de busca ignora qualquer caracter que n?o seja n?mero.

        //caso a busca ocorra bem, imprime os resultados.
        if (webServiceCep.wasSuccessful()) {
            TxtLogradouro.setText(webServiceCep.getLogradouroFull());
            TxtCidade.setText(webServiceCep.getCidade());
            TxtBairro.setText(webServiceCep.getBairro());
            TxtUf.setText(webServiceCep.getUf());

            //caso haja problemas imprime as exce??es.
        }

        else {
            JOptionPane.showMessageDialog(null, "Erro numero: " + webServiceCep.getResulCode());

            JOptionPane.showMessageDialog(null, "Descrição do erro: " + webServiceCep.getResultText());
        }
               
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CbolTipoContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbolTipoContatoActionPerformed
        int tipoContato = CbolTipoContato.getSelectedIndex();
        TxtTelefone.setValue(null);
        switch(tipoContato){
            case 0:
            TxtTelefone.setFormatterFactory(Selecionar.getFormat());
            break;
            case 1:
            TxtTelefone.setFormatterFactory(ResidencialEComercial.getFormat());
            break;
            case 2:
            TxtTelefone.setFormatterFactory(ResidencialEComercial.getFormat());
            break;
            case 3:
            TxtTelefone.setFormatterFactory(Celular.getFormat());
            break;

        }
    }//GEN-LAST:event_CbolTipoContatoActionPerformed

    private void TxtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTelefoneActionPerformed


    
   
    private void habilitarTela(){
        TxtCpf.setEditable(true);
        TxtNomeCliente.setEditable(true);
        TxtTelefone.setEditable(true);
        CbolTipoContato.setEditable(true);
        CbolTipoContato.setEnabled(true);
        TxtCep.setEditable(true);
        TxtLogradouro.setEditable(true);
        TxtBairro.setEditable(true);
        TxtCidade.setEditable(true);
        TxtUf.setEnabled(true);
        TxtEmail.setEditable(true);
        
        BtnAlterar.setEnabled(false);
        BtnCancelar.setEnabled(true);
        BtnExcluir.setEnabled(false);
        BtnGravar.setEnabled(true);
        BtnIncluir.setEnabled(false);
        LstCliente.setEnabled(false);
    }
    
    private void desabilitarTela(){
        TxtCpf.setEditable(false);
        TxtNomeCliente.setEditable(false);
        TxtTelefone.setEditable(false);
        CbolTipoContato.setEditable(false);
        CbolTipoContato.setEnabled(false);
        TxtCep.setEditable(false);
        TxtLogradouro.setEditable(false);
        TxtBairro.setEditable(false);
        TxtCidade.setEditable(false);
        TxtUf.setEditable(false);
        TxtEmail.setEditable(false);
        
        BtnAlterar.setEnabled(true);
        BtnCancelar.setEnabled(false);
        BtnExcluir.setEnabled(true);
        BtnGravar.setEnabled(false);
        BtnIncluir.setEnabled(true);
        LstCliente.setEnabled(true);
    }
    
    private void limparTela(){
        TxtIdCliente.setText("");
        TxtCpf.setText("");
        TxtNomeCliente.setText("");
        TxtTelefone.setText("");
        CbolTipoContato.setSelectedItem("Selecionar");
        TxtCep.setText("");
        TxtLogradouro.setText("");
        TxtBairro.setText("");
        TxtCidade.setText("");
        TxtUf.setText("");
        TxtEmail.setText("");
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAlterar;
    private javax.swing.JButton BtnAnimal;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton BtnGravar;
    private javax.swing.JButton BtnIncluir;
    private javax.swing.JComboBox CbolTipoContato;
    private javax.swing.JList LstCliente;
    private javax.swing.JTextField TxtBairro;
    private javax.swing.JFormattedTextField TxtCep;
    private javax.swing.JTextField TxtCidade;
    private javax.swing.JFormattedTextField TxtCpf;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtIdCliente;
    private javax.swing.JTextField TxtLogradouro;
    private javax.swing.JTextField TxtNomeCliente;
    private javax.swing.JFormattedTextField TxtTelefone;
    private javax.swing.JTextField TxtUf;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
