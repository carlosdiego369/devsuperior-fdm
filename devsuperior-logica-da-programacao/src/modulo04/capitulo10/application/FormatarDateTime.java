package modulo04.capitulo10.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FormatarDateTime {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2022-12-21");
		LocalDateTime d05 = LocalDateTime.parse("2022-12-21T01:30:26");
		Instant d06 = Instant.parse("2022-12-21T01:30:26Z");

		System.out.println("D04 = " + d04);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

		System.out.println("D04 = " + d04.format(fmt1));
		System.out.println("D04 = " + fmt1.format(d04));
		System.out.println("D04 = " + d04.format(fmt1));
		System.out.println("D04 = " + d04.format(fmt1));
		System.out.println("D05 = " + d05.format(fmt1));
		System.out.println("D05 = " + d05.format(fmt2));
		System.out.println("D05 = " + d05.format(fmt4));

		
		System.out.println("D010 = " + fmt4.format(d05));
		System.out.println("D06 = " + fmt3.format(d06));
		System.out.println("D06 = " + fmt5.format(d06));
		System.out.println("D06 = " + d06.toString());

	}

}
