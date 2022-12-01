package modulo04.capitulo04;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {

		inputDados();
	}

	public static void inputDados() {
		imprimir("Quantos casos voce vai digitar? ");
		int qtd = scannerNum();

		for (int i = 0; i < qtd; i++) {
			imprimir("Entre com o numerador: ");
			double numerador = scannerNumDouble();
			imprimir("Entre com o denominador: ");
			double denominador = scannerNumDouble();

			if (numerador < 0 && denominador == 0) {
				imprimir("DIVISAO IMPOSSIVEL\n");
			} else {
				imprimir("DIVISAO = ");
				imprimirDouble((numerador / denominador));
			}
		}
	}

	public static void imprimir(String text) {
		System.out.print(text);
	}

	public static void imprimirDouble(double num) {
		DecimalFormat df = new DecimalFormat("##0.00");
		System.out.println(df.format(num));
	}

	public static int scannerNum() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		return num;
	}

	public static double scannerNumDouble() {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double num = input.nextDouble();
		return num;
	}
}
