package Startup;

import java.util.Scanner;

public class Gerente extends Funcionario{

    private int tentativa;
    private int tentativasSenhas = 3;

    private int senhaCorreta = 1234;


    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);

    }

    @Override
    public double calcularBonificacao() {
        return getSalario() * 0.20;
    }

    public boolean autenticar(){
        Scanner senhaEntrada = new Scanner(System.in);


        System.out.println("Por favor informe sua senha para que possa consultar seu salario");


        for (int i = 1; i <= tentativasSenhas; i++) {
            System.out.print("Senha: ");

            if (!senhaEntrada.hasNextInt()) {
                System.out.println(VERMELHO + "Entrada inválida! Digite apenas números." + RESET);
                senhaEntrada.next(); // limpa a entrada inválida
                continue;
            }


            tentativa = senhaEntrada.nextInt();

                if (tentativa == senhaCorreta) {
                    System.out.println(VERDE + "A sua bonificação é R$" + calcularBonificacao() + " reais." + RESET);

                    return true;
                } else {
                    System.out.printf(VERMELHO + "Voce digitou a senha errada, você utilizou %d/3 tentativas.\n %s", i, RESET);
                }


        }

        System.out.println(VERMELHO + "Tentativas esgotadas. Tente novamente mais tarde." + RESET);
        return false;
    }
}
