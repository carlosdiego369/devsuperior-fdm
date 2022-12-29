package modulo04.capitulo11.labs.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import modulo04.capitulo11.labs.entities.Client;
import modulo04.capitulo11.labs.entities.Order;
import modulo04.capitulo11.labs.entities.OrderItem;
import modulo04.capitulo11.labs.entities.Product;
import modulo04.capitulo11.labs.entities.enums.OrderStatus;

public class OrderApplication {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		printOff("Enter cliente data:");
		printOff("\nName: ");
		String name = input.nextLine();

		printOff("Email: ");
		String email = input.nextLine();

		printOff("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(input.next());

		Client client = new Client(name, email, birthDate);

		printOff("Enter order data: ");
		printOff("\nStatus: ");

		OrderStatus status = OrderStatus.valueOf(input.next());

		Order order = new Order(new Date(), status, client);

		printOff("How many items to this order? ");
		int qtdItems = input.nextInt();
		input.nextLine();

		for (int i = 0; i < qtdItems; i++) {
			printOff("Enter #" + (i + 1) + " item data:");
			printOff("\nProduct name: ");
			String productName = input.nextLine();

			printOff("Product price: ");
			double productPrice = input.nextDouble();

			printOff("Quantity: ");
			int productQuantity = input.nextInt();
			input.nextLine();

			Product product = new Product(productName, productPrice);

			OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);

			order.addItem(orderItem);
		}

		printOff("\n" + order);

		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}
}
