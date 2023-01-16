package modulo04.capitulo14.labs.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import modulo04.capitulo14.labs.model.entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.00");

		List<Product> list = new ArrayList<>();

		printOff("Enter file path: ");
		String filePath = input.nextLine();

		File file = new File(filePath);

		String fileDir = file.getParent();

		boolean success = new File(fileDir + "\\out").mkdir();

		if (success == true) {
			printOff("Created Folder");
		} else {
			printOff("Folder existed!");
		}

		String savePath = fileDir + "\\out\\summary.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = br.readLine();

			while (line != null) {
				String[] field = line.split(",");
				list.add(new Product(field[0], Double.parseDouble(field[1]), Integer.parseInt(field[2])));
				line = br.readLine();
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(savePath))) {
				for (Product p : list) {
					bw.write(p.getName() + "," + df.format(p.total()));
					bw.newLine();
				}
				printOff("\nCreated path: " + savePath);
			} catch (Exception e) {
				printOff("\nError: " + e.getMessage());
				e.printStackTrace();
			}

		} catch (Exception e) {
			printOff("\nError: " + e.getMessage());
		} finally {
			printOff("\nEND PROGRAM");
			input.close();
		}

	}

	public static void printOff(String text) {
		System.out.print(text);
	}
}
