package exerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		/*Fazer um programa para ler um número inteiro, 
		 *e depois dizer se este número é negativo ou não.*/
		System.out.println("Olá digite um número: ");
		int number = sc.nextInt();
		
		if (number >1) {
			System.out.println("Não Negativo");
		}else {
			System.out.println("Negativo");
		}
		sc.close();
	}
}
