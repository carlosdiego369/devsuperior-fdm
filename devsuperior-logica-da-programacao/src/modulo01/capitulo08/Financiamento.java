package modulo01.capitulo08;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Financiamento {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		calcularFinanciamento(input);

		input.close();
	}

	public static double calcularFinanciamento(Scanner input) {
		imprimir("Valor total do imovel: ");
		double valorTotalImovel = input.nextDouble();
		imprimir("Valor pago na entrada: ");
		double valorPagoEntrada = input.nextDouble();
		imprimir("Sera financiado em quantos meses? ");
		int meses = input.nextInt();
		imprimir("Valor de cada prestacao: ");
		double prestacao = conversao(calculoDoFinanciamento(valorTotalImovel, valorPagoEntrada, meses));
		return prestacao;
	}

	public static double conversao(double num) {
		DecimalFormat df = new DecimalFormat("#,###.00");
		imprimir(df.format(num));
		return num;
	}

	public static double calculoDoFinanciamento(double valorTotalImovel, double valorPagoEntrada, int meses) {
		double valorPrestacao = (valorTotalImovel - valorPagoEntrada) / meses;
		return valorPrestacao;
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}
}
