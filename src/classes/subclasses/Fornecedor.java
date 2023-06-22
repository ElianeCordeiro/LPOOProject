package classes.subclasses;

import java.util.ArrayList;

import classes.abstrata.Pessoa;
import classes.abstrata.Produto;

public class Fornecedor extends Pessoa{

	private Produto tipoProduto;
	private ArrayList<Setor> setores;
	
	public Fornecedor(String nome, String enderecoCidade, String telefone, String cpf_CNPJ, Produto tipoProduto,
			ArrayList<Setor> setores) {
		super(nome, enderecoCidade, telefone, cpf_CNPJ);
		this.tipoProduto = tipoProduto;
		this.setores = setores;
	}

	public Produto getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(Produto tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public ArrayList<Setor> getSetores() {
		return setores;
	}

	public void setSetores(ArrayList<Setor> setores) {
		this.setores = setores;
	}

	@Override
	public String toString() {
		return "Fornecedor: " + this.getNome() +
				"\nTipo Produto: " + tipoProduto + 
				"\nSetores: " + setores;
	}
	
	
	
}
