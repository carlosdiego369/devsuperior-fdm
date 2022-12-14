package modulo04.capitulo08.application;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicaoApplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		printOff("Quantos numeros voce vai digitar? ");
		int num = input.nextInt();
		
		double [] vetor = new double [num];
		int position = 0;
		double bigger = 0;
		
		for(int i = 0;i < vetor.length; i++ ) {
		printOff("Digite um numero: ");
		vetor[i] = input.nextDouble();
		if(vetor[i] > bigger) {
			bigger = vetor[i];
			position = i;
		}
		}
		
		printOff("\nMAIOR VALOR = " + bigger);
		printOff("\nPOSICAO DO MAIOR VALOR = " + position) ;
		
		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}
}
