package modulo04.capitulo03;

import java.util.Locale;
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		inputDeDados(input);
		input.close();
	}

	public static void inputDeDados(Scanner input) {
		imprimir("Digite a primeira nota: ");
		double nota1 = input.nextDouble();

		imprimir("Digite a segunda nota: ");
		double nota2 = input.nextDouble();

		verificadorDeNotas(nota1, nota2);
	}

	public static double verificadorDeNotas(double nota1, double nota2) {
		double mediaNota = nota1 + nota2;
		double aprovado = 60.0;
		boolean validaNota = mediaNota > aprovado;

		if (validaNota) {
			imprimir("NOTA FINAL = " + mediaNota);
		} else {
			imprimir("NOTA FINAL = " + mediaNota + "\n");
			imprimir("REPROVADO");
		}

		return mediaNota;
	}

	public static void imprimir(String text) {
		System.out.print(text);
	}

}
