package modulo01.capitulo07;

import java.util.Scanner;

public class DiagonalNegativos {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		diagonalNegativos(input);
		
		input.close();
	}

	public static void diagonalNegativos(Scanner input) {
		int matriz;
		
		boolean validador = false;
		
		imprimir("Qual a ordem da matriz? ");
		matriz = input.nextInt();
		while(!validador) {
			if(matriz > 10) {
				msgErro("Digite uma entrada valida (1~10): ");
				matriz = input.nextInt();
			}else {
				validador = true;
			}
		}
		
		int[][] vetor = new int[matriz][matriz];
		int qtdNegativo = 0;
		String diagonalPrincipal = ""; 
		for(int i = 0; i < vetor.length;i++) {
			for(int j = 0; j < vetor[i].length;j++) {
				imprimir("Elemento [" + i + "," + j + "]: ");
				vetor[i][j] = input.nextInt();
				
				if(i == j) {
					diagonalPrincipal += vetor[i][j] + " "; 
				}
				
				if(vetor[i][j] < 0) {
					qtdNegativo++;
				}
			}
		}
		
		imprimir("DIAGONAL PRINCIPAL: \n");
		imprimir(diagonalPrincipal);
		imprimir("\nQUANTIDADE DE NEGATIVOS = " + qtdNegativo);
		
	}
	
	public static void imprimir(String texto) {
		System.out.print(texto);
	}
	
	public static void msgErro(String texto) {
		System.err.print(texto);
	}
}
