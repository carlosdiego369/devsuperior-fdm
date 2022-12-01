package modulo04.capitulo04;

import java.util.Scanner;

public class ParesConsecutivos {

	public static void main(String[] args) {

		inputDados();
	}

	public static void inputDados() {
		boolean validacao = false;
		int cont = 0, soma = 0;
		while (!validacao) {
			imprimir("Informe um numero inteiro: ");
			Integer num = scannerNum();

			if (num.equals(0)) {
				validacao = true;
			} else if (num % 2 == 0) {
				while (cont < 5) {
					soma += num;
					num += 2;
					cont++;
				}
				imprimir("SOMA = " + soma + "\n");
			} else if (num % 2 == 1) {
				num++;
				while (cont < 5) {
					soma += num;
					num += 2;
					cont++;
				}
				imprimir("SOMA = " + soma + "\n");
			}
			soma = 0;
			cont = 0;
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
