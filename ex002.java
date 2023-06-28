package exercicios;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome ;
		nome = sc.next();
		
		System.out.printf("Seja bem vindo %s, aproveite os exercícios! :D", nome);
		sc.close();
	}
}
