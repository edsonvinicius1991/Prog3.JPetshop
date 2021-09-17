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
public enum TipoUf {
    SELECIONAR("Selecionar"),
    AC("AC"),
    AL("AL"),
    AP("AP"),
    AM("AM"),
    BA("BA"),
    CE("CE"),
    DF("DF"),
    ES("ES"),
    GO("GO"),
    MA("MA"),
    MT("MT"),
    MS("MS"),
    MG("MG"),
    PA("PA"),
    PB("PB"),
    PR("PR"),
    PE("PE"),
    PI("PI"),
    RJ("RJ"),
    RN("RN"),
    RS("RS"),
    RO("RO"),
    RR("RR"),
    SC("SC"),
    SP("SP"),
    SE("SE"),
    TO("TO");
    
    
    private String tipoUf;

    private TipoUf(String tipoUf) {
        this.tipoUf = tipoUf;
    }

    public String getTipoUf() {
        return tipoUf;
    }

    @Override
    public String toString() {
        return this.tipoUf;
    }
    
    public static TipoUf get(String tipoUf){
        if(tipoUf.equalsIgnoreCase("AC")){
            return TipoUf.AC;
        }
        if(tipoUf.equalsIgnoreCase("AL")){
            return TipoUf.AL;
        }
        if(tipoUf.equalsIgnoreCase("AP")){
            return TipoUf.AP;
        }
        if(tipoUf.equalsIgnoreCase("AM")){
            return TipoUf.AM;
        }
        if(tipoUf.equalsIgnoreCase("BA")){
            return TipoUf.BA;
        }
        if(tipoUf.equalsIgnoreCase("CE")){
            return TipoUf.CE;
        }    
        if(tipoUf.equalsIgnoreCase("DF")){
            return TipoUf.DF;
        }
        if(tipoUf.equalsIgnoreCase("ES")){
            return TipoUf.ES;
        }
        if(tipoUf.equalsIgnoreCase("GO")){
            return TipoUf.GO;
        }
        if(tipoUf.equalsIgnoreCase("MA")){
            return TipoUf.MA;
        }
        if(tipoUf.equalsIgnoreCase("MT")){
            return TipoUf.MT;
        }
        if(tipoUf.equalsIgnoreCase("MS")){
            return TipoUf.MS;
        }
        if(tipoUf.equalsIgnoreCase("MG")){
            return TipoUf.MG;
        }
        if(tipoUf.equalsIgnoreCase("PA")){
            return TipoUf.PA;
        }
        if(tipoUf.equalsIgnoreCase("PB")){
            return TipoUf.PB;
        }
        if(tipoUf.equalsIgnoreCase("PR")){
            return TipoUf.PR;
        }
        if(tipoUf.equalsIgnoreCase("PE")){
            return TipoUf.PE;
        }
        if(tipoUf.equalsIgnoreCase("PI")){
            return TipoUf.PI;
        }
        if(tipoUf.equalsIgnoreCase("RJ")){
            return TipoUf.RJ;
        }
        if(tipoUf.equalsIgnoreCase("RN")){
            return TipoUf.RN;
        }
        if(tipoUf.equalsIgnoreCase("RS")){
            return TipoUf.RS;
        }
        if(tipoUf.equalsIgnoreCase("RO")){
            return TipoUf.RO;
        }
        if(tipoUf.equalsIgnoreCase("RR")){
            return TipoUf.RR;
        }
        if(tipoUf.equalsIgnoreCase("SC")){
            return TipoUf.SC;
        }
        if(tipoUf.equalsIgnoreCase("SP")){
            return TipoUf.SP;
        }
        if(tipoUf.equalsIgnoreCase("SE")){
            return TipoUf.SE;
        }
        if(tipoUf.equalsIgnoreCase("TO")){
            return TipoUf.TO;
        }
        
        return null;
    }
    
    
}
