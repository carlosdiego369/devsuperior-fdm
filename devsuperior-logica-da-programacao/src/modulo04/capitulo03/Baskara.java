package modulo04.capitulo03;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Baskara {

	public static void main(String[] args) {
		entradasCoeficiente();
	}

	public static void entradasCoeficiente() {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		imprimir("Coeficiente a: ");
		double a = input.nextDouble();

		imprimir("Coeficiente b: ");
		double b = input.nextDouble();

		imprimir("Coeficiente c: ");
		double c = input.nextDouble();

		calcularDelta(a, b, c);

		input.close();
	}

	public static boolean calcularDelta(double a, double b, double c) {

		double delta = Math.pow(b, 2) - (4 * a * c);

		boolean validaEquacao = delta < 0;

		if (validaEquacao) {
			imprimir("A equação do segundo grau não possui raízes reais");
		} else {
			double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
			double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

			imprimir("X1 = ");
			imprimirDecimais(x1);
			imprimir("\nX2 = ");
			imprimirDecimais(x2);
		}

		return false;
	}

	public static void imprimir(String text) {
		System.out.print(text);
	}

	public static double imprimirDecimais(double num) {
		DecimalFormat df = new DecimalFormat("#0.0000");
		imprimir(df.format(num));
		return num;
	}

}
