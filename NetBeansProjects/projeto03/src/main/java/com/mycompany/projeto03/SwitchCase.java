
package com.mycompany.projeto03;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite um número:");
        Integer numeroDigitado = leitor.nextInt();
        
        String diaDaSemana;
        
        switch (numeroDigitado) {
            case 1:
                diaDaSemana = "Domingo";
                break;
            case 2:
                diaDaSemana = "Segunda";
                break;
            case 3:
                diaDaSemana = "Terça";
                break;
            case 4:
                diaDaSemana = "Quarta";
                break;
            case 5:
                diaDaSemana = "Quinta";
                break;
            case 6:
                diaDaSemana = "Sexta";
                break;
            case 7:
                diaDaSemana = "Sábado";
                break;
            default:
                diaDaSemana = "Dia inválido";
                break;
        }
        
        System.out.println(diaDaSemana);
        
    }
}
