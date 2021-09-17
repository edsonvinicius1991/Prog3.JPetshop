package org.femass.model;

import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 * @author Gilberto Toledo
 */
public class Selecionar {
    private String selecionar;
    private static final String Formato = "";
    
    public Selecionar(String C) {
        this.selecionar = this.Format(C,false);
    }

    public static DefaultFormatterFactory getFormat(){
        try {
            return new DefaultFormatterFactory(new MaskFormatter(Formato));
        } catch (Exception e) {
            return null;
        }
    }

    private String Format(String C, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
