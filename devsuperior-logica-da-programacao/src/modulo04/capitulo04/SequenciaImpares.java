package modulo04.capitulo04;

import java.util.Scanner;

public class SequenciaImpares {

	public static void main(String[] args) {

		inputDados();
	}

	public static void inputDados() {
		imprimir("Digite o valor de X: ");
		int x = scannerNum();

		for (int i = 1; i <= x; i++) {
			
			if(i % 2 != 0) {
				imprimir(i + "\n");
			}
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
