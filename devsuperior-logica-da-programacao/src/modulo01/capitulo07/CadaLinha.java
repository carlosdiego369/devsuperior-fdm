package modulo01.capitulo07;

import java.util.Scanner;

public class CadaLinha {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		cadaLinha(input);

		input.close();
	}

	public static void cadaLinha(Scanner input) {
		int ordem;

		boolean validador = false;

		imprimir("Qual a ordem da matriz? ");
		ordem = input.nextInt();
		while (!validador) {
			if (ordem > 10) {
				msgErro("Digite uma entrada valida (1~10): ");
				ordem = input.nextInt();
			} else {
				validador = true;
			}
		}

		int[][] vetor = new int[ordem][ordem];
		int[] maiorDaOrdem = new int[ordem];
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor[i].length; j++) {
				imprimir("Elemento [" + i + "," + j + "]: ");
				vetor[i][j] = input.nextInt();

				if (vetor[i][j] > maiorDaOrdem[i]) {
					maiorDaOrdem[i] = vetor[i][j];
				}
			}
		}

		imprimir("MAIOR ELEMENTO DE CADA LINHA: \n");
		for (int a : maiorDaOrdem) {
			imprimir(a + "\n");
		}

	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

	public static void msgErro(String texto) {
		System.err.print(texto);
	}

}
