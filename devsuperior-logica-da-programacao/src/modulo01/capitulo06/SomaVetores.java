package modulo01.capitulo06;

import java.util.Scanner;

public class SomaVetores {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		somaDeVetores(input);

		input.close();
	}

	private static void somaDeVetores(Scanner input) {
		
		int num = 0;

		imprimir("Quantas numeros voce vai digitar? ");
		num = input.nextInt();
		
		int [] vetorA = new int[num];
		int [] vetorB = new int[vetorA.length];
		int [] vetorC = new int[vetorA.length];
		
		imprimir("Digite os valores do vetor A: \n");
		vetorizacao(vetorA, input);
		
		imprimir("Digite os valores do vetor B: \n");
		vetorizacao(vetorB, input);
		
		imprimir("VETOR RESULTANTE: \n");
		for(int i = 0;i < vetorC.length;i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			imprimir(vetorC[i] + "\n");
		}
	}
	
	public static void vetorizacao(int [] vetor, Scanner input) {
		
		for(int i = 0;i < vetor.length;i++) {
			imprimir("Digite um numero: ");
			vetor[i] = input.nextInt();
			}
		}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}
}
