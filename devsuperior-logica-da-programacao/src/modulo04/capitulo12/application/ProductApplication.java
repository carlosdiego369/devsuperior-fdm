package modulo04.capitulo12.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import modulo04.capitulo12.entities.ImportedProduct;
import modulo04.capitulo12.entities.Product;
import modulo04.capitulo12.entities.UsedProduct;

public class ProductApplication {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		printOff("Enter the number of products: ");
		int N = input.nextInt();
		input.nextLine();

		List<Product> products = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			printOff("Product #" + (i + 1) + " data:");
			printOff("\nCommon, used or imported (c/u/i)? ");
			String common = input.next();
			input.nextLine();

			printOff("Name: ");
			String name = input.nextLine();

			printOff("Price: ");
			double price = input.nextDouble();
			input.nextLine();

			if (common.equalsIgnoreCase("i")) {
				printOff("Customs fee: ");
				double customsFee = input.nextDouble();
				Product p = new ImportedProduct(name, price, customsFee);
				products.add(p);
			} else if (common.equalsIgnoreCase("u")) {
				printOff("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(input.next());
				Product p = new UsedProduct(name, price, manufactureDate);
				products.add(p);
			} else {
				Product p = new Product(name, price);
				products.add(p);
			}
		}

		printOff("\nPRICE TAGS:");
		for (Product p : products) {
			printOff("\n" + p.priceTag());
		}

		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}

}
