package modulo04.capitulo14.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ApplicationTryWithResources {

	public static void main(String[] args) {

		String[] lines = new String[] { "Good morning", "Good everning", "Good night" };

		String path = "c:\\temp\\out.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path/* , true (ele escreve em baixo */))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
