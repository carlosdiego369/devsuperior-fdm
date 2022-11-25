package modulo04.capitulo03;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {

	public static void main(String[] args) {
		inputCodigo();
	}

	public static void inputCodigo() {
		imprimir("Codigo do produto comprado: ");
		int codigoProduto = inputNum();
		imprimir("Quantidade comprada: ");
		int qtdComprada = inputNum();

		calcularProdutos(codigoProduto, qtdComprada);
	}

	public static double calcularProdutos(Integer codigoProduto, int qtdComprada) {
		double valorProduto = 0, valorTotal;
		
		if (codigoProduto.equals(1)) {
			valorProduto = 5.00;
			valorTotal = valorProduto * qtdComprada;
			
			imprimir("Valor a pagar: R$ ");
			imprimirDecimais(valorTotal);
			
		} else if (codigoProduto.equals(2)) {
			valorProduto = 3.50;
			valorTotal = valorProduto * qtdComprada;
			
			imprimir("Valor a pagar: R$ ");
			imprimirDecimais(valorTotal);
			
		} else if (codigoProduto.equals(3)) {
			valorProduto = 4.80;
			valorTotal = valorProduto * qtdComprada;
			
			imprimir("Valor a pagar: R$ ");
			imprimirDecimais(valorTotal);
			
		} else if (codigoProduto.equals(4)) {
			valorProduto = 8.90;
			valorTotal = valorProduto * qtdComprada;
			
			imprimir("Valor a pagar: R$ ");
			imprimirDecimais(valorTotal);
			
		} else if (codigoProduto.equals(5)) {
			valorProduto = 7.32;
			valorTotal = valorProduto * qtdComprada;
			
			imprimir("Valor a pagar: R$ ");
			imprimirDecimais(valorTotal);
			
		} else {
			msgError();
		}
		return valorProduto;
	}

	public static int inputNum() {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		return num;
	}

	public static void imprimir(String text) {
		System.out.print(text);
	}

	public static void msgError() {
		System.err.print("Entrada inválida!");
	}

	public static double imprimirDecimais(double num) {
		DecimalFormat df = new DecimalFormat("#0.00");
		imprimir(df.format(num));
		return num;
	}
}
