package ex1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		
		List<Produto> lista = new ArrayList();
		
		//inserindo objs na lista
		
		lista.add(new Produto(1, "tets", 420));
		lista.add(new Produto(2, "carros", 69));
		lista.add(new Produto(3, "feijão", 88));

		//impressão dos dados usando for tradicional
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			
		}
		
		//impressão dos dados usando foreach
		System.out.println();
		for (Produto p : lista) {
			System.out.println(p);
		}
		
	}

}
