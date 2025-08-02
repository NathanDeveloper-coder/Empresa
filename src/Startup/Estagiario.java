package Startup;

public class Estagiario extends  Funcionario{

    private String universidade;
    public Estagiario(String nome, String cpf, double salario, String universidade) {
        super(nome, cpf, salario);
        this.universidade = universidade;
    }

    @Override
    public double calcularBonificacao() {
        return getSalario() * 0.05;

    }


}
