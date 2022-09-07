package modulo01.capitulo08;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		calculoImc(input);

		input.close();
	}

	public static double calculoImc(Scanner input) {
		imprimir("Digite o peso: ");
		double peso = input.nextDouble();
		imprimir("Digite a altura: ");
		double altura = input.nextDouble();
		double imc = calculo(peso, altura);
		imprimir("IMC = ");
		conversor(imc);
		return imc;
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

	public static double calculo(double peso, double altura) {
		double imc = peso / (altura * altura);
		return imc;
	}

	public static double conversor(double num) {
		DecimalFormat df = new DecimalFormat("#,###.00");
		imprimir(df.format(num));
		return num;
	}
}
