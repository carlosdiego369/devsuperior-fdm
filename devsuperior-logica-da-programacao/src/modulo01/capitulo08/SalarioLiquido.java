package modulo01.capitulo08;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		salarioLiquido(input);

		input.close();

	}

	public static void salarioLiquido(Scanner input) {
		imprimir("Digite o valor do salario bruto: ");
		double salarioBruto = input.nextDouble();

		imprimir("Salario liquido = R$ ");
		conversor(calculoSalarioLiquido(salarioBruto));
	}

	public static double calculoSalarioLiquido(double salarioBruto) {
		double salarioLiquido = salarioBruto - calculoImposto(salarioBruto) - calculoPrevidencia(salarioBruto);
		return salarioLiquido;

	}

	public static double calculoImposto(double salarioBruto) {
		double imposto;
		if (salarioBruto <= 4000) {
			imposto = salarioBruto * 20 / 100;
		} else {
			imposto = salarioBruto * 25 / 100;
		}

		return imposto;
	}

	public static double calculoPrevidencia(double salarioBruto) {
		double previdencia;
		if (salarioBruto <= 1500) {
			previdencia = salarioBruto * 10 / 100;
		} else {
			previdencia = salarioBruto * 15 / 100;
		}
		return previdencia;
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}
	
	public static void conversor(double num) {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		
		imprimir(df.format(num));
	}
}
