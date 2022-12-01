package modulo04.capitulo04;

import java.util.Locale;
import java.util.Scanner;

public class ValidacaoDeNota {

	public static void main(String[] args) {

		inputDados();
	}

	public static void inputDados() {
		imprimir("Digite a primeira nota: ");
		double nota1 = validadorDeNotas();

		imprimir("Digite a segunda nota: ");
		double nota2 = validadorDeNotas();

		imprimir("MEDIA = ");
		mediaDeNotas(nota1, nota2);
	}

	public static double validadorDeNotas() {
		boolean validacao = false;
		double num = 0;
		while (!validacao) {
			num = scannerNum();

			if (num < 0 || num > 10) {
				imprimir("Valor invalido! Tente novamente: ");
			} else {
				validacao = true;
			}
		}
		return num;
	}

	public static double mediaDeNotas(double nota1, double nota2) {
		double media;
		media = (nota1 + nota2) / 2;
		return imprimirNum(media);
	}

	public static double imprimirNum(double num) {
		System.out.print(num);
		return num;
	}

	public static void imprimir(String text) {
		System.out.print(text);
	}

	public static double scannerNum() {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		double num = input.nextDouble();

		return num;
	}
}
