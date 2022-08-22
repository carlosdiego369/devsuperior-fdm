package modulo01.capitulo03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Medidas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		imprimir("Digite a medida A: ");
		Double medidaA = input.nextDouble();

		imprimir("Digite a medida B: ");
		Double medidaB = input.nextDouble();

		imprimir("Digite a medida C: ");
		Double medidaC = input.nextDouble();


		Double totalMedidaA = Math.pow(medidaA, 2);
		Double totalMedidaB = (medidaA * medidaB) / 2 ;
		Double totalMedidaC = ((medidaA + medidaB) * medidaC) / 2;

		imprimir("AREA DO QUADRADO = " + new DecimalFormat("###.0000").format(totalMedidaA) + "\n");
		imprimir("AREA DO TRIANGULO = " + new DecimalFormat("###.0000").format(totalMedidaB) + "\n");
		imprimir("AREA DO TRAPEZIO = " + new DecimalFormat("###.0000").format(totalMedidaC) + "\n");

		input.close();

	}
	static void imprimir(String texto) {
		System.out.print(texto);
	}

}
