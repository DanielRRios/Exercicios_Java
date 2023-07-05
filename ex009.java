package exercicios;

import java.util.Scanner;

public class ex09 {
	public static void main(String[] args) {
		// # Exercício Java 009 : Faça um programa que leia um número inteiro qualquer e mostre na tela a sua tabuada.
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int cont = 1;
		while(cont <= 10) {
			System.out.printf("%d x %d = %d %n", num, cont, num * cont);
			cont += 1;
		}
		
		// Preguiça de escrever as 10 linhas.
		
		sc.close();
		
	}
}
