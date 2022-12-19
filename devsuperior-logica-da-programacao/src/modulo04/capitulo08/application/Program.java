package modulo04.capitulo08.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		System.out.println("------------");
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");

		System.out.println(list.size());

		for (String a : list) {
			System.out.println(a);
		}

		System.out.println("------------");
		list.removeIf(a -> a.charAt(0) == 'M'); // PREDICADO
		
		for (String a : list) {
			System.out.println(a);
		}
		System.out.println("------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Bob: " + list.indexOf("Marco"));
		
		System.out.println("------------");
		List<String> result = list.stream().filter(a -> a.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String a : result) {
			System.out.println(a);
		}
		System.out.println("------------");
		String name = list.stream().filter(a -> a.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		System.out.println("------------");
	}
}
