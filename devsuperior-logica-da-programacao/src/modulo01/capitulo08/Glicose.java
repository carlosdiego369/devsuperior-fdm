package modulo01.capitulo08;

import java.util.Scanner;

public class Glicose {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		aferidorDeGlicose(input);

		input.close();
	}

	public static void aferidorDeGlicose(Scanner input) {
		imprimir("Digite o valor da glicose: ");
		double valorGlicose = input.nextDouble();

		calculoValoresGlicose(valorGlicose);
	}

	public static double calculoValoresGlicose(double valorGlicose) {

		if (valorGlicose > 70 && valorGlicose < 100) {
			imprimir("Classificação: Normal");
		} else if (valorGlicose > 100 && valorGlicose < 140) {
			imprimir("Classificação: Elevado");
		} else {
			imprimir("Classificação: Diabetes");
		}
		return valorGlicose;
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}
}
