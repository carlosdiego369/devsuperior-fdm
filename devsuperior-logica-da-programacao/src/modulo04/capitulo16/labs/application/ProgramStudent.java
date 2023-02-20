package modulo04.capitulo16.labs.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import modulo04.capitulo16.labs.entities.Student;

public class ProgramStudent {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		printOff("How many students for course A? ");
		int num = input.nextInt();

		Set<Student> courseA = new HashSet<>();

		addStudents(num, courseA, input);

		printOff("How many students for course B? ");
		num = input.nextInt();

		Set<Student> courseB = new HashSet<>();

		addStudents(num, courseB, input);

		printOff("How many students for course C? ");
		num = input.nextInt();

		Set<Student> courseC = new HashSet<>();

		addStudents(num, courseC, input);

		Set<Student> allStudents = new HashSet<>(courseA);
		allStudents.addAll(courseB);
		allStudents.addAll(courseC);

		printOff("Total students: " + allStudents.size());

		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}

	public static void addStudents(int num, Set<Student> list, Scanner input) {

		for (int i = 0; i < num; i++) {
			int id = input.nextInt();
			list.add(new Student(id));
		}
	}
}
