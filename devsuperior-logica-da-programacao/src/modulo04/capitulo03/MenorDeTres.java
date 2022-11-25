package modulo04.capitulo03;

import java.util.Scanner;

public class MenorDeTres {

	public static void main(String[] args) {
		menorValor();
	}

	public static void menorValor() {
		Scanner input = new Scanner(System.in);
		imprimir("Primeiro valor: ");
		int num1 = input.nextInt();

		imprimir("Segundo valor: ");
		int num2 = input.nextInt();

		imprimir("Terceiro valor: ");
		int num3 = input.nextInt();
		input.close();

		verificaMenorValor(num1, num2, num3);
	}

	public static int verificaMenorValor(int num1, int num2, int num3) {
		int menorValor;

		if (num1 < num2 && num1 < num3) {
			menorValor = num1;
			imprimir("MENOR = " + menorValor);
		} else if (num2 < num1 && num2 < num3) {
			menorValor = num2;
			imprimir("MENOR = " + menorValor);
		} else {
			menorValor = num3;
			imprimir("MENOR = " + menorValor);
		}
		return menorValor;
	}

	public static void imprimir(String text) {
		System.out.print(text);
	}

}
