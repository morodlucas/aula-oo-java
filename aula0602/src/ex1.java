import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int n;
		
			System.out.print("Numero: ");
			n = kb.nextInt();
			
			System.out.print(n + " ");
			
			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				if(n % 2 != 0) {
					n = n * 3 +1;
				}else {
					n = n/2;
				}if(n == 1) {
					System.out.println("1");
					break;
				}
				System.out.print(n + " ");
			}
			
			kb.close();
			
			
	}

}