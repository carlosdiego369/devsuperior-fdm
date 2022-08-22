package modulo01.capitulo05;

import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		validadorCrescente(input);

		input.close();
	}

	public static void validadorCrescente(Scanner input) {
		int num1 = 0, num2 = 0;

		boolean condicao = num1 == num2;

		while (condicao) {

			imprimir("Digite dois numeros");
			num1 = input.nextInt();
			num2 = input.nextInt();

			if (num1 > num2) {
				imprimir("\nDECRESCENTE!");
			} else if (num1 < num2) {
				imprimir("\nCRESCENTE!");
			} else {
				condicao = false;
			}
		}
	}

	public static void imprimir(String texto) {
		System.out.println(texto);
	}
}
