
//uma classe p objeto


public class Aluno {
	
	//atributos; propriedades; variável de instância
	
	String nome;
	int rm;
	double nota1, nota2;

	// método p calcular e retornar a média
	public double media() {
		double media;
		media = (nota1 + nota2) / 2;
		return media;
	}
	
}

