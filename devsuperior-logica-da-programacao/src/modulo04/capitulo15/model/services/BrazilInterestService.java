package modulo04.capitulo15.model.services;

public class BrazilInterestService implements InterestService {

	private double interestRate;

	public BrazilInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}
}
