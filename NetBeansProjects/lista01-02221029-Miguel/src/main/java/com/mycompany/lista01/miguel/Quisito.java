
package com.mycompany.lista01.miguel;

import java.util.Scanner;

public class Quisito {
    
    public static void main(String[] args) {
        
        Scanner bolsa = new Scanner(System.in);
        
        System.out.println("Filhos de 0 a 3 anos: ");
        Integer zero3 = bolsa.nextInt();
        
        System.out.println("Filhos de 4 a 16 anos: ");
        Integer quatro16 = bolsa.nextInt();
        
        System.out.println("Filhos de 17 a 18 anos: ");
        Integer dezessete18 = bolsa.nextInt();
        
        Integer filhos = zero3 + quatro16 + dezessete18;
        
        Double dinheiros = (zero3 * 25.12) + (quatro16 * 15.88) + (dezessete18 * 12.44);
        
        String relatorio = String.format("Você tem um total de: %d filhos e vai receber R$%.2f" , filhos, dinheiros);
        
        System.out.println(relatorio);
        
    }
    
}
