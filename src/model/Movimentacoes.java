package model;

import java.io.Serializable;
/**
 * @author Allison
 * @author Valdenize
 * @author Helmuth
 *Classe que representa as movimentacoes do Banco
*/

public class Movimentacoes implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nomeOperacao;
	private float valorOperacao;
	private boolean aconteceu;
	
	/**
	 * @param nome
	 * @param valor
	 * @param aconteceu
	 */
	public Movimentacoes(String nome, float valor, boolean aconteceu){
		this.setNomeOperacao(nome);
		this.setValorOperacao(valor);
		this.setAconteceu(aconteceu);
	}

	/**
	 * Metodo que retorna o nome da operacao
	 * @return String
	 */
	public String getNomeOperacao() {
		return nomeOperacao;
	}

	/**
	 * Metodo que insere o nome da operacao
	 * @param nomeOperacao
	 */
	public void setNomeOperacao(String nomeOperacao) {
		this.nomeOperacao = nomeOperacao;
	}

	/**
	 * Metodo que retorna o valor da operacao
	 * @return float
	 */
	public float getValorOperacao() {
		return valorOperacao;
	}

	/**
	 * Metodo que insere o valor da operacao
	 * @param valorOperacao
	 */
	public void setValorOperacao(float valorOperacao) {
		this.valorOperacao = valorOperacao;
	}
	/**
	 * Metodo que retorna se aconteceu ou nao
	 * @return boolean
	 */
	public boolean isAconteceu() {
		return aconteceu;
	}

	/**
	 * Metodo que insere um valor booleano
	 * @param aconteceu
	 */
	public void setAconteceu(boolean aconteceu) {
		this.aconteceu = aconteceu;
	}
}
