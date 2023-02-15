package modulo04.capitulo16.application;

import java.util.Scanner;

import modulo04.capitulo16.services.PrintService;

public class ProgramService {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		PrintService<String> ps = new PrintService<>();

		printOff("How many value? ");
		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			String value = input.next();
			ps.addValue(value);
		}

		ps.print();

		printOff("First: " + ps.first());
		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}
}
