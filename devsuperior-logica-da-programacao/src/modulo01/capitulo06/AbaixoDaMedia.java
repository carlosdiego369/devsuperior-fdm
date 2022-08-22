package modulo01.capitulo06;

import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		verificadorDeMedia(input);

		input.close();
	}

	private static void verificadorDeMedia(Scanner input) {

		int num = 0;

		imprimir("Quantas elementos vai ter o vetor? ");
		num = input.nextInt();

		double[] elemento = new double[num];

		imprimir("Digite os valores do vetor A: \n");
		vetorizacao(elemento, num, input);

	}

	public static void vetorizacao(double[] vetor, int num, Scanner input) {
		double media = 0;
		for (int i = 0; i < vetor.length; i++) {
			imprimir("Digite um numero: ");
			vetor[i] = input.nextDouble();
			media += vetor[i];
		}
		media = media / num;
		imprimir("\nMEDIA DO VETOR = " + media);

		imprimir("\nELEMENTOS ABAIXO DA MEDIA: \n");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < media) {
				imprimir(vetor[i] + "\n");
			}

		}
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}
}
