package modulo01.capitulo05;

import java.util.Scanner;

public class Quadrante {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		verificadorDeQuadrante(input);

		input.close();
	}

	public static void verificadorDeQuadrante(Scanner input) {

		boolean verificador = false;

		while (!verificador) {
			imprimir("Digite os valores das coordenadas X e Y:");
			int x = input.nextInt();
			int y = input.nextInt();

			if (x == 0 || y == 0) {
				verificador = true;
			} else if (x > 0 && y > 0) {
				imprimir("QUADRANTE Q1");
			} else if (x < 0 && y > 0) {
				imprimir("QUADRANTE Q2");
			} else if (x < 0 && y < 0) {
				imprimir("QUADRANTE Q3");
			} else if (x > 0 && y < 0) {
				imprimir("QUADRANTE Q4");
			}
		}

	}

	public static void imprimir(String texto) {
		System.out.println(texto);
	}

}
