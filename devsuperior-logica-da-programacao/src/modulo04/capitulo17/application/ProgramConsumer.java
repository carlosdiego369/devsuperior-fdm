package modulo04.capitulo17.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import modulo04.capitulo17.entities.Product;

public class ProgramConsumer {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

//		list.forEach(new PriceUpdate());

//		list.forEach(Product::staticPriceUpdate);

//		list.forEach(Product::noStaticPriceUpdate);

//		double factor = 1.1;
//		Consumer<Product> cons = p -> {p.setPrice(p.getPrice() * factor);
//		};
//		list.forEach(cons);

		double factor = 1.1;

		list.forEach(p -> {
			p.setPrice(p.getPrice() * factor);
		});

		list.forEach(System.out::println);
	}

}
