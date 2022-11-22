package modulo04.capitulo02;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Duracao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		inputEntradas(input);

		input.close();

	}

	public static void inputEntradas(Scanner input) {
		imprimir("Digite a duracao em segundos: ");
		int duracao = input.nextInt();
		
		conversao(duracao);
	}

	public static int conversao(int duracao) {
		int horas = duracao / 3600;
		int minutos = (duracao - (horas * 3600)) / 60;
		int segundos = duracao % 60;
		
		imprimir(horas + ":" + minutos + ":" + segundos);
		return horas;
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
