package ex2;

public class Funcionario {
	int id;
	String name;
	double salario;
	
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
		aux += "Nome: " + name + "\n";
		aux += "Salario: R$" + String.format("%.2f", salario) + "\n";
		return aux;
	}	
}
