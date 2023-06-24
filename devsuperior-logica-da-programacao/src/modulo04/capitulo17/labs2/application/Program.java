package modulo04.capitulo17.labs2.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		Map<String, Double> map = new HashMap<>();

		prinfOff("Entre com o caminho do arquivo: ");
		String path = input.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String lines = br.readLine();

			while (lines != null) {
				String[] fields = lines.split(",");

//				list.add(new Sale(Integer.parseInt(fields[0]), Integer.parseInt(fields[1]), fields[2],
//						Integer.parseInt(fields[3]), Double.parseDouble(fields[4])));

				String nome = fields[2];
				Double valor = Double.parseDouble(fields[4]);

				if (map.get(nome) == null) {
					map.put(nome, valor);
				} else {
					map.put(nome, valor + map.get(nome));
				}

				lines = br.readLine();
			}
			prinfOff("\nTotal de Vendas por vendedor:");

		} catch (IOException e) {
			prinfOff("Erro: " + e.getMessage());
		} finally {
			for (String key : map.keySet()) {
				prinfOff("\n" + key + " - R$ " + new DecimalFormat("##0.00").format(map.get(key)));
				input.close();
			}
		}
	}

	public static void prinfOff(String text) {
		System.out.print(text);
	}
}
