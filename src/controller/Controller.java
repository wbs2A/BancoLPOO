package controller;

import model.Pessoa;
import java.util.ArrayList;
import java.util.Date;

import exceptions.SaldoNegativo;
import exceptions.SenhaIncorreta;

import java.io.IOException;
import model.Conta;
import model.Movimentacoes;

/**
 * Classe que representa o controller principal da aplicacao, contendo metodos
 * que sao comuns nas classes do sistema ou conectando metodo com os respectivos
 * DAOs.
 * 
 * @author: Nathaly.
 * @author: Wesley B.
 */
public class Controller {
	private static Pessoa sessao = null;
	private static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

	/**
	 * Variavel que armazena a pessoa que estao a usar o sistema.
	 * 
	 * @author: Wesley B.
	 */
	private static Pessoa instSessao;

	/**
	 * Metodo que retorna a pessoa da sessao.
	 * 
	 * @author: Wesley B.
	 * @return: Pessoa da sessao
	 */
	public static Pessoa getSessao() {
		return sessao;
	}

	/**
	 * Metodo que defina a pessoa da sessao.
	 * 
	 * @author: Wesley B.
	 * @param: Pessoa
	 *             da sessao
	 */
	public static void setSessao(Pessoa sessao) {
		Controller.sessao = sessao;
	}

	/**
	 * Metodo que recebe os dados de uma pessoa a ser criada no sistema.
	 * 
	 * @author: Wesley B.
	 * @param: nome:
	 *             String que representa o nome pessoa a ser criada
	 * @param: senha:
	 *             Senha de acesso
	 * @param: cpf:
	 *             Cadastro unico
	 * @param: data:
	 *             Data de nascimento
	 * @param: sexo:
	 *             Genero
	 * @param: telefone:
	 *             Numero de telefone
	 * @param: email:
	 *             Endereco eletrinico da pessoa
	 */
	public static void criarPessoa(String nome, String senha, String cpf, Date data, String sexo, String telefone,
			String email) {
		Pessoa p = (Pessoa) PessoaDAO.create(nome, senha, cpf, data, sexo, telefone, email);
		Controller.pessoas.add(p);
	}

	/**
	 * Metodo que conecta a solicitacao de uma pessoa da view com o DAO.
	 * 
	 * @author: Wesley B.
	 * @param: cpf:
	 *             Cadastro unico
	 * @param: senha:
	 *             Senha de acesso ao sistema.
	 * @return Pessoa solicitada.
	 */
	public static Pessoa getPessoa(String cpf, String senha) throws SenhaIncorreta {
		return PessoaDAO.get(cpf, senha);
	}

	/**
	 * Metodo que valida o acesso de uma pessoa ao sistema.
	 * 
	 * @author: Wesley B.
	 * @param: cpf:
	 *             Cadastro unico
	 * @param: senha:
	 *             Senha de acesso ao sistema.
	 * @return Um booleano indicando se a solicitacao e valida ou nao
	 */
	public static boolean validaLogin(String cpf, String senha) throws IOException, SenhaIncorreta {
		// Atribui uma pessoa a sessao

		Pessoa p = Controller.getPessoa(cpf, senha);
		if (p != null) {
			if (p.getSenha().equals(senha)) {
				setSessao(p);
				return true;
			} else {
				return false;
			}
		} else
			throw new IOException();
	}

	/**
	 * Metodo que conecta a solicitao de uma pessoa da view com o DAO ao remover
	 * alguem do sistema
	 * 
	 * @author: Wesley B.
	 * @param: Pessoa
	 *             a ser removida.
	 */
	public static void removerPessoa(Pessoa pessoa) {
		PessoaDAO.delete(pessoa.getCpf());
	}

	/**
	 * Este conjunto de metodos com prefixo "atualiza" referem-se aos metodos
	 * chamados pela view para atualizar um determi-- nado campo de uma pessoa
	 * utilizando o factory de atuali--- zacoes da classe PessoaDAO, passando o
	 * parametro correto que indica a atualizacao a ser feita.
	 * 
	 * @author: Wesley B.
	 * @param: pessoa:
	 *             Pessoa a ser atualizada
	 * @param: campo:
	 *             String contendo o valor do campo homonimo a ser atualizado
	 */
	public static void atualizaNomePessoa(Pessoa pessoa, String nome) {
		PessoaDAO.update(1, pessoa, nome);
	}

	/**
	 * Este conjunto de metodos com prefixo "atualiza" referem-se aos metodos
	 * chamados pela view para atualizar um determi-- nado campo de uma pessoa
	 * utilizando o factory de atuali--- zacoes da classe PessoaDAO, passando o
	 * parametro correto que indica a atualizacao a ser feita.
	 * 
	 * @author: Wesley B.
	 * @param: pessoa:
	 *             Pessoa a ser atualizada
	 * @param: campo:
	 *             String contendo o valor do campo homonimo a ser atualizado
	 */
	public static void atualizaSenhaPessoa(Pessoa pessoa, String senha) {
		PessoaDAO.update(2, pessoa, senha);
	}

	/**
	 * Este conjunto de metodos com prefixo "atualiza" referem-se aos metodos
	 * chamados pela view para atualizar um determi-- nado campo de uma pessoa
	 * utilizando o factory de atuali--- zacoes da classe PessoaDAO, passando o
	 * parametro correto que indica a atualizacao a ser feita.
	 * 
	 * @author: Wesley B.
	 * @param: pessoa:
	 *             Pessoa a ser atualizada
	 * @param: campo:
	 *             String contendo o valor do campo homonimo a ser atualizado
	 */
	public static void atualizaDtNascPessoa(Pessoa pessoa, Date dtNasc) {
		PessoaDAO.update(3, pessoa, dtNasc);
	}

