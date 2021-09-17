
package org.femass.model;


public enum TipoCliente {
    SELECIONAR("Selecionar"),
    PESSOAFISICA("Pessoa Física"),
    PESSOAJURIDICA("Pessoa Jurídica");
    
    private String tipoCliente;

    private TipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    @Override
    public String toString() {
        return tipoCliente;
    }
    
    public static TipoCliente get(String tipoCliente){
      if(tipoCliente.equalsIgnoreCase("Pessoa Física")){
          return TipoCliente.PESSOAFISICA;
      }
      if(tipoCliente.equalsIgnoreCase("Pessoa Jurídica")){
          return TipoCliente.PESSOAJURIDICA;
      }
      return null;
    }
}
    

