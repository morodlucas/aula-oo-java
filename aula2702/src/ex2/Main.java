package ex2;
//ex3
public class Main {

	public static void main(String[] args) {

		Funcionario f = new Funcionario();
		
		f.name = "fdasgf";
		f.id = 4325;
		f.salario = 1000.00;
		
		System.out.println(f.getDados());
		
		f.salAumentar(50);
		
		System.out.println(f.getDados());
		
	}

}
