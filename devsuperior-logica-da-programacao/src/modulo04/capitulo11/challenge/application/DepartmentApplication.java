package modulo04.capitulo11.challenge.application;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

import modulo04.capitulo11.challenge.entities.Address;
import modulo04.capitulo11.challenge.entities.Department;
import modulo04.capitulo11.challenge.entities.Employee;

public class DepartmentApplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		printOff("Nome do departamento: ");
		String departmentName = input.nextLine();

		printOff("Dia do pagamento: ");
		int payDay = input.nextInt();
		input.nextLine();

		printOff("Email: ");
		String departmentEmail = input.next();

		printOff("Telefone: ");
		String departmentPhone = input.next();

		Address address = new Address(departmentEmail, departmentPhone);

		printOff("Quantos funcionários tem o departamento? ");
		int qtd = input.nextInt();
		input.nextLine();

		Department department = new Department(departmentName, payDay, address);

		for (int i = 1; i <= qtd; i++) {
			printOff("Dados do funcionário " + i + ":");
			printOff("\nNome: ");
			String employeeName = input.nextLine();
			printOff("Salário: ");
			double employeeSalary = input.nextDouble();
			input.nextLine();

			Employee employees = new Employee(employeeName, employeeSalary);

			department.addEmployee(employees);

		}

		showReport(department);

		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}

	public static void showReport(Department dept) {
		DecimalFormat df = new DecimalFormat("##0.00");
		String form = "";

		form += "\nFOLHA DE PAGAMENTO:" + "\nDepartamento " + dept.getName() + " = R$ " + df.format(dept.payroll())
				+ "\nPagamento realizado no dia " + dept.getPayDay() + "\nFuncionarios:";

		for (Employee e : dept.getEmployees()) {
			form += "\n" + e.getName();
		}

		form += "\nPara dúvidas favor entrar em contato: " + dept.getAdress().getEmail();

		printOff(form);
	}
}
