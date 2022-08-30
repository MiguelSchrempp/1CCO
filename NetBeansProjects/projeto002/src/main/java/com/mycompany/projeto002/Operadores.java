
package com.mycompany.projeto002;

public class Operadores {
    public static void main(String[] args) {
        
        /*
        == -> comparação de números
        !=
        <
        >
        >=
        <=
        !
        */
        
        Integer numero1 = 42;
        Integer numero2 = 10;
        
        if (numero1 > numero2){
            System.out.println(numero1 + " é maior que " + numero2);
        } else if (numero1 < numero2){
            System.out.println(numero1 + " é menos que " + numero2);
        } else{
            System.out.println(numero1 + " é igual " + numero2);
        }
        
        Boolean isProfessor = true;
        
        if (isProfessor){
            System.out.println("É professor...");
        } else {
            System.out.println("Não é professor...");
        }
        
        String nome1 = "diego";
        String nome2 = "diego";
        
        if (nome1 == nome2){
            System.out.println("São iguais...");
        }
        
        
        
    }
}
