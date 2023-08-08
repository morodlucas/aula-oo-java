package ex.main;

import ex.conta.ContaBancaria;
import ex.excecao.ContaExcecao;

public class Main {

	public static void main(String[] args) {

		ContaBancaria cb = new ContaBancaria(700, 1000);
		try {
			//cb.sacar(501);
			cb.depositar(1001);
		} catch(ContaExcecao e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("finally");
		}

	}

}
