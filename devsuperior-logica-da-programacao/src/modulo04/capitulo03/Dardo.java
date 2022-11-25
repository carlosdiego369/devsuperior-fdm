package modulo04.capitulo03;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Dardo {

	public static void main(String[] args) {
		maiorDistancia();
	}

	public static void maiorDistancia() {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		imprimir("Digite as tres distancias:\n");
		double distancia1 = input.nextDouble();
		double distancia2 = input.nextDouble();
		double distancia3 = input.nextDouble();

		verificaMaiorDistancia(distancia1, distancia2, distancia3);
		
		input.close();
	}

	public static double verificaMaiorDistancia(double distancia1, double distancia2, double distancia3) {
		double maiorDistancia = 0;

		if (distancia1 > distancia2 && distancia1 > distancia3) {
			maiorDistancia = distancia1;
			imprimir("MAIOR DISTANCIA = ");
			imprimirDecimais(maiorDistancia);
		} else if (distancia2 > distancia1 && distancia2 > distancia3) {
			maiorDistancia = distancia2;
			imprimir("MAIOR DISTANCIA = ");
			imprimirDecimais(maiorDistancia);
		} else {
			maiorDistancia = distancia3;
			imprimir("MAIOR DISTANCIA = ");
			imprimirDecimais(maiorDistancia);
		}
		return maiorDistancia;
	}

	public static void imprimir(String text) {
		System.out.print(text);
	}

	public static double imprimirDecimais(double num) {
		DecimalFormat df = new DecimalFormat("##.00");
		imprimir(df.format(num));
		return num;
	}
}
