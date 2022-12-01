package modulo04.capitulo04;

import java.util.Scanner;

public class DentroFora {

	public static void main(String[] args) {

		inputDados();
	}

	public static void inputDados() {
		imprimir("Quantos numeros voce vai digitar? ");
		int dentro = 0, fora = 0;
		int qtd = scannerNum();
		
		for (int i = 0; i < qtd; i++) {
			imprimir("Digite o " + (i + 1) + "º numero: ");
			int num = scannerNum();

			if (num >= 10 && num <= 20) {
				dentro++;
			} else {
				fora++;
			}
		}
		imprimir(dentro + " DENTRO\n");
		imprimir(fora + " FORA");
	}

	public static void imprimir(String text) {
		System.out.print(text);
	}

	public static int scannerNum() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		return num;
	}
}
