package modulo01.capitulo06;

import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		somadorDeVetor(input);

		input.close();

	}

	private static void somadorDeVetor(Scanner input) {
		boolean validacao = false;
		int num = 0;
		double somatoria = 0, media = 0;

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

		double[] vetorA = new double[num];

		for (int i = 0; i < vetorA.length; i++) {
			imprimir("Digite " + (i + 1) + " numero: ");
			vetorA[i] = input.nextInt();

		}

		imprimir("VALORES = ");
		for (int i = 0; i < vetorA.length; i++) {
			imprimir(vetorA[i] + " ");
			somatoria += vetorA[i];
		}

		imprimir("\nSOMA = " + somatoria);
		media = somatoria / num;
		imprimir("\nMEDIA = " + media);

	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

	public static void msgErro() {
		System.err.print("Valor invalido! Favor digite novamente: \n");
	}

}
