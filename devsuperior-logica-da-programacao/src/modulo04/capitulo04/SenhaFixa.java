package modulo04.capitulo04;

import java.util.Scanner;

public class SenhaFixa {

	public static void main(String[] args) {

		inputDados();
	}

	public static void inputDados() {
		boolean validacao = true;
		Integer senha;
		imprimir("Digite a senha: ");

		while(validacao) {
			senha = scannerNum();
			if(senha.equals(2002)) {
				imprimir("Acesso permitido!");
			}else {
				validacao = true;
				imprimir("Senha Invalida! Tente novamente: ");
			}
		}
	}

	public static void imprimir(String text) {
		System.out.print(text);
	}

	public static int scannerNum() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int num = input.nextInt();

		return num;
	}
}
