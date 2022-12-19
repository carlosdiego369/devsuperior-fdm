package modulo04.capitulo08.entities;

public class TaxPayer {
	private double salaryIncome;
	private double servicesIncome;
	private double capitalIncome;
	private double healthSpending;
	private double educationSpending;

	public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending,
			double educationSpending) {
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(double educationSpending) {
		this.educationSpending = educationSpending;
	}

	public double salaryTax() {
		double annualIncome = salaryIncome / 12;
		double salaryTax = 0;

		if (annualIncome < 3000) {

		} else if (annualIncome >= 3000 && annualIncome < 5000) {
			salaryTax = salaryIncome * 10 / 100;
		} else {
			salaryTax = salaryIncome * 20 / 100;
		}
		return salaryTax;
	}

	public double servicesTax() {
		return servicesIncome * 15 / 100;
	}

	public double capitalTax() {
		return capitalIncome * 20 / 100;
	}

	public double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();
	}

	public double taxRebate() {
		double taxRebate = (healthSpending + educationSpending) * 100 / salaryTax();

		double rebateValue = 0;
		if (taxRebate < 30) {
			rebateValue = healthSpending + educationSpending;
		} else {
			rebateValue = grossTax() * 30 / 100;
		}
		return rebateValue;
	}

	public double netTax() {
		return grossTax() - taxRebate();
	}
}
