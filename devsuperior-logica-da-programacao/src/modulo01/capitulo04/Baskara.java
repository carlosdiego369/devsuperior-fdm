package modulo01.capitulo04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Baskara {

	public static void main(String[] args) {

		entradasCoeficiente();

	}

	public static void entradasCoeficiente() {
		double a, b, c;
		Scanner input = new Scanner(System.in);
		imprimir("Informe o valor de Coeficiente A: ");
		a = input.nextDouble();
		imprimir("Informe o valor de Coeficiente B: ");
		b = input.nextDouble();
		imprimir("Informe o valor de Coeficiente C: ");
		c = input.nextDouble();

		calcularDelta(a, b, c);

		input.close();
	}

	public static void calcularDelta(double a, double b, double c) {
		double delta, x1, x2;
		DecimalFormat df = new DecimalFormat("##0.0000");

		delta = Math.pow(b, 2) + (-4 * (a * c));

		if (delta >= 0) {

			x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
			x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

			imprimir("X1 = " + df.format(x1));
			imprimir("\nX2 = " + df.format(x2));

		} else {
			imprimir("Esta equação não possui raizes reais");
		}

	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

}
