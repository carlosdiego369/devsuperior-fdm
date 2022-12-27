package modulo04.capitulo10.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConversaoDataHora {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2022-12-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-12-20T01:30:26");
		Instant d06 = Instant.parse("2022-12-20T01:30:26Z");

		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

		System.out.println("R1 = " + r1);
		System.out.println("R2 = " + r2);
		System.out.println("R3 = " + r3);
		System.out.println("R4 = " + r4);

		System.out.println("D04 DIA = " + d04.getDayOfMonth());
		System.out.println("D04 MES = " + d04.getMonthValue());
		System.out.println("D04 ANO = " + d04.getYear());
		System.out.println("D05 HORA = " + d05.getHour());
		System.out.println("D05 MINUTOS = " + d05.getMinute());
		System.out.println("D05 SEGUNDOS = " + d05.getSecond());
	}

}
