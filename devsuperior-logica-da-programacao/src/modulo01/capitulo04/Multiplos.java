package modulo01.capitulo04;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		imprimir("Digite o primeiro numero inteiro: ");
		int num1 = input.nextInt();
		imprimir("Digite o segundo numero inteiro: ");
		int num2 = input.nextInt();
		
		verificadorDeMultiplos(num1, num2);
		
		input.close();
		
	}
	
	public static void imprimir(String texto) {
		System.out.print(texto);
	}
	
	public static boolean verificadorDeMultiplos(int num1, int num2) {
		boolean validador = num1 % num2 == 0;
		if(num2 > num1) {
			validador = num2 % num1 == 0;
		}
		if(validador) {
			imprimir("São multiplos");
		}else {
			imprimir("Não são multiplos");
		}
		return validador;
	}

}
