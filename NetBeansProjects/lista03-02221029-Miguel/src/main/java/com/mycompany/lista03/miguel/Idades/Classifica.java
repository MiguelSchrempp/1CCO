
package com.mycompany.lista03.miguel.Idades;

public class Classifica {
    void exibirFaixa(int anos){
        String idade;
        if (anos >= 0 && anos <= 2) {
             idade = "Bebê";
        }else if (anos >= 3 && anos <= 11 ) {
            idade = "Criaça";
        }else if (anos >= 12 && anos <= 19) {
            idade = "Adolescente";
        }else if (anos >= 20 && anos <= 30) {
            idade = "Jovem";
        }else if (anos >= 31 && anos <= 60) {
            idade = "Adulto";
        }else {
            idade = "Idoso";
        }
        System.out.println(idade);
    }
}
