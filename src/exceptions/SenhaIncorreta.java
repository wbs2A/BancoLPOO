package exceptions;

/**
 * Classe que representa a excecao de senha incorreta
 * @author: Nathaly.
 * @author: Wesley B.
 */

public class SenhaIncorreta extends Exception{

	/**
	 * Classe de excecao se a senha estiver incorreta
	 * @author Nathaly
	 * @author: Wesley B.
	 */

	private static final long serialVersionUID = 1L;
	//TODO
	public SenhaIncorreta(String msg){
		super(msg);
	}
	//TODO
	public SenhaIncorreta(String msg, Throwable cause){
		super(msg, cause);
	}
	//TODO
	public SenhaIncorreta(Throwable cause){
		super(cause);
	}
}
