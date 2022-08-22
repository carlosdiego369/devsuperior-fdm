package modulo01.capitulo06;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		verificadorDeAltura(input);

		input.close();

	}

	private static void verificadorDeAltura(Scanner input) {
		int num = 0;
		double mediaAltura = 0;
		double cont = 0;
		String menoresDeDezesseisAnos = "";

		imprimir("Quantas pessoas serao digitadas? ");
		num = input.nextInt();
		input.nextLine();

		double[] altura = new double[num];
		int[] idade = new int[num];
		String[] nome = new String[num];
		
		for (int i = 0; i < num; i++) {
			imprimir("Dados da " + (i + 1) + "a pessoa: ");
			imprimir("\nNome: ");
			nome[i] = input.nextLine();
			imprimir("Idade: ");
			idade[i] = input.nextInt();
			input.nextLine();
			imprimir("Altura: ");
			altura[i] = input.nextDouble();
			input.nextLine();

			mediaAltura += altura[i];

			if (idade[i] < 16) {
				cont++;
				menoresDeDezesseisAnos += nome[i] + "\n";
			}
		}
		
		mediaAltura = mediaAltura / num;
		imprimir("\nAltura média: ");
		conversor(mediaAltura);
		cont = ((cont * 100) / num);
		imprimir("\nPessoas com menos de 16 anos: " + cont + "%\n");
		imprimir(menoresDeDezesseisAnos );
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

	public static void msgErro() {
		System.err.print("Valor invalido! Favor digite novamente: \n");
	}
	
	public static void conversor(double num) {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		imprimir(df.format(num));
	}

}
