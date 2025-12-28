package aula10.exemploException;

public class ErroNaDivisaoPorZeroException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ErroNaDivisaoPorZeroException(String message, Throwable cause) {
		super(message, cause);
	}

	public ErroNaDivisaoPorZeroException(String message) {
		super(message);
	}

	

} 