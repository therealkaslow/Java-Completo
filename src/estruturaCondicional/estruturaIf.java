package estruturaCondicional;

import java.util.Scanner;

public class estruturaIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a hora");
		int hora = sc.nextInt();

		if (hora <= 11) {
			System.out.println("Bom dia!");
		} else if (hora < 18) {
			System.out.println("Boa tarde !");
		}
		if (hora < 24) {
			System.out.println("Boa noite");
		} else if (hora > 24) {
			System.out.println("Valor invalido");
		}
		sc.close();
	}
}
