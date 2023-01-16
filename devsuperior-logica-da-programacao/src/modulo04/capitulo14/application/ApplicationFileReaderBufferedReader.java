package modulo04.capitulo14.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ApplicationFileReaderBufferedReader {

	public static void main(String[] args) {

		File file = new File("c:\\temp\\in.txt");

		Scanner input = null;

		try {
			input = new Scanner(file);
			while (input.hasNextLine()) {
				System.out.println(input.nextLine());
			}
		} catch (IOException e) {
			System.err.println("Error : " + e.getMessage());
		} finally {
			if (input != null) {
				input.close();
			}
		}
	}
}
