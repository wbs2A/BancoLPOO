package exceptions;

public class SenhaIncorreta extends Exception{

	/**
	 * 
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
