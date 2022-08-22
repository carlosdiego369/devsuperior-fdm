package modulo01.capitulo03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Circulo {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o valor do raio do circulo: ");
		Double raioDoCirculo = input.nextDouble();
		
		Double area = (raioDoCirculo * 2) * Math.PI;
		
		System.out.println("AREA = " + new DecimalFormat("#,###.000").format(area));
		
		
		input.close();
		
	}

}
