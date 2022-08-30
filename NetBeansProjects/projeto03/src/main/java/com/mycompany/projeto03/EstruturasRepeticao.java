
package com.mycompany.projeto03;

public class EstruturasRepeticao {
    public static void main(String[] args) {
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

//        LAÇO INFINITO        
//        for (;;){
//            System.out.println("Emergencia");
//        }
        
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        int j = 0;
        while (j <= 10) {            
            System.out.println(j);
            j++;
        }
        
        int k = 10;
        while (k >= 10) {            
            System.out.println(k);
            k--;
        }
    }
}
