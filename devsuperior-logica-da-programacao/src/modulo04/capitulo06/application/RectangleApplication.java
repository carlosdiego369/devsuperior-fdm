package modulo04.capitulo06.application;

import java.util.Locale;
import java.util.Scanner;

import modulo04.capitulo06.entities.Rectangle;

public class RectangleApplication {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		Rectangle rectangle = new Rectangle();

		imprimir("Entre com a largura e altura do retângula:");
		rectangle.width = input.nextDouble();
		rectangle.height = input.nextDouble();

		imprimir("" + rectangle);

		input.close();

	}

	public static void imprimir(String text) {
		System.out.println(text);
	}

}
