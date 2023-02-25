package modulo04.capitulo17.util;

import java.util.function.Function;

import modulo04.capitulo17.entities.Product;

public class UpperCaseName implements Function<Product, String> {

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
