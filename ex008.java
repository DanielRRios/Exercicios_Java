package exercicios;

import java.util.Scanner;

public class ex08 {
	public static void main (String[] args) {
		// # Exercício Java 008: Escreva um programa que leia um valor em metros e o exiba convertido em centímetros e milímetros.
		Scanner sc = new Scanner(System.in);
		
		int mt = sc.nextInt();
		
		System.out.printf("%n%dCm %n%dMm", mt * 100, mt * 1000);
		
		sc.close();
	}
}
