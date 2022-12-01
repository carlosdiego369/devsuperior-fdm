package modulo04.capitulo04;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		inputDados();
	}

	public static void inputDados() {
		imprimir("Deseja a tabuada para qual valor? ");
		int num = scannerNum();
		for(int i = 1; i <= 10; i++) {
			imprimir(num + " X " + i + " = " + (num * i) + "\n");
		}
	}

	public static void imprimir(String text) {
		System.out.print(text);
	}

	public static int scannerNum() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int num = input.nextInt();

		return num;
	}
}
