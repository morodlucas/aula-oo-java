import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int i, j, n;
		int maior = 0, repeticao;

		System.out.print("i: ");
		i = kb.nextInt();
		System.out.print("j: ");
		j = kb.nextInt();

		for (; i <= j; i++) {
			n = i;
			repeticao = 0;

			while (true) {
				repeticao++;
				if (n == 1) {
					break;
				}
				if (n % 2 != 0) {
					n = 3 * n + 1;
				} else {
					n = n / 2;
				}
			}
			
			if(repeticao > maior) {
				maior = repeticao;
			}
			
		}

		System.out.println("Vmax = "+ maior);
		
		kb.close();

	}

}