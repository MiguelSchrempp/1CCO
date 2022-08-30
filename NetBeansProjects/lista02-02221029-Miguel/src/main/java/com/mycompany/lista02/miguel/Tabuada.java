package com.mycompany.lista02.miguel;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner calcular = new Scanner (System.in);
        
        System.out.println("Insira um número:");
        Integer numero = calcular.nextInt();
        
        System.out.println("Tabudada do " + numero);
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + "*" + i + "=" + numero * i);
        }
    }
    
}
