package modulo04.capitulo08.application;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetoresApplication {

	public static void main(String[] args) {

		printOff("Quantos valores vai ter cada vetor? ");
		int num = inputNumInt();

		int[] vetorA = new int[num];
		int[] vetorB = new int[num];
		printOff("Digite os valores do vetor A:\n");
		inputVetor(vetorA);
		printOff("Digite os valores do vetor B:\n");
		inputVetor(vetorB);

		printOff("VETOR RESULTANTE:\n");

		for (int i = 0; i < vetorA.length; i++) {
			printOff((vetorA[i] + vetorB[i]) + "\n");
		}

	}

	public static void inputVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = inputNumInt();
		}
	}

	public static int inputNumInt() {
		int num;
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		return num;
	}

	public static void printOff(String text) {
		System.out.print(text);
	}
}
