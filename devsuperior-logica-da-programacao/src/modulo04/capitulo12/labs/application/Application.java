package modulo04.capitulo12.labs.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modulo04.capitulo12.labs.entities.Lesson;
import modulo04.capitulo12.labs.entities.Task;
import modulo04.capitulo12.labs.entities.Video;

public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		printOff("Quantas aulas tem o curso? ");
		int N = input.nextInt();
		input.nextLine();

		List<Lesson> list = new ArrayList<>();

		for (int i = 1; i <= N; i++) {
			printOff("\nDados da " + i + "a aula:");
			printOff("\nConteúdo ou tarefa (c/t)? ");
			String type = input.nextLine();

			printOff("Título: ");
			String title = input.nextLine();

			if (type.equalsIgnoreCase("c")) {
				printOff("URL do vídeo: ");
				String url = input.nextLine();

				printOff("Duração em segundos: ");
				int seconds = input.nextInt();
				input.nextLine();

				list.add(new Video(title, url, seconds));
			} else if (type.equalsIgnoreCase("t")) {
				printOff("Descrição: ");
				String description = input.nextLine();

				printOff("Quantidade de questões: ");
				int questionCount = input.nextInt();
				input.nextLine();

				list.add(new Task(title, description, questionCount));
			}
		}

		int sum = 0;
		for (Lesson l : list) {
			sum += l.duration();
		}

		printOff("\nDURAÇÃO TOTAL DO CURSO = " + sum + " segundos");
		input.close();
	}

	public static void printOff(String text) {
		System.out.print(text);
	}
}
