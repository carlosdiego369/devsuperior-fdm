package modulo04.capitulo14.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ApplicationFileWriterBufferedWriter {

	public static void main(String[] args) {
		String path = ("c:\\temp\\in.txt");

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		} catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}
