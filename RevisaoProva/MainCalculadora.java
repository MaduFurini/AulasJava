package RevisaoProva;

import java.util.Scanner;

public class MainCalculadora {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora c = new Calculadora();

        do{
            System.out.println("Insira a ação desejada: \\n 1: SOMA \\n 2: SUBTRAÇÃO \\n 3: MULTIPLICAÇÃO \\n 4: DIVISÃO \\n 5: Encerrar");
            int acao = scanner.nextInt();

            System.out.println("Insira um número: ");
            double num1 = scanner.nextDouble();

            System.out.println("Insira outro número ");
            double num2 = scanner.nextDouble();

            double resultado = 0;

            switch (acao) {
                case 1:
                    resultado = c.soma(num1, num2);
                    break;
                case 2:
                    resultado = c.subtrair(num1, num2);
                    break;
                case 3:
                    resultado = c.multiplicar(num1, num2);
                    break;
                case 4:
                    resultado = c.dividir(num1, num2);
                    break;
                case 5:
                    System.out.println("Encerrando o programa");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Insira uma ação para continuar ");
                    break;
            }

            System.out.println("O resultado é: " + resultado);
        }while(true);   
    }
}
