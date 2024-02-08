package Arrays;
import java.util.HashSet;
public class Collections {
    public static void  main(){
        //SET
        /* Hashset- mais comum
        * pode ser heterogêneo
        * poder ser homogêneo (versão mais ideal)
        * Não aceuta duplicação de oBJ
        * Pode ser ordenado
        * Não aceita valores primitivos, apenas tipos objetos
        * Não é indexado
        */
        HashSet<Object> conjunto =  new HashSet<Object>();
        Aluno aluno = new Aluno();
        conjunto.add(aluno);

        /*caso desejamos ter a ordenação com a inclusão, devemos utilizar o TreeSet() pois este marca a ordem e faz parte do "SortedSet"*/
        for(Object alunoV : conjunto){
            System.out.print(alunoV);
        }
        
    }
}
