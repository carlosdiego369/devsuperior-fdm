package modulo04.capitulo06.entities;

public class Bill {

	public static Character gender;
	public static int beer, barbecue, softDrink;

	public static double cover() {
		double total = 0;
		if (feeding() <= 30) {
			total += 4.00;
		}
		return total;
	}

	public static double feeding() {
		double total = 0;
		total += beer * 5 + barbecue * 7 + softDrink * 3;
		return total;
	}

	public static double ticket() {
		double total = 0;
		if (gender.equals('F') || gender.equals('f')) {
			total = 8.00;
		} else if (gender.equals('M') || gender.equals('m')) {
			total = 10.00;
		}
		return total;
	}

	public static double total() {
		return feeding() + cover() + ticket();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}
	
	public static void errorMsg() {
		System.err.print("Input Invalid\n");
	}
}
