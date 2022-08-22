package modulo01.capitulo05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		verificadorDeMedia(input);

		input.close();
	}

	public static void verificadorDeMedia(Scanner input) {

		int peso1 = 2, peso2 = 3, peso3 = 5, totalPeso = 2 + 3 + 5;
		imprimir("Quantos casos voce vai digitar? ");
		int casos = input.nextInt();

		casos--;
		for (int i = 0; i <= casos; i++) {

			imprimir("Digite tres numeros: \n");
			double num1 = input.nextDouble();
			double num2 = input.nextDouble();
			double num3 = input.nextDouble();

			double media = ((num1 * peso1) + (num2 * peso2) + (num3 * peso3)) / totalPeso;

			imprimir("MEDIA = ");
			conversor(media);
			imprimir("\n");
		}
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

	public static double conversor(double num) {
		DecimalFormat df = new DecimalFormat("#,###.0");
		imprimir(df.format(num));
		return num;
	}

}
