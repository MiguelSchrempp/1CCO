
package com.mycompany.lista03.miguel.Supermercado;

import java.util.Scanner;

public class DescontoProgressivo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite o valor unitário do produto: ");
        Double valorProduto = leitor.nextDouble();
        
        System.out.println("Digite a quantidade: ");
        int qtdProduto = leitor.nextInt();
        
        calcularDesconto calc = new calcularDesconto();
        
        calc.calcularDesconto(valorProduto, qtdProduto);
        calc.exibirPreco(valorProduto, qtdProduto);
    }
}
