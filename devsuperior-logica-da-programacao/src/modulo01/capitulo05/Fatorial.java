package modulo01.capitulo05;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		verificadorDeFatorial(input);

		input.close();
	}

	public static void verificadorDeFatorial(Scanner input) {

		int n = 0;
		boolean validador = n < 15;

		while (validador) {
			imprimir("Digite o valor de N? ");
			n = input.nextInt();
			if (validador) {
				validador = false;
			}
		}

		if (n == 0 || n == 1) {
			n = 1;
		} else {

			for (int i = n; i >= 2;) {
				i--;
				n = n * i;

			}
		}

		imprimir("FATORIAL = " + n);
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

}
