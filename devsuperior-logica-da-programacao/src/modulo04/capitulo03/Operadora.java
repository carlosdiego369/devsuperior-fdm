package modulo04.capitulo03;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Operadora {

	public static void main(String[] args) {
		inputDadosOperadora();
	}

	public static void inputDadosOperadora() {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		imprimir("Digite a quantidade de minutos: ");
		int minutos = input.nextInt();

		calcularValorAPagar(minutos);

		input.close();
	}

	public static double calcularValorAPagar(int minutos) {
		int planoBasico = 100;
		double valorPlano = 50.0, valorAcrecimo = 2.00;
		boolean validaMinutos = minutos < planoBasico;

		if (validaMinutos) {
			imprimir("Valor a pagar: R$ ");
			imprimirDecimais(valorPlano);
		} else {
			double diferenca = (minutos - planoBasico) * valorAcrecimo;
			double total = valorPlano + diferenca;
			imprimir("Valor a pagar: R$ ");
			imprimirDecimais(total);
		}

		return valorPlano;
	}

	public static void imprimir(String text) {
		System.out.print(text);
	}

	public static double imprimirDecimais(double num) {
		DecimalFormat df = new DecimalFormat("##.00");
		imprimir(df.format(num));
		return num;
	}

}
