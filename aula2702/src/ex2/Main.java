package ex2;
//ex3
public class Main {

	public static void main(String[] args) {

		Funcionario f = new Funcionario(120, "FDSFfdd", 1000);
		
		System.out.println(f.getDados());
		
		f.salAumentar(50);
		
		System.out.println(f.getDados());
		
	}
	

}
