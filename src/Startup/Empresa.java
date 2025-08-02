package Startup;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    List<Funcionario> funcionarios  = new ArrayList<>();


    public void adicionarFuncionario(Funcionario f){
        funcionarios.add(f);
    }

    public void listarFuncionarios(){
        funcionarios.forEach(exibir -> {

            System.out.println(exibir.getNome());
            System.out.println(exibir.getCpf());
            System.out.println(exibir.calcularBonificacao());
            System.out.println("=================");
        });
    }

}
