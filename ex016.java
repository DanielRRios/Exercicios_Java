package exercicios;

import java.util.Scanner;

public class ex16 {
	public static void main(String[] args) {
		// # Exercício Java 016: Crie um programa que leia um número Real qualquer pelo teclado e mostre na tela a sua porção Inteira.
		
		Scanner sc = new Scanner(System.in);
		
		double i = sc.nextDouble();
		System.out.printf("A parte inteira é %.0f", Math.floor(i));
		
		sc.close();
	}
}
