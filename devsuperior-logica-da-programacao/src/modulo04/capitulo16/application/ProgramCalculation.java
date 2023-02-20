package modulo04.capitulo16.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import modulo04.capitulo16.entities.Product;
import modulo04.capitulo16.services.CalculationService;

public class ProgramCalculation {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		String path = "D:\\Anexos\\in2.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] vect = line.split(",");
				list.add(new Product(vect[0], Double.parseDouble(vect[1])));
				line = br.readLine();
			}

			Product x = CalculationService.max(list);
			System.out.println("Most expesive: ");
			System.out.println(x);
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}
