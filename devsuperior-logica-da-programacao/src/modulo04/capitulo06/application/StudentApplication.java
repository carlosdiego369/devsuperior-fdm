package modulo04.capitulo06.application;

import java.util.Locale;
import java.util.Scanner;

import modulo04.capitulo06.entities.Student;

public class StudentApplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Student student = new Student();
		student.name = input.nextLine();
		student.note1 = student.validatesFirstQuarter();
		student.note2 = student.validatesOtherNote();
		student.note3 = student.validatesOtherNote();

		student.finalGrade(student.note1, student.note2, student.note3);
		input.close();
	}
	

}
