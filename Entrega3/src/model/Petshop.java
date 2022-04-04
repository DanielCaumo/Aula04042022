/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author Daniel Caumo
 */
public class Petshop {
    public String nomeAnimal, sexoAnimal;
    public double pesoAnimal, valorPrimeiroServico, valorSegundoServico;
    public int idadeAnimal;
    public ArrayList<String> notaFiscal = new ArrayList<>();

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getSexoAnimal() {
        return sexoAnimal;
    }

    public void setSexoAnimal(String sexoAnimal) {
        this.sexoAnimal = sexoAnimal;
    }

    public ArrayList<String> getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(ArrayList<String> notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public double getPesoAnimal() {
        return pesoAnimal;
    }

    public void setPesoAnimal(double pesoAnimal) {
        this.pesoAnimal = pesoAnimal;
    }

    public double getValorPrimeiroServico() {
        return valorPrimeiroServico;
    }

    public void setValorPrimeiroServico(double valorPrimeiroServico) {
        this.valorPrimeiroServico = valorPrimeiroServico;
    }

    public double getValorSegundoServico() {
        return valorSegundoServico;
    }

    public void setValorSegundoServico(double valorSegundoServico) {
        this.valorSegundoServico = valorSegundoServico;
    }

    public int getIdadeAnimal() {
        return idadeAnimal;
    }

    public void setIdadeAnimal(int idadeAnimal) {
        this.idadeAnimal = idadeAnimal;
    }
    
    public void adicionar(String nf){
        this.notaFiscal.add(nf);
    }
    
    public double somarValor(){
        return this.valorPrimeiroServico + this.valorSegundoServico;
    }
    
    
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat(".00");
        return "Nome: "+this.nomeAnimal+"\nIdade: "+this.idadeAnimal+" anos"+"\nPeso: "+this.pesoAnimal+"kg"+"\nSexo: "+this.sexoAnimal+"\n"+"\nPrimeiro Serviço R$: "+df.format(this.valorPrimeiroServico)+"\nSegundo Serviço R$ :"+df.format(this.valorSegundoServico)+"\nValor total R$ : "+df.format(this.somarValor())+"\n"+"\nEnviar nota fiscal por: "+notaFiscal;
    }
    
}
