package Arrays;

public class Aluno {
    
    String nome;
    int matricula;

    Aluno(){
        this.matricula++;
    }

    void dadosAluno(){
        System.out.printf("Nome:"+ nome+" matricula:"+matricula+"\n");
    }
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }
    public boolean equals(Object objeto){
       if(objeto instanceof Aluno){
            Aluno AlunoTest = (Aluno) objeto;
            return super.equals(objeto);
       }
       return false;
    }
}
