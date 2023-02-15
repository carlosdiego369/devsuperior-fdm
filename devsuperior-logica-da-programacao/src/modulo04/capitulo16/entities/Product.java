package modulo04.capitulo16.entities;

import java.text.DecimalFormat;

public class Product implements Comparable<Product> {

	private String name;
	private Double price;

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("##0.00");
		return name + ", " + df.format(price);
	}

	@Override
	public int compareTo(Product other) {
		return price.compareTo(other.getPrice());
	}

}
