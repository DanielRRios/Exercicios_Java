package exercicios;

import java.util.Scanner;

public class ex14 {
	public static void main(String[] args) {
		//  Exercício Java 014: Escreva um programa que converta uma temperatura digitando em graus Celsius e converta para graus Fahrenheit.
		Scanner sc = new Scanner(System.in);
		
		double cel = sc.nextDouble();
		double fir =(cel * 9/5) + 32;
		
		System.out.printf("%s°C convertido para F°%s", cel, fir);
		
		sc.close();
	}
}
