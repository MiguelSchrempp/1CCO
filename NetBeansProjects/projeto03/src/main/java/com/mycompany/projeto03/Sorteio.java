
package com.mycompany.projeto03;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Insira um número de 1 a 100:");
        Integer numero = leitor.nextInt();
        Integer primeiro = 0;
        Integer pares = 0;
        Integer impares = 0;
        
        for (int i = 0; i < 200; i++) {
            Integer inteiroGerado = ThreadLocalRandom.current().nextInt(0, 100);
            if (inteiroGerado == numero) {
                primeiro = i;
            }
            if (inteiroGerado %2== 0) {
                pares++;
            }
            if (inteiroGerado %2!= 0) {
                impares++;
            }
        }
        
        if (primeiro == 0) {
            System.out.println("Seu número não foi sorteado");
        }else{
        System.out.println("Seu número foi exibido pela primeira vez na: " + primeiro + " tentativa");
        }
        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);
    }
}
