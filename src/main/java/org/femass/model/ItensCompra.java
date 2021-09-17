
package org.femass.model;


public class ItensCompra {
    
    private Produto produto;
    private Compra compra;
    private Integer quantidade;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return produto + " - QTD: " + quantidade + " - Valor: " + (this.produto.getValorProduto() * this.quantidade) ;
    }
    
    
       
}
