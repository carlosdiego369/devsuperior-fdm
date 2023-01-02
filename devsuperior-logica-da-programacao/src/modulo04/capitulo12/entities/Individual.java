package modulo04.capitulo12.entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double sum = 0;
		if (getAnualIncome() < 20000) {
			sum += getAnualIncome() * 0.15;
		} else if (getAnualIncome() >= 20000) {
			sum += getAnualIncome() * 0.25;
		}

		if (healthExpenditures > 0) {
			sum -= (healthExpenditures * 0.50);
		}
		return sum;
	}
}
