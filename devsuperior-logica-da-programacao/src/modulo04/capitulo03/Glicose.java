package modulo04.capitulo03;

import java.util.Locale;
import java.util.Scanner;

public class Glicose {

	public static void main(String[] args) {
		inputDadosDaGlicose();
	}

	public static void inputDadosDaGlicose() {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		imprimir("Digite a medida da glicose: ");
		double medida = input.nextDouble();

		calculoVerificadorDeGlicose(medida);

		input.close();
	}

	public static double calculoVerificadorDeGlicose(double medida) {
		if (medida <= 100) {
			imprimir("Classificação: normal ");
		} else if (medida > 100 && medida <= 140) {
			imprimir("Classificação: elevado ");
		} else {
			imprimir("Classificação: diabetes ");
		}
		return medida;
	}

	public static void imprimir(String text) {
		System.out.print(text);
	}
}
