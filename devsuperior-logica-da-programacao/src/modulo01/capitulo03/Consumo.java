package modulo01.capitulo03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		imprimir("Digite a distancia percorrida: ");
		Double distancia = input.nextDouble();

		imprimir("Digite o combustivel gasto: ");
		Double gastoCombustivel = input.nextDouble();
		input.nextLine();

		Double consumoMedio = distancia / gastoCombustivel;

		imprimir("Consumo medio = " + new DecimalFormat("###.000").format(consumoMedio));

		input.close();
	}

	static void imprimir(String texto) {
		System.out.print(texto);
	}
}
