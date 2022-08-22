package modulo01.capitulo05;

import java.util.Scanner;

public class SenhaFixa {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		verificadorDeSenha(input);

		input.close();
	}

	public static int verificadorDeSenha(Scanner input) {

		int senha, pin = 2002;

		boolean verificador = false;

		imprimir("Digite a senha: ");
		senha = input.nextInt();

		while (!verificador)

			if (senha == pin) {
				imprimir("Acesso permitido!");
				verificador = true;
			} else {
				imprimir("Senha Invalida! Tente novamente: ");
				senha = input.nextInt();
			}

		return senha;

	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

}
