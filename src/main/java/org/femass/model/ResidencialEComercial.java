package org.femass.model;

import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 * @author Gilberto Toledo
 */
public class ResidencialEComercial {
    private String resECom;
    private static final String Formato = "(##)####-####";
    
    public ResidencialEComercial(String C) {
        this.resECom= this.Format(C,false);
    }
    
    public String getResidencialEComercial(boolean Mascara) {
        return Format(this.resECom,Mascara);
    }

    private String Format(String C, boolean Mascara){
        if(Mascara){
            return("("+C.substring(0, 2) + ") " + C.substring(2, 6)+"-"+C.substring(6, 10)) ;
        }else{
            C = C.replace("(","");
            C = C.replace(")","");
            C = C.replace("-","");
            return C;
        }
    }
    
    
    public static DefaultFormatterFactory getFormat(){
        try {
            return new DefaultFormatterFactory(new MaskFormatter(Formato));
        } catch (Exception e) {
            return null;
        }
    }
}
