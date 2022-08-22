package modulo01.capitulo04;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {

		ArrayList<Pessoa> pessoaLista;

		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
		
		p1.setNome("Marcelo");
		p2.setNome("Carlos");
		p3.setNome("João");
		
		pessoaLista = new ArrayList<Pessoa>();
		pessoaLista.add(p1);
		pessoaLista.add(p2);
		pessoaLista.add(p3);
		
		p1.imprimir(pessoaLista.toString());
	}
}