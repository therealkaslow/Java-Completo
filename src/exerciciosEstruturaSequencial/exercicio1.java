package exerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {
	//Exercicios para calculo de estrutura sequncial
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Locale.setDefault(Locale.US);
			int add1 = 0;
			int add2 = 0;
			int avg = 0;
			
			add1 = sc.nextInt();
			add2 = sc.nextInt();
			
			avg = add1 + add2;
			
			System.out.println("SOMA = " + avg);
			sc.close();
		}
}
