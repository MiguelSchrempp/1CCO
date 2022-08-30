package com.mycompany.lista01.miguel;

import java.util.Scanner;

public class Elevador {
    
    public static void main(String[] args) {
    Scanner calcular = new Scanner(System.in);

    System.out.println("Digite o peso suportado pelo elevador: ");
    Integer pesoMax = calcular.nextInt();

    System.out.println("Digite o limite de pessoas: ");
    Integer limite = calcular.nextInt();

    System.out.println("Digite o peso do passageiro:" );
    Integer peso = calcular.nextInt();
    
    Integer j = 0;
    
    
    for(Integer i = 1; i < limite; i++){
        System.out.println("Digite o peso do passageiro:" );
        j = calcular.nextInt();
        }
    
    Integer pesoTotal =  peso + j;
    
        if(pesoTotal > pesoMax){
        System.out.println("Elevador acima do peso");
        } else {
        System.out.println("Vamos lá");
        }

    }
    
}