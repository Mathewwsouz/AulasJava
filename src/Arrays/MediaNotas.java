package Arrays;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[]args){
        int i;
        double total=0;
        Aluno aluno = new Aluno();
        Scanner scan =  new Scanner (System.in);
        System.out.print("Cadastro de notas:\n");
        System.out.print("Qual o nome do Aluno:\n");
        aluno.nome = scan.nextLine();
        System.out.print("Quantas notas deseja Inserir:\n");
        int n =  scan.nextInt();

        double [] a = new double[n];
        int j=0;
        for( i=0; i<a.length; i++){
            j++;
            System.out.printf("Digite a %dª: \n", j);
            a[i] = scan.nextDouble();
        }

        for(double nota:a){
            total +=nota;
        }
        double media =  total / n;
        System.out.printf("\033[H\033[2J");
        System.out.print("-------Sistema Escolar 2024--------");
        aluno.dadosAluno();
        System.out.printf("\nMedia de Notas Aluno: "+ media);

}
}
