package modulo04.capitulo02;

import java.util.Locale;
import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		inputEntradas(input);

		input.close();

	}

	public static void inputEntradas(Scanner input) {
		imprimir("Digite o valor de X: ");
		int x = input.nextInt();

		imprimir("Digite o valor de Y: ");
		int y = input.nextInt();

		imprimir("SOMA = " + somatoria(x, y));

	}

	public static int somatoria(int x, int y) {
		int soma = x + y;
		return soma;
	}

	public static void imprimir(String text) {
		System.out.print(text);
	}
}
