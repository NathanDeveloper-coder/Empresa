import Empresa.Funcionario;
import Empresa.Gerente;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Teste");

        Gerente funcionario1 = new Gerente("Geraldo", "10022233344", 2000.00 );


        funcionario1.autenticar();

    }
}