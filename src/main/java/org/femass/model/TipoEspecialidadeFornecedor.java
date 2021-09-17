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
public enum TipoEspecialidadeFornecedor {
    
    SELECIONAR("Selecionar"),
    FORNECEDORACESSORIOS("Fornecedor de Acessórios"),
    FORNECEDORRACAO("Fornecedor de Ração"),
    FORNECEDORREMEDIO("Fornecedor de Remédio");
    
    private String tipoEF;

    private TipoEspecialidadeFornecedor(String tipoEF) {
        this.tipoEF = tipoEF;
    }
    
    public String getTipoEF() {
        return tipoEF;
    }

    @Override
    public String toString() {
        return tipoEF;
    }
    
    
    
}
