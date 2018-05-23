 package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Allison
 * @author Valdenize
 * @author Helmuth
 * Classe Conta
 */

public class Conta implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private double Saldo;
	private String Senha;
	private int Numero;
	private int Agencia;
	private Pessoa pessoa;
    private ArrayList<Movimentacoes> movimentacoes = new ArrayList<Movimentacoes>();
			
	/**
	* @param agencia
	* @param numero
	* @param saldo
	* @param senha
	* @param pessoa
	*
	*/
	public Conta( int agencia, int numero, double saldo, String senha, Pessoa pessoa){
		this.setAgencia(agencia);
		this.setSaldo(saldo);
		this.setPessoa(pessoa);
		this.setNumero(numero);
		this.setSenha(senha);
	}
	
	/**
	 * Metodo que retorna a pessoa
	 * @return Pessoa
	 */
	public Pessoa getPessoa() {
		return pessoa;
	}

	/**
	 * Metodo que insere a pessoa
	 * @param pessoa 
	 */
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	/**
	 * Metodo que retorna a agencia
	 * @return int
	 */
	public int getAgencia() {
		return Agencia;
	}

	/**
	 * Metodo que insere o numero da agencia
	 * @param agencia
	 */
	public void setAgencia(int agencia) {
		this.Agencia = agencia;
	}

	/**
	 * Metodo que retorna o numero da Conta
	 * @return int
	 */
	public int getNumero() {
		return Numero;
	}

	/**
	 * Metodo que insere o numero da conta
	 * @param numero
	 */
	public void setNumero(int numero) {
		this.Numero = numero;
	}

	/**
	 * Metodo que retorna a senha
	 * @return String
	 */
	public String getSenha() {
		return Senha;
	}

	/**
	 * Metodo que insere a senha
	 * @param senha
	 */
	public void setSenha(String senha) {
		this.Senha = senha;
	}

	/**
	 * Metodo que retorna o saldo
	 * @return double
	 */
	public double getSaldo() {
		return Saldo;
	}

	/**
	 * Metodo que insere o valor do saldo
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.Saldo = saldo;
	}	

	/**
	 * Metodo que lista as movimentacoes
	 * @return Movimentacoes
	 */
	public ArrayList<Movimentacoes> getMovimentacoes() {
		return movimentacoes;
	}

	/**
	 * Metodo que insere as movimentacoes
	 * @param movimentacoes
	 */
	public void setMovimentacoes(ArrayList<Movimentacoes> movimentacoes) {
		this.movimentacoes = movimentacoes;
	}
	
	  /**
	   * Metodo tostring de conta, ver as informacoes da conta.
	   * @return String
	   */
	   @Override
	   public String toString(){
	     return "\nNome:"+this.getPessoa().getNome() + 
	    		"\nNumero: "+ this.Numero +
	    		"\nAgencia: " + this.Agencia;
	         
	    }
	    
	
	
}
