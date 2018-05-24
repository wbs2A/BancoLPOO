package controller;

import model.Pessoa;
import java.util.ArrayList;
import java.util.Date;
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
    private Pessoa sessao = null;
    private static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    private PessoaDAO daoPessoa = new PessoaDAO();
    public static void criarPessoa(String nome, Date dtNasc, String sexo, String cpf, String senha){
	//Cria pessoa
	Pessoa p = daoPessoa.create(nome,dtNasc,sexo,cpf,senha);
        Controller.pessoas.add(p);
    }

	//Sessão
	public static Pessoa getPessoa(String cpf, String senha){
	     return daoPessoa.get(cpf,senha);
	}

	public static boolean validaLogin(String cpf, String senha) throws IOException{
	//Atribui uma pessoa à sessão
//----
	Pessoa pessoa = pessoas.get(cpf);

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
	public static void atualizaDtNascPessoa(Pessoa pessoa, Date dtNasc){
            
        }
	public static void atualizaSexoPessoa(Pessoa pessoa, String sexo){
            
        }
	public static void atualizaSenhaPessoa(Pessoa pessoa, String senha){
            
        }

	public static void removerPessoa(Pessoa pessoa){
            
        }

}