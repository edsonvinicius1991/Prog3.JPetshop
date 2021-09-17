
package org.femass.model;


public enum TipoContato {

    SELECIONAR("Selecionar"),
    RESIDENCIAL("Residencial"),
    COMERCIAL("Comercial"),
    CELULAR("Celular");
    
    private String tipoContato;

    private TipoContato(String tipoContato) {
        this.tipoContato = tipoContato;
    }

    public String getTipoContato() {
        return tipoContato;
    }

    @Override
    public String toString() {
        return tipoContato;
    }
    
    public static TipoContato get(String tipoContato){
        if(tipoContato.equalsIgnoreCase("Residencial")){
            return TipoContato.RESIDENCIAL;
        }
        if(tipoContato.equalsIgnoreCase("Comercial")){
            return TipoContato.COMERCIAL;
        }
        if(tipoContato.equalsIgnoreCase("Celular")){
            return TipoContato.CELULAR;
        }
        return null;
    }
    
}
