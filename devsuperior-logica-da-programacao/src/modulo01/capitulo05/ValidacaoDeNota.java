package modulo01.capitulo05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValidacaoDeNota {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		validacaoDeNotas(input);

		input.close();

	}

	public static double validacaoDeNotas(Scanner input) {
		double media = 0;
		boolean validador = false;

		imprimir("Digite a primeira nota:");
		double nota1 = input.nextDouble();
		while (!validador) {
			if (nota1 < 0 || nota1 > 10) {
				imprimir("Valor invalido! Tente novamente: ");
				nota1 = input.nextDouble();
			}else {
				validador = true;
			}

			validador = false;
			imprimir("Digite a segunda nota:");
			double nota2 = input.nextDouble();
			while (!validador) {
				if (nota2 < 0 || nota2 > 10) {
					imprimir("Valor invalido! Tente novamente: ");
					nota2 = input.nextDouble();
				}else {
					validador = true;
				}
			}
			media = (nota1 + nota2) / 2;
		}
		imprimir("MEDIA = ");
		conversor(media);
		return media;
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}
	
	public static void conversor(double num) {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		imprimir(df.format(num));
	}

}
