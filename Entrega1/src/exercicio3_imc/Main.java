/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio3_imc;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Main {

    
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        DecimalFormat df = new DecimalFormat(".00");
        
        p.setAltura(Double.parseDouble( 
        JOptionPane.showInputDialog(null, "Informe a altura em metros: ","ALTURA",JOptionPane.QUESTION_MESSAGE)));
        p.setMassa(Double.parseDouble( 
        JOptionPane.showInputDialog(null, "Informe a massa corporal em quilos: ","MASSA",JOptionPane.QUESTION_MESSAGE)));
        JOptionPane.showMessageDialog(null,"O índice de IMC dessa pessoa é: "+df.format(p.calcularImc()),"IMC",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
