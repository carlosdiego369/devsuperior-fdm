package modulo04.capitulo16.application;

import java.util.LinkedHashSet;
import java.util.Set;

public class ProgramSet {

	public static void main(String[] args) {

//		Set<String> set = new HashSet<>(); //HashSet nao garante a ordem
//		Set<String> set = new TreeSet<>(); //Ordena por ordem alfabetica
		Set<String> set = new LinkedHashSet<>(); // Mantem a ordem da inserção dos elementos
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");

		set.removeIf(x -> x.charAt(0) == 'T');

		for (String s : set) {
			System.out.println(s);
		}
	}

}
