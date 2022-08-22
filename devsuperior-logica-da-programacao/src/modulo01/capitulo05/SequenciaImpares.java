package modulo01.capitulo05;

import java.util.Scanner;

public class SequenciaImpares {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		sequenciaImpares(input);

		input.close();

	}

	public static void sequenciaImpares(Scanner input) {
		imprimir("Digite o valor de X: \n");
//		int x = input.nextInt();

		int x = 8;
		int y = 0;


		while (y <= x) {

			if (y % 2 < 0 || y % 2 == 1) {
				
					imprimir(y + "\n");
					y++;
				
			} else {
				y++;
			}
		}
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

}
