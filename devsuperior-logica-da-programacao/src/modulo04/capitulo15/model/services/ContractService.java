package modulo04.capitulo15.model.services;

import java.time.LocalDate;

import modulo04.capitulo15.model.entities.Contract;
import modulo04.capitulo15.model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer months) {

		double baseInstallment = contract.getTotalValue() / months;

		for (int i = 1; i <= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			double interest = onlinePaymentService.interest(baseInstallment, i);
			double fee = onlinePaymentService.paymentFee(baseInstallment + interest);
			double quota = baseInstallment + interest + fee;
			contract.getInstallment().add(new Installment(dueDate, quota));
		}

	}
}
