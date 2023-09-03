package entidades;

public class Cliente {

	private int idCliente;
	private String email;
	private String telefone;
	private String nome;
	private String cpf;
	private String dtNascimento;
	private String sexo;
	private int uf;
	
	public int getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
	public int getUf() {
		return uf;
	}
	
	public void setUf(int estado) {
		this.uf = estado;
	}
	
	public String getDtNascimento() {
		return dtNascimento;
	}

	public void setIdade(String idade) {
		this.dtNascimento = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
