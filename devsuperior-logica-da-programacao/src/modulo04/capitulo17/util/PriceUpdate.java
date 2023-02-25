package modulo04.capitulo17.util;

import java.util.function.Consumer;

import modulo04.capitulo17.entities.Product;

public class PriceUpdate implements Consumer<Product> {

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

}
