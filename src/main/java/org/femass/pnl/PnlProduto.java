
package org.femass.pnl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import org.femass.dao.ProdutoDao;
import org.femass.model.Cliente;
import org.femass.model.ModeloProduto;



import org.femass.model.Produto;
import org.femass.model.TipoReferencia;



public class PnlProduto extends javax.swing.JPanel {

    ModeloProduto tabela = new ModeloProduto();
    private Produto produto;
    private List<Produto> produtos = new ArrayList();
    private boolean alterando;
    
    

    public PnlProduto() throws SQLException {
        initComponents();
        TblProdutos.setModel(tabela);
        preencherCombosTipoReferencia();
        ProdutoDao produtoDao = new ProdutoDao();
        produtos = produtoDao.consultarTodos();
        
        for(Produto p: produtos){
            Object dados[] = {p.getIdProduto(),p.getTipoReferencia(),p.getProduto(),p.getValorProduto(),p.getEstoque()};
            tabela.adicionar(p);
        }
    }
    
    private void preencherCombosTipoReferencia(){
        for(TipoReferencia tipoReferencia: TipoReferencia.values()){
            CbolTipoReferencia.addItem(tipoReferencia);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        TblProdutos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtIdProduto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CbolTipoReferencia = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        TxtProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtValor = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtQuantidade = new javax.swing.JTextField();
        BtnLimpar = new javax.swing.JButton();
        BtnGravar = new javax.swing.JButton();
        BtnExcluir = new javax.swing.JButton();
        BtnAlterar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        BtnInserir = new javax.swing.JButton();

        TblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Referência", "Produto", "Valor", "Estoque"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblProdutosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TblProdutos);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro Produto"));

        jLabel1.setText("ID");

        TxtIdProduto.setEditable(false);

        jLabel2.setText("Referencia do Produto");

        CbolTipoReferencia.setEnabled(false);

        jLabel3.setText("Produto");

        TxtProduto.setEditable(false);

        jLabel4.setText("Valor");

        TxtValor.setEditable(false);
        TxtValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        jLabel5.setText("Quantidade");

        TxtQuantidade.setEditable(false);

