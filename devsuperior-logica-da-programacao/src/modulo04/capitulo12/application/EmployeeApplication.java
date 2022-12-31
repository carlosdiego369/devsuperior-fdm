package modulo04.capitulo12.application;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import modulo04.capitulo12.entities.Employee;
import modulo04.capitulo12.entities.OutsourcedEmployee;

public class EmployeeApplication {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.00");

		List<Employee> list = new ArrayList<>();

		printOff("Enter the number of employees: ");
		int N = input.nextInt();
		input.nextLine();

		for (int i = 0; i < N; i++) {
			printOff("Employee #" + (i + 1) + " data:");

			printOff("\nOutsourced (y/n)? ");
			String outsourced = input.next();
			input.nextLine();

			printOff("Name: ");
			String name = input.nextLine();

			printOff("Hours: ");
			int hours = input.nextInt();

			printOff("Value per hour: ");
			double valuePerHour = input.nextDouble();

			if (outsourced.equalsIgnoreCase("Y")) {

				printOff("Additional charge: ");
				double additionalCharge = input.nextDouble();
				input.nextLine();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);

				list.add(emp);
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}

		}

		printOff("\nPAYMENTS:");
		for (Employee emp : list) {
			printOff("\n" + emp.getName() + " - $ " + df.format(emp.payment()));
		}

		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}
}
