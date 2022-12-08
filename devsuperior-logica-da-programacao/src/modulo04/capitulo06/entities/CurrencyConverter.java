package modulo04.capitulo06.entities;

public class CurrencyConverter {
	public static double IOF = 0.06;

	public static double dollarToReal(double dollarValue, double price) {
		double amount = dollarValue * price;
		amount += amount * IOF;
		return amount;
	}
}
