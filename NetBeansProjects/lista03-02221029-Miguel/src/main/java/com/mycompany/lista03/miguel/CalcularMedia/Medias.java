
package com.mycompany.lista03.miguel.CalcularMedia;

import java.util.Scanner;

public class Medias {
    public static void main(String[] args) {
        Scanner media = new Scanner (System.in);
        
        System.out.println("Insira a primeira nota:");
        Double media1 = media.nextDouble();
        
        System.out.println("Insira a segunda nota:");
        Double media2 = media.nextDouble();
        
        Calculadora calc = new Calculadora();
        
        System.out.println("Sua média é de:" + calc.calcularMedia(media1, media2));
        
    }
}
