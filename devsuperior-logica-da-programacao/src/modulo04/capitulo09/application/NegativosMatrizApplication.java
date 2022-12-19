package modulo04.capitulo09.application;

import java.util.Scanner;

public class NegativosMatrizApplication {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		printOff("Qual a quantidade de linhas da matriz? ");
		int line = input.nextInt();

		printOff("Qual a quantidade de colunas da matriz? ");
		int column = input.nextInt();

		int[][] element = new int[line][column];

		for (int i = 0; i < element.length; i++) {
			for (int j = 0; j < element[i].length; j++) {
				printOff("Elemento [" + i + "," + j + "]: ");
				element[i][j] = input.nextInt();
			}
		}

		printOff("VALORES NEGATIVOS:\n");
		for (int i = 0; i < element.length; i++) {
			for (int j = 0; j < element[i].length; j++) {

				if (element[i][j] < 0) {
					printOff(element[i][j] + "\n" );
				}
			}
		}
		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}
}
