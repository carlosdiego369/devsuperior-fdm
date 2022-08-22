package modulo01.capitulo04;

import java.util.Scanner;

public class MenorDeTres {

	public static void main(String[] args) {

		Integer n1, n2, n3;
		Scanner input = new Scanner(System.in);
		imprimir("Informe o primeiro valor: ");
		n1 = input.nextInt();
		imprimir("Informe o segundo valor: ");
		n2 = input.nextInt();
		imprimir("Informe o terceiro valor: ");
		n3 = input.nextInt();

		verificadorDeNumero(n1, n2, n3);
		input.close();
		
	}
	
	public static void verificadorDeNumero(int n1, int n2, int n3 ) {
		
		if(n1 < n2 && n1 < n3) {
			imprimir("MENOR = " + n1);
		}else if(n2 < n1 && n2 < n3) {
			imprimir("MENOR = " + n2);
		}else {
			imprimir("MENOR = " + n3);
		}
	}
	
	public static void imprimir(String texto) {
		System.out.print(texto);
	}

}
