package modulo04.capitulo08.application;

import java.util.Locale;
import java.util.Scanner;

public class NumerosParesApplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		printOff("Quantos numeros voce vai digitar? ");
		int num = input.nextInt();
		
		int [] vetor = new int [num];
		
		for(int i = 0;i < vetor.length; i++ ) {
		printOff("Digite um numero: ");
		vetor[i] = input.nextInt();
		}
		
		int qtdEven = 0;
		printOff("\nNUMEROS PARES:\n");
		for(int v : vetor) {
			if(v % 2 == 0) {
				printOff(v + " ");
				qtdEven++;
			}
		}
		printOff("\n\nQUANTIDADE DE PARES = " + qtdEven) ;
		
		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}
}