        BtnLimpar.setText("Limpar Campos");
        BtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(TxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(136, 136, 136)
                                .addComponent(BtnLimpar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(CbolTipoReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(TxtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbolTipoReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnLimpar))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        BtnGravar.setText("Gravar");
        BtnGravar.setEnabled(false);
        BtnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGravarActionPerformed(evt);
            }
        });

        BtnExcluir.setText("Excluir");
        BtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluirActionPerformed(evt);
            }
        });

        BtnAlterar.setText("Alterar");
        BtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAlterarActionPerformed(evt);
            }
        });

        BtnCancelar.setText("Cancelar");
        BtnCancelar.setEnabled(false);
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnInserir.setText("Inserir");
        BtnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(BtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGravar)
                    .addComponent(BtnExcluir)
                    .addComponent(BtnAlterar)
                    .addComponent(BtnInserir)
                    .addComponent(BtnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGravarActionPerformed
            
        if(alterando){
            Produto p = tabela.getProduto(TblProdutos.getSelectedRow());
            if (TblProdutos.getSelectedRow() != -1) {

                tabela.setValueAt(CbolTipoReferencia.getSelectedItem(), TblProdutos.getSelectedRow(), 1);
                tabela.setValueAt(TxtProduto.getText(), TblProdutos.getSelectedRow(), 2);
                tabela.setValueAt(TxtValor.getText(), TblProdutos.getSelectedRow(), 3);
                tabela.setValueAt(TxtQuantidade.getText(), TblProdutos.getSelectedRow(), 4);
            }
            ProdutoDao pDao = new ProdutoDao();
            try {
                pDao.alterar(p);
            } catch (SQLException ex) {
                Logger.getLogger(PnlProduto.class.getName()).log(Level.SEVERE, null, ex);
            }

        }else{
            produto = new Produto();
            produto.setTipoReferencia((TipoReferencia) CbolTipoReferencia.getSelectedItem());
            produto.setProduto(TxtProduto.getText());
            produto.setValorProduto(((Number) TxtValor.getValue()).doubleValue());
            produto.setEstoque(Integer.parseInt(TxtQuantidade.getText()));
        
            //AbstractModel//
            tabela.adicionar(produto);
            
            ProdutoDao produtoDao = new ProdutoDao();
            //Produto produto = new Produto(this.produto.getTipoReferencia(),this.produto.getProduto(),this.produto.getValorProduto(),this.produto.getEstoque());
            produtoDao.salvar(produto);
            TxtIdProduto.setText(produto.getIdProduto().toString());
        }
            limparTela();
        
        desabilitarTela();
    }//GEN-LAST:event_BtnGravarActionPerformed

    private void BtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirActionPerformed
        
        if(JOptionPane.showConfirmDialog(null, "Deseja excluir o Registro?","Pergunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)== JOptionPane.YES_OPTION){
        
            Produto p = new Produto();
            ProdutoDao pDao = new ProdutoDao();

            int index = TblProdutos.getSelectedRow();
            try {
                p = pDao.consultarTodos().get(index);
            } catch (SQLException ex) {
                Logger.getLogger(PnlProduto.class.getName()).log(Level.SEVERE, null, ex);
            }


            if(TblProdutos.getSelectedRow()!=-1){
                tabela.excluir(TblProdutos.getSelectedRow());
            }
                try {
                    new ProdutoDao().excluir(p);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }

            limparTela();
        }
        
    }//GEN-LAST:event_BtnExcluirActionPerformed

    private void BtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAlterarActionPerformed
            habilitarTela();
            alterando=true;
    }//GEN-LAST:event_BtnAlterarActionPerformed

    private void TblProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblProdutosMouseClicked
        
        Produto p = tabela.getProduto(TblProdutos.getSelectedRow());
        TxtIdProduto.setText(String.valueOf(p.getIdProduto()));
        CbolTipoReferencia.setSelectedItem((TipoReferencia)p.getTipoReferencia());
        TxtProduto.setText(p.getProduto());
        TxtValor.setText(String.valueOf(p.getValorProduto()));
        TxtQuantidade.setText(String.valueOf(p.getEstoque()));
        
        
    }//GEN-LAST:event_TblProdutosMouseClicked

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        desabilitarTela();
        limparTela();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInserirActionPerformed
        this.produto = new Produto();
        habilitarTela();
        TxtProduto.requestFocus();
        limparTela();
    }//GEN-LAST:event_BtnInserirActionPerformed

    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed
        limparTela();
    }//GEN-LAST:event_BtnLimparActionPerformed

    public boolean validarDados() {
        boolean valido = true;
        produto = new Produto();
        if (TxtProduto.getText().isEmpty()||TxtQuantidade.getText().isEmpty()||TxtValor.getText().isEmpty()) {
            valido = false;
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        }
        try{
            Double.valueOf(TxtValor.getValue().hashCode());
            Integer.valueOf(TxtQuantidade.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Insira números nos campos de valor e estoque");
        }
        
        return valido;
    }


    
    private void limparTela() {
        TxtIdProduto.setText("");
        CbolTipoReferencia.setSelectedItem("Selecionar");
        TxtProduto.setText("");
        TxtValor.setText("");
        TxtQuantidade.setText("");
    }
    
        private void habilitarTela(){
        CbolTipoReferencia.setEditable(true);
        CbolTipoReferencia.setEnabled(true);
        TxtProduto.setEditable(true);
        TxtValor.setEditable(true);
        TxtQuantidade.setEditable(true);
        
        
        BtnAlterar.setEnabled(false);
        BtnCancelar.setEnabled(true);
        BtnExcluir.setEnabled(false);
        BtnGravar.setEnabled(true);
        BtnInserir.setEnabled(false);
        TblProdutos.setEnabled(false);
    }
    
    private void desabilitarTela(){
        CbolTipoReferencia.setEditable(false);
        CbolTipoReferencia.setEnabled(false);
        TxtProduto.setEditable(false);
        TxtValor.setEditable(false);
        
        BtnAlterar.setEnabled(true);
        BtnLimpar.setEnabled(false);
        BtnCancelar.setEnabled(false);
        BtnExcluir.setEnabled(true);
        BtnGravar.setEnabled(false);
        BtnInserir.setEnabled(true);
        TblProdutos.setEnabled(true);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAlterar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton BtnGravar;
    private javax.swing.JButton BtnInserir;
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JComboBox CbolTipoReferencia;
    private javax.swing.JTable TblProdutos;
    private javax.swing.JTextField TxtIdProduto;
    private javax.swing.JTextField TxtProduto;
    private javax.swing.JTextField TxtQuantidade;
    private javax.swing.JFormattedTextField TxtValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

   
}
