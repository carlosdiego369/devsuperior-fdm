package modulo01.capitulo03;

import java.util.Scanner;

public class Duracao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		imprimir("Digite a duração em segundos: ");
		Integer entrada = input.nextInt();

		int horas = entrada / 3600;
		int minutos = (entrada - (horas * 3600)) / 60;
		int segundos = entrada % 60;

		imprimir(horas + ":" + minutos + ":" + segundos);

		input.close();

	}

	static void imprimir(String texto) {
		System.out.print(texto);
	}
}