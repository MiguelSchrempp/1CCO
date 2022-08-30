
package com.mycompany.lista02.miguel;

import java.util.Scanner;

public class Pizzaria {
    public static void main(String[] args) {
        Scanner votos = new Scanner (System.in);
        
        System.out.println("Mussarela: 5");
        System.out.println("Calabresa: 25");
        System.out.println("Quatro-queijos: 50");
        System.out.println("Digite o valor da pizza desejada:");
        String Soma = votos.nextLine();
        int mussa = 0;
        int cala = 0;
        int queijo = 0;
        int Contador = 0;
        
        while (Contador < 10) {
        Soma = votos.nextLine();
            
        if (Soma.equals("5")) {
            mussa = mussa + 1;
            Contador = Contador + 1;
        }else if (Soma.equals("25")) {
            cala = cala + 1;
            Contador = Contador + 1;
        }else if (Soma.equals("50")) {
                queijo = queijo + 1;
            Contador = Contador + 1;
            }            
        }
            System.out.println(mussa);
            System.out.println(cala);
            System.out.println(queijo);                                   
    }
}
