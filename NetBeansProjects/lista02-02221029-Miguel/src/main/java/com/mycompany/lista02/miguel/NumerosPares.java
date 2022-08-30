
package com.mycompany.lista02.miguel;

public class NumerosPares {
    public static void main(String[] args) {
        Integer numero = 0;
        
        while (numero != 41) {            
            if (numero %2==0) {
                System.out.println(numero);
            }
            numero++;
        }
    }
    
}
