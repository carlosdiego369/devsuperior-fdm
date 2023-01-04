package modulo04.capitulo13.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import modulo04.capitulo13.model.entities.Reservation1;

public class Solucao1 {

	public static void main(String[] args) throws ParseException {

		Scanner input = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		printOff("Room number: ");
		int number = input.nextInt();

		printOff("Check-in date (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(input.next());

		printOff("Check-out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(input.next());

		if (!checkOut.after(checkIn)) {
			printOff("Error in reservation: Check-out date must be after check-in date");
		} else {
			Reservation1 reservation1 = new Reservation1(number, checkIn, checkOut);
			printOff("Reservation: " + reservation1);

			printOff("\n\nEnter data to update the reservation:");

			printOff("\nCheck-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(input.next());

			printOff("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(input.next());

			Date now = new Date();

			if (!checkOut.after(checkIn)) {
				printOff("Error in reservation: Check-out date must be after check-in date");
			} else if (checkIn.before(now) || checkOut.before(now)) {
				printOff("Error in reservation: Reservation dates for update must be future dates");
			} else {
				reservation1.updateDates(checkIn, checkOut);
				printOff("Reservation: " + reservation1);
			}

		}

		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}
}
