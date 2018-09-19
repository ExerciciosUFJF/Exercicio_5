/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Luis
 */
public class Prontuario {
    private String nome;
    private Date dataNascimento;
    private double peso;
    private double altura;

    public Prontuario() {
    }

    public Prontuario(String nome, Date dataNascimento, double peso, double altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.peso = peso;
        this.altura = altura;
    }
    
    public double calculaIMC(){
        return peso / (Math.pow(altura, 2));
    }
    
    public String preDiagnosticar(){
        String diagnostico = null;
        if(calculaIMC() < 18.5){
            diagnostico = "Você está abaixo do peso ideal";
        }else if(calculaIMC() >= 18.5 && calculaIMC() <= 24.9){
            diagnostico = "Você está no seu peso ideal";
        }else if(calculaIMC() >= 25 && calculaIMC() <= 29.9){
            diagnostico = "Você está com sobrepeso";
        }else if(calculaIMC() >= 30 && calculaIMC() <= 34){
            diagnostico = "Obesidade Grau I";
        }else if(calculaIMC() >= 35 && calculaIMC() <= 39.9){
            diagnostico = "Obesidade Grau II";
        }else if(calculaIMC() >= 40){
            diagnostico = "Obesidade Mórbida";
        }
        return diagnostico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        String str = "Nome: " + nome;
        str += "\nData de Nascimento: " + dataNascimento;
        str += "\nPeso: " + peso;
        str += "\nAltura: " + altura;
        return str;
    }
}
