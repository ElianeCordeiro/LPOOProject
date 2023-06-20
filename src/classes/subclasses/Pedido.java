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
	
	public void confirmarPagamento(boolean pagamento) throws PagamentoNaoConfirmadoException {
		this.pago = pagamento;
		if (pagamento == false) {
			throw new PagamentoNaoConfirmadoException();
		}
	}
}
