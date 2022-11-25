package modulo04.capitulo03;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		inputCodigo();
	}

	public static void inputCodigo() {
		imprimir("Digite dois numero inteiros: \n");
		int num1 = inputNum();
		int num2 = inputNum();

		verificadorMultiplo(num1, num2);
	}

	public static boolean verificadorMultiplo(Integer num1, int num2) {
		
		boolean validador = num1 % num2 == 0 || num2 % num1 == 0;
		
		if (validador) {
			imprimir("São multiplos");
			
		}else {
			imprimir("Nao sao multiplos");
		}
		
		return validador;
	}

	public static int inputNum() {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		return num;
	}

	public static void imprimir(String text) {
		System.out.print(text);
	}

	public static void msgError() {
		System.err.print("Entrada inválida!");
	}

	public static double imprimirDecimais(double num) {
		DecimalFormat df = new DecimalFormat("#0.00");
		imprimir(df.format(num));
		return num;
	}
}
