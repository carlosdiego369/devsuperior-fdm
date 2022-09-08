package modulo01.capitulo08;

import java.util.Scanner;

public class Exame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		aferidorDeGlicose(input);

		input.close();
	}

	public static void aferidorDeGlicose(Scanner input) {
		imprimir("Medida de glicose: ");
		double valorGlicose = input.nextDouble();
		calculoValoresGlicose(valorGlicose);
		
		imprimir("\nMedida de triglicerídeos: ");
		double triglicerideos = input.nextDouble();
		calculoValoresTriglicerideos(triglicerideos);
		
		imprimir("\nMedida de colesterol: ");
		double colesterol = input.nextDouble();
		calculoValorescolesterol(colesterol);
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
	
	public static double calculoValoresTriglicerideos(double triglicerideos) {

		if (triglicerideos < 200) {
			imprimir("Classificação: Desejável");
		} else if (triglicerideos > 200) {
			imprimir("Classificação: Aumentado");
		} 

		return triglicerideos;
	}
	
	public static double calculoValorescolesterol(double colesterol) {

		if (colesterol < 200) {
			imprimir("Classificação: Desejável");
		} else if (colesterol > 200 && colesterol < 240) {
			imprimir("Classificação: Limiar");
		} else {
			imprimir("Classificação: Elevado");
		}

		return colesterol;
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}


}
