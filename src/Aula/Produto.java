package Aula;

public class Produto {
    
    String nome;
    double preco;
    static double desconto = 0.25;

    Produto(){

    }

    Produto(String nomeInicial, double precoInicial){
        this.nome = nomeInicial;
        this.preco = precoInicial;

    }
    double precoComdescont(){
        return preco*(1-desconto);
    }

}
