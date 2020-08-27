
package aula08;
public class Funcionario extends Pessoa{
    private String matricula;
    private String dataAdmissao;
    private double salario;
    public Funcionario(String nome, String cpf, String calendar,String matricula,String dataAdmissao,double salario){
        super(nome,cpf,calendar);
        this.matricula = matricula;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getDataAdmissao(){
        return this.dataAdmissao; 
    }
    public void setDataAdmissao(String DA){
        this.dataAdmissao = DA;
    }
    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public void mostrarFuncionario(){
        System.out.println("Matricula: "+this.getMatricula());
        System.out.println("Data de Admissão: "+this.getDataAdmissao());
        System.out.println("Salário: "+this.getSalario()+ "R$");
    }
}
