package exercicios;

import java.util.Scanner;

public class ex18 {
	public static void main(String[] args) {
		// Exercício Java 18: Faça um programa que leia um ângulo qualquer e mostre na tela o valor do seno, cosseno e tangente desse ângulo.
		
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		
		System.out.printf("Seno %s %nCosseno %s %nTangente %s", Math.sin(num), Math.cos(num), Math.tanh(num));
		
		sc.close();
	}
}
