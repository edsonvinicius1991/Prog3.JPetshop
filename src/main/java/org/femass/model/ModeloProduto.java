
package org.femass.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import org.femass.dao.ProdutoDao;


public class ModeloProduto extends AbstractTableModel {

    private List<Produto> produtos = new ArrayList(); 
    private String[] colunas = {"ID","Referencia","Produto","Valor","Estoque"};
    

    public void ModeloProduto() {
        ProdutoDao produtoDao = new ProdutoDao();
        try {
            produtos = produtoDao.consultarTodos();
        } catch (SQLException ex) {
            Logger.getLogger(ModeloProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public int getRowCount() {
        return produtos.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto produto = produtos.get(rowIndex);
        switch(columnIndex){
            case 0:
                return produto.getIdProduto();
            case 1:
                return produto.getTipoReferencia(); 
            case 2:
                return produto.getProduto();
            case 3:
                return produto.getValorProduto();
            case 4:
                return produto.getEstoque();
            default:
                return "";
        }
   
    }

  
    public void setValueAt(String aValue, int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                produtos.get(rowIndex).setIdProduto(Integer.parseInt(aValue));
                break;
            case 1:
                produtos.get(rowIndex).setTipoReferencia(TipoReferencia.valueOf(aValue));
                break;
            case 2:
                produtos.get(rowIndex).setProduto(aValue);
                break;
            case 3:
                produtos.get(rowIndex).setValorProduto(Double.parseDouble(aValue));
                break;
            case 4:
                produtos.get(rowIndex).setEstoque(Integer.parseInt(aValue));
                break;
                
        }
        this.fireTableRowsUpdated(rowIndex, rowIndex);
    }
    
    
    
    @Override
    public String getColumnName(int coluna) {
        //Produto produto = produtos.get(rowIndex);
        switch(coluna){
            case 0:
                return "ID";
            case 1:
                return "Referencia"; 
            case 2:
                return "Produto";
            case 3:
                return "Valor";
            case 4:
                return "Estoque";
            default:
                return "";
        }
   
    }
    
    public Produto getProduto(int linha){
        return produtos.get(linha);
    }
    
    
    public void adicionar(Produto produto){
        produtos.add(produto);
        
        this.fireTableDataChanged();
    }
    
    public void excluir(int produto){
        produtos.remove(produto);
        this.fireTableRowsDeleted(produto, produto);
    }
    
}
