package modulo04.capitulo08.application;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

import modulo04.capitulo08.entities.Produtos;

public class ProdutosApplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		printOff("Serao digitados dados de quantos produtos? ");
		int num = input.nextInt();
		input.nextLine();

		Produtos p = new Produtos();

		Produtos[] vetor = new Produtos[num];

		int profitBelow10 = 0, profitBetween10And20 = 0, profitAbove20 = 0;
		double totalPurchase = 0, totalSale = 0;

		for (int i = 0; i < vetor.length; i++) {
			printOff("Produto " + (i + 1) + ":");
			printOff("\nNome: ");
			String item = input.nextLine();
			printOff("Preco de compra: ");
			double priceBuy = input.nextDouble();
			input.nextLine();
			printOff("Preco de venda: ");
			double priceSell = input.nextDouble();
			input.nextLine();

			totalPurchase += priceBuy;
			totalSale += priceSell;

			if (p.totalPercentual(priceBuy, priceSell) < 10) {
				profitBelow10++;
			} else if (p.totalPercentual(priceBuy, priceSell) >= 10 && p.totalPercentual(priceBuy, priceSell) <= 20) {
				profitBetween10And20++;
			} else if (p.totalPercentual(priceBuy, priceSell) > 20) {
				profitAbove20++;
			}

			vetor[i] = new Produtos(item, priceBuy, priceSell);
		}

		printOff("\nRELATORIO:");
		printOff("\nLucro abaixo de 10%: " + profitBelow10);
		printOff("\nLucro entre 10% e 20%: " + profitBetween10And20);
		printOff("\nLucro acima de 20%: " + profitAbove20);

		DecimalFormat df = new DecimalFormat("##0.00");
		printOff("\nValor total de compra: " + df.format(totalPurchase));
		printOff("\nValor total de venda: " + df.format(totalSale));
		printOff("\nLucro total: " + df.format((totalSale - totalPurchase)));

		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}
}
