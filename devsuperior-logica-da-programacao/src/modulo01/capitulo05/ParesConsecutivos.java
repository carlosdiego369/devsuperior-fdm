package modulo01.capitulo05;

import java.util.Scanner;

public class ParesConsecutivos {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		validadorDePares(input);
		input.close();

	}

	public static void validadorDePares(Scanner input) {
		boolean validador = false;
		int num;

		while (!validador) {
			imprimir("Digite um numero inteiro: ");
			num = input.nextInt();

			if (num == 0) {
				validador = true;
			} else {

				if (num % 2 == 0) {
					int cont = 0, soma = 0;
					while (cont < 5) {
						soma = soma + num;
						num += 2;
						cont++;
					}
					imprimir("SOMA = " + soma + "\n");
				}else if (num % 2 == 1) {
					num++;
					int cont = 0, soma = 0;
					while (cont < 5) {
						soma = soma + num;
						num += 2;
						cont++;
					}
					imprimir("SOMA = " + soma + "\n");
				}

			}
		}

	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

}
