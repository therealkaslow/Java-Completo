package exerciciosEstruturaCondicional;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int A, B =0;
		A = sc.nextInt();
		B = sc.nextInt();
		if (A % B ==0 || B % A ==0) {
			System.out.println("Sao multiplos");
		}
		sc.close();
	}
}
