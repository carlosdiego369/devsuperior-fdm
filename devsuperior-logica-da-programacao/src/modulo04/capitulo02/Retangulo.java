package modulo04.capitulo02;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		inputEntradas(input);

		input.close();

	}

	public static void inputEntradas(Scanner input) {
		imprimir("Base do retangulo: ");
		double base = input.nextDouble();

		imprimir("Altura do retangulo: ");
		double altura = input.nextDouble();

		imprimir("AREA = ");
		imprimirValor(calculoArea(base, altura));
		imprimir("PERIMETRO = ");
		imprimirValor(calculoPerimetro(base, altura));
		imprimir("DIAGONAL = ");
		imprimirValor(calculoDiagonal(base, altura));
	}

	public static double calculoArea(double base, double altura) {
		double area = base * altura;
		return area;
	}

	public static double calculoPerimetro(double largura, double altura) {
		double perimetro = (largura * 2) + (altura * 2);
		return perimetro;
	}

	public static double calculoDiagonal(double base, double altura) {
		double perimetro = Math.sqrt((base * base) + (altura * altura));
		return perimetro;
	}

	public static void imprimir(String text) {
		System.out.print(text);
	}

	public static void imprimirValor(double num) {
		DecimalFormat df = new DecimalFormat("###.0000");
		imprimir(df.format(num) + "\n");
	}
}
