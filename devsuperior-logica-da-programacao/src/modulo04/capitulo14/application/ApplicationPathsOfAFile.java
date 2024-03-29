package modulo04.capitulo14.application;

import java.io.File;
import java.util.Scanner;

public class ApplicationPathsOfAFile {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a folder path: ");
		String strPath = input.nextLine();

		File path = new File(strPath);

		File[] folders = path.listFiles(File::isDirectory);

		System.out.println("Folders");

		for (File folder : folders) {
			System.out.println(folder);
		}

		File[] files = path.listFiles(File::isFile);

		System.out.println("Files");
		for (File file : files) {
			System.out.println(file);
		}

		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully " + success);

		input.close();
	}
}
