package Arrays;

public class Aluno {
    
    String nome;
    int matricula;

    Aluno(){
        this.matricula++;
    }

    void dadosAluno(){
        System.out.printf("Nome: %s", nome," matricula;%d\n", matricula);
    }
}
