package modulo04.capitulo08.application;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMediaApplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.000");

		printOff("Quantos elementos vai ter cada vetor? ");
		int num = input.nextInt();

		double[] vetor = new double[num];
		double sun = 0;
		for (int i = 0; i < vetor.length; i++) {
			printOff("Digite um numero: ");
			vetor[i] = input.nextDouble();
			sun += vetor[i];
		}

		sun = sun / num;
		printOff("\nMEDIA DO VETOR = " + df.format(sun));
		printOff("\nELEMENTOS ABAIXO DA MEDIA:");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < sun) {
				printOff("\n" + vetor[i]);
			}
		}

		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}
}
