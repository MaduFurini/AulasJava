package Conceitos;

import java.util.Scanner;

public class diasSemana {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int diaSemana;
		String nomeDia;
		
		System.out.print("Insira um número");
		diaSemana = scanner.nextInt();
		
		switch(diaSemana) {
			case 1:
				nomeDia = "Domingo";
			break;
			
			case 2:
				nomeDia = "Segunda";
			break;
			
			case 3:
				nomeDia = "Terça";
			break;
			
			default:
				nomeDia = "Dia inválido";
			break;
		}
		
		System.out.println("O dia da semana é: " + nomeDia);
		
	}
}

