package modulo04.capitulo16.application;

import java.util.HashSet;
import java.util.Set;

import modulo04.capitulo16.entities.Product;

public class ProgramProduct {

	public static void main(String[] args) {

		Set<Product> set = new HashSet<>();

		set.add(new Product("TV", 900.00));
		set.add(new Product("Notebook", 1200.00));
		set.add(new Product("Tablet", 400.00));

		Product prod = new Product("Notebook", 1200.00);

		System.out.println(set.contains(prod));

	}
}
