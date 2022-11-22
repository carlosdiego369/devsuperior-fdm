package modulo04.capitulo02;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Medidas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		inputEntradas(input);

		input.close();

	}

	public static void inputEntradas(Scanner input) {
		imprimir("Digite a medida A: ");
		double medidaA = input.nextDouble();

		imprimir("Digite a medida B: ");
		double medidaB = input.nextDouble();

		imprimir("Digite a medida C: ");
		double medidaC = input.nextDouble();

		imprimir("AREA DO QUADRADO = ");
		imprimirValor(calculoAreaQuadrado(medidaA));

		imprimir("AREA DO TRIANGULO = ");
		imprimirValor(calculoAreaTriangulo(medidaA, medidaB));

		imprimir("AREA DO TRAPEZIO = ");
		imprimirValor(calculoAreaTrapezio(medidaA, medidaB, medidaC));

	}

	public static double calculoAreaQuadrado(double medidaA) {
		double total = medidaA * medidaA;
		return total;
	}

	public static double calculoAreaTriangulo(double medidaA, double medidaB) {
		double total = (medidaA * medidaB) / 2;
		return total;
	}

	public static double calculoAreaTrapezio(double medidaA, double medidaB, double medidaC) {
		double total = ((medidaA + medidaB) * medidaC) / 2;
		return total;
	}

	public static void imprimir(String text) {
		System.out.print(text);
	}

	public static void imprimirValor(double num) {
		DecimalFormat df = new DecimalFormat("###.0000");
		imprimir(df.format(num) + "\n");
	}
}
