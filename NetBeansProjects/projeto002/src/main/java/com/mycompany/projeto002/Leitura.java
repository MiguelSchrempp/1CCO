
package com.mycompany.projeto002;

import java.util.Scanner;


public class Leitura {
    
    public static void main(String[] args) {
        
        // Assistente para captura de dados inseridos na execução
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nome = leitor.nextLine();
        
        System.out.println("Digite sua idade: ");
        Integer idade = leitor.nextInt();
        
        System.err.println("Digite sua altura: ");
        Double altura = leitor.nextDouble();
        
        System.out.println("Olá " + nome);
        System.out.println("Idade digitada:  " + idade);
        System.out.println("Altura digitada: " + altura);
    }
}