package modulo01.capitulo07;

import java.util.Scanner;

public class Telefone {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		clientes(input);

		input.close();
	}

	public static void clientes(Scanner input) {

		int quantidadeDeClientes = 0;

		boolean validador = false;

		while (!validador) {
			imprimir("Informe a quantidade de clientes: ");
			quantidadeDeClientes = input.nextInt();
			input.nextLine();
			if (quantidadeDeClientes < 1) {
				msgErro("Digite uma entrada valida (1~10)\n");
			} else {
				validador = true;
			}
		}
		String[][] nome = new String[quantidadeDeClientes][1];
		String[][] telefone = new String[quantidadeDeClientes][1];
		int[][] tipo = new int[quantidadeDeClientes][1];
		int[][] minutos = new int[quantidadeDeClientes][1];

		for (int i = 0; i < quantidadeDeClientes; i++) {
			imprimir("Dados do " + (i + 1) + "o. cliente:");
			for (int j = 0; j < nome[i].length; j++) {
				imprimir("\nNome: ");
				nome[i][j] = input.nextLine();
				imprimir("Telefone: ");
				telefone[i][j] = input.nextLine();

				validador = false;

				while (!validador) {
					imprimir("Tipo: ");
					tipo[i][j] = input.nextInt();
					if (tipo[i][j] < 0 || tipo[i][j] > 2) {
						msgErro("Digite uma entrada valida (0~2)\n");
					} else {
						validador = true;
					}
				}

				imprimir("Minutos: ");
				minutos[i][j] = input.nextInt();
				input.nextLine();
			}
			imprimir("\n");
		}

		imprimir("Informe o preco basico e excedente de cada tipo de conta:\n");
		double[][] precoBasico = new double[3][2];
		for (int i = 0; i < precoBasico.length; i++) {
			imprimir("Tipo " + i + ":\n");
			for (int j = 0; j < precoBasico[i].length; j++) {
				precoBasico[i][j] = input.nextDouble();
			}
		}

		imprimir("\nRELATÓRIO DE CLIENTES:\n");

		for (int i = 0; i < quantidadeDeClientes; i++) {
			for (int j = 0; j < nome[i].length; j++) {
				imprimir(nome[i][j] + ", " +
						telefone[i][j] + ", Tipo" +
						tipo[i][j] + ", " + 
						minutos[i][j] + ", Conta = \n");
			}
		}

	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

	public static void msgErro(String texto) {
		System.err.print(texto);
	}

}
