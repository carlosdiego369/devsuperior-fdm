package modulo04.capitulo04;

import java.util.Scanner;

public class SomaImpares {

	public static void main(String[] args) {

		inputDados();
	}

	public static void inputDados() {
		imprimir("Digite dois numeros:\n");
		int numInicial = scannerNum();
		int numFinal = scannerNum();

		int somador = 0;
		if (numInicial > 0 && numFinal < 0) {
			for (; numFinal < numInicial; numInicial--) {
				if (numInicial % 2 == 1 || numInicial % 2 < 0) {
					somador += numInicial;
				}
			}
			imprimir("SOMA DOS IMPARES = " + somador);
			
		} else if (numInicial < 0 && numFinal > 0) {
			for (; numInicial < numFinal; numFinal--) {
				if (numFinal % 2 == 1 || numFinal % 2 < 0) {
					somador += numFinal;
				}
			}
			imprimir("SOMA DOS IMPARES = " + somador);
		} else if (numInicial < numFinal) {
			numInicial++;
			for (; numInicial < numFinal; numInicial++) {
				if (numInicial % 2 == 1) {
					somador += numInicial;
				}
			}
			imprimir("SOMA DOS IMPARES = " + somador);
		} else {
			numFinal++;
			for (; numInicial > numFinal; numFinal++) {
				if (numFinal % 2 == 1) {
					somador += numFinal;
				}
			}
			imprimir("SOMA DOS IMPARES = " + somador);
		}
	}

	public static void imprimir(String text) {
		System.out.print(text);
	}

	public static int scannerNum() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		return num;
	}
}
