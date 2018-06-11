package controller;

import java.util.ArrayList;
import java.util.Date;

import model.Pessoa;
import exceptions.SenhaIncorreta;

/**
 * Classe que representa as operacoes CRUDs da PessoaDAO e operacoes de
 * atualizacao de cadastro.
 * 
 * @author: Jose Sandonas
 */

public class PessoaDAO extends DAO<Object> {
	/**
	 * Metodo carrega dados para o objeto array de pessoa
	 * @author Nathaly
	 */
	@SuppressWarnings("unchecked")
	public static void carregarPessoas() {
		ArrayList<Pessoa> arrayCarregaPessoas = (ArrayList<Pessoa>) PessoaDAO.carregar(diretorioPessoa);
		if (arrayCarregaPessoas != null) {
			setArrayPessoa(arrayCarregaPessoas);
			PessoaDAO.castTo(arrayCarregaPessoas);
		} else {
			PessoaDAO.descarregar(diretorioPessoa, getPessoas());
		}
	}
	/**
	 * Metodo salva array de pessoas em arquivo
	 * @author Nathaly
	 */
	public static void salvarPessoas() {
		PessoaDAO.descarregar(diretorioPessoa, getPessoas());
	}
	/**
	 * Metodo retorna array de pessoa
	 * @author Nathaly
	 * @return array de pessoas
	 */

	public static Object getPessoa() {
		throw new UnsupportedOperationException("Not supported yet."); // To do
	}
	
	private static ArrayList<Pessoa> arrayPessoa = new ArrayList<Pessoa>();
	private static String diretorioPessoa = "Pessoa.dat";
	/**
	 * Metodo que retorna o array de Pessoa
	 * 
	 * @return arrayPessoa 
	 */
	public static ArrayList<Pessoa> getPessoas() {
		return arrayPessoa;
	}
	/**
	 * Metodo que insere um array do tipo Pessoa ao arrayPessoa da class
	 *  
	 * @param arrayPessoa
	 */
	public static void setArrayPessoa(ArrayList<Pessoa> arrayPessoa) {
		PessoaDAO.arrayPessoa = arrayPessoa;
	}

	/**
	 * Metodo instancia objeto do tipo pessoa (criando uma pessoa) e adiciona o
	 * objeto pessoa no array de pessoas
	 * 
	 * @author Jose Sandonas
	 * @param String nome que representa o nome da pessoa
	 * @param String senha que representa a senha de cadastro
	 * @param String cpf que representa o cadastro
	 * @param Date data que representa a data de nascimento
	 * @param String sexo genero seja ele qual for
	 * @param String email 
	 * @return pessoa
	 */
	public static Object create(String nome, String senha, String cpf, Date data, String sexo, String telefone,
			String email) {
		Pessoa pessoa = new Pessoa(nome, senha, cpf, data, sexo, telefone, email);
		arrayPessoa.add(pessoa);
		return pessoa;
	}

	/**
	 * Metodo que realiza a busca de uma pessoa recebendo como parametro o seu
	 * CPF
	 * 
	 * @author Jose Sandonas
	 * @return pessoa especificada ou nulo caso nao encontrada
	 * @param cpf
	 */
	public static Pessoa read(String cpf) {
		for (Pessoa pessoa : arrayPessoa) {
			if (pessoa.getCpf().equals(cpf)) {
				return pessoa;
			}
		}
		return null;
	}

	/**
	 * Metodo que realiza a alteracao das informacoes de uma pessoa recebendo
	 * como parametro o numero que especifica qual dado que sera alterado,
	 * pessoa do tipo Pessoa, obejto info que seria a informacao que sera
	 * alterada
	 * 
	 * @author Jose Sandonas
	 * 
	 * @param operacao
	 * @param pessoa
	 * @param info
	 */
	public static void update(int operacao, Pessoa pessoa, Object info) {
		switch (operacao) {
		case 1:
			pessoa.setNome((String) info);
			break;
		case 2:
			pessoa.setSenha((String) info);
			break;
		case 3:
			pessoa.setDtNasci((Date) info);
			break;
		case 4:
			pessoa.setSexo((String) info);
			break;
		case 5:
			pessoa.setTelefone((String) info);
			break;
		case 6:
			pessoa.setEmail((String) info);
			break;
		case 7:
			pessoa.setCpf((String) info);
			break;
		}

	}

	/**
	 * Metodo que executa a remocao interna que remove a pessoa contida dentro
	 * do arraypessoa
	 * 
	 * @param pessoa
	 * 
	 * @author Jose Sandonas
	 */
	private static void delete(Pessoa pessoa) {
		arrayPessoa.remove(pessoa);
	}

	/**
	 * Metodo que executa a remocao externa que recebe o cpf e remove a pessoa
	 * 
	 * @param String cpf
	 * 
	 * @author Jose Sandonas
	 */
	public static void delete(String cpf) {
		Pessoa p = read(cpf);
		delete(p);
	}
	/**
	 * Metodo que executa a remocao externa que recebe o cpf e remove a pessoa
	 * 
	 * @param String cpf
	 * @param String senha
	 * @return Pessoa
	 * @author Jose Sandonas
	 * @throws Caso a senha esteja incorreta
	 */
	
	public static Pessoa get(String cpf, String senha) throws SenhaIncorreta {
		Pessoa p = PessoaDAO.read(cpf);
		if (p.getSenha().equals(senha)) {
			return p;
		} else {
			throw new SenhaIncorreta("Senha incorreta");
		}
	}

}
