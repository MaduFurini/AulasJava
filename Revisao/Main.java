package Revisao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cliente a1 = new Cliente();
        a1.setNome("Jonas");
        a1.setIdade(40);
        a1.setEmail("jonas.furini@gmail.com");
        
        System.out.println("Insira um nome");
        String nome = scanner.nextLine();

        System.out.println("Insira sua idade");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Insira seu email");
        String email = scanner.nextLine();

        Cliente a2 = new Cliente(nome, idade, email);

        Cliente a3 = new Cliente();

        System.out.println("Clientes cadastrados: ");
        System.out.println("Cliente 1: \n Nome: " + a1.getNome() + "\n Idade: " + a1.getIdade() + "\n Email: " + a1.getEmail());
        System.out.println("Cliente 2: \n Nome: " + a2.getNome() + "\n Idade: " + a2.getIdade() + "\n Email: " + a2.getEmail());
        System.out.println("Cliente 3: \n Nome: " + a3.getNome() + "\n Idade: " + a3.getIdade() + "\n Email: " + a3.getEmail());

        double media = (a1.getIdade() + a2.getIdade() + a3.getIdade())/3;

        System.out.println("A média da idade de todos os clientes é " + media);
    }

}
