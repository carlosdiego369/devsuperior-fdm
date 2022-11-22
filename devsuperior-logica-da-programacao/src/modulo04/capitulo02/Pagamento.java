package modulo04.capitulo02;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Pagamento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		inputEntradas(input);

		input.close();

	}

	public static void inputEntradas(Scanner input) {
		imprimir("Distancia percorrida: ");
		int distancia = input.nextInt();

		imprimir("Combustivel gasto: ");
		double combustivelGasto = input.nextDouble();


		imprimir("Consumo medio = ");
		imprimirValor(verificadorDeConsumo(distancia, combustivelGasto));

	}

	public static double verificadorDeConsumo(int distancia, double combustivelGasto) {
		double consumoMedio = distancia / combustivelGasto;
		return consumoMedio;
	}

	public static void imprimir(String text) {
		System.out.print(text);
	}

	public static void imprimirValor(double num) {
		DecimalFormat df = new DecimalFormat("###.000");
		imprimir(df.format(num) + "\n");
	}
}
