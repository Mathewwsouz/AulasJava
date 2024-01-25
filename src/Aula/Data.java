package Aula;

public class Data {

        public static String Autor = "Matheus Pinho";//colocando a palavra static eu defini que esta variavel tera apenas um valor em qualuqer uma das instancias
        int dia, mes ,ano;

        Data(int diaInicial, int MesInicial, int AnoInicial){
            dia = diaInicial;
            mes = MesInicial;   
            ano = AnoInicial;
        }
        Data(){
            //construtor sem parametro, como o padrão
        }

        String formatarData(){
            return String.format("%d/%d/%d", dia, mes, ano);
        }
        public void ImprimirDados(){
            System.out.printf("Autor: %s\n", Autor);
            System.out.printf("Data:%s", formatarData());

        }

}
