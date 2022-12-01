package modulo04.capitulo04;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Experiencias {

	public static void main(String[] args) {

		inputDados();
	}

	public static void inputDados() {
		imprimir("Quantos casos de teste serao digitados? ");
		int qtdCasos = scannerNum();

		int totalCobaias = 0, totalCoelhos = 0, totalSapos = 0, totalRatos = 0;
		for (int i = 0; i < qtdCasos; i++) {
			imprimir("Quantidade de cobaias: ");
			int qtdDeCobaias = scannerNum();

			imprimir("Tipo de Cobaia: ");
			String tipoCobaia = scanner();

			totalCobaias += qtdDeCobaias;

			if (tipoCobaia.equalsIgnoreCase("R")) {
				totalRatos += qtdDeCobaias;
			} else if (tipoCobaia.equalsIgnoreCase("S")) {
				totalSapos += qtdDeCobaias;
			} else if (tipoCobaia.equalsIgnoreCase("C")) {
				totalCoelhos += qtdDeCobaias;
			}
		}
		relatorioFinal(totalCobaias, totalCoelhos, totalSapos, totalRatos);
	}

	public static void relatorioFinal(int totalCobaias, int totalCoelhos, int totalSapos, int totalRatos) {

		String info = "";

		info += "\nRELATORIO FINAL:" + "\nTotal: " + totalCobaias + " cobaias" + "\nTotal de coelhos: " + totalCoelhos
				+ "\nTotal de ratos: " + totalRatos + "\nTotal de sapos: " + totalSapos;

		imprimir(info);
		calculoPercentual(totalCobaias, totalCoelhos, totalSapos, totalRatos);
	}

	public static void calculoPercentual(double totalCobaias, double totalCoelhos, double totalSapos,
			double totalRatos) {
		Locale.setDefault(Locale.US);
		DecimalFormat df = new DecimalFormat("##0.00");
		double percentualCoelhos = (totalCoelhos * 100) / totalCobaias;
		double percentualRatos = (totalRatos * 100) / totalCobaias;
		double percentualSapos = (totalSapos * 100) / totalCobaias;
		String info = "";

		info += "\nPercentual de coelhos: " + df.format(percentualCoelhos) + "\nPercentual de ratos: "
				+ df.format(percentualRatos) + "\nPercentual de sapos: " + df.format(percentualSapos);

		imprimir(info);
	}

	public static void imprimir(String text) {
		System.out.print(text);
	}

	public static String scanner() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String tipo = input.next();
		return tipo;
	}

	public static int scannerNum() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		return num;
	}
}
