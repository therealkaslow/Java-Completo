package exerciciosEstruturaCondicional;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro e dizer se este número é par ou
		 * ímpar.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.printf("Verifique se é par ou impar: %n");
		int number = sc.nextInt();
		if (number % 2 == 0) {
			System.out.println("Par");
		} else
			System.out.println("Impar");
		{
			sc.close();
		}
	}
}
