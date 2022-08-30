
package com.mycompany.lista02.miguel;

import java.util.Scanner;

public class Acumulador {
    public static void main(String[] args) {
        Scanner calcular = new Scanner (System.in);
        
        Integer numero = calcular.nextInt();
        int valor = 0;
        
        while (numero != 0) {            
            valor = numero + valor;
            numero = calcular.nextInt();
        }
        System.out.println(valor);
    }
}
