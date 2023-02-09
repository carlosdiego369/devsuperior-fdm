package modulo04.capitulo15.labs.application;

import modulo04.capitulo15.model.entities.AbstractShape;
import modulo04.capitulo15.model.entities.Circle;
import modulo04.capitulo15.model.entities.Rectangle;
import modulo04.capitulo15.model.enums.Color;

public class ProgramShape {

	public static void main(String[] args) {

		AbstractShape s1 = new Circle(Color.BLACK, 2.0);
		AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);

		printOff("Circle color: " + s1.getColor());
		printOff("Circle area: " + String.format("%.3f", s1.area()));
		printOff("Rectangle color: " + s2.getColor());
		printOff("Rectangle area: " + String.format("%.3f", s2.area()));

	}

	public static void printOff(String text) {
		System.out.println(text);
	}
}
