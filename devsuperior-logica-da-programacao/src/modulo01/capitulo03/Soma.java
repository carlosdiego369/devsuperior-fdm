package modulo01.capitulo03;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor de X: ");
		Integer x = input.nextInt();
		
		System.out.print("Digite o valor de Y: ");
		Integer y = input.nextInt();
		
		
		Integer total = x + y;
		
		System.out.println("SOMA = " + total);
		
		input.close();
		
	}

}
