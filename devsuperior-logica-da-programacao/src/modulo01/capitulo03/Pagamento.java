package modulo01.capitulo03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Pagamento {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		imprimir("Digite o primeiro nome: ");
		String nome = input.nextLine();

		imprimir("Digite o valor da hora trabalhada: ");
		Double valorHora = input.nextDouble();
		input.nextLine();

		imprimir("Digite a hora trabalhada: ");
		Double horaTrabalhada = input.nextDouble();
		input.nextLine();

		Double total = valorHora * horaTrabalhada;

		imprimir("O pagamento para " + nome + " deve ser " + new DecimalFormat("###.00").format(total));

		input.close();

	}

	static void imprimir(String texto) {
		System.out.print(texto);
	}
}
