package bank.model;

import java.io.Serializable;

/**
*Saldo
*senha
*numero
*Agencia
*Pessoa
*Metodos:
*Sacar,Depositar,Emprestar,transferir,varSaldo
*
*
*
*FAZER TODA A IMPLEMENTAÇÃO DOS SETS E GET DO ATRIBUTOS E OS METODOS DETERMINADOS
*PROXIMA AULA
*/


//import Cconta.Pessoa;
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

	public Conta( int agencia, int numero, String tipo, Pessoa pessoa){
		this.setAgencia(agencia);
		this.setSaldo(0);
		this.setPessoa(pessoa);
		this.setNumero(numero);
		this.setTipo(tipo);
	}
	//Sacar,Depositar,Emprestar,transferir,varSaldo
	
	public boolean sacar(int valor){
		if (this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo()-valor);
			return true;
		}else{
			return false;
		}
	}
	
	public boolean depositar(int valor){
		if (valor >= 0) {
			this.setSaldo(this.getSaldo()+valor);
			return true;
		}else{
			return false;
		}
	}
	
	public boolean transferir(int valor, Conta DepositarNela){
		if (this.Emprestar(valor)) {

			if(DepositarNela.depositar(valor)){
				this.sacar(valor);
				return true;
			}else{
				//this.depositar(valor); Nao preciso fazer isso, apenas retorna false;
				return false;
			}				
		}else{
			return false;
		}
	}

	public boolean Emprestar(int valor){
		if (this.getSaldo() >= valor) {
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
	public String getTipo(){
		return Tipo;
	}
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

	/****public void ValSaldo(){}
	public Conta maiorSaldo(Conta teste){
		if (this.getSaldo() > teste.getSaldo()) {
			return this;
		}else{
			return teste;
		}
	}
	**/
}