package javaPackage;

import java.util.Scanner;

public class exemploWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int soma = 0;
		while (number != 0) {
			soma = number + 0;
			number = sc.nextInt();
			}
		System.out.println("parabens " + soma);
		sc.close();
	}
}
