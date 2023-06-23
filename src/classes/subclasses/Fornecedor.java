package classes.subclasses;


import classes.abstrata.Pessoa;
import classes.abstrata.Produto;

public class Fornecedor extends Pessoa{

	private Produto tipoProduto;
	
	public Fornecedor(String nome, String enderecoCidade, String telefone, String cpf_CNPJ, Produto tipoProduto) {
		super(nome, enderecoCidade, telefone, cpf_CNPJ);
		this.tipoProduto = tipoProduto;
	}

	public Produto getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(Produto tipoProduto) {
		this.tipoProduto = tipoProduto;
	}


	@Override
	public String toString() {
		return "Fornecedor: " + this.getNome() +
				"\nTipo Produto: " + this.tipoProduto;
	}
	
	
	
}
