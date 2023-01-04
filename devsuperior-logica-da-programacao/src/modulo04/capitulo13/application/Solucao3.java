package modulo04.capitulo13.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import modulo04.capitulo13.model.entities.Reservation3;
import modulo04.capitulo13.model.exceptions.DomainException;

public class Solucao3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			printOff("Room number: ");
			int number = input.nextInt();
			printOff("Check-in date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(input.next());
			printOff("Check-out date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(input.next());

			Reservation3 reservation3 = new Reservation3(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation3);

			printOff("\n\nEnter data to update the reservation:");
			printOff("\nCheck-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(input.next());
			printOff("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(input.next());

			reservation3.updateDates(checkIn, checkOut);
			printOff("\nReservation: " + reservation3);
		} catch (ParseException e) {
			errorMsg("Invalid date format");
		} catch (DomainException e) {
			errorMsg("Error in reservation: " + e.getMessage());
		} catch (InputMismatchException e) {
			errorMsg("Invalid input value");
		} catch(RuntimeException e) {
			errorMsg("Unexpected error");
		}
		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}

	public static void errorMsg(String text) {
		System.err.print(text);
	}
}
