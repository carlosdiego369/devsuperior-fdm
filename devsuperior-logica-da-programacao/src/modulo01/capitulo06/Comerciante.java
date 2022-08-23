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
		double[] precosVendas = new double[1];

		for (int i = 0; i < qtdProdutos; i++) {
			imprimir("Produto " + (i + 1) + ": ");
			imprimir("\nNome: ");
			nomeProduto[i] = input.nextLine();

			imprimir("Preco de Compra: ");
			vetorizacao(precosCompras, input);

			imprimir("Preco de venda: ");
			vetorizacao(precosVendas, input);

		}

		
	}

	public static void vetorizacao(double[] vetor, Scanner input) {
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = input.nextDouble();
			input.nextLine();
		}
	}

	public static void vetorizacaoDeSoma(double[] vetorA, double[] vetorB, Scanner input) {
		double valorTotalCompra = 0, valorTotalVenda = 0, lucroTotal = 0;
		int lucroAbaixoDeDez = 0, lucroEntreDezEVinte = 0, lucroAcimaDeVinte = 0;
		double[] vetorC = new double[1];

		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = (((vetorB[i] - vetorA[i]) * 100) / vetorB[i]);
			
			valorTotalCompra += vetorA[i];
			valorTotalVenda += vetorB[i];

			if (vetorC[i] < 10) {
				lucroAbaixoDeDez++;
			}else if(vetorC[i] > 10 && vetorC[i] < 20) {
				lucroEntreDezEVinte++;
			}else {
				lucroAcimaDeVinte++;
			}
		}
		lucroTotal = valorTotalVenda - valorTotalCompra;
		relatorio(lucroAcimaDeVinte, lucroAcimaDeVinte, lucroAcimaDeVinte, lucroTotal, lucroTotal, lucroTotal);
	}

	public static void relatorio(int lucroAbaixoDeDez, 
			int lucroEntreDezEVinte, int lucroAcimaDeVinte, double valorTotalCompra, double valorTotalVenda, double lucroTotal) {
		imprimir("\nRELATORIO:");
		imprimir("\nLucro abaixo de 10%: " + lucroAbaixoDeDez);
		imprimir("\nLucro entre de 10% e 20%: " + lucroEntreDezEVinte);
		imprimir("\nLucro acima de 30%: " + lucroAcimaDeVinte);
		imprimir("\nLucro total de compra: " + valorTotalCompra);
		imprimir("\nLucro total de venda: " + valorTotalVenda);
		imprimir("\nLucro total: " + lucroTotal);
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
