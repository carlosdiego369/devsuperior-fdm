package modulo04.capitulo15.labs.application;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import modulo04.capitulo15.labs.model.entities.CarRental;
import modulo04.capitulo15.labs.model.entities.Vehicle;
import modulo04.capitulo15.labs.model.services.BrazilTaxServices;
import modulo04.capitulo15.labs.model.services.RentalService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DecimalFormat df = new DecimalFormat("##0.00");

		printOff("Entre com os dados do aluguel");
		printOff("\nModelo do carro: ");
		String carModel = input.nextLine();
		printOff("Retirada (dd/MM/yyyy HH:mm): ");
		LocalDateTime start = LocalDateTime.parse(input.nextLine(), fmt);
		printOff("Retorno (dd/MM/yyyy HH:mm): ");
		LocalDateTime finish = LocalDateTime.parse(input.nextLine(), fmt);

		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
		
		printOff("Entre com o preço por hora: ");
		double pricePerHour = input.nextDouble();
		printOff("Entre com o preço por dia: ");
		double pricePerDay = input.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxServices());
		
		rentalService.processInvoice(cr);
		
		printOff("FATURA");
		printOff("\nPagamento basico: " + df.format(cr.getInvoice().getBasicPayment()));
		printOff("\nImposto: " + df.format(cr.getInvoice().getTax()));
		printOff("\nPagamento total: " + df.format(cr.getInvoice().getTotalPayment()));
		
		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}
}
