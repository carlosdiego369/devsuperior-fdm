package modulo04.capitulo09.application;

import java.util.Scanner;

public class DiagonalNegativosApplication {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		printOff("Qual a ordem da matriz? ");
		int num = input.nextInt();

		int[][] element = new int[num][num];

		for (int i = 0; i < element.length; i++) {
			for (int j = 0; j < element[i].length; j++) {
				printOff("Elemento [" + i + "," + j + "]: ");
				element[i][j] = input.nextInt();
			}
		}

		printOff("DIAGONAL PRINCIPAL: \n");
		int count = 0;
		for (int i = 0; i < element.length; i++) {
			for (int j = 0; j < element[i].length; j++) {

				if (element[i][j] < 0) {
					count++;
				}
			}
			printOff(element[i][i] + " ");
		}
		printOff("\nQUANTIDADE DE NEGATIVOS = " + count);
		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}
}
