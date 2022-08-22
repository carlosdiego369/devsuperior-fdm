package modulo01.capitulo04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DesafioBar {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		imprimir("Sexo: ");
		String sexo = input.next();

		imprimir("Quantidade de cervejas: ");
		int qtdCerveja = input.nextInt();

		imprimir("Quantidade de refrigerantes: ");
		int qtdRefrigerante = input.nextInt();

		imprimir("Quantidade de espetinhos: ");
		int qtdEspetinho = input.nextInt();

		consumoBar(sexo, qtdCerveja, qtdRefrigerante, qtdEspetinho);

		input.close();

	}

	public static void consumoBar(String sexo, double qtdCerveja, double qtdRefrigerante, double qtdEspetinho) {
		DecimalFormat df = new DecimalFormat("#,###.00");
		double minimoCouver = 30.00, valorCouver = 4.00, valorCerveja = 5.00, valorRefrigerante = 3.00,
				valorEspetinho = 7.00;

		qtdCerveja = qtdCerveja * valorCerveja;
		qtdRefrigerante = qtdRefrigerante * valorRefrigerante;
		qtdEspetinho = qtdEspetinho * valorEspetinho;

		double totalConsumido = qtdCerveja + qtdRefrigerante + qtdEspetinho;
		imprimir("\nRELATÓRIO:");
		imprimir("\nConsumo = R$ " + df.format(totalConsumido));

		if (totalConsumido > minimoCouver) {
			imprimir("\nIsento de Couvert");
		} else {
			imprimir("\nCouvert = R$ " + df.format(valorCouver));
			totalConsumido = totalConsumido + valorCouver;
		}
		verificadorSexo(sexo, totalConsumido);
	}

	public static void verificadorSexo(String sexo, double total) {
		DecimalFormat df = new DecimalFormat("#,###.00");

		double ingresso = 0.00;

		if (sexo.equalsIgnoreCase("F")) {
			ingresso = 8.00;
			imprimir("\nIngresso = R$ " + df.format(ingresso));
			total = total + ingresso;
			imprimir("\n\nValor a pagar = R$ " + df.format(total));

		} else if (sexo.equalsIgnoreCase("M")) {
			ingresso = 10.00;
			imprimir("\nIngresso = R$ " + df.format(ingresso));
			total = total + ingresso;
			imprimir("\n\nValor a pagar = R$ " + df.format(total));
		} else {
			msgErro("Entrada Inválida");
		}
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

	public static void msgErro(String texto) {
		System.err.print(texto);
	}

}
