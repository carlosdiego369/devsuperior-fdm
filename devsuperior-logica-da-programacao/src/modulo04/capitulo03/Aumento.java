package modulo04.capitulo03;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Aumento {

	public static void main(String[] args) {
		inputCodigo();
	}

	public static void inputCodigo() {
		imprimir("Digite o salario da pessoa: ");
		double salario = inputNum();

		verificadorDePorcentagem(salario);
	}

	public static void verificadorDePorcentagem(double salario) {
		int porcentagem = 0;

		if (salario <= 1000) {
			porcentagem = 20;
			calculoSalarial(salario, porcentagem);

		} else if (salario > 1000 && salario <= 3000) {
			porcentagem = 15;
			calculoSalarial(salario, porcentagem);

		} else if (salario > 3000 && salario <= 8000) {
			porcentagem = 10;
			calculoSalarial(salario, porcentagem);

		}else {
			porcentagem = 5;
			calculoSalarial(salario, porcentagem);
		}
	}
	
	public static double calculoSalarial(double salario, int porcentagem){
		double novoSalario = 0, aumentoSalario;
		
		aumentoSalario = (salario * porcentagem) / 100;
		novoSalario = salario + aumentoSalario;
		imprimir("Novo salario = R$ ");
		imprimirDecimais(novoSalario);
		imprimir("\nAumento = R$ ");
		imprimirDecimais(aumentoSalario);
		imprimir("\nPorcentagem = " + porcentagem + " %");
		
		return novoSalario;
	}

	public static double inputNum() {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double num = input.nextDouble();
		return num;
	}

	public static void imprimir(String text) {
		System.out.print(text);
	}

	public static double imprimirDecimais(double num) {
		DecimalFormat df = new DecimalFormat("#0.00");
		imprimir(df.format(num));
		return num;
	}
}
