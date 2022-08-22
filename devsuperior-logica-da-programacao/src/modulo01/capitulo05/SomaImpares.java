package modulo01.capitulo05;

import java.util.Scanner;

public class SomaImpares {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		somaDosImpares(input);

		input.close();
	}

	public static void somaDosImpares(Scanner input) {
		imprimir("Digite dois numeros: \n");
		int x = input.nextInt();
		int y = input.nextInt();

		int impar = 0;

		if (x < 0) {
			x++;
			while (x < y) {
				if (x % 2 < 0 || x % 2 == 1) {
					impar += x;
					x++;
				} else {
					x++;
				}
			}
			imprimir("SOMA DOS IMPARES = " + impar);
		} else if (y < 0) {
			y++;
			while (y < x) {
				if (y % 2 < 0 || y % 2 == 1) {
					impar += y;
					y++;
				} else {
					y++;
				}
			}
			imprimir("SOMA DOS IMPARES = " + impar);
		} else if (x < y) {
			while (x != y) {
				if (x % 2 == 1 || x % 2 < 0) {
					impar = impar + x;
					x++;
				} else {
					x++;
				}
			}
			imprimir("SOMA DOS IMPARES = " + impar);
		} else if (y < x) {
			while (y != x) {
				if (y % 2 == 1) {
					{
						impar = impar + y;
						y++;
					}
				} else {
					y++;
				}
			}
			imprimir("SOMA DOS IMPARES = " + impar);
		}
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}
}
