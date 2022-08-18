package exerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {
	public static void main(String []args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Coloque o seu ID: ");
		int idEmployee = sc.nextInt();
		System.out.println("Insira as horas trabalhadas: ");
		double workedHours = sc.nextDouble();
		System.out.println("Agora o valor por hora: ");
		double valueHour = sc.nextDouble();
		
		workedHours = workedHours * valueHour;
		
		System.out.println("ID = " + idEmployee);
		System.out.printf("SALÁRIO = %.2f%n", workedHours);
		sc.close();
		
	}
}
