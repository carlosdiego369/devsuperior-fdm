package modulo04.capitulo09.application;

import java.util.Scanner;

public class CadaLinhaApplication {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		printOff("Qual a ordem da matriz? ");
		int matriz = input.nextInt();
		
		boolean validate = false;
		while(!validate) {
			if(matriz > 10) {
				printOff("Entrada inválida, MÁX = 10: ");
				matriz = input.nextInt();
				validate = false;
			}else {
				validate = true;
			}
		}

		int[][] element = new int[matriz][matriz];

		for (int i = 0; i < element.length; i++) {
			for (int j = 0; j < element[i].length; j++) {
				printOff("Elemento [" + i + "," + j + "]: ");
				element[i][j] = input.nextInt();
			}
		}

		printOff("MAIOR ELEMENTO DE CADA LINHA:\n");
		int larger = 0;
		for (int i = 0; i < element.length; i++) {
			for (int j = 0; j < element[i].length; j++) {

				if (element[i][j] > larger) {
					larger = element[i][j];
				}
			}
			printOff(larger + "\n");
			larger = 0;
		}
		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}
}
