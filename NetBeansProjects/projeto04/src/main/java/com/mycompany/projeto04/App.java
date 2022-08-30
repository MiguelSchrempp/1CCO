
package com.mycompany.projeto04;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        // Objeto ou instancia
        Utilitaria util = new Utilitaria();
        
        util.exibirLinha();
        System.out.println("Miguel");
        util.exibirLinha();
        System.out.println("Carvalho");
        util.exibirLinha();
        
        // Objeto ou instancia
        Scanner in = new Scanner(System.in);
        
        //System.out.println("Digite seu nome:");
        //String nomeDigitado = in.nextLine();
        //util.exibirNome(nomeDigitado);
        //util.exibirNomeComLinha(nomeDigitado);
        
        Calculadora calc = new Calculadora();
        
        System.out.println("Digite um número:");
        Integer numero1 = in.nextInt();
        //Double numero1 = in.nextDouble();
        
        System.out.println("Digite um número:");
        Integer numero2 = in.nextInt();
        //Double numero2 = in.nextDouble();
        //Integer resultadoObtido = calc.somar(numero1, numero2, numero3);
        
        System.out.println("Digite um número:");
        Integer numero3 = in.nextInt();
        //Double numero2 = in.nextDouble();
        //Integer resultadoObtido = calc.somar(numero1, numero2, numero3);
        
        //System.out.println("Resultado: " + resultadoObtido);
        
        System.out.println("Resultado: " + calc.somar(numero1, numero2, numero3));
    }
}
