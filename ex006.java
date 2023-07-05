package exercicios;

import java.util.Scanner;

public class ex06 {
	public static void main(String[] args) {
		// Exercício Java 006: Crie um algoritmo que leia um número e mostre o seu dobro, triplo e raiz quadrada
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.printf("Dobro %d %nTriplo %d %nRaiz %s", num * 2, num * 3, Math.sqrt(num));
		
		sc.close();
	}
}
