package modulo01.capitulo05;

import java.util.Scanner;

public class DentroOuFora {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		verificadorDoIntervalo(input);

		input.close();

	}
	
	public static void verificadorDoIntervalo(Scanner input) {
		int dentro = 0, fora = 0;
		
		imprimir("Quantos numeros voce vai digitar? ");
		int sequencia = input.nextInt();
		
		sequencia--;
		for(int i = 0; i <= sequencia;i++) {
			
			imprimir("Digite um numero: ");
			int num = input.nextInt();
			
			if(num >= 10 && num <= 20) {
				dentro++;
			}else {
				fora++;
			}
			
		}
		
		imprimir(dentro + " DENTRO\n");
		imprimir(fora + " FORA");
		
	}
	
	public static void imprimir(String texto) {
		System.out.print(texto);
	}
}
