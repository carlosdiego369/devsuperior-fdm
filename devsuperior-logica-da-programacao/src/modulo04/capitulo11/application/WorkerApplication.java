package modulo04.capitulo11.application;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import modulo04.capitulo11.entities.Department;
import modulo04.capitulo11.entities.HourContract;
import modulo04.capitulo11.entities.Worker;
import modulo04.capitulo11.entities.enums.WorkerLevel;

public class WorkerApplication {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("##0.00");

		printOff("Enter department's name: ");
		String departmentName = input.nextLine();

		printOff("Enter worker data:");
		printOff("\nName: ");
		String workerName = input.nextLine();
		printOff("Level: ");
		String workerLevel = input.nextLine();
		printOff("Base salary: ");
		double baseSalary = input.nextDouble();

		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
				new Department(departmentName));

		printOff("How many contracts to this worker? ");
		int value = input.nextInt();

		for (int i = 0; i < value; i++) {
			printOff("Enter contract #" + (i + 1) + " data:");
			printOff("\nDate (DD/MM/YYYY): ");
			Date date = sdf.parse(input.next());
			printOff("Value per hour: ");
			double valuePerHour = input.nextDouble();
			printOff("Duration (hours): ");
			int hours = input.nextInt();

			HourContract hC = new HourContract(date, valuePerHour, hours);

			worker.addContract(hC);
		}

		printOff("\nEnter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = input.next();

		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));

		printOff("\nName: " + worker.getName());
		printOff("\nDepartment: " + worker.getDepartment().getName());
		printOff("\nIncomer for " + monthAndYear + ": " + df.format(worker.income(year, month)));

		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}

}
