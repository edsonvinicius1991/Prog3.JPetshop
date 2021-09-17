
package org.femass.model;

public enum TipoReferencia {
    SELECIONAR("Selecionar"),
    RACAO("Ração"),
    ACESSORIOS("Acessórios"),
    VERMIFUGO("Vermifugo"),
    COLEIRA("Coleira");

    static TipoReferencia valueOf() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    private String nome;

    private TipoReferencia(String _nome) {
        this.nome = _nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    public static TipoReferencia get(String _nome){
        if (_nome.equalsIgnoreCase("Ração")) {
            return TipoReferencia.RACAO;
        }
        if (_nome.equalsIgnoreCase("Acessórios")) {
            return TipoReferencia.ACESSORIOS;
        }
        if (_nome.equalsIgnoreCase("Vermifugo")) {
            return TipoReferencia.VERMIFUGO;
        }
        if (_nome.equalsIgnoreCase("Coleira")) {
            return TipoReferencia.COLEIRA;
        }
        return null;
    }
}
