package modulo04.capitulo16.application;

import java.util.ArrayList;
import java.util.List;

import modulo04.capitulo16.entities.Circle;
import modulo04.capitulo16.entities.Rectangle;
import modulo04.capitulo16.entities.Shape;

public class ProgramShape {

	public static void main(String[] args) {

		List<Shape> myShapes = new ArrayList<>();

		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));

		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		

		System.out.println("Total area: " + totalArea(myCircles));

	}

	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}

}
