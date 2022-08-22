package modulo01.capitulo05;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		imprimirTabuada(input);
		
		input.close();

	}
	
	public static void imprimirTabuada(Scanner input){
		imprimir("Deseja a tabuada para qual valor? ");
		int num = input.nextInt();
		
		int cont = 1, total;
		
		while(cont <= 10) {
			total = num * cont;
			imprimir(num + " x " + cont + " = " + total + "\n");
			cont++;
		}
	}
	
	public static void imprimir(String texto) {
		System.out.print(texto);
	}

}
