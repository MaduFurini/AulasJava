package Conceitos;

import java.util.Scanner;
public class tabuada {
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero, i;
		
		System.out.println("Insira um número");
		numero = scanner.nextInt();
		
		for(i = 0; i<=10; i++) {
			System.out.println(numero * i);
		}
	}
}       