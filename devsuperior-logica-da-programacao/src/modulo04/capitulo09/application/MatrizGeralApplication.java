package modulo04.capitulo09.application;

import java.util.Scanner;

public class MatrizGeralApplication {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		printOff("Qual a ordem da matriz? ");
		int matriz = input.nextInt();

		boolean validate = false;
		while (!validate) {
			if (matriz > 10) {
				printOff("Entrada inválida, MÁX = 10: ");
				matriz = input.nextInt();
				validate = false;
			} else {
				validate = true;
			}
		}

		double[][] element = new double[matriz][matriz];

		double adder = 0;
		for (int i = 0; i < element.length; i++) {
			for (int j = 0; j < element[i].length; j++) {
				printOff("Elemento [" + i + "," + j + "]: ");
				element[i][j] = input.nextDouble();

				if (element[i][j] > 0) {
					adder += element[i][j];
				}
			}
		}

		printOff("\nSOMA DOS POSITIVOS: " + adder);

		printOff("\n\nEscolha uma linha: ");
		int line = input.nextInt();
		
		printOff("LINHA ESCOLHIDA: ");
		for (int i = 0; i < element.length; i++) {
			printOff(element[line][i] + " ");
		}
		
		printOff("\n\nEscolha uma coluna: ");
		int column = input.nextInt();
		
		printOff("COLUNA ESCOLHIDA: ");
		for (int i = 0; i < element.length; i++) {
			printOff(element[i][column] + " ");
		}

		printOff("\n\nDIAGONAL PRINCIPAL: ");
		for (int i = 0; i < element.length; i++) {
			printOff(element[i][i] + " ");
		}
		
		printOff("\n\nMATRIZ ALTERADA: \n");
		for (int i = 0; i < element.length; i++) {
			for (int j = 0; j < element[i].length; j++) {
				if(element[i][j] < 0) {
					printOff(Math.pow(element[i][j], 2) + " ");
				}else {
					printOff(element[i][j] + " ");
				}
			}
			printOff("\n");
		}
		
		input.close();
	}

	private static void printOff(String text) {
		System.out.print(text);
	}

}
