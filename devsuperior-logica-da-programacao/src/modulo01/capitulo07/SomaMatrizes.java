package modulo01.capitulo07;

import java.util.Scanner;

public class SomaMatrizes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		somaMatrizes(input);

		input.close();
	}

	public static void somaMatrizes(Scanner input) {
		int linha, coluna;

		boolean validador = false;

		imprimir("Quantas linhas vai ter cada matriz? ");
		linha = input.nextInt();
		while (!validador) {
			if (linha > 10) {
				msgErro("Digite uma entrada valida (1~10): ");
				linha = input.nextInt();
			} else {
				validador = true;
			}
		}

		imprimir("Quantas colunas vai ter cada matriz? ");
		coluna = input.nextInt();
		while (!validador) {
			if (coluna > 10) {
				msgErro("Digite uma entrada valida (1~10): ");
				coluna = input.nextInt();
			} else {
				validador = true;
			}
		}

		int[][] vetorA = new int[linha][coluna];
		int[][] vetorB = new int[linha][coluna];
		int[][] vetorC = new int[linha][coluna];

		imprimir("Digite os valores da matriz A:\n");
		for (int i = 0; i < vetorA.length; i++) {
			for (int j = 0; j < vetorA[i].length; j++) {
				imprimir("Elemento [" + i + "," + j + "]: ");
				vetorA[i][j] = input.nextInt();

			}
		}
		imprimir("Digite os valores da matriz B:\n");
		for (int i = 0; i < vetorB.length; i++) {
			for (int j = 0; j < vetorB[i].length; j++) {
				imprimir("Elemento [" + i + "," + j + "]: ");
				vetorB[i][j] = input.nextInt();

			}
		}
		imprimir("MATRIZ SOMA:");
		for (int i = 0; i < vetorC.length; i++) {
			imprimir("\n");
			for (int j = 0; j < vetorC[i].length; j++) {
				vetorC[i][j] = vetorA[i][j] + vetorB[i][j];
				imprimir(vetorC[i][j] + " ");
			}
		}
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

	public static void msgErro(String texto) {
		System.err.print(texto);
	}
}
