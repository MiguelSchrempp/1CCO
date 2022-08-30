
package com.mycompany.lista01.miguel;

import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {
        
        Scanner calculo = new Scanner(System.in);
        
        System.out.println("Insira o primeiro número: ");
        Double n1 = calculo.nextDouble();
        
        System.out.println("Insira o segundo número: ");
        Double n2 = calculo.nextDouble();
        
        Double soma = n1 + n2;
        Double subtracao = n1 - n2;
        Double multiplicacao = n1 * n2;
        Double divisao = n1 / n2;
        
        String relatorio = String.format("Resultado da soma: " + soma + "\n"
        + "Resultado da subtração: " + subtracao + "\n" + "Resultado da multiplicação: " + multiplicacao +
                "\n" + "Resultado da divisão: " + divisao);
        
        System.out.println(relatorio);
        
    }
    
}
