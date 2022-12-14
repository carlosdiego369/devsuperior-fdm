package modulo04.capitulo08.application;

import java.util.Locale;
import java.util.Scanner;

public class MediaParesApplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		printOff("Quantos elementos vai ter cada vetor? ");
		int num = input.nextInt();

		int[] vetor = new int[num];
		double sun = 0;
		int even = 0;
		for (int i = 0; i < vetor.length; i++) {
			printOff("Digite um numero: ");
			vetor[i] = input.nextInt();
			if (vetor[i] % 2 == 0) {
				sun += vetor[i];
				even++;
			}
		}

		sun = sun / even;
		if (even == 0) {
			printOff("NENHUM NUMERO PAR");
		} else {

			printOff("MEDIA DO VETOR = " + sun);
		}

		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}
}
