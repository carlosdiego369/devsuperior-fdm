package modulo04.capitulo08.application;

import java.util.Locale;
import java.util.Scanner;

import modulo04.capitulo08.entities.Alunos;

public class AprovadosApplication {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		printOff("Quantos alunos serão digitados? ");
		int num = input.nextInt();
		input.nextLine();

		Alunos[] vetor = new Alunos[num];

		for (int i = 0; i < vetor.length; i++) {
			printOff("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:\n");
			String name = input.nextLine();
			double grade1 = input.nextDouble();
			double grade2 = input.nextDouble();
			input.nextLine();

			vetor[i] = new Alunos(name, grade1, grade2);
		}
		printOff("Alunos aprovados:\n");
		for (int i = 0; i < vetor.length; i++) {
			double sun = 0;
				sun += vetor[i].getGrade1() + vetor[i].getGrade2();
				sun /= 2;
				
			if (sun >= 6) {
				printOff(vetor[i].getName() + "\n");
			}
			sun = 0;
		}

		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}
}
