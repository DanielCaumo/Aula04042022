/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio1_quadrado;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class MainQuadrado {


    public static void main(String[] args) {
        Quadrado q = new Quadrado();
        DecimalFormat df = new DecimalFormat(".00");
        
        q.setLado(Double.parseDouble( 
        JOptionPane.showInputDialog(null, "Informe o lado do quadrado em metros: ","LADO DO QUADRADO", JOptionPane.QUESTION_MESSAGE)));
        JOptionPane.showMessageDialog(null,"Área do quadrado: "+df.format(q.calcularArea())+"m²","ÁREA DO QUADRADO", JOptionPane.INFORMATION_MESSAGE); 
    }
}
