
package com.mycompany.projeto03;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;



public class Randomicos {
    public static void main(String[] args) {
        
        /*
        Math.random() * n
        
        Existem outros, exemplo:
        Random x = new Random();
        
        Random geradorRandomico = new Random();
        
        geradorRandomico.nextInt(10);
        geradorRandomico.nextDouble();
        geradorRandomico.nextBosolean();
        */
        
        Integer inteiroGerado =
        ThreadLocalRandom.current().nextInt(0, 10);
        
        System.out.printf("Número gerado: %d", inteiroGerado);
    
    }
 
}
