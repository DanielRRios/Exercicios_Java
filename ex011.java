package exercicios;

import java.util.Scanner;

public class ex11 {
	public static void main(String[] args) {
		//  Java 011: Faça um programa que leia a largura e a altura de uma parede em metros, calcule a sua área e a quantidade de tinta necessária para pintá-la,
		 //sabendo que cada litro de tinta pinta uma área de 2 metros quadrados.
		Scanner sc = new Scanner(System.in);
		
		double larg = sc.nextDouble();
		double alt = sc.nextDouble();
		
		double total = (larg * alt) / 2;
		
		System.out.printf("Você vai precisar de %.1fL de tinta", total);
		
		sc.close();
		
	}
}
