package ex2;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Main2 {
	public static void main(String[] args) {
		int x, y;
		double resultado;
		
		try {
			x = parseInt(showInputDialog("Primeiro valor"));
			y = parseInt(showInputDialog("Segundo valor"));
			resultado = (double) x / y;
			showMessageDialog(null, resultado);
		}
		catch (NumberFormatException e) {
			showMessageDialog(null, "Você deve digitar um número");
		}
	}

}
