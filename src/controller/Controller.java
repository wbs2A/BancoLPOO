package controller;

import model.Pessoa;
import java.util.ArrayList;
import java.IOException;
import DAO.PessoaDAO;
/**
* 
**/
class Controller{
	private Pessoa sessao = null;
    private static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    private PessoaDAO dao = new PessoaDAO();
	public static void criarPessoa(String nome, Date dtNasc, String sexo, String cpf, String senha){
		//Cria pessoa
		dao.criar(nome,dtNasc,sexo,cpf,senha);
	}

	//Sessão
	public static Pessoa getPessoa(String cpf, String senha){
		return dao.get(cpf,senha);
	}

	private static boolean validaLogin(String cpf, String senha) throws IOException{
		//Atribui uma pessoa à sessão
//----
		pessoa = pessoas.get(cpf);

//------

		if(senha.equalsIgnoreCase(pessoa.senha)){
			this.sessao = pessoa;
			return true;
		}else{
			return false;
		}
	}



	public static void removerPessoa(Pessoa pessoa){

	}

	public static void atualizaNomePessoa(Pessoa pessoa, String nome){

	}
	public static void atualizaCpfPessoa(Pessoa pessoa, String cpf){

	}
	public static void atualizaDtNascPessoa(Pessoa pessoa, Date dtNasc);
	public static void atualizaSexoPessoa(Pessoa pessoa, String sexo);
	public static void atualizaSenhaPessoa(Pessoa pessoa, String senha);

	public static void removerPessoa(Pessoa pessoa);

}