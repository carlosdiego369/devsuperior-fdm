package modulo04.capitulo08.application;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

import modulo04.capitulo08.entities.Pessoa;

public class DadosPessoasApplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		printOff("Quantos alunos serao digitados? ");
		int num = input.nextInt();

		Pessoa[] vetor = new Pessoa[num];

		double height = 0, greaterHeight = 0, shorterHeight = height, averageWomanHeight = 0;
		int man = 0;
		Character genre;

		for (int i = 0; i < vetor.length; i++) {
			printOff("Altura da " + (i + 1) + "a pessoa: ");
			height = input.nextDouble();
			input.nextLine();
			printOff("Genero da " + (i + 1) + "a pessoa: ");
			genre = input.next().charAt(0);

			if (height > greaterHeight) {
				greaterHeight = height;
				shorterHeight = height;
			}

			if (height < shorterHeight) {
				shorterHeight = height;
			}

			if (genre.equals('F') || genre.equals('f')) {
				averageWomanHeight += height;
			} else {
				man++;
			}
			vetor[i] = new Pessoa(height, genre);
		}
		DecimalFormat df = new DecimalFormat("##0.00");
		printOff("Menor altura = " + shorterHeight);
		printOff("\nMaior altura = " + greaterHeight);
		printOff("\nMedia das alturas das mulheres = " + df.format((averageWomanHeight / (num - man))));
		printOff("\nNumero de homens = " + man);

		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}
}
