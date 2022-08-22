package modulo01.capitulo04;

import java.util.Scanner;

public class TempoDeJogo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		imprimir("Hora inicial: ");
		int hrInicial = input.nextInt();
		imprimir("Hora final: ");
		int hrFinal = input.nextInt();

		verificadorDeTempoDeJogo(hrInicial, hrFinal);

		input.close();
	}

	public static void verificadorDeTempoDeJogo(int hrInicial, int hrFinal) {

		int hrJogadas;

		if (hrInicial < 0) {
			msgErro("O jogo não pode ter menos de 1 hora");
		} else if (hrInicial > 24 || hrFinal > 24) {
			msgErro("O jogo não pode passar de 24 horas");
		} else if (hrInicial == 0 && hrFinal == 0) {
			imprimir("O JOGO DUROU 24 HORA(S)");
		}else if (hrFinal > hrInicial) {
			hrJogadas = (12 - hrInicial) + (hrFinal - 12);
			imprimir("O JOGO DUROU " + hrJogadas + " HORA(S)");
		} else {
			hrJogadas = (24 - hrInicial) + hrFinal;
			imprimir("O JOGO DUROU " + hrJogadas + " HORA(S)");
		}
		
	}

	public static void imprimir(String texto) {
		System.out.print(texto);
	}

	public static void msgErro(String texto) {
		System.err.println(texto);
	}

}
