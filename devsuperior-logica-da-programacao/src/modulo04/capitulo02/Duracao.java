package modulo04.capitulo02;

import java.util.Locale;
import java.util.Scanner;

public class Duracao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		inputEntradas(input);

		input.close();

	}

	public static void inputEntradas(Scanner input) {
		imprimir("Digite a duracao em segundos: ");
		int duracao = input.nextInt();

		conversao(duracao);
	}

	public static int conversao(int duracao) {
		int horas = duracao / 3600;
		int minutos = (duracao - (horas * 3600)) / 60;
		int segundos = duracao % 60;

		imprimir(horas + ":" + minutos + ":" + segundos);
		return horas;
	}

	public static void imprimir(String text) {
		System.out.print(text);
	}

}
