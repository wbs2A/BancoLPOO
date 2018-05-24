package model;

import java.io.Serializable;
/**
 * @author Allison
 * @author Valdenize
 * @author Helmuth
 * Esta classe e uma abstracao de um possivel usuario do banco.
 */

import java.util.ArrayList;
import java.util.Date;

public class Pessoa implements Serializable{
	private transient static final long serialVersionUID = 1L;
	private String Nome;
	private String senha;
	private Date dtNasci;
	private String Sexo;
	private Conta contaPadrao;
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
	 * @param email
	 */
	
	public Pessoa(String nome,String senha, String cpf, Date data, String sexo, String telefone, String email){
		this.setNome(nome);
		this.setSenha(senha);
		this.setCpf(cpf);
		this.setDtNasci(data);
		this.contas=new ArrayList<Conta>();
		this.contaPadrao = null;
		this.setSexo(sexo);
		this.setEmail(email);
		this.setTelefone(telefone);
	
	}

	/**
	 * Metodo que retorna o nome da pessoa
	 * @return String
	 */
	public String getNome() {
		return Nome;
	}
	
	/**
	 * Metodo que insere o nome da Pessoa
	 * @param nome
	 */
	public void setNome(String nome) {
		this.Nome = nome;
	}
	
	/**
	 * Metodo que retorna o email da pessoa
	 * @return String
	 */
	
	public String getEmail(){
		return Email;	
	}
	/**
	 * Metodo que insere o email
	 * @param email
	 */
	public void setEmail(String email){
		this.Email = email;
	}
	
	/**
	 * Metodo que retorna o telefone
	 * @return String
	 */
	public String getTelefone(){
		 return Telefone;
		 
	}
	/**
	 * Metodo que insere o telefone
	 * @param telefone
	 */
	
	public void setTelefone(String telefone){
		this.Telefone = telefone;
	
	}
	/**
	 * Metodo que retorna a senha
	 * @return String
	 */
	
	public String getSenha() {
		return senha;
	}

	/**
	 * Metodo que insere a senha
	 * @param senha
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * Metodo que retorna a data de nascimento
	 * @return Date
	 */
	public Date getDtNasci() {
		return dtNasci;
	}

	/**
	 * Metodo que insere a data de nascimento
	 * @param dtNasci
	 */
	public void setDtNasci(Date dtNasci) {
		this.dtNasci = dtNasci;
	}

	/**
	 * Metodo que retorna o sexo da pessoa
	 * @return String
	 */
	public String getSexo() {
		return Sexo;
	}

	/**
	 * Metodo que insere o sexo da pessoa
	 * @param sexo
	 */
	public void setSexo(String sexo) {
		this.Sexo = sexo;
	}

	/**
	 * Metodo que retorna o CPF
	 * @return String
	 */
	public String getCpf() {
		return Cpf;
	}

	/**
	 * Metodo que insere o CPF
	 * @param cpf
	 */
	public void setCpf(String cpf) {
		this.Cpf = cpf;
	}

	/**
	 * Metodo que retorna a lista de contas da pessoa
	 * @return Conta
	 */
	public ArrayList<Conta> getContas() {
		return contas;
	}

	/**
	 * Metodo que insere conta
	 * @param contas
	 */
	public void setContas(ArrayList<Conta> contas) {
		this.contas = contas;
	}
	/**
	* Metodo que adicona conta a pessoa.
	*@param conta 
	*/
	public void addConta(Conta conta){
 	  	
 		this.contas.add(conta);
 			
 		}
	
	/**
	 * Metodo que retorna a contaPadrao da pessoa
	 * @return Conta
	 */
	public Conta getContaPadrao() {
		return contaPadrao;
	}

	/**
	 * Metodo que insere a contaPadrao em pessoa
	 * @param conta
	 */
	public void setContaPadrao(Conta conta) {
		this.contaPadrao = conta;
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
