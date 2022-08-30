
package com.mycompany.lista03.miguel.IBGE;

public class Calculadora {
    Double salarioMinimo(Double salario){
        Double salarios = salario / 1045;
        return salarios;
    }
    
    void classeSocial(Double salario){
        String classes = "a";
        
        if (salario <= 2090) {
            classes = "E";
        }else if (salario >= 2090.01 && salario <= 4180 ){
            classes = "D";
        }else if (salario >= 4180.01 && salario <= 10450) {
            classes = "C";
        }else if (salario >= 10450.01 && salario <= 20900) {
            classes = "B";
        }else if (salario >= 20900.01) {
            classes = "A";
        }
        System.out.println("\nVocê pertence a classe social: " + String.format(classes));
    }
}
