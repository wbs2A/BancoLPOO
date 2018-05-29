package exceptions;

	/**
	 * Classe de exceção se conta saldo é negativo para qualquer operação
	 * @author Controller 
	 */

public class SaldoNegativo extends Exception{

	private static final long serialVersionUID = 1L;

	public SaldoNegativo(String msg){
		super(msg);
	}
	
	public SaldoNegativo(String msg, Throwable cause){
		super(msg, cause);
	}
	
	public SaldoNegativo(Throwable cause){
		super(cause);
	}
}
