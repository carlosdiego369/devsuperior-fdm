package modulo04.capitulo14.application;

import java.io.File;
import java.util.Scanner;

public class ApplicationFolder {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		
		System.out.println("Enter a file path");
		String strPath = input.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());
		System.out.println("getPath: " + path.getPath());
		

		input.close();
	}
}
