package modulo01.capitulo06;

import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		verificadorDeNotas(input);

		input.close();
	}

	public static void verificadorDeNotas(Scanner input) {

		int alunos = 0;

		imprimir("Quantos alunos serao digitados? ");
		alunos = input.nextInt();
		input.nextLine();

		String[] nome = new String[alunos];
		double[][] notas = new double[nome.length][2];

		for (int i = 0; i < nome.length; i++) {

			imprimir("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:\n");
			nome[i] = input.nextLine();

			for (int j = 0; j < notas[i].length; j++) {
				notas[i][j] = input.nextDouble();
				input.nextLine();
			}
		}

		double soma;
		imprimir("Alunos aprovados: \n");
		for (int i = 0; i < nome.length; i++) {
			soma = 0;
			for(int j = 0; j < notas[i].length;j++) {
				soma += notas[i][j];
			}
			soma = soma / 2;
			
			if(soma >= 6) {
				imprimir(nome[i] + "\n");
			}
		
		}
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

}
