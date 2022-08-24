package modulo01.capitulo06;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Concurso {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		verificadorDeDadosConcurso(input);
		
		input.close();
	}

	public static void verificadorDeDadosConcurso(Scanner input) {
		imprimir("Qual a quantidade pessoas? ");
		int qtdPessoas = input.nextInt();
		input.nextLine();
		
		String [] nomes = new String[qtdPessoas];
		double[][] notas = new double[2][];
		
		for(int i = 0; i < nomes.length;i++) {
			imprimir("Digite os dados da " + (i + 1) + "a pessoa: ");
			nomes[i] = input.nextLine();
			
			for(int j = 0; j < notas.length; j++) {
				
			}
		}
		
	}
	
	public static void imprimir(String texto) {
		System.out.print(texto);
	}
	
	public static double conversao(double num) {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		imprimir(df.format(num));
		return num;
	}
}
