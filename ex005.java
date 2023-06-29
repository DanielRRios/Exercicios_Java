package exercicios;

import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {
		// Exercício Java 005: Faça um programa que leia um número Inteiro e mostre na tela o seu sucessor e seu antecessor.
		
		Scanner sc = new Scanner(System.in);
		
		int num ;
		num = sc.nextInt();
		
		System.out.printf("Analisando o número %d, o seu antecessor é %d e seu sucessor é %d", num, num -1, num + 1);
		
	}
}
