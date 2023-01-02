package modulo04.capitulo12.application;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import modulo04.capitulo12.entities.Circle;
import modulo04.capitulo12.entities.Rectangle;
import modulo04.capitulo12.entities.Shape;
import modulo04.capitulo12.enums.Color;

public class ShapeApplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.00");

		printOff("Enter the number of shapes: ");
		int N = input.nextInt();
		input.nextLine();

		List<Shape> list = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			printOff("Shape #" + (i + 1) + " data:");
			printOff("\nRectangle or Circle (r/c)? ");
			String type = input.next();
			input.nextLine();

			printOff("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(input.next());

			if (type.equalsIgnoreCase("r")) {
				printOff("Width: ");
				double width = input.nextDouble();
				printOff("Height: ");
				double height = input.nextDouble();

				list.add(new Rectangle(color, width, height));
			} else if (type.equalsIgnoreCase("c")) {
				printOff("Radius: ");
				double radius = input.nextDouble();
				list.add(new Circle(color, radius));
			}
		}

		printOff("\nSHAPE AREAS:");
		for (Shape s : list) {
			printOff("\n" + df.format(s.area()));
		}

		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}
}
