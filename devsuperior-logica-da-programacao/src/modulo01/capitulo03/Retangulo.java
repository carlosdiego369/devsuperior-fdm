package modulo01.capitulo03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite a base do retangulo: ");
		Double baseDoRetangulo = input.nextDouble();

		System.out.print("Digite a altura do retangulo: ");
		Double alturaDoRetangulo = input.nextDouble();


		Double totalArea = baseDoRetangulo * alturaDoRetangulo;
		Double perimetro = (baseDoRetangulo * 2) + (alturaDoRetangulo * 2);
		Double diametro = Math.pow(baseDoRetangulo, 2) + Math.pow(alturaDoRetangulo, 2);
		diametro = Math.sqrt(diametro);

		System.out.println("AREA = " + new DecimalFormat("###.0000").format(totalArea));
		System.out.println("PERIMETRO = " + new DecimalFormat("###.0000").format(perimetro));
		System.out.println("DIAGONAL = " +	new DecimalFormat("###.0000").format(diametro));

		input.close();

	}

}
