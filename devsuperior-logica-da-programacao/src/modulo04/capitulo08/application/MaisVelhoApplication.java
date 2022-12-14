package modulo04.capitulo08.application;

import java.util.Locale;
import java.util.Scanner;

import modulo04.capitulo08.entities.Pessoa;

public class MaisVelhoApplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int older = 0;
		String nameOlder = "";

		printOff("Quantas pessoas voce vai digitar? ");
		int num = input.nextInt();
		input.nextLine();

		Pessoa[] vetor = new Pessoa[num];

		for (int i = 0; i < vetor.length; i++) {
			printOff("Dados da " + (i + 1) + "a pessoa:");
			printOff("\nNome: ");
			String name = input.nextLine();
			printOff("Idade: ");
			int age = input.nextInt();
			input.nextLine();

			vetor[i] = new Pessoa(name, age);

			if (age > older) {
				older = age;
				nameOlder = name;
			}
		}

		printOff("PESSOA MAIS VELHA: " + nameOlder);

		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}
}
