package modulo04.capitulo04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaIdades {

	public static void main(String[] args) {

		inputDados();
	}

	public static void inputDados() {
		boolean validacao;
		int cont = 0;
		double media = 0;
		
		imprimir("Digite as idades:\n");
		
		do {
			int idades = scannerNum();

			if (idades < 0 && media <= 0) {
				imprimir("IMPOSSIVEL CALCULAR");
			} else if (idades < 0) {
				media /= cont;
				imprimir("MEDIA = ");
				imprimirNum(media);
			} else {
				cont++;
			}

			media += idades;
			validacao = idades < 0;
		} while (!validacao);
	}

	public static void imprimir(String text) {
		System.out.print(text);
	}
	
	public static double imprimirNum(double num) {
		DecimalFormat df = new DecimalFormat("###.00");
		System.out.print(df.format(num));
		return num;
	}

	public static int scannerNum() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int num = input.nextInt();

		return num;
	}
}
