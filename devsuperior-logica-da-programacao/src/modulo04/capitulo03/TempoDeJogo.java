package modulo04.capitulo03;

import java.util.Locale;
import java.util.Scanner;

public class TempoDeJogo {

	public static void main(String[] args) {
		inputCodigo();
	}

	public static void inputCodigo() {
		imprimir("Hora inicial: ");
		int horaInicial = inputNum();

		imprimir("Hora final: ");
		int horaFinal = inputNum();

		verificadorDeDuracao(horaInicial, horaFinal);
	}

	public static void verificadorDeDuracao(int horaInicial, int horaFinal) {
		int duracao = 0;
		boolean validacao24Horas = horaInicial == 0 && horaFinal == 0;
		boolean validacao = horaInicial > horaFinal;

		if (validacao24Horas) {
			duracao = 24;
			imprimir("O JOGO DUROU " + duracao + " HORAS (S)");

		} else if (validacao) {
			duracao = (24 - horaInicial) + horaFinal;
			imprimir("O JOGO DUROU " + duracao + " HORAS (S)");

		} else {
			duracao = horaInicial - horaFinal;
			imprimir("O JOGO DUROU " + Math.abs(duracao) + " HORAS (S)");
		}
	}

	public static int inputNum() {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		return num;
	}

	public static void imprimir(String text) {
		System.out.print(text);
	}
}
