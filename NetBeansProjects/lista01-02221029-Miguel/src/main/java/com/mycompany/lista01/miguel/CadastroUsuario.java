
package com.mycompany.lista01.miguel;

import java.util.Scanner;

public class CadastroUsuario {
    
    public static void main(String[] args) {
        
        Scanner cadastro = new Scanner(System.in);
        
        System.out.println("Digite seu login:");
        String login = cadastro.nextLine();
        
        System.out.println("Digite sua senha: ");
        String senha = cadastro.nextLine();
        
        System.out.println("Digite a quantidade de tentativas de erro permitida: ");
        Integer erros = cadastro.nextInt();
        
        String relatorio = String.format("Login: %s\nSenha: %s\nTentativas Permitidas: %d", 
                login, senha, erros);
        
        System.out.println(relatorio);
        
    }
    
}
