
package controller;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Daniel Caumo
 */
public class LimitadorTexto extends PlainDocument{
    
    private int quantidadeMax;
    public LimitadorTexto(int quantidadeMax){
        if(quantidadeMax<=0){
            throw new IllegalArgumentException("Erro ao definir quantidade de caracteres!");
        }else{
            this.quantidadeMax = quantidadeMax;
        }
    }

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if(str == null){
            return;
        }
        int totalCaracteres = (getLength()+str.length());
        if(totalCaracteres<=this.quantidadeMax){
            super.insertString(offs, str.replaceAll("[^a-z^A-Z^' '^!^?!*^á^â^ã^é^ê^í^ó^ô^õ^ú^ü^ç^.^-^@^,]",""),a);   
        }
        String verifica = str.substring(0,getLength()- this.quantidadeMax);
        super.insertString(offs, verifica, a); 
    }
}
