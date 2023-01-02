package modulo04.capitulo12.application;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import modulo04.capitulo12.entities.Company;
import modulo04.capitulo12.entities.Individual;
import modulo04.capitulo12.entities.TaxPayer;

public class TaxPayerApplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.00");

		List<TaxPayer> list = new ArrayList<>();

		printOff("Enter the number of tax payers: ");
		int payers = input.nextInt();

		for (int i = 1; i <= payers; i++) {
			printOff("Tax payer #" + i + " data:");
			printOff("\nIndividual or company (i/c)? ");
			String identification = input.next();
			input.nextLine();

			printOff("Name: ");
			String name = input.next();
			input.nextLine();

			printOff("Anual income: ");
			double anualIncome = input.nextDouble();
			input.nextLine();

			if (identification.equalsIgnoreCase("i")) {
				printOff("Health expenditures: ");
				double healthExpenditures = input.nextDouble();

				list.add(new Individual(name, anualIncome, healthExpenditures));
			} else if (identification.equalsIgnoreCase("c")) {
				printOff("Number of employees: ");
				int employees = input.nextInt();

				list.add(new Company(name, anualIncome, employees));
			}
		}

		printOff("\nTAXES PAID:");
		double sum = 0;
		for (TaxPayer tp : list) {
			printOff("\n" + tp.getName() + ": $ " + df.format(tp.tax()));
			sum += tp.tax();
		}

		printOff("\n\nTOTAL TAXES: $ " + df.format(sum));

		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}
}
