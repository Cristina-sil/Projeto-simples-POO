
package aula08;

/**
 *
 * @author Ana Cristina
 */
public class Pessoa{
    private String nome;
    private String cpf;
    private String calendar;
    
    public Pessoa(String nome, String cpf, String calendar){
        //super() ; chamada ao construtor da super classe
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.calendar = calendar;
    }
   
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCalendar(){
        return this.calendar;
    }
    public void setCalendar(String calendar){
        this.calendar = calendar;
    }
    
    public void mostrarPessoa(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Cpf: "+this.getCpf());
        System.out.println("Calendar: "+this.getCalendar());
    }
}
