package modulo01.capitulo04;

public class Pessoa {

	private String nome;

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + "]";
	}
	
	public void imprimir(String texto) {
		System.out.println(texto);
	}
}
