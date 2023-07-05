package exercicios;

import java.util.Scanner;

public class ex13 {
	public static void main(String[] args) {
		// Exercício Java 013: Faça um algoritmo que leia o salário de um funcionário e mostre seu novo salário, com 15% de aumento.
		Scanner sc = new Scanner(System.in);
		
		double sa = sc.nextDouble();
		System.out.printf("Reajuste de 15%% = R$%.2f", sa * 115 / 100);
		
		sc.close();
	}
}
