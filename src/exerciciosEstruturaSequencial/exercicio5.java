package exerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/
public class exercicio5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Código da Peca1: ");
		double pieceNumber1 = sc.nextDouble();
		System.out.println("Quantidade da peca1: ");
		double pieceQuantity1 = sc.nextDouble();
		System.out.println("Valor de cada peca1");
		double pieceValue1 = sc.nextDouble();

		System.out.println("Código da Peca2: ");
		double pieceNumber2 = sc.nextDouble();
		System.out.println("Quantidade da peca2: ");
		double pieceQuantity2 = sc.nextDouble();
		System.out.println("Valor de cada peca2");
		double pieceValue2 = sc.nextDouble();

		double resultPieceValues1 = pieceQuantity1 * pieceValue1;
		double resultPieceValues2 = pieceQuantity2 * pieceValue2;
		
		double totalValue = resultPieceValues1 + resultPieceValues2 ;

		System.out.printf("Valor a Pagar: R$ %.2f%n", totalValue);
		sc.close();
	}
}
