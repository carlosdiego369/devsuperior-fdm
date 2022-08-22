package modulo01.capitulo03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Terreno {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a largura do terreno: ");
		Integer largura = input.nextInt();
		
		System.out.print("Digite o comprimento do terreno: ");
		Integer comprimento = input.nextInt();
		
		System.out.print("Digite o valor do metro quadrado: ");
		Integer valorMetroQuadrado = input.nextInt();
		
		Integer totalAreaDoTerreno = largura * comprimento;
		Integer totalPrecoDoTerreno = totalAreaDoTerreno * valorMetroQuadrado;
		
		System.out.println("Area do terreno: " + new DecimalFormat("###.00").format(totalAreaDoTerreno));
		System.out.println("Area do terreno: " + new DecimalFormat("###.00").format(totalPrecoDoTerreno));
		
		input.close();
	}
}
