package modulo04.capitulo06.application;

import java.util.Locale;
import java.util.Scanner;

import modulo04.capitulo06.entities.Employee;

public class EmployeeApplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		imprimir("Nome: ");
		employee.name = input.nextLine();
		imprimir("Salário bruto: ");
		employee.grossSalary = input.nextDouble();
		imprimir("Imposto: ");
		employee.tax = input.nextDouble();
		
		imprimir("Funcionario: " + employee);
		imprimir("\nQual a porcentagem para aumentar o salário? ");
		double percentage = input.nextDouble();
		employee.increaseSalary(percentage);
		imprimir("Dados atualizados: " + employee);
		
		input.close();
	}
	public static void imprimir(String text) {
		System.out.print(text);
	}
}
