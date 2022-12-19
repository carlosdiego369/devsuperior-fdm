package modulo04.capitulo09.application;

import java.util.Scanner;

public class SomaLinhasApplication {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		printOff("Qual a quantidade de linhas da matriz? ");
		int line = input.nextInt();

		printOff("Qual a quantidade de colunas da matriz? ");
		int column = input.nextInt();

		double[][] element = new double[line][column];

		for (int i = 0; i < element.length; i++) {
			printOff("Digite os elementos da " + (i + 1) + "a linha:\n");
			for (int j = 0; j < element[i].length; j++) {
				element[i][j] = input.nextDouble();
			}
		}

		printOff("VETOR GERADO");
		double adder = 0;
		for (int i = 0; i < element.length; i++) {
			for (int j = 0; j < element[i].length; j++) {
				adder += element[i][j];
			}
			printOff("\n" + adder);
			adder = 0;
		}
		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}
}
