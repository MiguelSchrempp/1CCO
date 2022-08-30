
package com.mycompany.lista01.miguel;

import java.util.Scanner;


public class Idade {
    public static void main(String[] args) {
        
        Scanner calcular = new Scanner (System.in);
        
        System.out.println("Insira seu nome:");
        String nome = calcular.nextLine();
        
        System.out.println("Olá " + nome + "!" + " Qual o ano de seu nascimento?");
        Integer nascimento = calcular.nextInt();
        
        Integer data = 2030 - nascimento;
        
        String relatorio = String.format("Em 2030 você terá " + data +  " anos");
        
        System.out.println(relatorio);
        
    }
}
