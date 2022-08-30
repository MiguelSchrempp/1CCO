
package com.mycompany.lista01.miguel;

import java.util.Scanner;


public class Media {
    public static void main(String[] args) {
        Scanner calcular = new Scanner (System.in);
        
        System.out.println("Insira seu nome:");
        String nome = calcular.nextLine();
        
        System.out.println("Insira a nota 1:");
        Double nota1 = calcular.nextDouble();
        
        System.out.println("Insira a nota 2:");
        Double nota2 = calcular.nextDouble();
        
        Double media = (nota1 + nota2) / 2;
        
        String relatorio = String.format("Olá %s. Sua média foi de %.1f", nome, media);
        
        System.out.println(relatorio);
                
    }
}
