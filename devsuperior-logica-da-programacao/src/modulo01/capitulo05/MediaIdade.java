package modulo01.capitulo05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaIdade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		validadorMedia(input);

		input.close();
	}

	public static void validadorMedia(Scanner input) {
		double num = 0;
		int cont = 0;

		boolean validador = num < 0;

		imprimir("Digite as idades:\n");
		while (!validador) {

			int entrada = input.nextInt();
			num += entrada;

			if (num < 0) {
				imprimir("IMPOSSIVEL CALCULAR");
				validador = true;
			} else if (num > 0 && entrada < 0) {
				validador = true;
				num = (num - entrada);

				double media = num / cont;

				imprimir("MÉDIA: ");
				conversorDouble(media);
			}
			cont++;
		}
	}

	public static double conversorDouble(double num) {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		imprimir(df.format(num));
		return num;
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}
}
