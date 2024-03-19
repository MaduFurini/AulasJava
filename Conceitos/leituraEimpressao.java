package Conceitos;
import java.util.Scanner;

public class leituraEimpressao {
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome;
		int idade;
		
		System.out.println("Digite seu nome");
		nome = scanner.nextLine();
		
		System.out.println("Digite sua idade");
		idade = scanner.nextInt();
		
		System.out.println("Nome digitado: " + nome);
		System.out.println("Idade digitada: " + idade);
	}
}

