package modulo01.capitulo06;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DadosPessoais {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		cadastrarDados(input);

		input.close();
	}

	public static void cadastrarDados(Scanner input) {
		double maiorAltura = 0, menorAltura = maiorAltura, mediaAlturaMulheres = 0;
		int qtdHomens = 0, qtdMulheres = 0;

		imprimir("Quantas pessoas serao digitadas? ");
		int num = input.nextInt();

		double[] alturas = new double[num];
		String[] generos = new String[alturas.length];

		for (int i = 0; i < num; i++) {
			imprimir("Altura da " + (i + 1) + "a pessoa: ");
			alturas[i] = input.nextDouble();
			input.nextLine();
			boolean validacao = false;
			while (!validacao) {
				imprimir("Genero da " + (i + 1) + "a pessoa: ");
				generos[i] = input.nextLine();

				if (!generos[i].equalsIgnoreCase("F") && !generos[i].equalsIgnoreCase("M")) {
					msgErro();
					validacao = false;
				} else {
					validacao = true;
				}
				
				if (generos[i].equalsIgnoreCase("M")) {
					qtdHomens++;
				} else {
					qtdMulheres++;
					mediaAlturaMulheres += alturas[i];
				}
			}

			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
				menorAltura = alturas[i];
			} 
			
			if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}
		}
		mediaAlturaMulheres = (mediaAlturaMulheres / qtdMulheres);
		imprimir("Menor altura = " + menorAltura);
		imprimir("\nMaior altura = " + maiorAltura);
		imprimir("\nMedia das alturas das mulheres = ");
		conversao(mediaAlturaMulheres);
		imprimir("\nNumero de homens = " + qtdHomens);
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

	public static void msgErro() {
		System.err.print("Entrada inválida digite novamente!\n");
	}

	public static void conversao(double num) {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		imprimir(df.format(num));
	}

}
