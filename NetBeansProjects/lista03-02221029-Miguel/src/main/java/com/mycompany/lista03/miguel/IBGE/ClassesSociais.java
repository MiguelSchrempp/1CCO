
package com.mycompany.lista03.miguel.IBGE;

import java.util.Scanner;

public class ClassesSociais {
    public static void main(String[] args) {
        Scanner renda = new Scanner (System.in);
        
        System.out.println("Insira sua renda: ");
        Double salario = renda.nextDouble();
        
        Calculadora calc = new Calculadora();
        
        System.out.printf("Você recebe aproximadamente %.0f salários minímo.", calc.salarioMinimo(salario));
        calc.classeSocial(salario);
    }
}
