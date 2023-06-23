package classes.subclasses;

import classes.abstrata.Produto;

public class ProdutoAlimento extends Produto{

	private String temperaturaIdeal;
	private String localArmazenamento;
	
	public ProdutoAlimento(String dataValidade, double precoProduto, String nomeProduto, Fornecedor fornecedor,
			String temperaturaIdeal, String localArmazenamento) {
		super(dataValidade, precoProduto, nomeProduto, fornecedor);
		this.temperaturaIdeal = temperaturaIdeal;
		this.localArmazenamento = localArmazenamento;
	}

	public String getTemperaturaIdeal() {
		return temperaturaIdeal;
	}

	public void setTemperaturaIdeal(String temperaturaIdeal) {
		this.temperaturaIdeal = temperaturaIdeal;
	}

	public String getLocalArmazenamento() {
		return localArmazenamento;
	}

	public void setLocalArmazenamento(String localArmazenamento) {
		this.localArmazenamento = localArmazenamento;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	
	
}
