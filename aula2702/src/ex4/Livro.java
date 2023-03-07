package ex4;

public class Livro {

	int id;
	String titulo;
	String autor;
	boolean disponivel;
	
	//método p simular o empréstimo do livro
	public void emprestar() {
		if(disponivel) {
			disponivel = false;
		}
	}
	
	//método para simular a devolução do livro
	public void devolver() {
		if(!disponivel) {
			disponivel = true;
		}
	}
	
	//metódo para retornar os dados do livro
	public String getDados() {
		return id + "\n" + titulo + "\n" + autor + "\n" + disponivel;
	}
}
