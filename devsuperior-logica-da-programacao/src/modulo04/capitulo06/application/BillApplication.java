package modulo04.capitulo06.application;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

import modulo04.capitulo06.entities.Bill;

public class BillApplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		DecimalFormat df = new DecimalFormat("##0.00");
		Scanner input = new Scanner(System.in);

		boolean validate = false;
		while (!validate) {

			Bill.printOff("Sexo: ");
			Bill.gender = input.next().charAt(0);

			if (Bill.gender.equals('F') || Bill.gender.equals('f') || 
					Bill.gender.equals('M')|| Bill.gender.equals('m')) {
				validate = true;
			} else {
				Bill.errorMsg();
				validate = false;
			}
		}

		Bill.printOff("Quantidade de cervejas: ");
		Bill.beer = input.nextInt();

		Bill.printOff("Quantidade de refrigerantes: ");
		Bill.softDrink = input.nextInt();

		Bill.printOff("Quantidade de espetinhos: ");
		Bill.barbecue = input.nextInt();

		Bill.printOff("\nRELATÓRIO:");
		Bill.printOff("\nConsumo = R$ " + df.format(Bill.feeding()));

		if (Bill.cover() == 0) {
			Bill.printOff("\nIsento de Couvert");
		} else {
			Bill.printOff("\nCouvert = R$ " + df.format(Bill.cover()));
		}
		
		Bill.printOff("\nIngresso = R$ " + df.format(Bill.ticket()));
		
		Bill.printOff("\n\nValor a pagar = R$ " + df.format(Bill.total()));

		input.close();
	}

}
