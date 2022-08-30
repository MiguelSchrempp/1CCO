
package com.mycompany.lista02.miguel;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner calcular = new Scanner (System.in);
        
        System.out.println("Insira a base:");
        int base = calcular.nextInt();
        
        System.out.println("Insira o expoente:");
        int expoente = calcular.nextInt();
        
        int resultado = 1;
        
        for (int i = expoente; i >= 1; i--) {
            resultado = resultado * base;
        }
        
        System.out.println(resultado);
    }
}
