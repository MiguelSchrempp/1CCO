
package com.mycompany.lista01.miguel;

import java.util.Scanner;

public class Salario {
    
    public static void main(String[] args) {
        Scanner calculo = new Scanner (System.in);
        
        System.out.println("Insira o seu salário bruto:");
        Double bruto = calculo.nextDouble();
        
        Double inss = (bruto * 0.90);
        
        Double ir = (inss * 0.80);
        
        System.out.println("Insira a condução de IDA:");
        Double transporte = calculo.nextDouble();
        
        Double vt = (transporte * 2 * 22);
        
        Double liquido = (ir + vt);
        
        String relatorio = String.format("Seu salário bruto é R$ %.2f, tem um total de R$ %.2f em descontos"
                + "e receberá um líquido de R$ %.2f", bruto, bruto - liquido, liquido);
                
        System.out.println(relatorio);
        
    }
}
