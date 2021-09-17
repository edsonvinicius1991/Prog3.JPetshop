
package org.femass.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class Compra {
    
    private Integer idCompra;
    private Fornecedor fornecedor;
    private String dataVenda;
    private Double totalVenda;
    private List<ItensCompra> itensCompra = new ArrayList();
    

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda() {
        this.dataVenda = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public Double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(Double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public void adicionarLista(ItensCompra itensCompra){
        this.itensCompra.add(itensCompra);
    }

    public void removerLista(ItensCompra itensCompra){
        this.itensCompra.remove(itensCompra);
    }
    
    public List<ItensCompra> getItensCompra() {
        return this.itensCompra;
    }
    
    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + idCompra + ", fornecedor=" + fornecedor + ", dataVenda=" + dataVenda + ", totalVenda=" + totalVenda + '}';
    }
    
    
    
}
