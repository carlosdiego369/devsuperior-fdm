package modulo04.capitulo04;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {

		inputDados();
	}

	public static void inputDados() {
		imprimir("Quantos casos voce vai digitar? ");
		int qtd = scannerNum();

		for (int i = 0; i < qtd; i++) {
			int peso1 = 2, peso2 = 3, peso3 = 5;
			imprimir("Digite tres numero:\n");
			double num1 = scannerNumDouble();
			double num2 = scannerNumDouble();
			double num3 = scannerNumDouble();

			double media = ((num1 * peso1) + (num2 * peso2) + (num3 * peso3)) / (peso1 + peso2 + peso3);
			imprimir("MEDIA = ");
			imprimirDouble(media);
		}
	}

	public static void imprimir(String text) {
		System.out.print(text);
	}
	public static void imprimirDouble(double num) {
		DecimalFormat df = new DecimalFormat("###.0");
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
