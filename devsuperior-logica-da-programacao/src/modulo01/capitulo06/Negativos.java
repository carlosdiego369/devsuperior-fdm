package modulo01.capitulo06;

import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		numerosNegativos(input);

		input.close();

	}

	private static void numerosNegativos(Scanner input) {
		boolean validacao = false;
		int num = 0;

		while (!validacao) {
			imprimir("Quantos numeros voce vai digitar? ");
			num = input.nextInt();
			input.nextLine();

			if (num > 10) {
				msgErro();
				validacao = false;
			} else {
				validacao = true;
			}
		}

		int[] vetorA = new int[num];

		for (int i = 0; i < vetorA.length; i++) {
			imprimir("Digite " + (i + 1) + " numero: ");
			vetorA[i] = input.nextInt();
		}

		imprimir("NUMEROS NEGATIVOS:\n");

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] < 0) {
				imprimir(vetorA[i] + "\n");
			}
		}
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

	public static void msgErro() {
		System.err.print("Valor invalido! Favor digite novamente: \n");
	}
}
