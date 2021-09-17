/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.femass.model;

/**
 *
 * @author leome
 */
public class Produto {
    
    private Integer idProduto;
    private TipoReferencia tipoReferencia;
    private String produto;
    private Double valorProduto;
    private Integer estoque = 0;

    public Produto(TipoReferencia tipoReferencia, String produto, double valorProduto, Integer estoque) {
        this.tipoReferencia = tipoReferencia;
        this.produto = produto;
        this.valorProduto = valorProduto;
        this.estoque = estoque;
    }

    public Produto() {
    }

   

    
    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public TipoReferencia getTipoReferencia() {
        return tipoReferencia;
    }

    public void setTipoReferencia(TipoReferencia tipoReferencia) {
        this.tipoReferencia = tipoReferencia;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }
    
    public Object[] carregadDados(){
        return new Object[] {idProduto,tipoReferencia,produto,valorProduto,estoque};
    }

    @Override
    public String toString() {
        return tipoReferencia + " - " + produto;
    }
    
}
