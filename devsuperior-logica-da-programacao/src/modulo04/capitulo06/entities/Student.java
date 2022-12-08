package modulo04.capitulo06.entities;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Student {

	public String name;
	public double note1, note2, note3;

	public double validatesFirstQuarter() {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		boolean validate = false;
		double note;
		do {
			note = input.nextDouble();
			if (note < 0 || note > 30) {
				validate = true;
				errorMessage();
			} else {
				validate = false;
			}
		} while (validate);
		return note;

	}

	public double validatesOtherNote() {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		boolean validate = false;
		double note;
		do {
			note = input.nextDouble();
			if (note < 0 || note > 35) {
				validate = true;
				errorMessage();
			} else {
				validate = false;
			}
		} while (validate);
		return note;

	}

	public void finalGrade(double note1, double note2, double note3) {
		DecimalFormat df = new DecimalFormat("###.00");
		double finalGrade = note1 + note2 + note3, approved = 60.0, remaining;
		if (finalGrade > approved) {
			printOut("NOTA FINAL = " + df.format(finalGrade) + "\nPASS");
		} else {
			remaining = finalGrade - approved;
			printOut(
					"NOTA FINAL = " + df.format(finalGrade) + 
					"\nFAILED\nFALTARAM " + df.format(Math.abs(remaining)) + " PONTOS");
		}
	}

	public void printOut(String text) {
		System.out.print(text);
	}

	public static void errorMessage() {
		System.err.println("Invalid input");
	}
}
