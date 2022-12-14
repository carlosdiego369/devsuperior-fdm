package modulo01.capitulo06;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		verificadorDeNumerosPares(input);

		input.close();
	}

	private static void verificadorDeNumerosPares(Scanner input) {

		int num = 0;

		imprimir("Quantas numeros voce vai digitar? ");
		num = input.nextInt();
		input.nextLine();
		
		vetorizacao(num, input);
	}
	
	public static void vetorizacao(int num, Scanner input) {
		int [] vetor = new int[num];
		int cont = 0;
		for(int i = 0;i < vetor.length;i++) {
			imprimir("Digite um numero: ");
			vetor[i] = input.nextInt();
		}
		
		imprimir("\nNUMEROS PARES:\n");
		for(int i = 0;i < vetor.length;i++) {
			
			if(vetor[i] % 2 == 0){
				imprimir(vetor[i] + " ");
				cont++;
			}
		}
		imprimir("\nQUANTIDADE DE PARES = " + cont);
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}
}
