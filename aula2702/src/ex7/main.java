package ex7;

public class main {

	public static void main(String[] args) {

		Produto p1 = new Produto("fgfgsd", 10);
	
		System.out.println(p1.nome + " " + p1.quantidade);
		System.out.println(Produto.total);
		
		
		Produto p2 = new Produto("FGDSDG", 10);
		
		System.out.println(p2.nome + " " + p2.quantidade);
		System.out.println(Produto.total);
		
	}

}
