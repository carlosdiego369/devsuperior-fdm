package modulo04.capitulo16.labs.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import modulo04.capitulo16.labs.entities.LogEntry;

public class ProgramLog {

	public static void main(String[] args) {

		String path = "D:\\temp\\log.txt";
		System.out.println("Enter file full path: " + path);

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			Set<LogEntry> set = new HashSet<>();

			String line = br.readLine();

			while (line != null) {

				String[] vect = line.split(" ");
				String userName = vect[0];
				Date moment = Date.from(Instant.parse(vect[1]));

				set.add(new LogEntry(userName, moment));
				line = br.readLine();
			}
			System.out.println("Total users: " + set.size());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}
}
