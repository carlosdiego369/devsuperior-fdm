package modulo04.capitulo07.application;

import java.util.Scanner;

import modulo04.capitulo07.entities.Champion;

public class ChampionApplication {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		printOff("Digite os dados do primeiro campeão:");
		printOff("\nNome: ");
		String nome = input.nextLine();

		printOff("Vida inicial: ");
		int life = input.nextInt();
		input.nextLine();

		printOff("Ataque: ");
		int attack = input.nextInt();
		input.nextLine();

		printOff("Armadura: ");
		int armor = input.nextInt();
		input.nextLine();

		Champion c1 = new Champion(nome, life, attack, armor);

		printOff("\nDigite os dados do segundo campeão:");
		printOff("\nNome: ");
		nome = input.nextLine();

		printOff("Vida inicial: ");
		life = input.nextInt();
		input.nextLine();

		printOff("Ataque: ");
		attack = input.nextInt();
		input.nextLine();

		printOff("Armadura: ");
		armor = input.nextInt();
		input.nextLine();

		Champion c2 = new Champion(nome, life, attack, armor);

		printOff("\nQuanto turnos você deseja executar? ");
		int shift = input.nextInt();

		for (int i = 0; i < shift; i++) {
			c1.takeDamage(c2);
			c2.takeDamage(c1);

			if (c1.getLife() <= 0 || c2.getLife() <= 0) {
				printOff("\nResultado do turno " + (i + 1) + ":");
				if (c1.getLife() <= 0) {
					c1.setLife(0);
					printOff(c1.status() + " (morreu)");
					printOff(c2.status() + "\n");
				} else if (c2.getLife() <= 0) {
					c2.setLife(0);
					printOff(c1.status());
					printOff(c2.status() + " (morreu)\n");
				}
				i = shift;
			} else {
				printOff("\nResultado do turno " + (i + 1) + ":");

				printOff(c1.status());
				printOff(c2.status() + "\n");
			}
		}
		System.out.println("\nFIM DO COMBATE");
		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}
}
