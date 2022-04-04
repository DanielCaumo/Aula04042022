/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4_salario;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Salario {
    private String nome;
    private int qtdeDep;
    private double horasTrab, salarioHora, salarioBruto, descInss, descIr, salarioLiquido;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(double horasTrab) {
        this.horasTrab = horasTrab;
    }

    public int getQtdeDep() {
        return qtdeDep;
    }

    public void setQtdeDep(int qtdeDep) {
        this.qtdeDep = qtdeDep;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public double getDescInss() {
        return descInss;
    }

    public double getDescIr() {
        return descIr;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }
    
    public double calcularSalarioBruto(){
        return (this.salarioBruto=this.horasTrab*this.salarioHora+(50*this.qtdeDep));
    }
    
    public double calcularDescontoInss(){
        if(calcularSalarioBruto()<=1000){
            return (this.descInss=this.salarioBruto*8.5/100);
        } else {
            return (this.descInss=this.salarioBruto*9/100);
        }        
    }
    
    public double calcularDescontoIr(){
        if(calcularSalarioBruto()<=500){
            return (this.descIr=0);
        } else if(calcularSalarioBruto()>500 && calcularSalarioBruto()<=1000){
            return (this.descIr=this.salarioBruto*5/100);
        } else {
            return (this.descIr=this.salarioBruto*7/100);        
        }
    }
        
    public double calcularSalarioLiquido(){
        return (this.salarioLiquido=this.salarioBruto-this.descInss-this.descIr);
    }
    
    public void mostrarSalario(){
        JOptionPane.showMessageDialog(null,"Nome: "+nome+"\n"+"Salário bruto: "+salarioBruto+"\n"+"Desconto do INSS: "+descInss+"\n"+"Desconto do IR: "+descIr+"\n"+"Salário líquido: "+salarioLiquido,"Cálculo de Salário",JOptionPane.INFORMATION_MESSAGE);
    }
    
}