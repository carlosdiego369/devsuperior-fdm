package modulo04.capitulo15.labs.application;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

import modulo04.capitulo15.model.services.BrazilInterestService;
import modulo04.capitulo15.model.services.InterestService;
import modulo04.capitulo15.model.services.UsaInterestService;

public class ProgramInterest {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.00");

		System.out.print("Amount: ");
		double amount = input.nextDouble();

		System.out.print("Months: ");
		int months = input.nextInt();

		InterestService is = new BrazilInterestService(2.0);
		InterestService is2 = new UsaInterestService(1.0);

		double payment = is.payment(amount, months);

		System.out.println("Brazil Payment after " + months + " months:");
		System.out.println(df.format(payment));

		payment = is2.payment(amount, months);

		System.out.println("Usa Payment after " + months + " months:");
		System.out.println(df.format(payment));

		input.close();
	}
}