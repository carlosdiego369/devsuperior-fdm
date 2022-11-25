package modulo04.capitulo03;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		conversorDeTemperatura();
	}

	public static void conversorDeTemperatura() {
		imprimir("Voce vai digitar a temperatura em qual escala (C/F)?:");
		String escala = input();
		calculoTemperatura(escala);
	}

	public static double calculoTemperatura(String escala) {
		double temperatura = 0;
		if (escala.equalsIgnoreCase("F")) {
			imprimir("Digite a temperatura em Fahrenheit: ");
			temperatura = inputNum();
			temperatura = (temperatura - 32) * 5/9;
			
			imprimir("Temperatura equivalente em Celsius: ");
			imprimirDecimais(temperatura);

		} else if (escala.equalsIgnoreCase("C")) {
			imprimir("Digite a temperatura em Celsius: ");
			temperatura = inputNum();
			
			temperatura = ((temperatura * 1.8) + 32);
			
			imprimir("Temperatura equivalente em Fahrenheit: ");
			imprimirDecimais(temperatura);
		} else {
			msgError();
		}
		return temperatura;
	}

	public static String input() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String entrada = input.nextLine();

		return entrada;
	}

	public static double inputNum() {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double num = input.nextDouble();
		return num;
	}

	public static void imprimir(String text) {
		System.out.print(text);
	}

	public static void msgError() {
		System.err.print("Entrada inválida!");
	}

	public static double imprimirDecimais(double num) {
		DecimalFormat df = new DecimalFormat("#0.00");
		imprimir(df.format(num));
		return num;
	}
}
