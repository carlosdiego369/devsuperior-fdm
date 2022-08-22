package modulo01.capitulo04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Operadora {

	public static void main(String[] args) {

		Integer minutos;
		Scanner input = new Scanner(System.in);
		imprimir("Informe os minutos gasto no mês: ");
		minutos = input.nextInt();
		verificadorDeConta(minutos);

		input.close();
	}

	public static void verificadorDeConta(int minutos) {
		DecimalFormat df = new DecimalFormat("#,###.00");

		boolean verificador = minutos > 100;
		if (verificador) {
			minutos = (minutos - 100);
			minutos = (minutos * 2) + 50;
			imprimir("Valor a pagar: R$" + df.format(minutos));
		} else {
			minutos = 50;
			imprimir("Valor a pagar: R$" + df.format(minutos));
		}
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

}
