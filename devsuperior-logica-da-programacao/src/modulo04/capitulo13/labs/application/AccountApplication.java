package modulo04.capitulo13.labs.application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import modulo04.capitulo13.labs.model.entities.Account;
import modulo04.capitulo13.labs.model.exceptions.DomainException;

public class AccountApplication {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		try {
			printOff("Enter account data");
			printOff("\nNumber: ");
			int number = input.nextInt();
			input.nextLine();
			printOff("Holder: ");
			String holder = input.nextLine();
			printOff("Initial balance: ");
			double balance = input.nextDouble();
			printOff("Withdraw limit: ");
			double withdraw = input.nextDouble();

			Account a = new Account(number, holder, balance, withdraw);
//			Account a = new Account(8021, "Bob Brown", 200.00, 300.00);

			printOff("\nEnter amount for withdraw: ");
			double amount = input.nextDouble();

			a.withdraw(amount);
			printOff("" + a);

		} catch (InputMismatchException e) {
			msgError("Input invalid");
		} catch (DomainException e) {
			msgError("Withdrawn error: " + e.getMessage());
		}

		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}

	public static void msgError(String text) {
		System.err.print(text);
	}

}
