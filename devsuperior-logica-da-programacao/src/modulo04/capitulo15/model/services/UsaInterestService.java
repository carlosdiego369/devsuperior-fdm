package modulo04.capitulo15.model.services;

public class UsaInterestService implements InterestService {

	private double interestRate;

	public UsaInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}
}
