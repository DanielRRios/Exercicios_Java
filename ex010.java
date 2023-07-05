package exercicios;

import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		// # Exercício Java 010: Crie um programa que leia quanto dinheiro uma pessoa tem na carteira e mostre quantos dólares ela pode comprar.
		Scanner sc = new Scanner(System.in);
		double vl = sc.nextDouble();
		double dolar = vl / 4.85; // dia 05/07/23
		
		System.out.printf("Com R$%.2f reais você tem $%.2f doláres", vl, dolar);
		
		sc.close();
	}
}
