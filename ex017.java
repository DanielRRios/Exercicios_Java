package exercicios;

import java.util.Scanner;

public class ex17 {
	public static void main(String[] args) {
		// Exercício Java 017: Faça um programa que leia o comprimento do cateto oposto e do cateto adjacente de um triângulo retângulo. Calcule 
		// e mostre o comprimento da hipotenusa.

		Scanner sc = new Scanner(System.in);
		
		double ops = sc.nextDouble();
		double adj = sc.nextDouble();
		
		double hip = (ops * ops) + (adj * adj);
		double fim = Math.pow(hip, 0.5);
		
		System.out.printf("A hipotenusa é %.1f", fim);
		sc.close();
	}
}
