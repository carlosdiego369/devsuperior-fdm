package modulo04.capitulo02;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		inputEntradas(input);

		input.close();

	}

	public static void inputEntradas(Scanner input) {
		imprimir("Nome: ");
		String nome = input.nextLine();

		imprimir("Valor por hora: ");
		double valorHora = input.nextDouble();

		imprimir("Horas Trabalhadas: ");
		int horaTrabalhada = input.nextInt();

		imprimir("O pagamentro para " + nome + " deve ser ");
		imprimirValor(verificadorDeSalario(valorHora, horaTrabalhada));

	}

	public static double verificadorDeSalario(double valorHora, int horaTrabalhada) {
		double total = valorHora * horaTrabalhada;
		return total;
	}

	public static void imprimir(String text) {
		System.out.print(text);
	}

	public static void imprimirValor(double num) {
		DecimalFormat df = new DecimalFormat("###.00");
		imprimir(df.format(num) + "\n");
	}
}
