package modulo04.capitulo13.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import modulo04.capitulo13.model.entities.Reservation2;

public class Solucao2 {

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
			printOff("\nError in reservation: Check-out date must be after check-in date");
		} else {
			Reservation2 reservation = new Reservation2(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);

			printOff("\n\nEnter data to update the reservation:");
			printOff("\nCheck-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(input.next());
			printOff("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(input.next());

			String error = reservation.updateDates(checkIn, checkOut);

			if (error != null) {
				System.out.println("Error in reservation: " + error);
			} else {
				printOff("\nReservation: " + reservation);

			}

		}
		input.close();

	}

	public static void printOff(String text) {
		System.out.print(text);
	}
}
