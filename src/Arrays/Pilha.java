package Arrays;

import java.util.ArrayDeque;
import java.util.Deque;
public class Pilha {
    public static void main (String[] args){
        Deque<String> pilha = new ArrayDeque<>();//criação de uma lista com a estrutura java
        
        pilha.add("Paulinha");
        pilha.add("caio");
        pilha.add("diogo");
        pilha.push("carino");//nao adiciona se infrigir o limite
        pilha.push("Siena");

        System.out.println(pilha.getFirst());//retorna o primeiro elemento
        System.out.println(pilha.peek());//retorna o primeiro elemento
        System.out.println(pilha.remove());//remove o primeiro elemento
        System.out.println(pilha.pop());//caio passa a ser o primeiro elemento
        System.out.printf("old",pilha.poll());//remove tambem porem tem diferença pro remove/pop tradicional
        


    }
}
