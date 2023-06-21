package modulo04.capitulo17.labs.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import modulo04.capitulo17.labs.entities.Sale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		prinfOff("Entre com o caminho do arquivo: ");
		String path = input.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Sale> list = new ArrayList<>();

			String lines = br.readLine();

			while (lines != null) {
				String[] fields = lines.split(",");

				list.add(new Sale(Integer.parseInt(fields[0]), Integer.parseInt(fields[1]), fields[2],
						Integer.parseInt(fields[3]), Double.parseDouble(fields[4])));

				lines = br.readLine();
			}
			
			prinfOff("\n\nCinco primeiras vendas de 2016 de maior preço médio\n");
			List<Sale> avg = list.stream()
					.filter(y -> y.getYear().equals(2016))
					.sorted((a, b) -> b.avaragePrice()
					.compareTo(a.avaragePrice())).limit(5)
					.toList();

			avg.forEach(System.out::println);

			var result = list.stream()
					.filter(y -> y.getSeller().equalsIgnoreCase("Logan") && (y.getMonth() == 1 || y.getMonth() == 7))
					.mapToDouble(y -> y.getTotal())
					.sum();
					

			prinfOff("\nValor total vendido pelo vendedor Logan nos meses 1 e 7 = " + result);
			

		} catch (IOException e) {
			prinfOff("\nErro: " + e.getMessage());
		}

		input.close();
	}

	public static void prinfOff(String text) {
		System.out.print(text);
	}
}
