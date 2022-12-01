package modulo04.capitulo04;

import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {

		inputDados();
	}

	public static void inputDados() {
		boolean validacao = false;
		int alcool = 0, gasolina = 0, diesel = 0;
		while (!validacao) {
			imprimir("Informe um codigo (1, 2, 3) ou 4 para parar: ");
			Integer codigo = scannerNum();
			
			if(codigo.equals(1)) {
				alcool++;
			}else if(codigo.equals(2)) {
				gasolina++;
			}else if(codigo.equals(3)) {
				diesel++;
			}else if(codigo.equals(4)) {
				validacao = true;
			}
		}
		
		imprimir("MUITO OBRIGADO");
		imprimir("\nAlcool: " + alcool);
		imprimir("\nGasolina: " + gasolina);
		imprimir("\nDiesel: " + diesel);
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
