package modulo01.capitulo04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aumento {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		imprimir("Digite o salario da pessoa: ");
		double salario = input.nextDouble();
		
		verificadorDeSalarios(salario);
		
		input.close();
	}
	
	public static void imprimir(String texto) {
		System.out.print(texto);
	}
	
	public static double verificadorDeSalarios(Double salario) {
		DecimalFormat df = new DecimalFormat("#,###.00");
		double aumento;
		if(salario <= 1000) {
			aumento = (salario * 20) / 100;
			salario = salario + aumento;
			imprimir("Novo salario = R$ " + df.format(salario));
			imprimir("\nAumento = R$ " + df.format(aumento));
			imprimir("\nPorcentagem = 20 %");
		}else if(salario > 1000 && salario <= 3000){
			aumento = (salario * 15) / 100;
			salario = salario + aumento;
			imprimir("Novo salario = R$ " + df.format(salario));
			imprimir("\nAumento = R$ " + df.format(aumento));
			imprimir("\nPorcentagem = 15 %");
		}else if(salario > 3000 && salario <= 8000) {
			aumento = (salario * 10) / 100;
			salario = salario + aumento;
			imprimir("Novo salario = R$ " + df.format(salario));
			imprimir("\nAumento = R$ " + df.format(aumento));
			imprimir("\nPorcentagem = 10 %");
		}else {
			aumento = (salario * 5) / 100;
			salario = salario + aumento;
			imprimir("Novo salario = R$ " + df.format(salario));
			imprimir("\nAumento = R$ " + df.format(aumento));
			imprimir("\nPorcentagem = 5%");
		}
		
		return salario;
	}

}
