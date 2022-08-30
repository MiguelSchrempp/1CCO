
package com.mycompany.lista02.miguel;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Insira o login:");
        String login = leitor.nextLine();
        
        System.out.println("Insira a senha:");
        String senha = leitor.nextLine();
        
        if (login.equals("admin") && senha.equals("#SPtech2022")) {
            System.out.println("Login realizado com sucesso");
        } else {
            System.out.println("Login e/ou senha inválidos");
        }
    }
}
