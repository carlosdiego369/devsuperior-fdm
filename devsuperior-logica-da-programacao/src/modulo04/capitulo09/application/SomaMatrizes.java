package modulo04.capitulo09.application;

import java.util.Scanner;

public class SomaMatrizes {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		printOff("Quantas linhas vai ter cada matriz? ");
		int line = input.nextInt();

		checkNumber(line);

		printOff("Quantas colunas vai ter cada matriz? ");
		int column = input.nextInt();

		checkNumber(column);

		int[][] elementA = new int[line][column];
		int[][] elementB = new int[line][column];
		int[][] elementC = new int[line][column];

		printOff("Digite os valores da matriz A:\n");
		inputValue(elementA);

		printOff("Digite os valores da matriz B:\n");
		inputValue(elementB);

		printOff("MATRIZ SOMA:\n");
		for (int i = 0; i < elementC.length; i++) {
			for (int j = 0; j < elementC[i].length; j++) {
				elementC[i][j] = elementA[i][j] + elementB[i][j];
				printOff(elementC[i][j] + " ");
			}
			printOff("\n");
		}
		input.close();
	}

	public static void checkNumber(int num) {
		boolean validate = false;
		while (!validate) {
			if (num <= 0 || num > 10) {
				printOff("Entrada inválida, MÁX = 10: ");
				num = inputNum();
				validate = false;
			} else {
				validate = true;
			}
		}
	}

	public static void inputValue(int[][] element) {
		for (int i = 0; i < element.length; i++) {
			for (int j = 0; j < element[i].length; j++) {
				printOff("Elemento [" + i + "," + j + "]: ");
				element[i][j] = inputNum();
			}
		}
	}

	public static int inputNum() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		return num;
	}

	public static void printOff(String text) {
		System.out.print(text);
	}
}
