package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 
 */

public class Conta implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private float Saldo;
	private String Senha;
	private int Numero;
	private int Agencia;
	private String Tipo;
	private Pessoa pessoa;
	private ArrayList<Movimentacoes> movimentacoes = new ArrayList<Movimentacoes>();
			
	/**
	* @param agencia
	* @param numero s
	* @param tipo
	* @param pessoa
	*
	*/
	public Conta( int agencia, int numero, String tipo, Pessoa pessoa){
		this.setAgencia(agencia);
		this.setSaldo(0);
		this.setPessoa(pessoa);
		this.setNumero(numero);
		this.setTipo(tipo);
	}
	
	/**
	 * @param valor
	 * @return boolean
	 *
	 */
	public boolean sacar(int valor){
		if (this.Emprestar(valor)) {
			this.setSaldo(this.getSaldo()-valor);
			return true;
		}else{
			return false;
		}
	}
	/**
	 * @param valor
	 * @return boolean
	 *
	 */
	public boolean depositar(int valor){
		if (valor > 0) {
			this.setSaldo(this.getSaldo()+valor);
			return true;
		}else{
			return false;
		}
	}
	/**
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
	 * @param valor
	 * @return boolean
	 *
	 */
	public boolean Emprestar(int valor){
		if (valor > 0 && this.getSaldo() >= valor) {
			return true;
		}else{
			return false;
		}
	}

	/**
	 * @return the pessoa
	 */
	public Pessoa getPessoa() {
		return pessoa;
	}

	/**
	 * @param pessoa the pessoa to set
	 */
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	/**
	 * @return the Tipo
	 */
	public String getTipo(){
		return Tipo;
	}
	/**
	 * @param tipo the Tipo to set
	 */
	public void setTipo(String tipo){
		Tipo = tipo;
	}
	/**
	 * @return the agencia
	 */
	public int getAgencia() {
		return Agencia;
	}

	/**
	 * @param agencia the agencia to set
	 */
	public void setAgencia(int agencia) {
		Agencia = agencia;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return Numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		Numero = numero;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return Senha;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		Senha = senha;
	}

	/**
	 * @return the saldo
	 */
	public float getSaldo() {
		return Saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(float saldo) {
		Saldo = saldo;
	}	

	/**
	 * @return the movimentacoes
	 */
	public ArrayList<Movimentacoes> getMovimentacoes() {
		return movimentacoes;
	}

	/**
	 * @param movimentacoes the movimentacoes to set
	 */
	public void setMovimentacoes(ArrayList<Movimentacoes> movimentacoes) {
		this.movimentacoes = movimentacoes;
	}
