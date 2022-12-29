package modulo04.capitulo11.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import modulo04.capitulo11.entities.Comment;
import modulo04.capitulo11.entities.Post;

public class InstagramApplication {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		
		Post p1 = new Post(
				sdf.parse("27/12/2022 12:08:00"),
				"Traveling to New Zealand",
				"I'm going to visit this wonderful country!",
				12);
		
			p1.addComment(c1);
			p1.addComment(c2);
			
			
			Comment c3 = new Comment("Good night");
			Comment c4 = new Comment("May the Force be with you");	
		Post p2 = new Post(
				sdf.parse("27/12/2022 23:14:19"),
				"Good night guys",
				"See you tomorrow",
				5);
		
		p2.addComment(c3);
		p2.addComment(c4);
			
			printOff("" + p1);
			printOff("\n" + p2);
	}

	public static void printOff(String text) {
		System.out.print(text);
	}
}
