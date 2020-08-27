
package aula08;

public class Aluno extends Pessoa{
    private String matricula; 
    public Aluno(String nome, String cpf, String calendar,String matricula){
        super(nome,cpf,calendar);
        this.matricula = matricula;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String mat){
        this.matricula = mat;
    }
    public void mostrarAluno(){
        System.out.println("Matrícula: "+this.getMatricula());
    }
}
