package modulo04.capitulo15.application;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import modulo04.capitulo15.model.entities.Contract;
import modulo04.capitulo15.model.entities.Installment;
import modulo04.capitulo15.model.services.ContractService;
import modulo04.capitulo15.model.services.PaypalService;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("##0.00");

		printOff("Entre com os dados do contrato");
		int contactNumber = 8028;
		printOff("\nNumero: " + contactNumber);

		LocalDate date = LocalDate.parse("25/06/2018", fmt);
		printOff("\nData (dd/MM/yyyy): " + fmt.format(date));
		double totalValue = 600.00;
		printOff("\nValor do contrato: " + df.format(totalValue));

		Contract obj = new Contract(contactNumber, date, totalValue);

		int installmentValue = 3;
		printOff("\nEntre com o numero de parcelas: " + installmentValue);

		ContractService cS = new ContractService(new PaypalService());

		cS.processContract(obj, installmentValue);

		printOff("\nParcelas:");
		for (Installment i : obj.getInstallment()) {
			printOff("\n" + i);
		}

		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}
}
