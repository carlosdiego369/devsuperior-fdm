package modulo04.capitulo02;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Terreno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		verificadorDeTerreno(input);

		input.close();

	}

	public static void verificadorDeTerreno(Scanner input) {
		imprimir("Digite a largura do terreno: ");
		double largura = input.nextDouble();

		imprimir("Digite o comprimento do terreno: ");
		double comprimento = input.nextDouble();

		imprimir("Digite o valor do metro quadrado: ");
		double valorMetroQuadrado = input.nextDouble();

		imprimir("Area do terreno = ");
		imprimirValor(calculoArea(largura, comprimento));
		imprimir("Preco do terreno = ");
		imprimirValor(calculoTerreno(largura, comprimento, valorMetroQuadrado));
	}

	public static double calculoArea(double largura, double comprimento) {
		double area = largura * comprimento;
		return area;
	}

	public static double calculoTerreno(double largura, double comprimento, double valorMetroQuadrado) {
		double valor = valorMetroQuadrado * calculoArea(largura, comprimento);
		return valor;
	}

	public static void imprimir(String text) {
		System.out.print(text);
	}

	public static void imprimirValor(double num) {
		DecimalFormat df = new DecimalFormat("###.00");
		imprimir(df.format(num) + "\n");
	}
}
