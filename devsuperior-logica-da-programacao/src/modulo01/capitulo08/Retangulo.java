package modulo01.capitulo08;

import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		calcularAreaRetangulo(input);

		input.close();
	}

	public static void calcularAreaRetangulo(Scanner input) {

		imprimir("Digite o valor da base do retangulo: ");
		double valorBaseRetangulo = input.nextInt();

		imprimir("Digite o valor da altura do retangulo: ");
		double alturaDoRetangulo = input.nextInt();

		imprimir("\nDiagonal = " + calculoDiagonal(valorBaseRetangulo, alturaDoRetangulo));
		imprimir("\nArea = " + calculoArea(valorBaseRetangulo, alturaDoRetangulo));
		imprimir("\nPerimetro = " + calculoPerimetro(valorBaseRetangulo, alturaDoRetangulo));

	}

	public static void calculoDiagonal() {

	}

	public static double calculoDiagonal(double valorBaseRetangulo, double alturaDoRetangulo) {
		double diagonal = Math.sqrt((valorBaseRetangulo * valorBaseRetangulo) + (alturaDoRetangulo * alturaDoRetangulo));
		return diagonal;
	}

	public static double calculoArea(double valorBaseRetangulo, double alturaDoRetangulo) {
		double area = valorBaseRetangulo * alturaDoRetangulo;
		return area;
	}

	public static double calculoPerimetro(double valorBaseRetangulo, double alturaDoRetangulo) {
		double perimetro = ((valorBaseRetangulo * 2) + (alturaDoRetangulo * 2));
		return perimetro;
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}
}
