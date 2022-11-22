package modulo04.capitulo02;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Troco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		inputEntradas(input);

		input.close();

	}

	public static void inputEntradas(Scanner input) {
		imprimir("Preço unitário do produto: ");
		double precoUnitario = input.nextDouble();

		imprimir("Quantidade comprada: ");
		int qtdComprada = input.nextInt();

		imprimir("Dinheiro recebido: ");
		double dinheiro = input.nextDouble();

		imprimir("TROCO = ");
		imprimirValor(verificadorDeTroco(precoUnitario, qtdComprada, dinheiro));

	}

	public static double verificadorDeTroco(double precoUnitario, int qtdComprada, double dinheiro) {
		double troco = (precoUnitario * qtdComprada) - dinheiro;
		return Math.abs(troco);
	}

	public static void imprimir(String text) {
		System.out.print(text);
	}

	public static void imprimirValor(double num) {
		DecimalFormat df = new DecimalFormat("###.00");
		imprimir(df.format(num) + "\n");
	}
}
