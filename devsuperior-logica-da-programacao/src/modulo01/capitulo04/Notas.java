package modulo01.capitulo04;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		imprimir("Informe a primeira nota do aluno: ");
		Double nota1 = input.nextDouble();

		imprimir("Informe a segunda nota do aluno: ");
		Double nota2 = input.nextDouble();

		Double notaFinal = nota1 + nota2;

		boolean verificador = notaFinal > 60;

		if (verificador) {
			imprimir(notaFinal + "\nAPROVADO");
		} else {
			imprimir(notaFinal + "\nREPROVADO");
		}
		input.close();
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

}
