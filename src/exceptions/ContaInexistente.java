package exceptions;

/**
 * Classe de excecao se conta nao existe 
 * @author Nathaly
 * @author: Wesley B. 
 */

public class ContaInexistente extends Exception{

	private static final long serialVersionUID = 1L;
	//TODO
	public ContaInexistente(String msg){
		super(msg);
	}
	//TODO
	public ContaInexistente(String msg, Throwable cause){
		super(msg, cause);
	}
	//TODO
	public ContaInexistente(Throwable cause){
		super(cause);
	}
}
