package modulo04.capitulo04;

import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {

		inputDados();
	}

	public static void inputDados() {
		boolean validacao;
		do {
			imprimir("Digite dois numeros:");
			int x = scannerNum();
			int y = scannerNum();
			
			if(x > y) {
				imprimir("\nDECRESCENTE!");
			}else if(y > x) {
				imprimir("\nCRESCENTE!");
			}

			validacao = x == y;
		} while (!validacao);
	}

	public static void imprimir(String text) {
		System.out.println(text);
	}

	public static int scannerNum() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int num = input.nextInt();

		return num;
	}
}
