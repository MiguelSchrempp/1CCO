
package com.mycompany.projeto04;

public class Utilitaria {
    
    
    // Assinatura do metódo é composta por:
    // tipo de retorno
    // nome do método
    // parametros -> argumento
    
    // nesse caso void indica que o método não possui retorno
    void  exibirLinha(){ 
        System.out.println("-".repeat(30));
    }
    
    void exibirNome(String nomeParaExibicao){
        System.out.println(String.format("*** %s ***", nomeParaExibicao));
    }
    
    // Um método pode chamar outro método,
    // da mesma classe ou até mesmo de outras
    void exibirNomeComLinha(String nome){
        exibirLinha();
        exibirNome(nome);
        exibirLinha();
    }
}
