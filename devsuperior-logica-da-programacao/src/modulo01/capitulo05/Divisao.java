package modulo01.capitulo05;

import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		verificadorDeDivisao(input);

		input.close();
	}

	public static void verificadorDeDivisao(Scanner input) {

		imprimir("Quantos casos voce vai digitar? ");
		int casos = input.nextInt();

		casos--;
		for (int i = 0; i <= casos; i++) {

			imprimir("Entre com o numerdor: ");
			double numerador = input.nextDouble();
			imprimir("Entre com o denominador: ");
			double denominador = input.nextDouble();

			double divisao = numerador / denominador;

			if (numerador <= 0 && denominador <= 0) {
				imprimir("DIVISAO IMPOSSIVEL\n");
			} else {
				imprimir("MEDIA = " + divisao + "\n");
			}
		}
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

}
