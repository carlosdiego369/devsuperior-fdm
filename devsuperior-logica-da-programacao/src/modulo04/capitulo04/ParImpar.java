package modulo04.capitulo04;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {

		inputDados();
	}

	public static void inputDados() {
		imprimir("Quantos numeros voce vai digitar? ");
		int qtd = scannerNum();

		for (int i = 0; i < qtd; i++) {
			imprimir("Digite o " + (i + 1) + "º numero: ");
			int num = scannerNum();

			if (num == 0) {
				imprimir("NULO\n");
			} else if (num % 2 == 0 && num < 0) {
				imprimir("PAR NEGATIVO\n");
			} else if (num % 2 == -1 && num <= 0) {
				imprimir("IMPAR NEGATIVO\n");
			} else if (num % 2 == 0) {
				imprimir("PAR\n");
			} else if (num % 2 == 1) {
				imprimir("IMPAR\n");
			}
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
