package exercicios;

import java.util.Scanner;

public class ex07 {
	public static void main (String[] args) {
		// # Exercício Java 007: Desenvolva um programa que leia as duas notas de um aluno, calcule e mostre a sua média.
		Scanner sc = new Scanner(System.in);
		
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		
		System.out.printf("A média entre %s e %s foi %.1f", n1, n2, (n1 + n2) / 2);
		
		sc.close();
	}
}
