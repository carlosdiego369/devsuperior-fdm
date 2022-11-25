package modulo04.capitulo03;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class TrocoVerificado {

	public static void main(String[] args) {
		inputDadosDoTroco();
	}

	public static void inputDadosDoTroco() {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		imprimir("Preço unitário do produto: ");
		double precoUnitarioProduto = input.nextDouble();

		imprimir("Quantidade comprada: ");
		int qtdComprada = input.nextInt();

		imprimir("Dinheiro recebido: ");
		double dinheiroRecebido = input.nextDouble();

		calcularTroco(precoUnitarioProduto, qtdComprada, dinheiroRecebido);

		input.close();
	}

	public static double calcularTroco(double precoUnitarioProduto, int qtdComprada, double dinheiroRecebido) {

		boolean validaTroco = dinheiroRecebido < (precoUnitarioProduto * qtdComprada);
		double valorDoTroco = dinheiroRecebido - (precoUnitarioProduto * qtdComprada);

		if (validaTroco) {
			imprimir("DINHEIRO INSUFICIENTE. FALTAM ");
			imprimirDecimais(Math.abs(valorDoTroco));
			imprimir(" Reais ");

		} else {
			imprimir("TROCO = ");
			imprimirDecimais(valorDoTroco);
		}

		return valorDoTroco;
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
