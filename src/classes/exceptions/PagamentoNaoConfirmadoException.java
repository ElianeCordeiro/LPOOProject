package classes.exceptions;

public class PagamentoNaoConfirmadoException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PagamentoNaoConfirmadoException(String message) {
        super(message);
    }
}
