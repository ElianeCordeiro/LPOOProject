package classes.abstrata;

public abstract class Pessoa {

	private String nome;
	private String enderecoCidade;
	private String telefone;
	private String cpf_CNPJ;
	
	
	
	public Pessoa(String nome, String enderecoCidade, String telefone, String cpf_CNPJ) {
		super();
		this.nome = nome;
		this.enderecoCidade = enderecoCidade;
		this.telefone = telefone;
		this.cpf_CNPJ = cpf_CNPJ;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEnderecoCidade() {
		return enderecoCidade;
	}
	public void setEnderecoCidade(String enderecoCidade) {
		this.enderecoCidade = enderecoCidade;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf_CNPJ() {
		return cpf_CNPJ;
	}
	public void setCpf_CNPJ(String cpf_CNPJ) {
		this.cpf_CNPJ = cpf_CNPJ;
	}
	
	
	
	

}
