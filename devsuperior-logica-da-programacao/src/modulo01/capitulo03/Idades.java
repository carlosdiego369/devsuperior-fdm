package modulo01.capitulo03;

import java.util.Scanner;

public class Idades {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);


		System.out.println("Dados da primeira pessoa:");
		System.out.print("Nome: ");
		String primeiroNome = input.nextLine();
		System.out.print("Idade: ");
		Double primeiraIdade = input.nextDouble();
		input.nextLine();
		
		System.out.println("Dados da segunda pessoa:");
		System.out.print("Nome: ");
		String segundoNome = input.nextLine();
		System.out.print("Idade: ");
		Double segundaIdade = input.nextDouble();
		input.nextLine();
		Double media = (primeiraIdade + segundaIdade) / 2;

		System.out.println("A idade média de " + primeiroNome + " e " + segundoNome + " é de " + media + " anos");

		input.close();

	}

}
