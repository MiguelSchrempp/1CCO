
package com.mycompany.projeto002;

public class interpolacao {
    
    public static void main(String[] args) {
        
        String nome = "Miguel";
        Integer idade = 17;
        Double altura = 1.86;
        
        System.out.println("Nome: " + nome + "\n" + "idade: " + idade + "\n" + "Altura: "
                + altura);
        
        String frase = String.format("Nome: %s\nIdade: %d\nAltura: %.2f", nome, idade, altura);
        
        System.out.println(frase);
                
        
    }
    
}
