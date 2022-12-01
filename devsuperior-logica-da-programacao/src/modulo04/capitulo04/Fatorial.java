package modulo04.capitulo04;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		inputDados();
	}

	public static void inputDados() {
		imprimir("Digite o valor de N: ");
		int n = scannerNum();

		if (n == 0 || n == 1) {
			imprimir("FATORIAL = 1");
		} else {

			for (int i = n; 2 < i; i--) {

				n *= (i - 1);
			}
			imprimir("FATORIAL = " + n);
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
