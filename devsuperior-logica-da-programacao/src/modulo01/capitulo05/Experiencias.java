package modulo01.capitulo05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Experiencias {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		organizacaoDeExperimentos(input);

		input.close();
	}

	public static void organizacaoDeExperimentos(Scanner input) {
		imprimir("Quantos casos de testes serao digitados? ");
		int caso = input.nextInt();

		int sapo = 0, rato = 0, coelho = 0, totalSapo = 0, totalRato = 0, totalCoelho = 0, totalCobaia = 0;

		for (int i = 0; i < caso; i++) {
			imprimir("Quantidade de cobaias: ");
			int qtdCobaia = input.nextInt();

			imprimir("Tipo de cobaia: ");
			String tipo = input.next();

			if (tipo.equalsIgnoreCase("C")) {
				coelho = qtdCobaia;
				totalCoelho += coelho;
				totalCobaia += coelho;
			} else if (tipo.equalsIgnoreCase("R")) {
				rato = qtdCobaia;
				totalRato += rato;
				totalCobaia += rato;
			} else if (tipo.equalsIgnoreCase("S")) {
				sapo = qtdCobaia;
				totalSapo += sapo;
				totalCobaia += sapo;
			}
		}

		relatoriFinal(totalCobaia, totalCoelho, totalRato, totalSapo);

	}

	public static void relatoriFinal(double totalCobaia, double totalCoelho, double totalRato, double totalSapo) {
		imprimir("\nRELATORIO FINAL:");
		imprimir("\nTotal: " + totalCobaia + " cobaias");
		imprimir("\nTotal de coelhos: " + totalCoelho);
		imprimir("\nTotal de ratos: " + totalRato);
		imprimir("\nTotal de sapos: " + totalSapo);
		double percentualCoelho = ((totalCoelho * 100) / totalCobaia);
		double percentualRato = ((totalRato * 100) / totalCobaia);
		double percentualSapo = ((totalSapo * 100) / totalCobaia);
		imprimir("\nPercentual de coelhos: ");
		conversor(percentualCoelho);
		imprimir("\nPercentual de ratos: ");
		conversor(percentualRato);
		imprimir("\nPercentual de sapos: ");
		conversor(percentualSapo);
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}
	
	public static double conversor(Double num) {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		imprimir(df.format(num));
		return num;
	}

}
