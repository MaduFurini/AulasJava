package RevisaoProva;

import java.util.Scanner;

public class MainLanchonete {

    public static void main(String[] args) {
        String nomeAtendente;
        double valorPedido = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do atendente");
        nomeAtendente = scanner.nextLine();

        System.out.println("Boa noite, sou " + nomeAtendente + " e irei te atender hoje");

        do{
            System.out.println("Bem vindo!");
            System.out.println("======CARDÁPIO======");
            System.out.println("1: X-bacon - 20.0");
            System.out.println("2: X-salada - 25.0");
            System.out.println("3: X-calabresa - 19.0");
            System.out.println("4: X-tudo - 30.0");
            System.out.println("5: X-egg - 15.0");           
            System.out.println("6: Encerrar o pedido");
            System.out.println("Insira o número do lanche desejado");
            int acao = scanner.nextInt();

            switch (acao) {
                case 1:
                    valorPedido += 20;
                    break;
                case 2:
                    valorPedido += 25;
                    break;
                case 3:
                    valorPedido += 19;
                    break;
                case 4:
                    valorPedido += 30;
                    break;
                case 5: 
                    valorPedido += 15;
                    break;
                case 6:
                    System.out.println("O valor total do pedido é: " + valorPedido);
                    System.out.println("Obrigada por comprar conosco! Volte sempre!");
                    System.exit(0);
                default:
                    break;
            }
            

        }while(true);
    }
    
}


