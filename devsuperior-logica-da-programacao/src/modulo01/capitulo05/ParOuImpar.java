package modulo01.capitulo05;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		verificadorDoIntervalo(input);

		input.close();

	}
	
	public static void verificadorDoIntervalo(Scanner input) {
		
		imprimir("Quantos numeros voce vai digitar? ");
		int sequencia = input.nextInt();
		
		sequencia--;
		for(int i = 0; i <= sequencia;i++) {
			
			imprimir("Digite um numero: ");
			int num = input.nextInt();
			
			int resultado = num % 2;
			
			if(num == 0) {
				imprimir("NULO\n");
			}else if(resultado == 0) {
				if(resultado < 0 && num < -1) {
					imprimir("PAR NEGATIVO\n");
				}else {
					imprimir("PAR POSITIVO\n");
				}
			}else if(resultado == 1 || resultado == -1) {
				if(resultado < 0) {
					imprimir("IMPAR NEGATIVO\n");
				}else {
					imprimir("IMPAR POSITIVO\n");
				}
			}
		}
	}
	
	public static void imprimir(String texto) {
		System.out.print(texto);
	}

}
