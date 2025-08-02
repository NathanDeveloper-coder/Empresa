import Startup.Desenvolvedor;
import Startup.Empresa;
import Startup.Estagiario;
import Startup.Gerente;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Teste");

        Gerente funcionario1 = new Gerente("Geraldo", "10022233344", 2000.00 );
        Estagiario estagiario1 = new Estagiario("Geraldo", "10055533344", 2000.00, "uniesquina");
        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Geraldo", "10022233344", 2000.00 );


        funcionario1.autenticar();

        Estagiario estagiario3 = new Estagiario("Nathan", "10076732908", 1300, "uniesquina");


        Empresa empresa = new Empresa();

        empresa.adicionarFuncionario(funcionario1);
        empresa.adicionarFuncionario(estagiario1);
        empresa.adicionarFuncionario(desenvolvedor1);
        empresa.adicionarFuncionario(estagiario3);

        empresa.listarFuncionarios();










    }
}