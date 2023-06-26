package classes.subclasses;

import java.util.ArrayList;

import classes.abstrata.Produto;
import classes.exceptions.PagamentoNaoConfirmadoException;

public class Pedido {
	private String data;
	private Setor setor;
	private Cliente cliente;
	private ArrayList<Produto> listaProdutos;
	
	public Pedido(String data, Setor setor, Cliente cliente, ArrayList<Produto> listaProdutos) {
		this.data = data;
		this.setor = setor;
		this.cliente = cliente;
		this.listaProdutos = listaProdutos;
	}
	
	public String confirmarPagamento(boolean pagamento) throws PagamentoNaoConfirmadoException {
		if(this.cliente.realizarPagamentoPedido(pagamento)) {
			throw new PagamentoNaoConfirmadoException("O pagamento não foi confirmado");
		} else	
			return "O pagamento foi efetuado pelo cliente";
	}

	public 	String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(ArrayList<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}


	@Override
	public String toString() {
		return "Pedido:"
				+ "\nData:" + data + 
				"\nSetor: " + setor.getNomeSetor() + 
				"\nCliente:" + cliente.toString();
	}
	
	
}
