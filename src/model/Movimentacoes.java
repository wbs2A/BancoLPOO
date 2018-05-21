package model;

import java.io.Serializable;

/*
*
*/

public class Movimentacoes implements Serializable {
	private String nomeOperacao;
	private float valorOperacao;
	private boolean aconteceu;
	

	public Movimentacoes(String nome, float valor){
		this.setNomeOperacao(nome);
		this.setValorOperacao(valor);
	}

	/**
	 * @return the nomeOperacao
	 */
	public String getNomeOperacao() {
		return nomeOperacao;
	}

	/**
	 * @param nomeOperacao the nomeOperacao to set
	 */
	public void setNomeOperacao(String nomeOperacao) {
		this.nomeOperacao = nomeOperacao;
	}

	/**
	 * @return the valorOperacao
	 */
	public float getValorOperacao() {
		return valorOperacao;
	}

	/**
	 * @param valorOperacao the valorOperacao to set
	 */
	public void setValorOperacao(float valorOperacao) {
		this.valorOperacao = valorOperacao;
	}
	/**
	 * @return the aconteceu
	 */
	public boolean isAconteceu() {
		return aconteceu;
	}

	/**
	 * @param aconteceu the aconteceu to set
	 */
	public void setAconteceu(boolean aconteceu) {
		this.aconteceu = aconteceu;
	}
}
