package model;

import java.io.Serializable;
import java.util.Date;
import java.text.SimpleDateFormat;

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
	
	private Date date;
	private Conta conta;
	private Conta destino;
	private String nomeOperacao;
	private String descricao;
	private double valorOperacao;
	private int numero_operacao;
	private double saldo_anteior;
	private double saldo_atual;
	private boolean isDestinatario;

	private SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy HH:mm:ss");


	/**
	 * @param date
	 * @param conta
	 * @param descricao
	 * @param valor
	 * @param numero_operacao
	 */
	public Movimentacoes(Date date,Conta conta, String descricao, double valor, int numero_operacao){
		this.setDate(date);
		this.setConta(conta);
		this.setNomeOperacao(numero_operacao);
		this.setDescricao(descricao);
		this.setValorOperacao(valor);
		this.setNumero_operacao(numero_operacao);
		this.setSaldo_atual(conta.getSaldo());
		this.setSaldo_anteior(numero_operacao);

	}

	/**
	 * @param date
	 * @param destino
	 * @param conta
	 * @param descricao
	 * @param valor
	 * @param numero_operacao
	 */
	public Movimentacoes(Date date,Conta destino,Conta conta, String descricao, double valor, int numero_operacao){
		this.setDate(date);
		this.setConta(conta);
		this.setDestino(destino);
		this.setNomeOperacao(numero_operacao);
		this.setDescricao(descricao);
		this.setValorOperacao(valor);
		this.setNumero_operacao(numero_operacao);
		this.setSaldo_atual(conta.getSaldo());
		this.setSaldo_anteior(numero_operacao);
		Movimentacoes destinatario = new Movimentacoes(destino,this);
		destino.getMovimentacoes().add(destinatario);
	}

	/**
	 * @param conta
	 * @param movimentacao
	 */
	private Movimentacoes(Conta conta, Movimentacoes movimentacao){
		this.setDate(movimentacao.getDateNaoFormatada());
		this.setConta(conta);
		this.setNomeOperacao(movimentacao.getNumero_operacao());
		this.setDescricao(movimentacao.getDescricao());
		this.setValorOperacao(movimentacao.getValorOperacao());
		this.setNumero_operacao(movimentacao.getNumero_operacao());
		this.setSaldo_atual(conta.getSaldo());
		this.setSaldo_anteior(movimentacao.getNumero_operacao());
		this.setDestino(movimentacao.getConta());
		this.setDestinatario(true);
	}


	/**
	 * Metodo que retorna o nome da operacao
	 * @return String
	 */
	public String getNomeOperacao() {
		return nomeOperacao;
	}

	/**
	 * Metodo que insere o nome da operacao a partir do numero
	 * @param numero_operacao
	 */
	public void setNomeOperacao(int numero_operacao) {
		if(numero_operacao == 1){
			this.nomeOperacao="Saque";
		}else if(numero_operacao == 2){
			this.nomeOperacao="Deposito";
		}else if(numero_operacao == 3){
			this.nomeOperacao ="Transferencia";
		}
	}

	/**
	 * Metodo que retorna o valor da operacao
	 * @return double
	 */
	public double getValorOperacao() {
		return valorOperacao;
	}

	/**
	 * Metodo que insere o valor da operacao
	 * @param valorOperacao
	 */
	public void setValorOperacao(double valorOperacao) {
		this.valorOperacao = valorOperacao;
	}

	/**
	 * Metodo que retorna a data da operacao
	 * @return  date
	 */
	public String getDate() {
		return this.sdf.format(date);
	}
	/**
	 * Metodo que retorna a data da operacao
	 * @return  date
	 */
	public Date getDateNaoFormatada() {
		return date;
	}
	/**
	 * Metodo que insere a data da operacao
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * Metodo que retorna a conta em que ocorreu a operacao
	 * @return conta
	 */
	public Conta getConta() {
		return conta;
	}

	/**
	 * Metodo que insere a conta que ocorreu a operacao
	 * @param conta the conta to set
	 */
	public void setConta(Conta conta) {
		this.conta = conta;
	}

	/**
	 * Metodo que retorna a conta que foi destinatario da operacao transferencia
	 * @return the destino
	 */
	public Conta getDestino() {
		return destino;
	}

	/**
	 * Metodo que insere a conta destino de uma operacao transferencia
	 * @param destino the destino to set
	 */
	public void setDestino(Conta destino) {
		this.destino = destino;
	}

	/**
	 * Metodo que retorna o numero que representa a operacao
	 * @return the numero_operacao
	 */
	public int getNumero_operacao() {
		return numero_operacao;
	}

	/**
	 * Metodo que insere o numero que representa a operacao
	 * @param numero_operacao the numero_operacao to set
	 */
	public void setNumero_operacao(int numero_operacao) {
		this.numero_operacao = numero_operacao;
	}

	/**
	 * Metodo que retorna o saldo anterior a operacao
	 * @return the saldo_anteior
	 */
	public double getSaldo_anteior() {
		return saldo_anteior;
	}

	/**
	 * Metodo que insere o saldo anterior a uma operacao
	 * @param saldo_anteior the saldo_anteior to set
	 */
	public void setSaldo_anteior(int numero_operacao) {
		if(numero_operacao == 1){
			this.saldo_anteior = this.getSaldo_atual()+this.getValorOperacao();
		}else if(numero_operacao == 2){
			this.saldo_anteior = this.getSaldo_atual()-this.getValorOperacao();
		}else if(numero_operacao == 3){
			if(this.destino == null){
				this.saldo_anteior = this.getSaldo_atual()-this.getValorOperacao();
			}else{
				this.saldo_anteior = this.getSaldo_atual()+this.getValorOperacao();
			}
		}
	}


	/**
	 * Metodo que retorna a descricao da operacao realizada
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Metodo que insere a descricao da operacao
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * Metodo toString, retorna algumas das informacoes contidas 
	 * nos atributos da classe e outras das classes Pessoa e Conta 
	 * para simplificar as informações de Movimentacao ao usuário.
	 * @return String
	 */
	@Override
	public String toString() {
		if(this.getNumero_operacao() == 1 || this.getNumero_operacao() == 2){
			return "\n\t\t\t\tData: "+ this.getDate()+
					"\n\t\t\t\tNome: "+this.getConta().getPessoa().getNome()+
					"\n\t\t\t\tAgencia: "+ this.getConta().getAgencia()+
					"\n\t\t\t\tNumero: "+ this.getConta().getNumero()+
					"\n\t\t\t\tSaldo anterior: "+this.getSaldo_anteior()+
					"\n\t\t\t\tValor da operacao: "+this.getValorOperacao() +
					"\n\t\t\t\tOperacao: "+this.getNomeOperacao()+
					"\n\t\t\t\tSaldo atual: "+this.getSaldo_atual();

		}else if(this.getNumero_operacao() == 3){
			if(this.isDestinatario()){
				return "\n\t\t\t\tData: "+ this.getDate()+					
						"\n\t\t\t\tRemetente: "+
						"\n\t\t\t\t\t\tNome: "+this.getDestino().getPessoa().getNome()+
						"\n\t\t\t\t\t\tCPF: "+this.getDestino().getPessoa().getCpf()+
						"\n\t\t\t\t\t\tValor da operacao: "+this.getValorOperacao() +
						"\n\t\t\t\t\t\tOperacao: "+this.getNomeOperacao()+
						"\n\t\t\t\tDestinatario: "+
						"\n\t\t\t\t\t\tNome: "+this.getConta().getPessoa().getNome()+
						"\n\t\t\t\t\t\tAgencia: "+ this.getConta().getAgencia()+
						"\n\t\t\t\t\t\tNumero: "+ this.getConta().getNumero()+
						/*"\n\t\t\t\t\t\tSaldo anterior: "+this.getSaldo_anteior()+ */
						"\n\t\t\t\t\t\tSaldo atual: "+this.getSaldo_atual();
			}else{
				return "\n\t\t\t\tData: "+ this.getDate()+
						"\n\t\t\t\tRemetente: "+
						"\n\t\t\t\t\t\tNome: "+this.getConta().getPessoa().getNome()+
						"\n\t\t\t\t\t\tAgencia: "+ this.getConta().getAgencia()+
						"\n\t\t\t\t\t\tNumero: "+ this.getConta().getNumero()+
						"\n\t\t\t\t\t\tValor transferido: "+this.getValorOperacao() +
						"\n\t\t\t\t\t\tOperacao: "+this.getNomeOperacao()+
						"\n\t\t\t\t\t\tSaldo atual: "+this.getSaldo_atual()+
						"\n\t\t\t\tDestinatario: "+
						"\n\t\t\t\t\t\tNome: "+this.getDestino().getPessoa().getNome()+
						"\n\t\t\t\t\t\tCPF: "+this.getDestino().getPessoa().getCpf()+
						"\n\t\t\t\t\t\tAgencia: "+ this.getDestino().getAgencia()+
						"\n\t\t\t\t\t\tNumero: "+ this.getDestino().getNumero();
			}
		}
		return " ";
	}

	/**
	 * Metodo que retorna o saldo apos a realizacao da operacao
	 * @return the saldo_atual
	 */
	public double getSaldo_atual() {
		return saldo_atual;
	}

	/**
	 * Metodo que insere o saldo da conta apos uma operacao
	 * @param saldo_atual the saldo_atual to set
	 */
	public void setSaldo_atual(double saldo_atual) {
		this.saldo_atual = saldo_atual;
	}

	/**
	 * Metodo que retorna se esta movimentacao pertence a um destinatario de transferencia 
	 * @return the isDestinatario
	 */
	public boolean isDestinatario() {
		return isDestinatario;
	}

	/**
	 * Metodo que insere a marcacao para uma movimentacao de um destinatario
	 * @param isDestinatario the isDestinatario to set
	 */
	public void setDestinatario(boolean isDestinatario) {
		this.isDestinatario = isDestinatario;
	}

}

