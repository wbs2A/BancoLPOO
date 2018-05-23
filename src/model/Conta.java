 package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Allison
 * @author Valdenize
 * @author Helmuth
 * Classe Conta que conterá os métodos Getters e Settters, construtor e os atributos da Conta
 */

public class Conta implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private float Saldo;
	private String Senha;
	private int Numero;
	private int Agencia;
	private Conta contaPadrao;
	private Pessoa pessoa;
    private ArrayList<Movimentacoes> movimentacoes = new ArrayList<Movimentacoes>();
			
	/**
	* @paramss agencia
	* @param numero
	* @param tipo
	* @param pessoa
	*
	*/
	public Conta( int agencia, int numero, float saldo, String senha, Pessoa pessoa){
		this.setAgencia(agencia);
		this.setSaldo(saldo);
		this.setPessoa(pessoa);
		this.setNumero(numero);
<<<<<<< HEAD
=======
		this.setSenha(senha);
>>>>>>> 2aa3fb0505b9e4512119c507ec34df8498ba34d7
	}
	
	/**
	 * Método que realiza o saque da conta
	 * @param valor
	 * @return boolean
	 *
	 */
	public boolean sacar(int valor){
		if (this.Emprestar(valor)) {
			this.setSaldo(this.getSaldo()-valor);
			return true;
			}
		
			return false;
		
	}
	/**
	 * Método que realiza o depósito na Conta.
	 * * @param valor
	 * @return boolean
	 *
	 */


	public boolean depositar(int valor){
		if (valor > 0) {
			this.setSaldo(this.getSaldo()+valor);
			return true;
			
		}
			return false;
	}

	/**
	 * Método que realiza a transferência de um valor da conta para outra conta.
	 * @param valor
	 * @return boolean
	 *
	 */
	public boolean transferir(int valor, Conta DepositarNela){
		if (this.Emprestar(valor)) {

			if(DepositarNela.depositar(valor)){
				this.sacar(valor);
				return true;
			}else{
				return false;
			}				
		}else{
			return false;
		}
	}
	/**
	 * Método que realiza a verificação de que o saldo é maior que o valor inserido.
	 * @param valor
	 * @return boolean
	 *
	 */
	public boolean Emprestar(int valor){
		if (valor > 0 && this.getSaldo() >= valor) {
			return true;
			}
		
			return false;
		
	}

	/**
	 * Método que retorna a pessoa
	 * @return Pessoa
	 */
	public Pessoa getPessoa() {
		return pessoa;
	}

	/**
	 * Método que insere a pessoa
	 * @param pessoa 
	 */
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	/**
	 * Método que retorna a agência
	 * @return int
	 */
	public int getAgencia() {
		return Agencia;
	}

	/**
	 * Método que insere o numero da agência
	 * @param agencia
	 */
	public void setAgencia(int agencia) {
		this.Agencia = agencia;
	}

	/**
	 * Método que retorna o número da Conta
	 * @return int
	 */
	public int getNumero() {
		return Numero;
	}

	/**
	 * Método que insere o número da conta
	 * @param numero
	 */
	public void setNumero(int numero) {
		this.Numero = numero;
	}

	/**
	 * Método que retorna a senha
	 * @return String
	 */
	public String getSenha() {
		return Senha;
	}

	/**
	 * Método que insere a senha
	 * @param senha
	 */
	public void setSenha(String senha) {
		this.Senha = senha;
	}

	/**
	 * Método que retorna o saldo
	 * @return float
	 */
	public float getSaldo() {
		return Saldo;
	}

	/**
	 * Método que insere o valor do saldo
	 * @param saldo
	 */
	public void setSaldo(float saldo) {
		this.Saldo = saldo;
	}	

	/**
	 * Método que lista as movimentações
	 * @return Movimentacoes
	 */
	public ArrayList<Movimentacoes> getMovimentacoes() {
		return movimentacoes;
	}

	/**
	 * Método que insere as movimentações
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
