package modulo01.capitulo03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Troco {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Preço unitário do produto: ");
		Double preco = input.nextDouble();
		
		System.out.print("Quantidade comprada: ");
		Double quantidadeComprada = input.nextDouble();
		
		System.out.print("Dinheiro recebido: ");
		Double dinheiroRecebido = input.nextDouble();
		
		Double troco = dinheiroRecebido - (preco * quantidadeComprada);
		
		System.out.println("TROCO = " + new DecimalFormat("#,###.00").format(troco));
		
		input.close();
		
	}

}
