
package org.femass.gui;

import org.femass.pnl.PnlCliente;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.femass.dao.AnimalDao;
import org.femass.model.Animal;
import org.femass.model.Cliente;


public class GuiClienteAnimal extends javax.swing.JDialog {
    
    private boolean alterando;
    private Animal animal;
    private Cliente cliente;
    
    public GuiClienteAnimal(java.awt.Frame parent, boolean modal, Cliente cliente) {
        super(parent, modal);
        initComponents();
        this.cliente = cliente;
        TxtResponsavelAnimal.setText(cliente.getNomeCliente());
        try{
            LstAnimais.setListData(new AnimalDao().getAnimais(cliente).toArray());
        }catch(SQLException e){
            Logger.getLogger(GuiClienteAnimal.class.getName()).log(Level.SEVERE, null, e);
        }
    
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnGravar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TxtNomeAnimal = new javax.swing.JTextField();
        LblCliente = new javax.swing.JLabel();
        TxtResponsavelAnimal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtTipoAnimal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtRaca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        LstAnimais = new javax.swing.JList();
        TxtIdAnimal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BtnInserir = new javax.swing.JButton();
        BtnAlterar = new javax.swing.JButton();
        BtnExcluir = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BtnGravar.setText("Gravar");
        BtnGravar.setEnabled(false);
        BtnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGravarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome do animal");

        TxtNomeAnimal.setEditable(false);

        LblCliente.setText("Cliente");

        TxtResponsavelAnimal.setEditable(false);

        jLabel3.setText("Tipo de Animal");

        TxtTipoAnimal.setEditable(false);

        jLabel4.setText("Raça");

        TxtRaca.setEditable(false);

        LstAnimais.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                LstAnimaisValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(LstAnimais);

        TxtIdAnimal.setEditable(false);

        jLabel2.setText("ID");

        BtnInserir.setText("Inserir");
        BtnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInserirActionPerformed(evt);
            }
        });

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

        BtnCancelar.setText("Cancelar");
        BtnCancelar.setEnabled(false);
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtTipoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtIdAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblCliente)
                            .addComponent(TxtResponsavelAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BtnAlterar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnInserir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(LblCliente)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtResponsavelAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtIdAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtTipoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnGravar)
                        .addGap(3, 3, 3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(BtnInserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnCancelar)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGravarActionPerformed
        Animal animal = new Animal();
        animal.setNome_animal(TxtNomeAnimal.getText());
        animal.setAnimal(TxtTipoAnimal.getText());
        animal.setRaca(TxtRaca.getText());
        animal.setDono(cliente);
        
        if(TxtIdAnimal == null){
            this.cliente.adicionarAnimal(animal);
        } 
        
        try {
            if(alterando){
                animal.setIdAnimal(Integer.valueOf(TxtIdAnimal.getText()));
                new AnimalDao().alterar(animal);
            }else{
                new AnimalDao().gravar(animal);
                TxtIdAnimal.setText(animal.getIdAnimal().toString());
            }
            
            LstAnimais.setListData(this.cliente.getAnimais().toArray());
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        try {
            LstAnimais.setListData(new AnimalDao().getAnimais(this.cliente).toArray());
        } catch (SQLException ex) {
            Logger.getLogger(PnlCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        desabilitarTela();
        
        
    }//GEN-LAST:event_BtnGravarActionPerformed

    private void LstAnimaisValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_LstAnimaisValueChanged
        
        if(!LstAnimais.isSelectionEmpty()){
            Animal animal = (Animal)LstAnimais.getSelectedValue();
            TxtNomeAnimal.setText(animal.getNome_animal());
            TxtResponsavelAnimal.setText(cliente.getNomeCliente());
            TxtRaca.setText(animal.getAnimal());
            TxtTipoAnimal.setText(animal.getAnimal());
            TxtIdAnimal.setText(animal.getIdAnimal().toString());
        }
    }//GEN-LAST:event_LstAnimaisValueChanged

    private void BtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirActionPerformed
       if(JOptionPane.showConfirmDialog(null, "Deseja excluir o Registro?","Pergunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)== JOptionPane.YES_OPTION){
            Animal animal1 = (Animal)LstAnimais.getSelectedValue();
            try {
                new AnimalDao().excluir(animal1);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }
            try {
                LstAnimais.setListData(new AnimalDao().getAnimais(this.cliente).toArray());
            } catch (SQLException ex) {
                Logger.getLogger(PnlCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            limparTela();
        }
    }//GEN-LAST:event_BtnExcluirActionPerformed

    private void BtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAlterarActionPerformed
        if(!LstAnimais.isSelectionEmpty()){
            this.animal = (Animal) LstAnimais.getSelectedValue();
            alterando = true;
            habilitarTela();
            TxtNomeAnimal.requestFocus();
        }
        else{
            JOptionPane.showMessageDialog(null, "Selecione um usuário");
        }
    }//GEN-LAST:event_BtnAlterarActionPerformed

    private void BtnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInserirActionPerformed
        this.animal = new Animal();
        alterando = false;
        habilitarTela();
        TxtNomeAnimal.requestFocus();
        limparTela();
    }//GEN-LAST:event_BtnInserirActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        desabilitarTela();
        limparTela();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    
    
    
       private void desabilitarTela(){
        TxtNomeAnimal.setEditable(false);
        TxtRaca.setEditable(false);
        TxtTipoAnimal.setEditable(false);
        
        
        BtnAlterar.setEnabled(true);
        BtnCancelar.setEnabled(false);
        BtnExcluir.setEnabled(true);
        BtnGravar.setEnabled(false);
        BtnInserir.setEnabled(true);
        LstAnimais.setEnabled(true);
    }
   
    private void habilitarTela(){
        TxtNomeAnimal.setEditable(true);
        TxtRaca.setEditable(true);
        TxtTipoAnimal.setEditable(true);
        
        
        BtnAlterar.setEnabled(false);
        BtnCancelar.setEnabled(true);
        BtnExcluir.setEnabled(false);
        BtnGravar.setEnabled(true);
        BtnInserir.setEnabled(false);
        LstAnimais.setEnabled(false);
    }
    
    
    private void limparTela(){
        TxtNomeAnimal.setText("");
        TxtRaca.setText("");
        TxtTipoAnimal.setText("");
    }    
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAlterar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton BtnGravar;
    private javax.swing.JButton BtnInserir;
    private javax.swing.JLabel LblCliente;
    private javax.swing.JList LstAnimais;
    private javax.swing.JTextField TxtIdAnimal;
    private javax.swing.JTextField TxtNomeAnimal;
    private javax.swing.JTextField TxtRaca;
    private javax.swing.JTextField TxtResponsavelAnimal;
    private javax.swing.JTextField TxtTipoAnimal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
