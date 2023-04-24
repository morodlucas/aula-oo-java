
public class EmpregadoComissionado extends Empregado{
	
	private double totalDeVendas;
	private double comissao;
	
	public String toString() {
		String aux = super.toString();
		aux += "Total de vendas R$" + totalDeVendas + "\n";
		aux += "Total de vendas R$" + comissao + "\n";
		return aux;
	}

}
