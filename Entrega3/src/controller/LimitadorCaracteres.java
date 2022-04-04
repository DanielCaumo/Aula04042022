/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Ângela
 */
public class LimitadorCaracteres extends PlainDocument {
    
    private int quantidadeMax;
    
    //construtor
    public LimitadorCaracteres(int quantidadeMax){ 
        if(quantidadeMax<=0){
            throw new IllegalArgumentException("Erro ao definir quantidade de caracteres!");
        }else{
            this.quantidadeMax = quantidadeMax;
        }
    } // fecha construtor

    // método nativo do Java para...
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        /*
        offs - posição do texto
        str 0 texto que o usuário digita
        a - atributo que verifica se aceita letras, numeros, caracteres especiais, etc.
        */
        // se o usuario não digitou nenhum caractere, então ele pode continuar a ação de digitar;
        if(str == null){
            return;
        }
        //calcular número de caracteres digitados;
        int totalCaracteres = (getLength()+str.length());
        if(totalCaracteres<-this.quantidadeMax){
            super.insertString(offs, str.replaceAll("[^a-z^A-Z^' '^!^?!*^á^ê^í]",""),a);
            // aceitar minúsculas: ^a-z^
            // aceitar maiúsculas: ^A-Z^
            // aceitar números: ^0-9^
            // aceitar espaço: ^' '^
            // aceitar símbolos (digitar símbolos aceitados, ex: ("[^a-z^A-Z^' '^!^?!*]","")
        }
        // toda vez que o usuário digitar um caractere não autorizado, a classe não contabilizará na contagem máxima,
        // nem mostrará o caractere ao usuário, na aplicação.
        String verifica = str.substring(0,getLength()-quantidadeMax);
        
        super.insertString(offs, verifica ,a);
       
    }
    
}
