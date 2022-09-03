package modulo01.capitulo07;

import java.util.Scanner;

public class MatrizGeral {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		matrizGeral(input);

		input.close();
	}

	public static void matrizGeral(Scanner input) {
		int matriz;

		boolean validador = false;

		imprimir("Qual a ordem da matriz? ");
		matriz = input.nextInt();
		while (!validador) {
			if (matriz > 10) {
				msgErro("Digite uma entrada valida (1~10): ");
				matriz = input.nextInt();
			} else {
				validador = true;
			}
		}

		double[][] elementos = new double[matriz][matriz];
		int somador = 0;

		for (int i = 0; i < elementos.length; i++) {
			for (int j = 0; j < elementos[i].length; j++) {
				imprimir("Elemento [" + i + "," + j + "]: ");
				elementos[i][j] = input.nextInt();

				if (elementos[i][j] > 0) {
					somador += elementos[i][j];
				}

			}
		}
		imprimir("\nSOMA DOS POSITIVOS: " + somador);

		imprimir("\n\nEscolha uma linha: ");
		int linha = input.nextInt();

		validador = false;

		while (!validador) {
			if (linha > matriz) {
				msgErro("Digite uma entrada valida (1~10): ");
				linha = input.nextInt();
			} else {
				validador = true;
			}
		}

		for (int i = 0; i < linha; i++) {
			imprimir("LINHA ESCOLHIDA: ");
			for (int j = 0; j < matriz; j++) {
				imprimir(elementos[linha][j] + " ");
			}
		}

		imprimir("\n\nEscolha uma coluna: ");
		int coluna = input.nextInt();

		validador = false;

		while (!validador) {
			if (coluna > matriz) {
				msgErro("Digite uma entrada valida (1~10): ");
				coluna = input.nextInt();
			} else {
				validador = true;
			}
		}

		imprimir("COLUNA ESCOLHIDA: ");
		for (int i = 0; i < matriz; i++) {
			imprimir(elementos[i][coluna] + " ");
		}

		imprimir("\n\nDIAGONAL PRINCIPAL: ");
		for (int i = 0; i < matriz; i++) {
			for (int j = 0; j < matriz; j++) {
				if (i == j) {
					imprimir(elementos[i][j] + " ");
				}
			}
		}

		imprimir("\n\nMATRIZ ALTERADA: ");
		for (int i = 0; i < elementos.length; i++) {
			imprimir("\n");
			for (int j = 0; j < elementos[i].length; j++) {
				if (elementos[i][j] < 0) {
					double num = elementos[i][j] * elementos[i][j];
					imprimir(num + " ");
				} else {
					imprimir(elementos[i][j] + " ");
				}
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
