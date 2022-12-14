package modulo04.capitulo08.application;

import java.util.Locale;
import java.util.Scanner;

public class NegativosApplication {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		int num = 0;

		boolean validate = false;
		while (!validate) {
			printOff("Quantos numeros voce vai digitar? ");
			num = input.nextInt();
			if (num > 10) {
				errorMsg();
				validate = false;
			} else {
				validate = true;
			}
		}

		int[] vetor = new int[num];

		for (int i = 0; i < vetor.length; i++) {
			printOff("Digite um numero: ");
			vetor[i] = input.nextInt();
		}

		printOff("NUMEROS NEGATIVOS: ");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < 0) {
				printOff("\n" + vetor[i]);
			}
		}

		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}

	public static void errorMsg() {
		System.err.print("Entrada invalida\n");
	}

}
