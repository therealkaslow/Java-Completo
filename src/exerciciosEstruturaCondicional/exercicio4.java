package exerciciosEstruturaCondicional;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a hora inicial: ");
		int horaInicial = sc.nextInt();
		System.out.println("Digite a hora final: ");
		int duracao;
		int horaFinal = sc.nextInt();
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;

		} else {
			duracao = 24 - horaInicial + horaFinal;
		}
		System.out.println("o jogo durou: " + duracao + "Hora(s)");
		sc.close();
	}
}
