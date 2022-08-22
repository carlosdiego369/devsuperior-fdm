package modulo01.capitulo04;

import java.util.Scanner;

public class Glicose {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		imprimir("Digite a medida da glicose: ");
		Double medida = input.nextDouble();

		classificadorDeGlicose(medida);

		input.close();
	}

	public static double classificadorDeGlicose(double medida) {

		if (medida <= 90) {
			imprimir("Classificação: normal");
		} else if (medida > 90 && medida <= 140) {
			imprimir("Classificação: elevado");
		} else {
			imprimir("Classificação: diabetes");
		}

		return medida;
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

}
