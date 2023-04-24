
public class EmpregadoHorista extends Empregado {

	private int totalDeHorasTrabalhadas;
	private double valorDaHoraTrabalhada;
	
	public String toString() {
		String aux = super.toString();
		aux += "Total de vendas R$" + totalDeHorasTrabalhadas + "\n";
		aux += "Total de vendas R$" + valorDaHoraTrabalhada + "\n";
		return aux;
	}
	
}
