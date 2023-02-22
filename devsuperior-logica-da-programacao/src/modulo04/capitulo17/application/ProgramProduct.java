package modulo04.capitulo17.application;

import java.util.ArrayList;
import java.util.List;

import modulo04.capitulo17.entities.Product;

public class ProgramProduct {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Tablet", 450.0));

//		Comparator<Product> comp = (p1, p2) -> {
//			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//		}; //Original

//		Comparator<Product> comp = (p1, p2) -> 
//		p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()); //Resumido

//		list.sort(new MyComparator()); //Vindo de outra class

//		list.sort(comp); //passando a função lambda no construtor sendo atribuindo 'comp'

		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for (Product p : list) {
			System.out.println(p);
		}
	}
}
