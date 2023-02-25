package modulo04.capitulo17.entities;

import java.text.DecimalFormat;

public class Product {

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

	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100.0;
	}

	public boolean noStaticProductPredicate() {
		return getPrice() >= 100.0;
	}

	public static void staticPriceUpdate(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

	public void noStaticPriceUpdate() {
		setPrice(getPrice() * 1.1);
	}

	public static String staticUpperCaseName(Product p) {
		return p.getName().toUpperCase();
	}

	public String noStaticUpperCaseName() {
		return getName().toUpperCase();
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("##0.00");
		return name + ", " + df.format(getPrice());
	}
}
