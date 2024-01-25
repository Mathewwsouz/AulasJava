package Aula;

import java.util.Scanner;
public class teste02 {
    public static void main(String[] args){
        int numero;
        Data data =  new Data();
        Scanner scan =  new Scanner (System.in);

        System.out.println("digite o numero do processo:");
        numero = scan.nextInt();
        System.out.println("Digite o dia:");
        data.dia = scan.nextInt();
        System.out.println("Digite o mes:");
        data.mes = scan.nextInt();
        System.out.println("Digite o Ano:");
        data.ano = scan.nextInt();
        System.out.printf("\033[H\033[2J");
        
        System.out.println("Apresentação da data:");
        data.ImprimirDados();


    }
}
