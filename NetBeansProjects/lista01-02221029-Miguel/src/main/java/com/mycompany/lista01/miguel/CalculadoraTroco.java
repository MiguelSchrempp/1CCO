
package com.mycompany.lista01.miguel;

import java.util.Scanner;

public class CalculadoraTroco {
    
    public static void main(String[] args) {
        
        Scanner calculo = new Scanner(System.in);
        
        System.out.println("Valor do produto: ");
        Double valorProduto = calculo.nextDouble();
        
        System.out.println("Quantidade vendida: ");
        Integer qtdVendida = calculo.nextInt();
        
        System.out.println("Valor pago: ");
        Double valorPago = calculo.nextDouble();
        
        Double total = valorPago - (valorProduto * qtdVendida);
        
        String relatorio = String.format("Seu troco será de R$" + total );
        
        System.out.println(relatorio);
        
    }
    
}
