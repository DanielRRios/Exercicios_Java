package exercicios;

import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		// Exercício Java 004: Faça um programa que leia algo pelo teclado e mostre na tela o seu tipo primitivo e todas as informações possíveis 
		// sobre ele.

		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.println("Informe um número : ");
		x = sc.nextInt();
		System.out.printf("O número %d é inteiro", x);
		// Não achei uma forma de ser feito esse exercício em Java.
	}
}
