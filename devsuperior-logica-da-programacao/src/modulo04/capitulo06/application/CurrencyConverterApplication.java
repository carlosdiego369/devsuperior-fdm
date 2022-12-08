package modulo04.capitulo06.application;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

import modulo04.capitulo06.entities.CurrencyConverter;

public class CurrencyConverterApplication {

	public static void main(String[] args) {

		printOut("Qual o valor do dólar? ");
		double price = input();

		printOut("Quantos dólares serão comprados? ");
		double dollarValue = input();

		printOut("Valor a ser pago em reais = ");
		printOutDouble(CurrencyConverter.dollarToReal(dollarValue, price));
	}

	public static void printOut(String text) {
		System.out.print(text);
	}

	public static void printOutDouble(double num) {
		DecimalFormat df = new DecimalFormat("###.00");
		System.out.print(df.format(num));
	}

	public static double input() {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double num = input.nextDouble();
		return num;
	}
}
