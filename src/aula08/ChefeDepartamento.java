
package aula08;

public class ChefeDepartamento extends Funcionario{
    private String departamento;
    private String dataPromocao;
    private double gratificacao;
    public ChefeDepartamento(String nome, String cpf, String calendar,String mat,String dataA, double salario,String dep,String dataP,double gratificacao ){
        super(nome,cpf,calendar,mat,dataA,salario);
        this.departamento = dep;
        this.dataPromocao = dataP;
        this.gratificacao = gratificacao;
    }
    public String getDepartamento(){
        return this.departamento;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    public String getDataPromocao(){
        return this.dataPromocao;
    }
    public void setDataPromocao(String DP){
        this.dataPromocao = DP;
    }
    public double getGratificacao(){
        return this.gratificacao;
    }
    public void setGratificacao(double gratificacao){
        this.gratificacao = gratificacao;
    }
    
    public void mostrarChefeDepartamento(){
        System.out.println("Departamento: "+this.departamento);
        System.out.println("Data de Promoção: "+this.getDataPromocao());
        System.out.println("Gratificação: "+this.getGratificacao()+"R$");
    }
}
