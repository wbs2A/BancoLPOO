package controller;

import model.Pessoa;
import java.util.ArrayList;
import java.util.Date;

import exceptions.SaldoNegativo;
import exceptions.SenhaIncorreta;

import java.io.IOException;
import model.Conta;
import model.Movimentacoes;
/*
 * Classe que representa o controller
 	principal da aplicação, contendo métodos que são comuns às classes do sistema
 	ou conectando método com os respectivos DAOs.
 * @author: Náthaly.
 * @author: Wesley B.
 */
public class Controller{
    private static Pessoa sessao = null;
    private static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

	/*
	 * Variável que armazena a pessoa que está a usar o sistema.
	 * @author: Wesley B.
	 */
    private static Pessoa instSessao;
    

    /*
	 * Método que retorna a pessoa da sessão.
	 * @author: Wesley B.
	 * @return: Pessoa da sessão
	 */
	public static Pessoa getSessao() {
		return sessao;
	}



    /*
	 * Método que defina a pessoa da sessão.
	 * @author: Wesley B.
	 * @param: Pessoa da sessão
	 */    
	public static void setSessao(Pessoa sessao) {
		Controller.sessao = sessao;
	}

    /*
	 * Método que recebe os dados de uma pessoa a
	   ser criada no sistema.
	 * @author: Wesley B.
	 * @param: nome: String que representa o nome
	    pessoa a ser criada
	 * @param: senha: Senha de acesso
	 * @param: cpf: Cadastro único
	 * @param: data: Data de nascimento
	 * @param: sexo: Gênero
	 * @param: telefone: Número de telefone
	 * @param: email: Endereço eletrônico da pessoa
	 */
    public static void criarPessoa(String nome, String senha, String cpf, Date data, String sexo, String telefone, String email){
	Pessoa p = (Pessoa) PessoaDAO.create(nome, senha, cpf, data, sexo, telefone, email);
        Controller.pessoas.add(p);
    }

	/*
	 * Método que conecta a solicitação de uma pessoa
	   da view com o DAO.
	 * @author: Wesley B.
	 * @param: cpf: Cadastro único
	 * @param: senha: Senha de acesso ao sistema.
	 * @return Pessoa solicitada.
	 */
	public static Pessoa getPessoa(String cpf, String senha) throws SenhaIncorreta{
	     return PessoaDAO.get(cpf, senha);
	}

	/*
	 * Método que valida o acesso de uma pessoa ao sistema.
	 * @author: Wesley B.
	 * @param: cpf: Cadastro único
	 * @param: senha: Senha de acesso ao sistema.
	 * @return Um booleano indicando se a solicitação é válida ou não
	 */
	public static boolean validaLogin(String cpf, String senha) throws IOException,SenhaIncorreta{
	//Atribui uma pessoa à sessão
	
		Pessoa p = Controller.getPessoa(cpf, senha);
 		if(p != null){
	 		if(senha.equalsIgnoreCase(p.getSenha())){
				setSessao(p);
				return true;
			}else{
				return false;
			}
		}else
			throw new IOException();	
	}


	/*
	 * Método que conecta a solicitação de uma pessoa
	   da view com o DAO ao remover alguém do sistema
	 * @author: Wesley B.
	 * @param: Pessoa a ser removida.
	 */
	public static void removerPessoa(Pessoa pessoa){
		PessoaDAO.delete(pessoa.getCpf());
	}

	/*
	* Este conjunto de métodos com prefixo "atualiza" referem-se
	* aos métodos chamados pela view para atualizar um determi--
	* nado campo de uma pessoa utilizando o factory de atuali---
	* zações da classe PessoaDAO, passando o parâmetro correto
	* que indica a atualização a ser feita.
	* @author: Wesley B.
	* @param: pessoa: Pessoa a ser atualizada
	* @param: campo: String contendo o valor do campo homônimo a
	  ser atualizado 
	*/
	public static void atualizaNomePessoa(Pessoa pessoa, String nome){
		PessoaDAO.update(1, pessoa, nome);
	}
	public static void atualizaSenhaPessoa(Pessoa pessoa, String senha){
		PessoaDAO.update(2, pessoa, senha);
    }
	public static void atualizaDtNascPessoa(Pessoa pessoa, Date dtNasc){
		PessoaDAO.update(3, pessoa, dtNasc);
	}

	public static void atualizaSexoPessoa(Pessoa pessoa, String sexo){
		PessoaDAO.update(4, pessoa, sexo);
    }
	
	public static void atualizaTelefonePessoa(Pessoa pessoa, String telefone){
		PessoaDAO.update(5, pessoa, telefone);
    }
	
	public static void atualizaEmailPessoa(Pessoa pessoa, String email){
		PessoaDAO.update(6, pessoa, email);
    }
	
	public static void atualizaCpfPessoa(Pessoa pessoa, String cpf){
		PessoaDAO.update(7, pessoa, cpf);
    }

    public static void realizarTransacao(Date date, Conta conta, String saque_de_Conta, float valor, int i) throws SaldoNegativo {
    	if(ContaDAO.sacar(conta, valor)){
	        Movimentacoes movimentacaoMovimentada = new Movimentacoes(saque_de_Conta,valor,true);
	        conta.getMovimentacoes().add(movimentacaoMovimentada);
    	}
    }

    public static void realizarTransacao(Date date, Conta contaRemetente, Conta contaDestino, String transferencia, float valor, int i) throws SaldoNegativo {
        if(ContaDAO.transferir(valor, contaDestino,contaRemetente)){
	        Movimentacoes movimentacaoMovimentada = new Movimentacoes(transferencia,valor,true);
	        contaRemetente.getMovimentacoes().add(movimentacaoMovimentada);
        }
    }

    public static void realizarTransacao1(Date date, Conta conta, String deposito_de_Conta, float valor, int i) throws SaldoNegativo {
    	if(ContaDAO.depositar(conta, valor)){
	        Movimentacoes movimentacaoMovimentada = new Movimentacoes(deposito_de_Conta,valor,true);
	        conta.getMovimentacoes().add(movimentacaoMovimentada);
    	}
    }

	public static Pessoa getInstSessao() {
		return instSessao;
	}



	public static void setInstSessao(Pessoa instSessao) {
		Controller.instSessao = instSessao;
	}
}
