package modulo04.capitulo02;

import java.util.Locale;
import java.util.Scanner;

public class Idades {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		inputEntradas(input);

		input.close();

	}

	public static void inputEntradas(Scanner input) {
		imprimir("Dados da primeira pessoa:\n");
		imprimir("Nome: ");
		String nome = input.nextLine();
		imprimir("Idade: ");
		int idade = input.nextInt();
		input.nextLine();

		imprimir("Dados da primeira pessoa:\n");
		imprimir("Nome: ");
		String nome2 = input.nextLine();
		imprimir("Idade: ");
		int idade2 = input.nextInt();

		imprimir("A idade média de " + nome + " e " + nome2 + " é de " + calculoMedia(idade, idade2) + " anos");

	}

	public static double calculoMedia(double idade, double idade2) {
		double media = (idade + idade2) / 2;
		return media;
	}

	public static void imprimir(String text) {
		System.out.print(text);
	}
}
