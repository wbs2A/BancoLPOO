package controller;

import model.Pessoa;
import java.util.ArrayList;
import java.util.Date;

import exceptions.SenhaIncorreta;

import java.io.IOException;
/**
* 
**/
public class Controller{

    public static void getInstance(Pessoa pessoa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Pessoa getPessoa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private static Pessoa sessao = null;
    private static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    public static void criarPessoa(String nome, String senha, String cpf, Date data, String sexo, String telefone, String email){
	//Cria pessoa
	Pessoa p = (Pessoa) PessoaDAO.create(nome, senha, cpf, data, sexo, telefone, email);
        Controller.pessoas.add(p);
    }

	//Sessão
	public static Pessoa getPessoa(String cpf, String senha) throws SenhaIncorreta{
	     return PessoaDAO.get(cpf, senha);
	}

	public static boolean validaLogin(String cpf, String senha) throws IOException{
	//Atribui uma pessoa à sessão
//----
	 Pessoa pessoa = (Pessoa) PessoaDAO.read(cpf);

//------

		if(senha.equalsIgnoreCase(pessoa.getSenha())){
			setSessao(pessoa);
			return true;
		}else{
			return false;
		}
	}



	public static void removerPessoa(Pessoa pessoa){
		PessoaDAO.delete(pessoa.getCpf());
	}

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

	public static Pessoa getSessao() {
		return sessao;
	}

	public static void setSessao(Pessoa sessao) {
		Controller.sessao = sessao;
	}
}