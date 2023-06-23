package classes.abstrata;

import classes.subclasses.Fornecedor;

public abstract class Produto {

	private String dataValidade;
	private double precoProduto;
	private String nomeProduto;
	private Fornecedor fornecedor;
	
	public Produto(String dataValidade, double precoProduto, String nomeProduto, Fornecedor fornecedor) {
		super();
		this.dataValidade = dataValidade;
		this.precoProduto = precoProduto;
		this.nomeProduto = nomeProduto;
		this.fornecedor = fornecedor;
	}
	
	public String getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	public double getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	@Override
	public String toString() {
		return "Data Validade: " + dataValidade + "\nPreco Produto: " + precoProduto + "\nNome Produto:"
				+ nomeProduto;
	}
	
	

}
