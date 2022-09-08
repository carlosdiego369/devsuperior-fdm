package modulo01.capitulo08;

import java.util.Scanner;

public class ClassificarImc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		calculoImc(input);

		input.close();
	}

	public static void calculoImc(Scanner input) {
		imprimir("Digite o peso: ");
		double peso = input.nextDouble();
		imprimir("Digite a altura: ");
		double altura = input.nextDouble();
		imprimir("Resultado do IMC: ");
		calculo(peso, altura);
	}

	public static double calculo(double peso, double altura) {
		double imc = peso / (altura * altura);

		if (imc < 20) {
			imprimir("Abaixo do peso");
		} else if (imc > 20 && imc < 25) {
			imprimir("Peso normal");
		} else if (imc > 25 && imc < 30) {
			imprimir("Sobre peso");
		} else {
			imprimir("Obeso");
		}

		return imc;
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}
}
