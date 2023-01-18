package modulo04.capitulo15.labs.application;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import modulo04.capitulo15.labs.model.entities.Locadora;

public class LocadoraApplication {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		DecimalFormat df = new DecimalFormat("##0.00");
		List<Locadora> list = new ArrayList<>();

		try {
			printOff("Entre com os dados do aluguel");
			printOff("\nModelo do carro: ");
			String modelCar = "Civic";
			printOff(modelCar);
			printOff("\nRetirada (dd/MM/yyyy HH:mm): ");
			Date withdraw = sdf.parse("25/06/2018 10:30");
			printOff(sdf.format(withdraw) + "\n");
			printOff("Retorno (dd/MM/yyyy HH:mm): ");
			Date devolution = sdf.parse("27/06/2018 11:40");
			printOff(sdf.format(devolution) + "\n");
			printOff("Entre com o preço por hora: ");
			double valueForHour = 10.00;
			printOff(df.format(valueForHour) + "\n");
			printOff("Entre com o preço por dia: ");
			double valueForDay = 130.00;
			printOff(df.format(valueForDay) + "\n");

			list.add(new Locadora(modelCar, withdraw, devolution, valueForHour, valueForDay));

			printOff("FATURA:");
			for (Locadora l : list) {
				printOff("\nPagamento basico: " + df.format(l.basicPayment()));
				printOff("\nImposto: " + df.format(l.tax()));
				printOff("\nPagamento total: " + df.format(l.total()));
			}
		} catch (ParseException e) {
			printOff("Erro: " + e.getMessage());
		} catch (Exception e) {
			printOff("Erro: " + e.getMessage());
		} finally {
			input.close();
		}

	}

	public static void printOff(String text) {
		System.out.print(text);
	}
}
