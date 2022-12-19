package modulo04.capitulo08.application;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import modulo04.capitulo08.entities.TaxPayer;

public class TaxPayerApplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		printOff("Quantos contribuintes você vai digitar? ");
		int num = input.nextInt();

		List<TaxPayer> list = new ArrayList<>();

		for (int i = 0; i < num; i++) {
			printOff("\nDigite os dados do " + (i + 1) + "o contribuinte:");
			printOff("\nRenda Anual com salário: ");
			double salaryIncome = input.nextDouble();
			printOff("Renda anual com prestação de serviço: ");
			double servicesIncome = input.nextDouble();
			printOff("Renda anual com ganho de capital: ");
			double capitalIncome = input.nextDouble();
			printOff("Gastos médicos: ");
			double healthSpending = input.nextDouble();
			printOff("Gastos educacionais: ");
			double educationSpending = input.nextDouble();

			TaxPayer tP = new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending);

			list.add(tP);
		}

		for (int i = 0; i < list.size(); i++) {
			DecimalFormat df = new DecimalFormat("##0.00");
			printOff("\nResumo do " + (i + 1) + "o contribuinte:");
			if (list.get(i).grossTax() < 3000) {
				printOff("\nImposto bruto total: ISENTO");
			} else {
				printOff("\nImposto bruto total: " + df.format(list.get(i).grossTax()));
			}
			printOff("\nAbatimento: " + df.format(list.get(i).taxRebate()));
			printOff("\nImposto devido: " + df.format(list.get(i).netTax()) + "\n");
		}
		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}
}
