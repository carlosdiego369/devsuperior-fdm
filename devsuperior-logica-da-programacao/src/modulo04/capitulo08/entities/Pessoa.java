package modulo04.capitulo08.entities;

public class Pessoa {

	private String name;
	private int age;
	private double height;
	private char genre;

	public Pessoa(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public Pessoa(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Pessoa(double height, char genre) {
		this.height = height;
		this.genre = genre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getGenre() {
		return genre;
	}

	public void setGenre(char genre) {
		this.genre = genre;
	}
}
