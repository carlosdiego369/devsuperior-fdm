package modulo01.capitulo05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atleta {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		fichaDoAtleta(input);

		input.close();
	}

	public static void fichaDoAtleta(Scanner input) {
		String nome = null, sexo = null, nomeAtletaMaisAlto = null;
		double altura, peso;
		double pesoMedio = 0, atletaMaisAlto = 0, alturaMediaDasMulheres = 0;
		int atletas = 0, masculino = 0, feminino = 0;

		boolean validacao = false;
		while (!validacao) {
			imprimir("Qual a quantidade de atletas? ");
			atletas = input.nextInt();
			input.nextLine();

			if (atletas <= 0) {
				validacao = false;
				msgErro();
			} else {
				validacao = true;
			}
		}

		validacao = false;

		for (int i = 0; i < atletas; i++) {
			validacao = false;
			while (!validacao) {
				imprimir("Digite os dados do atleta numero " + (i + 1) + ":");
				imprimir("\nNome: ");
				nome = input.nextLine();

				if (nome.matches("[0-9]*")) {
					msgErro();
					validacao = false;
				} else {
					validacao = true;
				}
			}

			validacao = false;
			while (!validacao) {
				imprimir("Sexo: ");
				sexo = input.nextLine();

				if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
					msgErro();
					validacao = false;
				} else {
					if (sexo.equalsIgnoreCase("M")) {
						masculino++;
					} else {
						feminino++;
					}
					validacao = true;
				}
			}

			validacao = false;
			while (!validacao) {
				imprimir("Altura: ");
				altura = input.nextDouble();

				if (altura <= 0) {
					msgErro();
					validacao = false;
				} else {
					if (sexo.equalsIgnoreCase("M") && altura > atletaMaisAlto) {
						atletaMaisAlto = altura;
						nomeAtletaMaisAlto = nome;
					} else if (sexo.equalsIgnoreCase("F")) {
						if (altura > atletaMaisAlto) {
							atletaMaisAlto = altura;
							nomeAtletaMaisAlto = nome;
							alturaMediaDasMulheres += altura;
						}else {
							alturaMediaDasMulheres += altura;
						}
					}
					validacao = true;
				}
			}

			validacao = false;
			while (!validacao) {
				imprimir("Peso: ");
				peso = input.nextDouble();
				input.nextLine();
				if (peso <= 0) {
					msgErro();
					validacao = false;
				} else {
					validacao = true;
				}

				pesoMedio += peso;
			}

		}

		informacaoRelatorio(nomeAtletaMaisAlto, pesoMedio, atletas, masculino, feminino, alturaMediaDasMulheres);
	}

	// Relatorio
	public static void informacaoRelatorio(String nomeAtletaMaisAlto, double pesoMedio, int atletas, double masculino,
			int feminino, double alturaMediaDasMulheres) {

		imprimir("\nRELATÓRIO: ");
		pesoMedio = pesoMedio / atletas;
		imprimir("\nPeso médio dos atletas: ");
		conversor(pesoMedio);
		imprimir("\nAtleta mais alto: " + nomeAtletaMaisAlto);
		if (masculino <= 0) {
			imprimir("\nNão há homens cadastrados");
		} else if (feminino < masculino) {
			masculino = (((masculino - feminino) * 100) / atletas);
			imprimir("\nPorcentagem de homens: ");
			conversor(masculino);
			imprimir(" %");
		} else {
			masculino = (((feminino - masculino) * 100) / atletas);
			imprimir("\nPorcentagem de homens: ");
			conversor(masculino);
			imprimir(" %");
		}

		if (feminino > 0) {
			alturaMediaDasMulheres = (alturaMediaDasMulheres / feminino);
			imprimir("\nAltura média das mulheres: " + alturaMediaDasMulheres);
		} else {
			imprimir("\nNão há mulheres cadastradas");
		}

	}

	// Auxiliares
	public static void imprimir(String texto) {
		System.out.print(texto);
	}

	public static void msgErro() {
		System.err.print("Valor invalido! Favor digite novamente: \n");
	}

	public static double conversor(double num) {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		imprimir(df.format(num));
		return num;
	}

	public static double conversorUmaCasaDecimal(double num) {
		DecimalFormat df = new DecimalFormat("#,##0.0");
		imprimir(df.format(num));
		return num;
	}
}
