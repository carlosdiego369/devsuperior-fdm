package modulo01.capitulo08;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		verificadorDeTabuada(input);

		input.close();
	}

	public static void verificadorDeTabuada(Scanner input) {
		imprimir("Voce quer a tabuada de qual numero? ");
		int tabuada = input.nextInt();

		imprimirTabuada(tabuada);

	}

	public static void imprimirTabuada(int tabuada) {

		for(int i = 1; i <= 10; i++) {
			imprimir(tabuada + " x " + i + " = " + calculoTabuada(tabuada, i) + "\n");
		}
	}
	
	public static int calculoTabuada(int tabuada, int i) {
		int resultado = tabuada * i;
		return resultado;
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

}
