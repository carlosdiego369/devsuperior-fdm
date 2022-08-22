package modulo01.capitulo04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		imprimir("Você vai digitar a temperatura em qual escala (C/F)? ");
		String entrada = input.next();
		Double grau;

		if (entrada.equals("C") || entrada.equals("c")) {
			imprimir("Digite a temperatura em Celsius: ");
			grau = input.nextDouble();
			calculoGrauCelsius(input, grau);
			
		} else if (entrada.equals("F") || entrada.equals("f")) {
			imprimir("Digite a temperatura em Fahrenheit: ");
			grau = input.nextDouble();
			calculoGrauFahrenheit(input, grau);
			
		} else {
			msgError("Entrada inválida");
		}

		input.close();
	}

	public static double calculoGrauCelsius(Scanner scanner, double grau) {
		DecimalFormat df = new DecimalFormat("#,###.00");
		grau = ((grau * 9) / 5) + 32;
		imprimir("Temperatura equivalente em Celsius: " + df.format(grau));
		return grau;
	}

	public static double calculoGrauFahrenheit(Scanner scanner, double grau) {
		DecimalFormat df = new DecimalFormat("#,###.00");
		grau = ((grau - 32) * 5) / 9;
		imprimir("Temperatura equivalente em Fahrenheit: " + df.format(grau));
		return grau;
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

	public static void msgError(String texto) {
		System.err.print(texto);
	}
}
