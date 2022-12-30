package modulo04.capitulo11.challenge.entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private Integer payDay;

	private Address adress;

	List<Employee> employees = new ArrayList<>();

	public Department() {
	}

	public Department(String name, Integer payDay, Address adress) {
		this.name = name;
		this.payDay = payDay;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPayDay() {
		return payDay;
	}

	public void setPayDay(Integer payDay) {
		this.payDay = payDay;
	}

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

//	public void setEmployees(List<Employee> employees) {
//		this.employees = employees;
//	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}

	public double payroll() {
		double sum = 0;

		for (Employee e : employees) {
			sum += e.getSalary();
		}
		return sum;
	}
}
