package modulo04.capitulo06.entities;

import java.text.DecimalFormat;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;

	public double netSalary() {
		return grossSalary - tax;
	}

	public double increaseSalary(double percentage) {
		percentage = ((grossSalary * percentage) / 100);
		return grossSalary += percentage;
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("###.00");
		return name + ", $ " + df.format(netSalary());

	}
}
