package exercicios;

import java.util.Scanner;

public class ex12 {
	public static void main(String[] args) {
		// Exercício Java 012: Faça um algoritmo que leia o preço de um produto e mostre seu novo preço, com 5% de desconto.
		Scanner sc = new Scanner(System.in);
		
		double vl = sc.nextDouble();
		double sl = vl * 0.95;
		
		System.out.printf("Valor com desconto R$%.2f", sl);
		
		sc.close();	
	}
}
