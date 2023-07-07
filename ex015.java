package exercicios;

import java.util.Scanner;

public class ex15 {
	public static void main(String[] args) {
		// Exercício Java 015: Escreva um programa que pergunte a quantidade de Km percorridos por um carro alugado e a quantidade de dias pelos quais 
		// ele foi alugado. Calcule o preço a pagar, sabendo que o carro custa R$60 por dia e R$0,15 por Km rodado.
		
		Scanner sc = new Scanner(System.in);
		int km = sc.nextInt();
		int dias = sc.nextInt();
		
		double total = (km * 0.15) + (dias * 60);
		
		System.out.printf("Valor a ser pago R$%.2f", total);
		
		sc.close();
	}
}
