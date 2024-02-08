package Arrays;

import java.util.LinkedList;
import java.util.Queue;
public class Fila {
    public static void main (String[] args){
        Queue<String> fila = new LinkedList<>();//criação de uma lista com a estrutura java
        
        fila.add("Paulinha");
        fila.add("caio");
        fila.add("diogo");
        System.out.println(fila.peek());//retorna o primeiro elemento
        System.out.println(fila.element());
        System.out.println(fila.remove());//remove o primeiro elemento
        System.out.println(fila.element());//caio passa a ser o primeiro elemento
        System.out.println(fila.poll());//remove tambem porem tem diferença pro remove tradicional
        


    }
    
}
