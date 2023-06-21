package classes.subclasses;

import classes.abstrata.Pessoa;
import classes.exceptions.PagamentoNaoConfirmadoException;

public class Cliente extends Pessoa{

	public Cliente(String nome, String enderecoCidade, String telefone, String cpf_CNPJ) {
		super(nome, enderecoCidade, telefone, cpf_CNPJ);
	}
	
	public boolean realizarPagamentoPedido(boolean pagar) throws PagamentoNaoConfirmadoException{
		if(pagar == false) {
			throw new PagamentoNaoConfirmadoException("Pagamento não efetuado");
		}
		return true;
	}
	
}
