/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3_imc;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Pessoa {
    private double massa, altura;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calcularImc(){
        return this.massa/(Math.pow(this.altura, 2));
    }
    
}
