package classes.subclasses;

import java.util.ArrayList;

import classes.abstrata.Produto;
import classes.exceptions.PagamentoNaoConfirmadoException;

public class Pedido {
	private int data;
	private int id;
	private Setor setor;
	private Cliente cliente;
	private ArrayList<Produto> listaProdutos;
	private boolean pago;
	
	public Pedido(int data, int id, Setor setor, Cliente cliente, ArrayList<Produto> listaProdutos) {
		this.data = data;
		this.id = id;
		this.setor = setor;
		this.cliente = cliente;
		this.listaProdutos = listaProdutos;
	}
	
	public String confirmarPagamento(boolean pagamento) throws PagamentoNaoConfirmadoException {
		if(this.cliente.realizarPagamentoPedido(pagamento) == false) {
			throw new PagamentoNaoConfirmadoException("O pagamento não foi confirmado");
		} else	
			return "O pagamento foi efetuado pelo cliente";
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

	@Override
	public String toString() {
		return "Pedido:"
				+ "\nData:" + data + 
				"\nId: " + id + 
				"Setor: " + setor + 
				"\nCliente:" + cliente + 
				"Pago: " + pago;
	}
	
	
}