	/**
	 * Este conjunto de metodos com prefixo "atualiza" referem-se aos metodos
	 * chamados pela view para atualizar um determi-- nado campo de uma pessoa
	 * utilizando o factory de atuali--- zacoes da classe PessoaDAO, passando o
	 * parametro correto que indica a atualizacao a ser feita.
	 * 
	 * @author: Wesley B.
	 * @param: pessoa:
	 *             Pessoa a ser atualizada
	 * @param: campo:
	 *             String contendo o valor do campo homonimo a ser atualizado
	 */
	public static void atualizaSexoPessoa(Pessoa pessoa, String sexo) {
		PessoaDAO.update(4, pessoa, sexo);
	}

	/**
	 * Este conjunto de metodos com prefixo "atualiza" referem-se aos metodos
	 * chamados pela view para atualizar um determi-- nado campo de uma pessoa
	 * utilizando o factory de atuali--- zacoes da classe PessoaDAO, passando o
	 * parametro correto que indica a atualizacao a ser feita.
	 * 
	 * @author: Wesley B.
	 * @param: pessoa:
	 *             Pessoa a ser atualizada
	 * @param: campo:
	 *             String contendo o valor do campo homonimo a ser atualizado
	 */
	public static void atualizaTelefonePessoa(Pessoa pessoa, String telefone) {
		PessoaDAO.update(5, pessoa, telefone);
	}

	/**
	 * Este conjunto de metodos com prefixo "atualiza" referem-se aos metodos
	 * chamados pela view para atualizar um determi-- nado campo de uma pessoa
	 * utilizando o factory de atuali--- zacoes da classe PessoaDAO, passando o
	 * parametro correto que indica a atualizacao a ser feita.
	 * 
	 * @author: Wesley B.
	 * @param: pessoa:
	 *             Pessoa a ser atualizada
	 * @param: campo:
	 *             String contendo o valor do campo homonimo a ser atualizado
	 */
	public static void atualizaEmailPessoa(Pessoa pessoa, String email) {
		PessoaDAO.update(6, pessoa, email);
	}

	/**
	 * Este conjunto de metodos com prefixo "atualiza" referem-se aos metodos
	 * chamados pela view para atualizar um determi-- nado campo de uma pessoa
	 * utilizando o factory de atuali--- zacoes da classe PessoaDAO, passando o
	 * parametro correto que indica a atualizacao a ser feita.
	 * 
	 * @author: Wesley B.
	 * @param: pessoa:
	 *             Pessoa a ser atualizada
	 * @param: campo:
	 *             String contendo o valor do campo homonimo a ser atualizado
	 */
	public static void atualizaCpfPessoa(Pessoa pessoa, String cpf) {
		PessoaDAO.update(7, pessoa, cpf);
	}

	/**
	 * @author Nathaly
	 * @author: Wesley B.
	 * Metodos abaixo realizam as transacoes e armazenam no
	 *          extrato apenas se a transacao ocorrer
	 * @param Data
	 *            trnasacao, objeto conta, descricao, valor, numero da operacao
	 *            deseja realizar
	 */
	public static void mov_saque_deposito(Date date, Conta conta, String descricao, float valor, int num_operacao)
			throws SaldoNegativo {
		if(num_operacao == 1){
			if (ContaDAO.sacar(conta, valor) == true) {
				Movimentacoes movimentacaoMovimentada = new Movimentacoes(date, conta, descricao, valor, num_operacao);
				conta.getMovimentacoes().add(movimentacaoMovimentada);
			}
		}else if(num_operacao == 2){
			if (ContaDAO.depositar(conta, valor) == true) {
				Movimentacoes movimentacaoMovimentada = new Movimentacoes(date, conta, descricao, valor, num_operacao);
				conta.getMovimentacoes().add(movimentacaoMovimentada);
			}
		}
	}
	/**
	 * @author Nathaly
	 * @author: Wesley B.
	 * Metodos abaixo realiza a operacao de transacao
	 * @param Data
	 *            trnasacao, objeto conta remetende, conta destino, descricao, valor, numero da operacao
	 *            deseja realizar
	 */
	public static void mov_transferencia(Date date, Conta contaRemetente, Conta contaDestino, String descricao,
			float valor, int num_operacao) throws SaldoNegativo {
		if (ContaDAO.transferir(valor, contaDestino, contaRemetente) == true) {
			Movimentacoes movimentacaoMovimentada = new Movimentacoes(date, contaDestino, contaRemetente, descricao,
					valor, num_operacao);
			contaRemetente.getMovimentacoes().add(movimentacaoMovimentada);
		}
	}

	/**
	 * Metodo que retorna o objeto referente à pessoa que está a utilizar
	 * o sistema, setado ao fazer login.
	 * 
	 * @author: Wesley B.
	 * @author: Nathaly
	 * @return: objeto do tipo Pessoa.
	 */
	public static Pessoa getInstSessao() {
		return instSessao;
	}
	
	/**
	 * Metodo que define a pessoa que está a utilizar o sistema.
	 * 
	 * @author: Wesley B.
	 * @param: objeto Pessoa.
	 */
	public static void setInstSessao(Pessoa instSessao) {
		Controller.instSessao = instSessao;
	}
}
