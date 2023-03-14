package ex2;
//ex3

public class Funcionario {
	int id;
	String nome;
	double salario;
	
	//método construtor
	public Funcionario(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	//método para retornar o salário líquido	
	public double salLiquido(double desconto) {
		double s1;
		s1 = salario - salario * desconto /100;
		return s1;
	}
	
	//método para aumentar o salário do funcionário
	public void salAumentar(double aumento) {
		salario += salario * aumento / 100;
	}
	
	//método para retornar os dados do funcionário
	public String getDados() {
		String aux = "";
		aux += "ID: " + id + "\n";
		aux += "Nome: " + nome + "\n";
		aux += "Salario: R$" + String.format("%.2f", salario) + "\n";
		return aux;
	}	
}
