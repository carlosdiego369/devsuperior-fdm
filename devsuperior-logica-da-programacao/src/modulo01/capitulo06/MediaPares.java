package modulo01.capitulo06;

import java.util.Scanner;

public class MediaPares {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		verificadorMediaPares(input);

		input.close();
	}

	public static void verificadorMediaPares(Scanner input) {

		int num = 0, cont = 0;
		double media = 0;

		imprimir("Quantas elementos vai ter o vetor? ");
		num = input.nextInt();

		int[] vetor = new int[num];

		for (int i = 0; i < vetor.length; i++) {
			imprimir("Digite um numero: ");
			vetor[i] = input.nextInt();
			if (vetor[i] % 2 == 0) {
				media += vetor[i];
				cont++;
			}
		}

		if (cont > 0) {
			media = media / cont;
			imprimir("MEDIA DOS PARES = " + media);
		} else {
			imprimir("NENHUM NUMERO PAR");
		}
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

}
