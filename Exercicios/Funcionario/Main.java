package Exercicios.Funcionario;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Gerente gerente = new Gerente(0, null, 0, 0, 0, 0);
        FuncionarioRegular funcionarioRegular = new FuncionarioRegular(0, null, 0, 0, 0, null);

        System.out.println("Insira o nome do funcionário: ");
        funcionarioRegular.setNome(scanner.nextLine());

        System.out.println("Insira o cpf do funcionário: ");
        funcionarioRegular.setCpf(scanner.nextInt());

        System.out.println("Insira a idade do funcionário: ");
        funcionarioRegular.setIdade(scanner.nextInt());

        System.out.println("Insira quantas horas o funcionário trabalhou: ");
        funcionarioRegular.setHoraTrabalhada(scanner.nextDouble());

        System.out.println("Insira o valor de cada hora desse funcionário: ");
        funcionarioRegular.setValorHora(scanner.nextDouble());

        System.out.println("Insira o nome do supervisor desse funcionário: ");
        funcionarioRegular.setNomeSupervisor(scanner.nextLine());
        funcionarioRegular.setNomeSupervisor(scanner.nextLine());

        funcionarioRegular.apresentar();
        funcionarioRegular.calcularSalario();

        System.out.println("Insira o nome do gerente: ");
        gerente.setNome(scanner.nextLine());

        System.out.println("Insira o cpf do gerente: ");
        gerente.setCpf(scanner.nextInt());

        System.out.println("Insira a idade do gerente: ");
        gerente.setIdade(scanner.nextInt());

        System.out.println("Insira quantas horas o gerente trabalhou: ");
        gerente.setHoraTrabalhada(scanner.nextDouble());

        System.out.println("Insira o valor de cada hora desse gerente: ");
        gerente.setValorHora(scanner.nextDouble());

        System.out.println("Insira o valor da gratificação do gerente ");
        gerente.setGratificacao(scanner.nextDouble());

    
        gerente.apresentar();
        gerente.calcularSalario();
    }
}