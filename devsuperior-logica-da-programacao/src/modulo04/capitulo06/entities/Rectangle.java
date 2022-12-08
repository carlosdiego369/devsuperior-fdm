package modulo04.capitulo06.entities;

import java.text.DecimalFormat;

public class Rectangle {

	public double width;
	public double height;
	
	public double area() {
		return (width * height);
	}
	
	public double perimeter() {
		return (width * 2) + (height * 2);
	}
	
	public double diagonal() {
		return Math.sqrt((width * width) + (height * height));
	}
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("##0.00");
		return "AREA = " + df.format(area()) +
				"\nPERIMETRO = " + df.format(perimeter()) +
				"\nDIAGONAL = " + df.format(diagonal());
		
	}
}
