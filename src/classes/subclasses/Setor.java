package classes.subclasses;

import java.util.ArrayList;

import classes.exceptions.SalarioNaoValidoException;
import interfaces.Pagamento;

public class Setor implements Pagamento{
	
	private int codigoSetor;
	private String nomeSetor;
	private ArrayList<Funcionario> funcionarios;
	private ArrayList<Fornecedor> fornecedores;
	private int quantidadeFuncionario;
	
	
	public Setor(int codigoSetor, String nomeSetor, ArrayList<Funcionario> funcionarios, int quantidadeFuncionario, ArrayList<Fornecedor> fornecedores) {
		super();
		this.codigoSetor = codigoSetor;
		this.nomeSetor = nomeSetor;
		this.funcionarios = funcionarios;
		this.quantidadeFuncionario = funcionarios.size();
		this.fornecedores = fornecedores;
	}
	
	public String contratarFornecedor(Fornecedor fornecedor) {
		this.fornecedores.add(fornecedor);
		return "Fornecedor contratado com sucesso.";
	}
	
	public String contratarFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
		return "Funcionario contratado com sucesso. ";
	}
	
	public String demitirFuncionario(String cpfFuncionario) {
		for (Funcionario funcionario : this.funcionarios) {
			if(funcionario.getCpf_CNPJ().equals(cpfFuncionario)) {
				funcionarios.remove(funcionario);
			}
		}
		return "O funcionario foi demitido com sucesso."; 
	}
	
	@Override
	public boolean realizarPagamento(double salario) throws SalarioNaoValidoException {
		if(salario <=0 ) {
			throw new SalarioNaoValidoException("O valor informado não é válido");
		} else 
		return true;
	}


	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public String getNomeSetor() {
		return nomeSetor;
	}

	public void setNomeSetor(String nomeSetor) {
		this.nomeSetor = nomeSetor;
	}

	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public ArrayList<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(ArrayList<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}

	public int getQuantidadeFuncionario() {
		return quantidadeFuncionario;
	}

	public void setQuantidadeFuncionario(int quantidadeFuncionario) {
		this.quantidadeFuncionario = funcionarios.size();
	}

	@Override
	public String toString() {
		return "\nDados do Setor:"
				+ "\nCodigo Setor: " + codigoSetor + 
				"\nNome Setor: " + nomeSetor + 
				"\nQuantidade Funcionario:" + funcionarios.size() ;
	}
	
	
	
}
