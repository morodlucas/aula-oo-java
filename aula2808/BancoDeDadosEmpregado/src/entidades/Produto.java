package entidades;

public class Produto {

	private int idProduto;
	private double valUnitario;
	private double qtdEstoque;
	private double unidadeMedida;
	private String dataInclusao;
	private String nomeProduto;
	private int idEmpresa;
	private int idTipoProduto;

	@Override
	public String toString() {
		return "Nome: " + nomeProduto + " // ID = " + idProduto + " // valor unitário: " + valUnitario
				+ " // Qtd estoque: " + qtdEstoque + " // Unidade Medida: " + unidadeMedida + "\n"
				+ "Data de Inclusão: " + dataInclusao + " // ID Empresa: " + idEmpresa + " // ID do tipo do produto: "
				+ idTipoProduto;
	}

	public Produto() {
		super();
		this.idProduto = 0;
		this.valUnitario = 0;
		this.qtdEstoque = 0;
		this.unidadeMedida = 0;
		this.dataInclusao = null;
		this.nomeProduto = null;
		this.idEmpresa = 0;
		this.idTipoProduto = 0;
	}

	public Produto(int idProduto, double valUnitario, double qtdEstoque, double unidadeMedida, String dataInclusao,
			String nomeProduto, int idEmpresa, int idTipoProduto) {
		super();
		this.idProduto = idProduto;
		this.valUnitario = valUnitario;
		this.qtdEstoque = qtdEstoque;
		this.unidadeMedida = unidadeMedida;
		this.dataInclusao = dataInclusao;
		this.nomeProduto = nomeProduto;
		this.idEmpresa = idEmpresa;
		this.idTipoProduto = idTipoProduto;
	}

	public int getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public int getIdTipoProduto() {
		return idTipoProduto;
	}

	public void setIdTipoProduto(int idTipoProduto) {
		this.idTipoProduto = idTipoProduto;
	}

	public void setUnidadeMedida(double unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public double getValUnitario() {
		return valUnitario;
	}

	public void setValUnitario(double valUnitario) {
		this.valUnitario = valUnitario;
	}

	public double getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(double qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public double getUnidadeMedida() {
		return unidadeMedida;
	}

	public String getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(String dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

}
