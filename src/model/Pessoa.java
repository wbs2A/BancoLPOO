package bank.model;

import java.io.Serializable;

/**
 * Esta classe é uma abstração de um possível usuário do banco.
 */

import java.util.ArrayList;
import java.util.Date;

public class Pessoa implements Serializable{
	/**
	 * 
	 */
	private transient static final long serialVersionUID = 1L;
	private String Nome;
	private String senha;
	private Date dtNasci;
	private String Sexo;
	private String Cpf;
	private ArrayList<Conta> contas;
	
	public Pessoa(String nome,String senha, String cpf, Date data, String sexo){
		this.setNome(nome);
		this.setSenha(senha);
		this.setCpf(cpf);
		this.setDtNasci(data);
		this.setContas(new ArrayList<Conta>());
		this.setSexo(sexo);
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return Nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		Nome = nome;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * @return the dtNasci
	 */
	public Date getDtNasci() {
		return dtNasci;
	}

	/**
	 * @param dtNasci the dtNasci to set
	 */
	public void setDtNasci(Date dtNasci) {
		this.dtNasci = dtNasci;
	}

	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return Sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return Cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	/**
	 * @return the contas
	 */
	public ArrayList<Conta> getContas() {
		return contas;
	}

	/**
	 * @param contas the contas to set
	 */
	public void setContas(ArrayList<Conta> contas) {
		this.contas = contas;
	}
	
}
