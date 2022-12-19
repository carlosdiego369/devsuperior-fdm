package modulo04.capitulo08.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import modulo04.capitulo08.entities.Employee;

public class EmployeeApplication {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		printOff("How many employees will be registered? ");
		int registered = input.nextInt();
		input.nextLine();

		List<Employee> list = new ArrayList<>();

		for (int i = 0; i < registered; i++) {
			printOff("\nEmployee #" + (i + 1) + ":");

			printOff("\nId: ");
			Integer id = input.nextInt();
			input.nextLine();

			boolean validate = true;
			while (validate) {
				if (hasId(list, id) == true) {
					errorMsg("This id already exists!");
					printOff("\nType again: ");
					id = input.nextInt();
					input.nextLine();
					hasId(list, id);
					validate = true;
				} else {
					validate = false;
				}
			};

			printOff("Name: ");
			String name = input.nextLine();

			printOff("Salary: ");
			Double salary = input.nextDouble();
			input.nextLine();

			Employee e = new Employee(id, name, salary);

			list.add(e);
		}

		printOff("\nEnter the employee id that will have salary increase : ");
		int find = input.nextInt();
		input.nextLine();

		Employee result = list.stream().filter(x -> x.getId() == find).findFirst().orElse(null);

		if (result == null) {
			errorMsg("This id does not exist!\n");
		} else {
			printOff("Enter the percentage: ");
			double percentage = input.nextDouble();
			result.increaseSalary(percentage);
		}

		printOff("\nList of employees: ");
		for (Employee a : list) {
			printOff("\n" + a.toString());
		}

		input.close();
	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee result = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return result != null;
	}

	public static void printOff(String text) {
		System.out.print(text);
	}

	public static void errorMsg(String text) {
		System.err.print(text);
	}

}
