package modulo01.capitulo08;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		conversorDeTemperatura(input);

		input.close();
	}

	public static double conversorDeTemperatura(Scanner input) {
		imprimir("Digite a temperatura em Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		double conversao = calculoDaConversao(fahrenheit);
		imprimir("Temperatura em Celsius = ");
		conversao(conversao);
		return conversao;
	}

	public static double conversao(double num) {
		DecimalFormat df = new DecimalFormat("#,###.00");
		imprimir(df.format(num));
		return num;
	}

	public static double calculoDaConversao(double fahrenheit) {
		double celsius = (fahrenheit - 32) / 1.8;
		return celsius;
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}
}
