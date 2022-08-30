
package com.mycompany.projeto03;

import java.util.Scanner;

public class NovoLaco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        Integer numero = 10;
        
        System.out.println("Acerte o número");
        Integer numeroDigitado = leitor.nextInt();
        
        while (numeroDigitado != numero) {            
            System.out.println("Acerte o número");
            numeroDigitado = leitor.nextInt();
        }
        
        System.out.println("Você acertou");
        System.out.println("-".repeat(20));
        
        numeroDigitado = 0;
        
        do {            
            System.out.println("Acerte o número");
            numeroDigitado = leitor.nextInt();
        } while (numeroDigitado != numero);
            System.out.println("Você acertou");
    }
}
