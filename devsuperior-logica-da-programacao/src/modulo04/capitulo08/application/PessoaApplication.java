package modulo04.capitulo08.application;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

import modulo04.capitulo08.entities.Pessoa;

public class PessoaApplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.00");
		
		double totalHeight = 0, average;
		int under16 = 0;

		printOff("Quantas pessoas serao digitadas? ");
		int num = input.nextInt();
		input.nextLine();
		
		Pessoa[] vetor = new Pessoa[num];
		
		for(int i = 0; i < vetor.length; i++) {
			printOff("Dados da " + (i+1) + "a pessoa:");
			printOff("\nNome: ");
			String name = input.nextLine();
			printOff("Idade: ");
			int age = input.nextInt();
			input.nextLine();
			printOff("Altura: ");
			double height = input.nextDouble();
			input.nextLine();
			
			vetor[i]= new Pessoa (name, age, height);
			totalHeight += vetor[i].getHeight();
			
			if(age < 16) {
				under16++;
			}
		}
		
		average = totalHeight / num;
		double percentage = (under16 * 100 / num);
		printOff("\nAltura média: " + df.format(average));
		printOff("\nPessoas com menos de 16 anos: " + percentage + "%");
		
		for(Pessoa p : vetor) {
			if(p.getAge() < 16) {
				printOff("\n" + p.getName());
			}
		}
		
		
		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}
}
