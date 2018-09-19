/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Prontuario;


/**
 *
 * @author Luis
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Prontuario prontuario1 = new Prontuario();
        Prontuario prontuario2 = new Prontuario();
        Prontuario prontuario3 = new Prontuario();
        Prontuario prontuario4 = new Prontuario();
        Scanner le = new Scanner(System.in);
        
        //PACIENTE 1
        System.out.println("Paciente 1, informe os dados abaixo!");
        System.out.println("Nome:");
        String nome = le.next();
        System.out.println("Data de Nascimento. Ex:15/10/1989");
        SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = null;
        try {
            dataNascimento = fm.parse(le.next());
        } catch (Exception ex) {
            System.out.println("Erro ao inserir da data!");
        }
        System.out.println("Peso:");
        Double peso = le.nextDouble();
        System.out.println("Altura:");
        Double altura = le.nextDouble();
        prontuario1.setNome(nome);
        prontuario1.setDataNascimento(dataNascimento);
        prontuario1.setPeso(peso);
        prontuario1.setAltura(altura);
        System.out.println(prontuario1.getNome() + ", seu IMC é " + prontuario1.calculaIMC() + 
        " e seu diagnóstico é: " + prontuario1.preDiagnosticar());
        
        //PACIENTE 2
        System.out.println("\nPaciente 2, informe os dados abaixo!");
        System.out.println("Nome:");
        nome = le.next();
        System.out.println("Data de Nascimento. Ex:15/10/1989");
        dataNascimento = null;
        try {
            dataNascimento = fm.parse(le.next());
        } catch (Exception ex) {
            System.out.println("Erro ao inserir da data!");
        }
        System.out.println("Peso:");
        peso = le.nextDouble();
        System.out.println("Altura:");
        altura = le.nextDouble();
        prontuario2.setNome(nome);
        prontuario2.setDataNascimento(dataNascimento);
        prontuario2.setPeso(peso);
        prontuario2.setAltura(altura);
        System.out.println(prontuario2.getNome() + ", seu IMC é " + prontuario2.calculaIMC() + 
        " e seu diagnóstico é: " + prontuario2.preDiagnosticar());
        
        //PACIENTE 3
        System.out.println("\nPaciente 3, informe os dados abaixo!");
        System.out.println("Nome:");
        nome = le.next();
        System.out.println("Data de Nascimento. Ex:15/10/1989");
        dataNascimento = null;
        try {
            dataNascimento = fm.parse(le.next());
        } catch (Exception ex) {
            System.out.println("Erro ao inserir da data!");
        }
        System.out.println("Peso:");
        peso = le.nextDouble();
        System.out.println("Altura:");
        altura = le.nextDouble();
        prontuario3.setNome(nome);
        prontuario3.setDataNascimento(dataNascimento);
        prontuario3.setPeso(peso);
        prontuario3.setAltura(altura);
        System.out.println(prontuario3.getNome() + ", seu IMC é " + prontuario3.calculaIMC() + 
        " e seu diagnóstico é: " + prontuario3.preDiagnosticar());
        
        //PACIENTE 4
        System.out.println("\nPaciente 4, informe os dados abaixo!");
        System.out.println("Nome:");
        nome = le.next();
        System.out.println("Data de Nascimento. Ex:15/10/1989");
        dataNascimento = null;
        try {
            dataNascimento = fm.parse(le.next());
        } catch (Exception ex) {
            System.out.println("Erro ao inserir da data!");
        }
        System.out.println("Peso:");
        peso = le.nextDouble();
        System.out.println("Altura:");
        altura = le.nextDouble();
        prontuario4.setNome(nome);
        prontuario4.setDataNascimento(dataNascimento);
        prontuario4.setPeso(peso);
        prontuario4.setAltura(altura);
        System.out.println(prontuario4.getNome() + ", seu IMC é " + prontuario4.calculaIMC() + 
        " e seu diagnóstico é: " + prontuario4.preDiagnosticar());
    }
    
}
