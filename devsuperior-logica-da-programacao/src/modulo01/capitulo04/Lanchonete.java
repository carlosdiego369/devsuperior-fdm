package modulo01.capitulo04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lanchonete {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		info();

		imprimir("Codigo do produto comprado: ");
		Integer codigoProduto = input.nextInt();
		
		imprimir("Quantidade comprada: ");
		Integer quantidadeComprada = input.nextInt();
		
		if(codigoProduto.equals(1)) {
			double total = 5.00;
			valorTotal(total, quantidadeComprada);
		}else if(codigoProduto.equals(2)) {
			double total = 3.50;
			valorTotal(total, quantidadeComprada);
		}else if(codigoProduto.equals(3)) {
			double total = 4.80;
			valorTotal(total, quantidadeComprada);
		}else if(codigoProduto.equals(4)) {
			double total = 8.90;
			valorTotal(total, quantidadeComprada);
		}else if(codigoProduto.equals(5)) {
			double total = 7.32;
			valorTotal(total, quantidadeComprada);
		}else {
			msgError();
		}
		
		input.close();

	}
	public static double valorTotal(Double total, Integer quantidadeComprada) {
		DecimalFormat df = new DecimalFormat("#,###.00");
		total = total * quantidadeComprada;
		imprimir("Valor a pagar: R$ " + df.format(total));
		return total;
	}
	
	public static void imprimir(String texto) {
		System.out.print(texto);
	}
	
	public static void info() {
		String info = "";
		info += "|_____________Lanchonete________________|\n";
		info += " _______________________________________\n";
		info += "|Código do produto | Preço do produto   |\n";
		info += "|---------------------------------------|\n";
		info += "|________1_________|________R$5.00______|\n";
		info += "|________2_________|________R$3.50______|\n";
		info += "|________3_________|________R$4.80______|\n";
		info += "|________4_________|________R$8.90______|\n";
		info += "|________5_________|________R$7.32______|\n";
		
		imprimir(info);
	}
	
	public static void msgError() {
		System.err.println();
	}

}
