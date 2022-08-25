package modulo01.capitulo06;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Concurso {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		verificadorDeDadosConcurso(input);

		input.close();
	}

	public static void verificadorDeDadosConcurso(Scanner input) {
		imprimir("Qual a quantidade pessoas? ");
		int qtdPessoas = input.nextInt();
		input.nextLine();

		String[] nomes = new String[qtdPessoas];
		double[][] notas = new double[qtdPessoas][2];
		double[][] medias = new double[qtdPessoas][2];
		double mediaNotas = 0, porcentagemDeAprovados, maiorMedia = 0, notaMedia = 0;
		int aprovados = 0;
		String nomeAprovados = "", nomeMaiorMedia = "";

		for (int i = 0; i < nomes.length; i++) {
			imprimir("Digite os dados da " + (i + 1) + "a pessoa: ");
			imprimir("\nNome: ");
			nomes[i] = input.nextLine();

			for (int j = 0; j < notas[i].length; j++) {
				imprimir("Nota etapa " + (j + 1) + ": ");
				notas[i][j] = input.nextDouble();
				input.nextLine();
				mediaNotas += notas[i][j];
			}
			mediaNotas = mediaNotas / 2;
			if (mediaNotas >= 70) {
				aprovados++;
				nomeAprovados += nomes[i] + "\n";
				notaMedia += mediaNotas;
			}

			for (int l = 0; l < notas[i].length; l++) {
				medias[i][l] = mediaNotas;
			}

			mediaNotas = 0;
		}

		imprimir("\nTABELA:");
		for (int i = 0; i < nomes.length; i++) {
			imprimir("\n" + nomes[i] + ", ");

			for (int j = 0; j < notas[i].length; j++) {
				imprimir(notas[i][j] + ", ");
			}

			for (int l = 1; l < notas[i].length; l++) {
				imprimir("MEDIA = ");
				conversao(medias[i][l]);

				if (medias[i][l] > maiorMedia) {
					maiorMedia = medias[i][l];
					nomeMaiorMedia = nomes[i];
				}
			}
		}

		imprimir("\n\nPESSOAS APROVADAS:");
		imprimir("\n" + nomeAprovados);

		porcentagemDeAprovados = aprovados * 100 / qtdPessoas;
		notaMedia = notaMedia / aprovados;
		imprimir("\nPorcentagem de aprovação: " + porcentagemDeAprovados + " %");
		imprimir("\nMaior média: " + nomeMaiorMedia);

		if (aprovados <= 0) {
			imprimir("\nNão há candidatos aprovados");
		} else {
			imprimir("\nNota média dos aprovados: ");
			conversao(notaMedia);
		}
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

	public static double conversao(double num) {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		imprimir(df.format(num));
		return num;
	}
}
