package modulo01.capitulo03;

public class Exercicio01 {

	public static void main(String[] args) {

		String produto1 = "Computador";
		String produto2 = "Tv";
		Double preco1 = 2100.5;
		Double preco2 = 1830.0;
		Integer idade = 30;
		Integer codigo = 5291;
		Character genero = 'F';
		
		String texto = "";
		
		texto = "Produtos:\n" + 
		"O produto " + produto1 + " custa R$ " + preco1 + "\n" +
		"O produto " + produto2 + " custa R$ " + preco2 + "\n" +
		"Código = " + codigo + "\n" +
		"Dadps da pessoa: Genero " + genero + " e idade " + idade;
		
		System.out.println(texto);
				
		
	}

}
