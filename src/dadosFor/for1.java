package dadosFor;

import java.util.Scanner;

public class for1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero para a soma dos valores: ");
		int rep = 0;
		int numSoma = 0;
		rep = sc.nextInt();
		for (int i = 0; i < rep; i= i++) {
			int x = sc.nextInt();
			numSoma = numSoma +x;
		}
		System.out.println("soma");
		sc.close();
	}
}
