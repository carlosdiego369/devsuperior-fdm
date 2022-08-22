package modulo01.capitulo04;

import java.util.Scanner;

public class Coordenadas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		imprimir("Valor de X: ");
		double x = input.nextDouble();
		imprimir("Valor de Y: ");
		double y = input.nextDouble();
		
		determinadorDeQuadrante(x, y);

		input.close();
	}
	
	public static void determinadorDeQuadrante(double x, double y) {

		if(x == 0 && y == 0) {
			imprimir("Origem");
		}else if(x > 0 && y > 0) {
			imprimir("Q1");
		}else if(x < 0 && y > 0) {
			imprimir("Q2");
		}else if(x < 0 && y < 0) {
			imprimir("Q3");
		}else if(x > 0 && y < 0) {
			imprimir("Q4");
		}else if(x == 0 && y > 0 || x == 0 && y < 0) {
			imprimir("Eixo Y");
		}else if(y == 0 && x > 0 || y == 0 && x < 0) {
			imprimir("Eixo X");
		}
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

}
