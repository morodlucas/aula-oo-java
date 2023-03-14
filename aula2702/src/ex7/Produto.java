package ex7;

public class Produto {

	String nome;
	int quantidade;
	static int total = 0;
	
	public Produto(String nome, int quantidade) {
		this.nome = nome;
		this.quantidade = quantidade;
		total += quantidade;
	}
	
}
