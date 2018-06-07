package exceptions;

	/**
	 * Classe de excecao se conta saldo eh negativo para qualquer operacao
	 * @author Nathaly
	 * @author: Wesley B.
	 */

public class SaldoNegativo extends Exception{

	private static final long serialVersionUID = 1L;
	
	//TODO
	public SaldoNegativo(String msg){
		super(msg);
	}
	//TODO
	public SaldoNegativo(String msg, Throwable cause){
		super(msg, cause);
	}
	//TODO
	public SaldoNegativo(Throwable cause){
		super(cause);
	}
}
