
package com.mycompany.lista02.miguel;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Insira o número:");
        Integer numero = leitor.nextInt();
        
        Integer inteiroGerado = 100;
        Integer contador = 0;
        
        
        while (numero != inteiroGerado) {            
            contador++;
            inteiroGerado = ThreadLocalRandom.current().nextInt(0, 10);
            System.out.println(inteiroGerado);
        }
        
        if (contador <= 3) {
            System.out.println("Você é MUITO sortudo");
        }else if (contador >= 4 && contador <= 10) {
            System.out.println("Você é sortudo");
        }else{
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
    }
}