package dadosEntrada;

import java.util.Scanner;

public class Dados1 {

	public static void main(String[] args) {
		// Declaracao da variavel Scanner "sc"
		Scanner sc = new Scanner(System.in);
		// x = sc.nextInt(); para ler um numero inteiro
		// x = sc.nextDouble(); para ler com ponto flutuante
		// Para considerar o separador de decimais como ponto, ANTES da declaração do
		// Scanner, faça:
		// Locale.setDefault(Locale.US);

		/* Como ler um caractere especifico na linha? */
		/*
		 * x = sc.next();, para inserir os dados e charAt(0) para escolher qual o
		 * caractere na linha específica ou seja: x = sc.next().charAt(0);
		 */
		/*
		 * Para ler vários dados na mesma linha: string x; int y; double z; x =
		 * sc.next(); y = sc.nextInt(); z = sc.nextDouble();
		 */
		int x;
		x = sc.nextInt();
		System.out.println("Voce digitou no caso o valor " + x);
		// deve utilizar para encerrar o conteudo do objeto que foi criado quando foi
		// imposto na memória RAM
		sc.close();
	}
}