package modulo01.capitulo06;

import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		somaDeVetores(input);

		input.close();
	}

	private static void somaDeVetores(Scanner input) {

		int num = 0;

		imprimir("Quantas numeros voce vai digitar? ");
		num = input.nextInt();
		input.nextLine();
		
		vetorizacao(num, input);
	}
	
	public static void vetorizacao(int num, Scanner input) {
		int [] vetor = new int[num];
		double maiorValor = 0;
		 int posicao = 0;
		
		for(int i = 0;i < vetor.length;i++) {
			imprimir("Digite um numero: ");
			vetor[i] = input.nextInt();
			
			if(vetor[i] > maiorValor) {
				maiorValor = vetor[i];
				posicao = i;
			}
		}
		
		imprimir("\nMAIOR VALOR = " +  maiorValor);
		imprimir("\nPOSICAO DO MAIOR VALOR = " + posicao);
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

}
