package modulo04.capitulo04;

import java.util.Scanner;

public class Quadrante {

	public static void main(String[] args) {

		inputDados();
	}

	public static void inputDados() {
		boolean validacao = false;
		do {
			imprimir("Digite os valores das coordenadas X e Y:");
			int x = scannerNum();
			int y = scannerNum();

			if (x == 0 || y == 0) {
				validacao = true;
			} else if (x > 0 && y > 0) {
				imprimir("QUADRANTE Q1");
			} else if (x < 0 && y > 0) {
				imprimir("QUADRANTE Q2");
			} else if (x < 0 && y < 0) {
				imprimir("QUADRANTE Q3");
			} else if (x > 0 && y < 0) {
				imprimir("QUADRANTE Q4");
			}

		} while (!validacao);
	}

	public static void imprimir(String text) {
		System.out.println(text);
	}

	public static int scannerNum() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int num = input.nextInt();

		return num;
	}
}
