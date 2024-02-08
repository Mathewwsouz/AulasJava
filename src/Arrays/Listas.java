package Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Listas {
    /*LISTAS
     * -Aceita objetos duplicados 
     * -Poder ser heterogenea e homogênea
     * Aceta itens duplicados
     * é ordenada
     * é indexado
    */
    public static void main (String[] args){
        
        Scanner scan = new Scanner(System.in);
        ArrayList<Aluno> Alunos = new ArrayList<>();
        int shoice=1;
        while(shoice == 1){
            Aluno aluno = new Aluno();
            System.out.println("Digite o nome do usuario:");
            aluno.nome = scan.nextLine();
            System.out.println("Deseja cadastrar novo usuario?1-SIM OR 2-NÃO");
            shoice = scan.nextInt();
            scan.nextLine();
            Alunos.add(aluno);
        };

        for(Aluno Student : Alunos){
            Student.dadosAluno();
        }
        


    }


}
