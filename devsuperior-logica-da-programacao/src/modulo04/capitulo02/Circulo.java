package modulo04.capitulo02;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Circulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		inputEntradas(input);

		input.close();

	}

	public static void inputEntradas(Scanner input) {
		imprimir("Digite o valor do raio do circulo: ");
		double raioDoCirculo = input.nextDouble();

		imprimir("AREA = ");
		imprimirValor(verificadorDeArea(raioDoCirculo));

	}

	public static double verificadorDeArea(double raioDoCirculo) {
		double area = Math.PI * (raioDoCirculo * raioDoCirculo);
		return area;
	}

	public static void imprimir(String text) {
		System.out.print(text);
	}

	public static void imprimirValor(double num) {
		DecimalFormat df = new DecimalFormat("###.000");
		imprimir(df.format(num) + "\n");
	}
}
