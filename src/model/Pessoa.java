package model;

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
	private String Email;
	private String Telefone;
	private ArrayList<Conta> contas;
	
	/**
	 * @param nome
	 * @param senha
	 * @param cpf
	 * @param data
	 * @param sexo
	 * @param telefone
	 * @param funcoe
	 * @param email
	 */
	
	public Pessoa(String nome,String senha, String cpf, Date data, String sexo, String telefone, String funcao, String email){
	public Pessoa(String nome,String senha, String cpf, Date data, String sexo, String telefone, String email){
		this.setNome(nome);
		this.setSenha(senha);
		this.setCpf(cpf);
		this.setDtNasci(data);
		this.contas=new ArrayList<Conta>();
		this.setSexo(sexo);
		this.setEmail(email);
		this.setTelefone(telefone);
	
	}

	/**
	 * Método que retorna o nome da pessoa
	 * @return String
	 */
	public String getNome() {
		return Nome;
	}
	
	/**
	 * Método que insere o nome da Pessoa
	 * @param nome
	 */
	public void setNome(String nome) {
		this.Nome = nome;
	}
	
	/**
	 * Método que retorna o email da pessoa
	 * @return String
	 */
	
	public String getEmail(){
		return Email;	
	}
	/**
	 * Método que insere o email
	 * @param email
	 */
	public void setEmail(String email){
		this.Email = email;
	}
	
	/**
	 * Método que retorna o telefone
	 * @return String
	 */
	public String getTelefone(){
		 return Telefone;
		 
	}
	/**
	 * Método que insere o telefone
	 * @param telefone
	 */
	
	public void setTelefone(String telefone){
		this.Telefone = telefone;
	
	}
<<<<<<< HEAD
	
	/**
	 * Método que retorna a funcao/cargo
	 * @return String
	 */
	public String getFuncao(){
	  return Funcao;
	}
	/**
	 * Método que insere a funcao
	 * @param funcao
	 */
	public void setFuncao(String funcao){
		this.Funcao = funcao;
	}
=======

>>>>>>> 2aa3fb0505b9e4512119c507ec34df8498ba34d7
	/**
	 * Método que retorna a senha
	 * @return String
	 */
	
	public String getSenha() {
		return senha;
	}

	/**
	 * Método que insere a senha
	 * @param senha
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * Método que retorna a data de nascimento
	 * @return Date
	 */
	public Date getDtNasci() {
		return dtNasci;
	}

	/**
	 * Método que insere a data de nascimento
	 * @param dtNasci
	 */
	public void setDtNasci(Date dtNasci) {
		this.dtNasci = dtNasci;
	}

	/**
	 * Método que retorna o sexo da pessoa
	 * @return String
	 */
	public String getSexo() {
		return Sexo;
	}

	/**
	 * Método que insere o sexo da pessoa
	 * @param sexo
	 */
	public void setSexo(String sexo) {
		this.Sexo = sexo;
	}

	/**
	 * Método que retorna o CPF
	 * @return String
	 */
	public String getCpf() {
		return Cpf;
	}

	/**
	 * Método que insere o CPF
	 * @param cpf
	 */
	public void setCpf(String cpf) {
		this.Cpf = cpf;
	}

	/**
	 * Método que retorna a lista de contas da pessoa
	 * @return Conta
	 */
	public ArrayList<Conta> getContas() {
		return contas;
	}

	/**
	 * Método que insere conta
	 * @param contas
	 */
	public void setContas(ArrayList<Conta> contas) {
		this.contas = contas;
	}
	/**
	* Método que adicona conta a pessoa.
	*@param conta 
	*/
	public void addConta(Conta conta){
 	  	
 		this.contas.add(conta);
 			
 		}
	
	  /**
	   * Metodo toString classe pessoa
	   * @return String
	   */
	
	   @Override
	   public String toString(){
	     return "Nome: "+ this.Nome +
	         "\nCpf: " + this.Cpf +
	         "\nSexo: " + this.Sexo +
	         "\nData: " + this.dtNasci +
	           "\nTelefone: " + this.Telefone +
	           "\nEmail: " + this.Email;
	   }
	    



}
