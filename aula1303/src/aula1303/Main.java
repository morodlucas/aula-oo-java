package aula1303;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		int[] x = new int[10];
		
		lerDados(x);
		imprimir(x);
		
	}

	private static void imprimir(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}

	private static void lerDados(int[] x) {
		Random r = new Random();
		for (int i = 0; i < x.length; i++) {
			x[i] = r.nextInt()%20;
		}
	}

}
