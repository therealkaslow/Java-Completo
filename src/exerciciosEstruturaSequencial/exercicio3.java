package exerciciosEstruturaSequencial;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();
		int value3 = sc.nextInt();
		int value4 = sc.nextInt();
		
		int result =  value1 * value2 - value3 * value4;
		
		System.out.printf("Diferenca = "+result);
		sc.close();
	}
}
