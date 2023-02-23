package modulo04.capitulo17.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import modulo04.capitulo17.entities.Product;

public class ProgramPredicate {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

//		list.removeIf(p -> p.getPrice() >= 100);

//		list.removeIf(new ProductPredicate());

//		list.removeIf(Product::staticProductPredicate);

//		list.removeIf(Product::noStaticProductPredicate);

//		double min = 100.0;
//		Predicate<Product> pred = p -> p.getPrice() >= min;
//		list.removeIf(pred);

		double min = 100.0;
		list.removeIf(p -> p.getPrice() >= min);

		for (Product p : list) {
			System.out.println(p);
		}
	}

}
