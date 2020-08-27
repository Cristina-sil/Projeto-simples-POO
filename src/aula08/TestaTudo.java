
package aula08;

public class TestaTudo {
    public static void main(String []args){
        //Aluno
        Aluno judite = new Aluno ("Judite","12681251423","07-03-2000","20181214");
        judite.mostrarPessoa();
        judite.mostrarAluno();
        //Funcionario
        Funcionario jose = new Funcionario("Jose","12345666444","12-03-1993","12356788","23-06-2018",12.0);
        jose.mostrarPessoa();
        jose.mostrarFuncionario();
    }
}
