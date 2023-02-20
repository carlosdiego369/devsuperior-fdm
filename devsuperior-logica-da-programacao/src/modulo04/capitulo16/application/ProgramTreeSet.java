package modulo04.capitulo16.application;

import java.util.Set;
import java.util.TreeSet;

import modulo04.capitulo16.entities.Product;

public class ProgramTreeSet {

	public static void main(String[] args) {

		Set<Product> set = new TreeSet<>();

		set.add(new Product("TV", 900.00));
		set.add(new Product("Notebook", 1200.00));
		set.add(new Product("Tablet", 400.00));

		for (Product p : set) {
			System.out.println(p);
		}
	}
}
