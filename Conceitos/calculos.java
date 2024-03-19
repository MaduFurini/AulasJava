package Conceitos;

import java.util.Scanner;
public class calculos {
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double soma, sub, mult, div, v1, v2;
		
		System.out.println("Informe um número");
		v1 = scanner.nextDouble();
		
		System.out.println("Informe outro número");
		v2 = scanner.nextDouble();
		
		System.out.println("Soma: " + (v1 + v2));
		System.out.println("Subtração: " + (v1 - v2));
		System.out.println("Multiplicação: " + (v1 * v2));
		System.out.println("Divisão: " + (v1 / v2));
	}
}

