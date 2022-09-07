package modulo01.capitulo08;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Cambio {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		calcularCambio(input);

		input.close();
	}

	public static double calcularCambio(Scanner input) {
		imprimir("Digite a cotacao do dolar: ");
		double cotacaoDolar = input.nextDouble();
		imprimir("Digite a quantia em reais: ");
		double quantiaEmReais = input.nextDouble();
		double conversaoDolar = calculoDaCotacao(cotacaoDolar, quantiaEmReais);
		imprimir("Voce pode comprar ");
		conversao(conversaoDolar);
		imprimir(" dolares com esta quantia");
		return conversaoDolar;
	}

	public static double conversao(double num) {
		DecimalFormat df = new DecimalFormat("#,###.00");
		imprimir(df.format(num));
		return num;
	}

	public static double calculoDaCotacao(double cotacaoDolar, double quantiaReais) {
		double quantidadeDeDolar = (quantiaReais / cotacaoDolar);
		return quantidadeDeDolar;
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}
}
