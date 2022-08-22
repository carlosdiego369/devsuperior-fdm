package modulo01.capitulo05;

import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		verificadorDePreferencia(input);

		input.close();
	}

	@SuppressWarnings("unused")
	public static void verificadorDePreferencia(Scanner input) {
		boolean verificador = false;

		int entrada, alcool = 0, gasolina = 0, diesel = 0, sair = 4;

		while (!verificador) {
			imprimir("Informe um codigo (1, 2, 3) ou 4 para parar: ");
			entrada = input.nextInt();

			if (entrada == 1) {
				alcool++;
			} else if (entrada == 2) {
				gasolina++;
			} else if (entrada == 3) {
				diesel++;
			} else if (entrada == 4) {
				verificador = true;

				imprimir("MUITO OBRIGADO \nAlcool: " + alcool + "\nGasolina: " + gasolina + "\nDiesel: " + diesel);
			} else {
				msgError();
			}
		}
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

	public static void msgError() {
		System.err.print("Entrada Inválida\n");
	}

}
