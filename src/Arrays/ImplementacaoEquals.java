package Arrays;

public class ImplementacaoEquals {
    //aqui iremos usar o metodo para comparar dados em objetos
    public static void main(String[] args){
        Aluno aluno1 =  new Aluno();
        Aluno aluno02 =  new Aluno();
        aluno1.nome = "Carlos pietro";
        aluno02.nome = "Carlos pietro";

        System.out.println(aluno1.nome.equals(aluno02.nome));

    }
    
}
