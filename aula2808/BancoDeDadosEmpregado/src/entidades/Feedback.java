package entidades;

public class Feedback {
	
	private int idFeddback;
	private double notaAvaliacao;
	private String dataFeedback;
	private int idCliente;
	private int idProduto;
	private int idCategoria;
	private int tipoFeedback;
	

	public int getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}


	public int getIdProduto() {
		return idProduto;
	}


	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}


	public int getIdCategoria() {
		return idCategoria;
	}


	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}


	public int getTipoFeedback() {
		return tipoFeedback;
	}

	
	public int getIdFeddback() {
		return idFeddback;
	}



	public void setIdFeddback(int idFeddback) {
		this.idFeddback = idFeddback;
	}



	public double getNotaAvaliacao() {
		return notaAvaliacao;
	}



	public void setNotaAvaliacao(double notaAvaliacao) {
		this.notaAvaliacao = notaAvaliacao;
	}



	public String getDataFeedback() {
		return dataFeedback;
	}



	public void setDataFeedback(String dataFeedback) {
		this.dataFeedback = dataFeedback;
	}



	public void setTipoFeedback(int tipoFeedback) {
		this.tipoFeedback = tipoFeedback;
	}
	

}
