package modulo04.capitulo16.labs.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class ProgramElections {

	public static void main(String[] args) {

		Map<String, Integer> list = new LinkedHashMap<>();

		String path = "D:\\temp\\in.txt";
		printOff("Enter file full path: " + path);

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String lines = br.readLine();

			while (lines != null) {
				String[] fields = lines.split(",");

				String name = fields[0];
				int votes = Integer.parseInt(fields[1]);

				if (list.containsKey(name)) {
					int votesSoFar = list.get(name);
					list.put(name, votes + votesSoFar);
				} else {
					list.put(name, votes);
				}

				lines = br.readLine();
			}

			for (String key : list.keySet()) {
				printOff("\n" + key + ": " + list.get(key));
			}

		} catch (Exception e) {
			printOff("\nError: " + e.getMessage());
		}
	}

	public static void printOff(String text) {
		System.out.print(text);
	}
}
