package classes.exceptions;

public class SalarioNaoValidoException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SalarioNaoValidoException(String message) {
        super(message);
    }
}
