package modelos;

public class Aluno extends Individuo {

   
    private String matricula;

    public Aluno(String nome, String email) {
        super(nome, email);
    }

    public Aluno (String nome, String email, String matricula){
         super(nome, email);
         this.matricula = matricula;
    }
    
}
