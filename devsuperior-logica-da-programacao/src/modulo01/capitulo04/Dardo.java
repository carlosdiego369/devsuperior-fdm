package modulo01.capitulo04;

import java.util.Scanner;

public class Dardo {

	public static void main(String[] args) {
		Double d1, d2, d3;
		Scanner input = new Scanner(System.in);
		imprimir("Informe a primeira distancia: ");
		d1 = input.nextDouble();
		imprimir("Informe a segunda distancia: ");
		d2 = input.nextDouble();
		imprimir("Informe a terceira distancia: ");
		d3 = input.nextDouble();

		verificadorDeNumero(d1, d2, d3);
		input.close();
		
	}
	
	public static void verificadorDeNumero(double d1, double d2, double d3 ) {
		
		if(d1 > d2 && d1 > d3) {
			imprimir("MAIOR DISTANCIA = " + d1);
		}else if(d2 > d1 && d2 > d3) {
			imprimir("MAIOR DISTANCIA = " + d2);
		}else {
			imprimir("MAIOR DISTANCIA = " + d3);
		}
	}
	
	public static void imprimir(String texto) {
		System.out.print(texto);
	}

}
