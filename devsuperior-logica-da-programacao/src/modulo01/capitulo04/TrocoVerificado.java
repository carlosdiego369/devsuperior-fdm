package modulo01.capitulo04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TrocoVerificado {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		imprimir("Preço unitário do produto: ");
		Double preco = input.nextDouble();

		imprimir("Quantidade comprada: ");
		Double quantidadeComprada = input.nextDouble();

		imprimir("Dinheiro recebido: ");
		Double dinheiroRecebido = input.nextDouble();

		verificadorDoTotal(preco, quantidadeComprada, dinheiroRecebido);

		input.close();

	}

	public static Double verificadorDoTotal(double preco, double quantidadeComprada, double dinheiroRecebido) {
		double total = (preco * quantidadeComprada);
		boolean troco = dinheiroRecebido >= total;

		if (troco) {
			total = (dinheiroRecebido - total);
			imprimir("TROCO = " + new DecimalFormat("#,###.0").format(total));
		} else {
			total = (total - dinheiroRecebido);
			imprimir("DINHEIRO INSUFICIENTE. FALTAM " + new DecimalFormat("#,###.00").format(total) + " REAIS");
		}
		return total;

	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

}
