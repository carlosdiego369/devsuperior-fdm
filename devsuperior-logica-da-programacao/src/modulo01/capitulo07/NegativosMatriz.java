package modulo01.capitulo07;

import java.util.Scanner;

public class NegativosMatriz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		negativosMatriz(input);

		input.close();
	}

	public static void negativosMatriz(Scanner input) {
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
		String valoresNegativos = "";
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor[i].length; j++) {
				imprimir("Elemento [" + i + "," + j + "]: ");
				vetor[i][j] = input.nextInt();

				if (vetor[i][j] < 0) {
					valoresNegativos += vetor[i][j] + "\n";
				}
			}
		}

		imprimir("VALORES NEGATIVOS: \n");
		imprimir(valoresNegativos);

	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

	public static void msgErro(String texto) {
		System.err.print(texto);
	}

}
