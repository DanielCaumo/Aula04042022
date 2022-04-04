
package controller;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Daniel Caumo
 */
public class LimitadorNumeros extends PlainDocument{
    
    private int quantidadeMax;
    public LimitadorNumeros(int quantidadeMax){
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
            super.insertString(offs, str.replaceAll("0-9",""),a);   
        }
        String verifica = str.substring(0,getLength()- this.quantidadeMax);
        super.insertString(offs, verifica, a);
    }
}
