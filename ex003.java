package exercicios;

import java.util.Scanner;

// # Exercício Java 003: Crie um programa que leia dois números e mostre a soma entre eles.

public class ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		int soma = a + b;
		System.out.printf("A soma entre %d + %d = %d", a, b, soma);
	}
}
