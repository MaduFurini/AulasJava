package Conceitos;

import java.util.Scanner;
import java.lang.Math; 
public class imc {
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double peso, altura, res;
	
		System.out.println("Insira seu peso: ");
		peso = scanner.nextDouble();
		
		System.out.println("Insira sua altura: ");
		altura = scanner.nextDouble();
		
		System.out.println("Seu IMC é: " + (peso/Math.sqrt(altura)));
	}
}