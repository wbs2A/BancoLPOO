package exceptions;

public class SenhaIncorreta extends Exception{

	/**
	 * Classe de excecao se a senha estiver incorreta
	 * @author Nathaly
	 * @author: Wesley B.
	 */

	private static final long serialVersionUID = 1L;

	public SenhaIncorreta(String msg){
		super(msg);
	}
	
	public SenhaIncorreta(String msg, Throwable cause){
		super(msg, cause);
	}
	
	public SenhaIncorreta(Throwable cause){
		super(cause);
	}
}
