
package com.mycompany.lista03.miguel.Idades;

import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite sua idade: ");
        int anos = leitor.nextInt();
        
        Classifica faixa = new Classifica();
        
        faixa.exibirFaixa(anos);
    }
}
