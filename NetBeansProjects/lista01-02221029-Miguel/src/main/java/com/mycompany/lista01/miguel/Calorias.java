
package com.mycompany.lista01.miguel;

import java.util.Scanner;

public class Calorias {
    
    public static void main(String[] args) {
        
        Scanner exercicio = new Scanner(System.in);
        
        System.out.println("Tempo de aquecimento: ");
        Integer aquecimento = exercicio.nextInt();
        
        System.out.println("Tempo de aeróbico: ");
        Integer aerobico = exercicio.nextInt();
        
        System.out.println("Tempo de musculação: ");
        Integer musculacao = exercicio.nextInt();
        
        Integer tempo = aquecimento + aerobico + musculacao;
        
        Integer calorias = (aquecimento * 12) + (aerobico * 20) + (musculacao * 25);
        
        String relatorio = String.format("Olá, você fez um total de %d minutos de exercícios "
                + "e perdeu cerca de %d calorias" , tempo, calorias);
        
        System.out.println(relatorio);  
        
    }
    
}
