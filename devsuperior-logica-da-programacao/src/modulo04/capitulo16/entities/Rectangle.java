package modulo04.capitulo16.entities;

public class Rectangle implements Shape {

	private double height;
	private double widht;

	public Rectangle(double height, double widht) {
		this.height = height;
		this.widht = widht;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return widht;
	}

	public void setWeight(double weight) {
		this.widht = weight;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return widht * height;
	}
}
