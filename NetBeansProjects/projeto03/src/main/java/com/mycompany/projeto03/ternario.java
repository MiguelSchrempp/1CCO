
package com.mycompany.projeto03;

public class ternario {
    public static void main(String[] args) {
        
        Boolean isMatriculado = true;
        
        String frase;
        
//        if (isMatriculado){
//            frase = "Está matriculado";
//        } else{
//            frase = "Não está matriculado";
//        }
        
        frase = isMatriculado ? "Está matriculado" : "Não está matriculado";
        
        System.out.println(frase);
        
        Integer numero = 42;
        
        if (numero %2 == 0){
            System.out.println("É par...");
        }else{
            System.out.println("É ímpar...");
        }
    }
}
