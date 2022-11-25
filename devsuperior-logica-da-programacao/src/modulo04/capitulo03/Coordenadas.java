package modulo04.capitulo03;

import java.util.Locale;
import java.util.Scanner;

public class Coordenadas {

	public static void main(String[] args) {
		inputCodigo();
	}

	public static void inputCodigo() {
		imprimir("Valor de X: ");
		double x = inputNum();

		imprimir("Valor de Y: ");
		double y = inputNum();

		verificadorDePosicao(x, y);
	}

	public static void verificadorDePosicao(double x, double y) {

		if (x > 0 && y > 0) {
			imprimir("Q1");

		} else if (x < 0 && y > 0) {
			imprimir("Q2");

		} else if (x < 0 && y < 0) {
			imprimir("Q3");

		} else if (x > 0 && y < 0) {
			imprimir("Q4");

		} else if (x > 0 && y == 0) {
			imprimir("Eixo X");

		} else if (x == 0 && y > 0) {
			imprimir("Eixo Y");

		} else {
			imprimir("Origem");
		}
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
}
