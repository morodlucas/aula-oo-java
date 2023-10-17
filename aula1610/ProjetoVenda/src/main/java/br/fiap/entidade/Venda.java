package br.fiap.entidade;

public class Venda {

	private Integer id;
	private Funcionario funcionario;
	private Double valor;
	
	public Double calcularComissao() {
		Double comissao = 0.0;
		Cargo cargo = funcionario.getCargo();
		
		comissao = cargo.calcularComissao(valor);
		return comissao;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
}
