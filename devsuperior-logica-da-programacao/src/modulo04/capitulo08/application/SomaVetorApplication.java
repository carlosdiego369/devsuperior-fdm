package modulo04.capitulo08.application;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class SomaVetorApplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.00");

			printOff("Quantos numeros voce vai digitar? ");
			int num = input.nextInt();

		double[] vetor = new double[num];
		double soma = 0, media;
		for (int i = 0; i < vetor.length; i++) {
			printOff("Digite um numero: ");
			vetor[i] = input.nextDouble();
			soma += vetor[i];
		}

		printOff("\nVALORES =");
		for (int i = 0; i < vetor.length; i++) {
				printOff(" " + vetor[i]);
		}
		
		printOff("\nSOMA = " + df.format(soma));
		media = soma / num;
		printOff("\nMEDIA = " + df.format(media));
		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}

	public static void errorMsg() {
		System.err.print("Entrada invalida\n");
	}

}
