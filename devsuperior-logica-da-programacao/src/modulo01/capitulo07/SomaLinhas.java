package modulo01.capitulo07;

import java.util.Scanner;

public class SomaLinhas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		somaLinhas(input);

		input.close();
	}

	public static void somaLinhas(Scanner input) {
		int linhas, colunas;

		boolean validador = false;

		imprimir("Qual a quantidade de linhas da matriz? ");
		linhas = input.nextInt();
		while (!validador) {
			if (linhas > 10) {
				msgErro("Digite uma entrada valida (1~10): ");
				linhas = input.nextInt();
			} else {
				validador = true;
			}
		}

		validador = false;
		imprimir("Qual a quantidade de colunas da matriz? ");
		colunas = input.nextInt();
		while (!validador) {
			if (colunas > 10) {
				msgErro("Digite uma entrada valida (1~10): ");
				colunas = input.nextInt();
			} else {
				validador = true;
			}
		}

		int[][] vetor = new int[linhas][colunas];
		int[] somador = new int[linhas];
		for (int i = 0; i < vetor.length; i++) {
			imprimir("Digite os elementos da " + (i + 1) + "a. linha:\n");
			for (int j = 0; j < vetor[i].length; j++) {
				vetor[i][j] = input.nextInt();
				somador[i] += vetor[i][j];
			}
		}

		imprimir("VETOR GERADO: \n");
		for (double a : somador) {;
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
