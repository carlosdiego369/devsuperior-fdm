package modulo04.capitulo12.entities;

import java.text.DecimalFormat;

public class Product {

	private String name;
	private Double price;

	public Product() {
	}

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

	public String priceTag() {
		DecimalFormat df = new DecimalFormat("##0.00");
		StringBuilder sb = new StringBuilder();
		sb.append(getName());
		sb.append(" $ " + df.format(getPrice()));
		return sb.toString();
	}
}
