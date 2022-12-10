package modulo04.capitulo07.application;

import java.util.Locale;
import java.util.Scanner;

import modulo04.capitulo07.entities.Account;

public class AccountApplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		Account ac;

		printOff("Enter account number: ");
		int accountNumber = input.nextInt();
		input.nextLine();
		printOff("Enter account holder: ");
		String holder = input.nextLine();
		printOff("Is there na initial deposit (y/n)? ");
		String option = input.next();
		double balance = 0;
		if (option.equalsIgnoreCase("y")) {
			printOff("Enter initial deposit value: ");
			balance = input.nextDouble();
			ac = new Account(accountNumber, holder, balance);
		} else {
			ac = new Account(accountNumber, holder);
		}

		printOff("\nAccount data:");
		printOffObjet(ac);

		printOff("\n\nEnter a deposit value: ");
		double deposit = input.nextDouble();
		ac.deposit(deposit);
		printOff("Updated account data:");
		printOffObjet(ac);

		printOff("\n\nEnter a withdraw value: ");
		double withdraw = input.nextDouble();
		ac.withdraw(withdraw);
		printOff("Updated account data:");
		printOffObjet(ac);

		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}
	public static void printOffObjet(Account ac) {
		System.out.print(ac);
	}
}
