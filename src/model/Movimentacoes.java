package model;

import java.io.Serializable;

/**
*Classe que representa as movimentacoes do Banco
*/

public class Movimentacoes implements Serializable {
	private String nomeOperacao;
	private float valorOperacao;
	private boolean aconteceu;
	
	/**
	 * @param nome
	 * @param valor
	 */
	public Movimentacoes(String nome, float valor){
	public Movimentacoes(String nome, float valor, boolean aconteceu){
		this.setNomeOperacao(nome);
		this.setValorOperacao(valor);
		this.setAconteceu(aconteceu);
	}

	/**
	 * Método que retorna o nome da operação
	 * @return String
	 */
	public String getNomeOperacao() {
		return nomeOperacao;
	}

	/**
	 * Método que é inserido o nome da operação
	 * @param nomeOperacao
	 */
	public void setNomeOperacao(String nomeOperacao) {
		this.nomeOperacao = nomeOperacao;
	}

	/**
	 * Método que retorna o valor da operação
	 * @return float
	 */
	public float getValorOperacao() {
		return valorOperacao;
	}

	/**
	 * Método que insere o valor da operação
	 * @param valorOperacao
	 */
	public void setValorOperacao(float valorOperacao) {
		this.valorOperacao = valorOperacao;
	}
	/**
	 * Método que retorna se aconteceu ou não
	 * @return boolean
	 */
	public boolean isAconteceu() {
		return aconteceu;
	}

	/**
	 * Método que insere um valor booleano
	 * @param aconteceu
	 */
	public void setAconteceu(boolean aconteceu) {
		this.aconteceu = aconteceu;
	}
}
