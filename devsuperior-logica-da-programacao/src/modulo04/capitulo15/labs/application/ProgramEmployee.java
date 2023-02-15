package modulo04.capitulo15.labs.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import modulo04.capitulo15.model.entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		String path = "D:\\Anexos\\in.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while (line != null) {
				String[] vect = line.split(",");
				list.add(new Employee(vect[0], Double.parseDouble(vect[1])));
				line = br.readLine();
			}

			Collections.sort(list);
			for (Employee emp : list) {
				DecimalFormat df = new DecimalFormat("##0.00");
				System.out.println(emp.getName() + " " + df.format(emp.getSalary()));
			}

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
