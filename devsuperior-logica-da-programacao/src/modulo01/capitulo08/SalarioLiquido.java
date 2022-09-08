package modulo01.capitulo08;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		calculoSalarioLiquido(input);

		input.close();

	}

	public static void calculoSalarioLiquido(Scanner input) {
		imprimir("Digite o valor do salario bruto: ");
		double salarioBruto = input.nextDouble();
		
		double salarioLiquido = salarioBruto;
		salarioLiquido = calculoImposto(salarioBruto);
		salarioLiquido = calculoPrevidencia(salarioBruto);

		imprimir("Salario liquido = R$ " + salarioLiquido);

	}

	public static double calculoImposto(double salarioBruto) {
		double imposto;
		if (salarioBruto < 4000) {
			imposto = salarioBruto * 20 / 100;
			salarioBruto = salarioBruto - imposto;
		} else {
			imposto = salarioBruto * 25 / 100;
			salarioBruto = salarioBruto - imposto;
		}

		return salarioBruto;
	}

	public static double calculoPrevidencia(double salarioBruto) {
		double previdencia;
		if (salarioBruto < 1500) {
			previdencia = salarioBruto * 10 / 100;
			salarioBruto = salarioBruto - previdencia;
		} else {
			previdencia = salarioBruto * 15 / 100;
			salarioBruto = salarioBruto - previdencia;
		}

		return salarioBruto;
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}
}
