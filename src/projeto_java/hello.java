package projeto_java;

import java.util.Locale;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		// abaixo serve para colocar os decimais em formato do estados unidos
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		System.out.println("Record: ");
		System.out.printf("%d years old, code %d and gender: %c%n", age, code, gender);
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US Decimal point: %.3f%n", measure);

	}

}
