package classes.subclasses;

import classes.abstrata.Pessoa;
import classes.exceptions.SalarioNaoValidoException;

public class Funcionario extends Pessoa{
	
	private String cargo;
	private double salario;
	private Setor setor;
	
	public Funcionario(String nome, String enderecoCidade, String telefone, String cpf_CNPJ, String cargo,
			double salario, Setor setor) {
		super(nome, enderecoCidade, telefone, cpf_CNPJ);
		this.cargo = cargo;
		this.salario = salario;
		this.setor = setor;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) throws SalarioNaoValidoException {
		if(salario <=0) {
			throw new SalarioNaoValidoException("Valor inserido não é válido");
		}
		this.salario = salario;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	@Override
	public String toString() {
		return "Funcionario:"
				+ "\nCargo: " + cargo + "\nSalário: " + salario + "\nSetor: " + setor;
	}
	
	
	
}
