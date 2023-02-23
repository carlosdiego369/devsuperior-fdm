package modulo04.capitulo17.util;

import java.util.function.Predicate;

import modulo04.capitulo17.entities.Product;

public class ProductPredicate implements Predicate<Product> {

	@Override
	public boolean test(Product p) {
		// TODO Auto-generated method stub
		return p.getPrice() >= 100.0;
	}

}
