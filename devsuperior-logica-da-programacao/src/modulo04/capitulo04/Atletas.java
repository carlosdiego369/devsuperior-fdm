package modulo04.capitulo04;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Atletas {

	public static void main(String[] args) {

		inputDados();
	}

	public static void inputDados() {
		int qtdAtletas, qtdAtletaMasculino = 0;
		double alturaMediaDasMulheres = 0, pesoTotal = 0, maiorAltura = 0;
		String atletaMaisAlto = "";
		boolean validacao = false;
		imprimir("Qual a quantidade de atleta? ");
		do {
			qtdAtletas = scannerNum();

			if (qtdAtletas <= 0) {
				validacao = true;
				msgError();
			} else {
				validacao = false;
			}

		} while (validacao);

		for (int i = 0; i < qtdAtletas; i++) {
			imprimir("Digite os dados do atleta numero " + (i + 1) + ":");
			imprimir("\nNome: ");
			String nome = scanner();

			imprimir("Sexo: ");
			String sexo;
			validacao = false;
			do {
				sexo = scanner();
				if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M")) {
					if (sexo.equalsIgnoreCase("M")) {
						qtdAtletaMasculino++;
					}
					validacao = false;
				} else {
					validacao = true;
					msgErrorSexo();
				}
			} while (validacao);

			imprimir("Altura: ");
			double altura;
			validacao = false;
			do {
				altura = scannerNumDouble();
				if (altura <= 0) {
					validacao = true;
					msgError();
				} else {
					if (altura > maiorAltura) {
						maiorAltura = altura;
						atletaMaisAlto = nome;
					}
					if (altura > 0 && sexo.equalsIgnoreCase("F")) {
						alturaMediaDasMulheres += altura;
					}
					validacao = false;
				}
			} while (validacao);

			imprimir("Peso: ");
			double peso;
			validacao = false;
			do {
				peso = scannerNumDouble();
				if (peso <= 0) {
					validacao = true;
					msgError();
				} else {
					pesoTotal += peso;
					validacao = false;
				}
			} while (validacao);
		}
		relatorioFinal(pesoTotal, qtdAtletas, qtdAtletaMasculino, alturaMediaDasMulheres, atletaMaisAlto);
	}

	public static void relatorioFinal(double pesoTotal, double qtdAtletas, double qtdAtletaMasculino,
			double alturaMediaDasMulheres, String atletaMaisAlto) {
		DecimalFormat df = new DecimalFormat("##0.00");
		DecimalFormat df2 = new DecimalFormat("###.0");
		double pesoMedio = pesoTotal / qtdAtletas;
		double porcentagemDeHomens = (qtdAtletaMasculino * 100) / qtdAtletas;
		double porcentagemAlturaMediaDasMulheres = (alturaMediaDasMulheres / (qtdAtletas - qtdAtletaMasculino));

		String info = "";

		info += "\nRELATÓRIO:\n" + "Peso médio dos atletas: " + df.format(pesoMedio) + "\nAtleta mais alto: "
				+ atletaMaisAlto;

		if (qtdAtletaMasculino == 0) {
			info += "\nNão há homens cadastrados";
		} else {
			info += "\nPorcentagem de homens: ";
			info += df2.format(porcentagemDeHomens) + " %";
		}

		if (alturaMediaDasMulheres == 0) {
			info += "\nNão há mulheres cadastradas";
		} else {
			info += "\nAltura média das mulheres: ";
			info += df.format(porcentagemAlturaMediaDasMulheres);
		}

		imprimir(info);
	}

	public static void imprimir(String text) {
		System.out.print(text);
	}

	public static void msgError() {
		System.err.print("Valor invalido! Favor digitar um valor positivo: ");
	}

	public static void msgErrorSexo() {
		System.err.print("Entrada invalida! Favor digitar 'F' ou 'M': ");
	}

	public static String scanner() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String texto = input.nextLine();
		return texto;
	}

	public static int scannerNum() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.nextLine();
		return num;
	}

	public static double scannerNumDouble() {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double num = input.nextDouble();
		input.nextLine();
		return num;
	}
}
