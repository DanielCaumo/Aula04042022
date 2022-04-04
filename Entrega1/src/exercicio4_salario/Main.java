/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio4_salario;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Main {

    
    public static void main(String[] args) {
        Salario s = new Salario();
        
        s.setNome (
        JOptionPane.showInputDialog(null, "Informe o nome: ", JOptionPane.QUESTION_MESSAGE));
        s.setHorasTrab(Double.parseDouble( 
        JOptionPane.showInputDialog(null, "Informe a quantidade de horas trabalhadas: ", JOptionPane.QUESTION_MESSAGE)));
        s.setSalarioHora(Double.parseDouble( 
        JOptionPane.showInputDialog(null, "Informe o salário hora: ", JOptionPane.QUESTION_MESSAGE)));
        s.setQtdeDep(Integer.parseInt( 
        JOptionPane.showInputDialog(null, "Informe a quantidade de dependentes: ", JOptionPane.QUESTION_MESSAGE)));
        s.calcularSalarioBruto();
        s.calcularDescontoInss();
        s.calcularDescontoIr();
        s.calcularSalarioLiquido();
        s.mostrarSalario();
    }
    
}
