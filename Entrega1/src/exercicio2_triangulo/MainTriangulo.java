/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2_triangulo;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class MainTriangulo {

    
    public static void main(String[] args) {
        Triangulo t = new Triangulo();
        DecimalFormat df = new DecimalFormat(".00");
        
        t.setBase(Double.parseDouble( 
        JOptionPane.showInputDialog(null, "Informe a base do triângulo em metros: ","BASE DO TRIANGULO", JOptionPane.QUESTION_MESSAGE)));
        t.setAltura(Double.parseDouble( 
        JOptionPane.showInputDialog(null, "Informe a altura do triângulo em metros: ","ALTURA DO TRIÂNGULO", JOptionPane.QUESTION_MESSAGE)));
        JOptionPane.showMessageDialog(null,"Área do triângulo: "+df.format(t.calcularArea())+"m²","ÁREA DO TRIÂNGULO", JOptionPane.INFORMATION_MESSAGE); 
    }
    
}
