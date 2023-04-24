
public class Empregado {
	private long matricula;
	private String nome;
	
	public String toString() {
		String aux = "";
		aux += "Nome: " + nome + "\n";
		aux += "Matrícula: " + matricula + "\n";
		return aux;
	}
	
}
