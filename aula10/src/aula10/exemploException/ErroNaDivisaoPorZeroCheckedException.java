package aula10.exemploException;

public class ErroNaDivisaoPorZeroCheckedException extends Exception {


	private static final long serialVersionUID = 1L;

	public ErroNaDivisaoPorZeroCheckedException(String message, Throwable cause) {
		super(message, cause);
	}

	public ErroNaDivisaoPorZeroCheckedException(String message) {
		super(message);
	}

}
