package modulo01.capitulo06;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Comerciante {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		cadastroDosProdutos(input);

		input.close();
	}

	public static void cadastroDosProdutos(Scanner input) {
		imprimir("Serao digitados dados de quantos produtos? ");
		int qtdProdutos = input.nextInt();
		input.nextLine();

		String[] nomeProduto = new String[qtdProdutos];
		double[] precosCompras = new double[1];
		double[] precosVendas = new double[precosCompras.length];

		double valorTotalCompra = 0, valorTotalVenda = 0, lucroTotal = 0, lucro = 0;
		int lucroAbaixoDeDez = 0, lucroEntreDezEVinte = 0, lucroAcimaDeVinte = 0;

		for (int i = 0; i < qtdProdutos; i++) {
			imprimir("Produto " + (i + 1) + ": ");
			imprimir("\nNome: ");
			nomeProduto[i] = input.nextLine();

			imprimir("Preco de Compra: ");
			vetorizacao(precosCompras, input);

			imprimir("Preco de venda: ");
			vetorizacao(precosVendas, input);

			for (int j = 0; j < precosCompras.length; j++) {
				lucro = precosVendas[j] - precosCompras[j];
				lucro = ((lucro * 100) / precosCompras[j]);

				valorTotalCompra += precosCompras[j];
				valorTotalVenda += precosVendas[j];

				if (lucro < 10) {
					lucroAbaixoDeDez++;
				} else if (lucro >= 10 && lucro <= 20) {
					lucroEntreDezEVinte++;
				} else {
					lucroAcimaDeVinte++;
				}
			}
		}
		lucroTotal = valorTotalVenda - valorTotalCompra;
		relatorio(lucroAbaixoDeDez, lucroEntreDezEVinte, lucroAcimaDeVinte, valorTotalCompra, valorTotalVenda,
				lucroTotal);
	}

	public static void vetorizacao(double[] vetor, Scanner input) {
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = input.nextDouble();
			input.nextLine();
		}
	}

	public static void relatorio(int lucroAbaixoDeDez, int lucroEntreDezEVinte, int lucroAcimaDeVinte,
			double valorTotalCompra, double valorTotalVenda, double lucroTotal) {
		imprimir("\nRELATORIO:");
		imprimir("\nLucro abaixo de 10%: " + lucroAbaixoDeDez);
		imprimir("\nLucro entre de 10% e 20%: " + lucroEntreDezEVinte);
		imprimir("\nLucro acima de 20%: " + lucroAcimaDeVinte);
		imprimir("\nLucro total de compra: ");
		conversao(valorTotalCompra);
		imprimir("\nLucro total de venda: ");
		conversao(valorTotalVenda);
		imprimir("\nLucro total: ");
		conversao(lucroTotal);
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

	public static void msgErro() {
		System.err.print("Entrada inválida digite novamente!\n");
	}

	public static void conversao(double num) {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		imprimir(df.format(num));
	}
}
