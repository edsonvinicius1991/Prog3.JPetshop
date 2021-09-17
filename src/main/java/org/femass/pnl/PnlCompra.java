
package org.femass.pnl;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.femass.dao.ComprasDao;
import org.femass.dao.FornecedorDao;
import org.femass.dao.ProdutoDao;
import org.femass.model.Compra;
import org.femass.model.Fornecedor;
import org.femass.model.ItensCompra;
import org.femass.model.Produto;


public class PnlCompra extends javax.swing.JPanel {
    Compra compra = new Compra();
    ComprasDao comprasDao = new ComprasDao();
    Double soma = 0.0;
    
    public PnlCompra() {
        initComponents();
        compra.setDataVenda();
        TxtData.setText(compra.getDataVenda());
        
        
        try {
            preencherComboFornecedor();
            preencherComboProduto();
        } catch (SQLException ex) {
            Logger.getLogger(PnlCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void preencherComboFornecedor() throws SQLException{
        FornecedorDao fornecedorDao = new FornecedorDao();
        for (Fornecedor item: fornecedorDao.getFornecedor()){
            CbolFornecedor.addItem(item);
        }
    }
    
    public void preencherComboProduto() throws SQLException{
        ProdutoDao produtoDao = new ProdutoDao();
        for (Produto p: produtoDao.consultarTodos()){
            CbolProdutos.addItem(p);
        }
    }
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        LstPedidoCompra = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtNumPedido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtData = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CbolFornecedor = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        CbolProdutos = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtQuantidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        TxtValor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtValorTotal = new javax.swing.JTextField();
        BtnExcluir = new javax.swing.JButton();
        BtnFinalizar = new javax.swing.JButton();
        TxtValorTotalPedido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(LstPedidoCompra);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Nº Pedido");

        TxtNumPedido.setEditable(false);

        jLabel2.setText("Data");

        jLabel3.setText("Fornecedor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(TxtNumPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(TxtData, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CbolFornecedor, 0, 779, Short.MAX_VALUE)
                        .addGap(49, 49, 49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNumPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbolFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Inserir Produtos"));

        CbolProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbolProdutosActionPerformed(evt);
            }
        });

        jLabel4.setText("Produto");

        jLabel5.setText("Quantidade Desejada");

        TxtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtQuantidadeKeyReleased(evt);
            }
        });

        jLabel6.setText("Valor");

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        TxtValor.setEditable(false);

        jLabel7.setText("Valor Total");

        TxtValorTotal.setEditable(false);

        BtnExcluir.setText("Remover");
        BtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TxtValorTotal)
                        .addGap(33, 33, 33)
                        .addComponent(btnAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnExcluir)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(TxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(TxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(CbolProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(35, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CbolProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar)
                    .addComponent(BtnExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BtnFinalizar.setText("Finalizar Pedido");
        BtnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFinalizarActionPerformed(evt);
            }
        });

        jLabel8.setText("Valor Total do Pedido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(TxtValorTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnFinalizar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtValorTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
            ItensCompra itensCompra = new ItensCompra();
        try{

            itensCompra.setProduto((Produto) CbolProdutos.getSelectedItem());
            itensCompra.setQuantidade(Integer.parseInt(TxtQuantidade.getText()));
            this.compra.adicionarLista(itensCompra);
            LstPedidoCompra.setListData(this.compra.getItensCompra().toArray());
         }catch(NumberFormatException e ){
            JOptionPane.showMessageDialog(null, "Insira o valor corretor");
        }
        soma+=valorTotal();

        TxtValorTotalPedido.setText(soma.toString());
        TxtQuantidade.setText("");
        TxtValorTotal.setText("");
                
        this.compra.setTotalVenda(soma);
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void CbolProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbolProdutosActionPerformed
        Produto produto = (Produto) CbolProdutos.getSelectedItem();
        TxtValor.setText(produto.getValorProduto().toString());
       
    }//GEN-LAST:event_CbolProdutosActionPerformed

    private void BtnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFinalizarActionPerformed
        try {
            this.compra.setFornecedor((Fornecedor)CbolFornecedor.getSelectedItem());
            this.comprasDao.gravar(this.compra);
            TxtNumPedido.setText(this.compra.getIdCompra().toString());
            nota();
        } catch (SQLException ex) {
            Logger.getLogger(PnlCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnFinalizarActionPerformed

    private void TxtQuantidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtQuantidadeKeyReleased
        try{
            TxtValorTotal.setText(valorTotal().toString());
        }catch(NumberFormatException e){
            
        }
    }//GEN-LAST:event_TxtQuantidadeKeyReleased

    private void BtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirActionPerformed

        this.compra.getItensCompra().remove(this.compra.getItensCompra().get(LstPedidoCompra.getSelectedIndex()));
        LstPedidoCompra.setListData(this.compra.getItensCompra().toArray());
    }//GEN-LAST:event_BtnExcluirActionPerformed
        
   
    
    private Double valorTotal(){
        Produto produto = (Produto) CbolProdutos.getSelectedItem();
        Double vTotal = produto.getValorProduto()*Integer.parseInt(TxtQuantidade.getText());
        
        return vTotal;
    }
    
    
    private void nota(){
        JOptionPane.showMessageDialog(null, "Número do Pedido: "+this.compra.getIdCompra()
        + "\n\nFornecedor: "+this.compra.getFornecedor().getRazaoSocial()
        +"\nLista de Produtos: \n\t "+this.compra.getItensCompra().toString()
        +"\n\nValor Total do Pedido: "+this.compra.getTotalVenda());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton BtnFinalizar;
    private javax.swing.JComboBox CbolFornecedor;
    private javax.swing.JComboBox CbolProdutos;
    private javax.swing.JList LstPedidoCompra;
    private javax.swing.JTextField TxtData;
    private javax.swing.JTextField TxtNumPedido;
    private javax.swing.JTextField TxtQuantidade;
    private javax.swing.JTextField TxtValor;
    private javax.swing.JTextField TxtValorTotal;
    private javax.swing.JTextField TxtValorTotalPedido;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
