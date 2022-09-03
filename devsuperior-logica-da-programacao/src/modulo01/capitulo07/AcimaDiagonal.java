package modulo01.capitulo07;

import java.util.Scanner;

public class AcimaDiagonal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		acimaDiagonal(input);

		input.close();
	}

	public static void acimaDiagonal(Scanner input) {
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

		int[][] elementos = new int[matriz][matriz];
		int somador = 0;

		for (int i = 0; i < elementos.length; i++) {
			for (int j = 0; j < elementos[i].length; j++) {
				imprimir("Elemento [" + i + "," + j + "]: ");
				elementos[i][j] = input.nextInt();

				if (i <= i && j <= i) {

				} else {
					somador += elementos[i][j];
				}

			}
		}
		imprimir("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = " + somador);
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

	public static void msgErro(String texto) {
		System.err.print(texto);
	}
}
