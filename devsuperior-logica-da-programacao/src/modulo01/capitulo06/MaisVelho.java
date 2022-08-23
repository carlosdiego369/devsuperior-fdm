package modulo01.capitulo06;

import java.util.Scanner;

public class MaisVelho {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		verificadorMediaPares(input);

		input.close();
	}

	public static void verificadorMediaPares(Scanner input) {

		int num = 0, maiorIdade = 0;
		String nomeDoMaisVelho = "";

		imprimir("Quantas pessoas voce vai digitar? ");
		num = input.nextInt();
		input.nextLine();

		String[] nome = new String[num];
		int[] idade = new int[nome.length];

		for (int i = 0; i < nome.length; i++) {
			imprimir("Dados da " + (i + 1) + "a pessoa:\n");
			imprimir("Nome: ");
			nome[i] = input.nextLine();
			imprimir("Idade: ");
			idade[i] = input.nextInt();
			input.nextLine();
			
			if(idade[i] > maiorIdade) {
				maiorIdade = idade[i];
				nomeDoMaisVelho = nome[i];
			}
		}
		
		imprimir("PESSOA MAIS VELHA: " + nomeDoMaisVelho);

	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

}
