package doWhile;

import java.util.Scanner;

public class doWhileEx1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		char alternativa;
		do {
			System.out.println("Digite a Temperatura de Celsius: ");
			double C = sc.nextDouble();
			double F = 9 * C / 5 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.println("Deseja Repetir?(S/N)? ");
			alternativa = sc.next().charAt(0);
		}while(alternativa != 'n');
	}
}
