package controller;

import java.util.ArrayList;
import java.util.Random;
import model.Conta;
import model.Pessoa;
import exceptions.ContaInexistente;
import exceptions.SaldoNegativo;
import exceptions.SenhaIncorreta;

/**
 * Classe que representa as operacoes CRUDs da ContaDAO e operacoes de alguma transacao requisitada.
 * @author: Nathaly.
 * @author: Wesley B.
 */

public class ContaDAO extends DAO<Object>{
	//TODO
	@SuppressWarnings("unchecked")
	public static void carregarContas(){
		ArrayList<Conta> arrayCarregaContas = (ArrayList<Conta>) ContaDAO.carregar(diretorioConta);
        if(arrayCarregaContas != null){
        	setArrayConta(arrayCarregaContas);
        	ContaDAO.castTo(arrayCarregaContas);
        }else{
        	ContaDAO.descarregar(diretorioConta, getContas());
        }
    }
	//TODO
    public static void salvarContas() {
        ContaDAO.descarregar(diretorioConta, getContas());
    }
 
	private static ArrayList<Conta> arrayConta  = new ArrayList<Conta>();
	private static String diretorioConta = "Conta.dat";
	static Random gerador = new Random();
	
	 /**
	 * Metodo le int numero da conta
	 * @author Nathaly
	 * @return int
	 */
	public static int num(){
		return 100000 +(gerador.nextInt(90000));
	}

	 /**
	 * Metodo instancia objeto do tipo conta (cria) e adiciona o objeto conta no array de contas em pessoa
	 * 
	 * @author Nathaly
	 * @param string senha
	 * @param objeto pessoa
	 * @return objeto
	 */
	public static Object create(String senha, Pessoa pessoa ){
		Conta conta = new Conta(1400, ContaDAO.num(), 0, senha, pessoa);
		arrayConta.add(conta);
		pessoa.getContas().add(conta);
		return conta;
	}

	 /**
	 * Metodo atualiza senha
	 * @author Nathaly
	 * @param objeto conta
	 * @param senha
	 */
	public static void update(Conta conta, String senha) {
		conta.setSenha(senha);
	}

	/**
	 * 
	 * Metodo retorna array de Conta
	 * @author Nathaly
	 * @return array tipo conta de contas
	 */
	public static ArrayList<Conta> getContas(){
		return arrayConta;
	}
	
	public static void setArrayConta(ArrayList<Conta> arrayConta){
    	ContaDAO.arrayConta = arrayConta;
    }
	
	/**
	 * Metodo buscar mas so se a senha estiver correta
	 * @author Nathaly
	 * @param int numero conta, senha string
	 * @return objeto conta
	 */
	public static Conta read(int num, String senha) throws ContaInexistente, SenhaIncorreta{
		Conta conta = ContaDAO.read(num);
    	if(conta.getNumero() == num){
    		return conta;
    	}else{
    		throw new SenhaIncorreta("Senha incorreta");
    	}
	}
	/**
	 * Metodo buscar um objeto no array pelo numero da conta
	 * @author Nathaly
	 * @param int
	 * @return objeto conta
	 */
	public static Conta read(int num) throws ContaInexistente{
		for(Conta conta : arrayConta){
			if(conta.getNumero() == num){
				return conta;
			}
		}
		throw new ContaInexistente("Conta nao existe");
	}
	
	/**
	 * @author Nathaly
	 * Metodo exclui um objeto no array conta
	 * @param objeto
	 */
	public static void delete(Conta conta, Pessoa pessoa){
		arrayConta.remove(conta);
		pessoa.getContas().remove(conta);
	}


	/**
	 * Metodo sacar um valor
	 * @author Nathaly
	 * @param objeto, valor
	 * @return boolean
	 */
	public static boolean sacar(Conta conta, double valor) throws SaldoNegativo{
		if (Emprestar(conta, valor)){
			conta.setSaldo(conta.getSaldo()-valor);
			return true;
		}
		return false;
	}
	
	/**
	 * Metodo deposita um valor
	 * @author Nathaly
	 * @param valor
	 * @return boolean
	 */
	public static boolean depositar(Conta conta, double valor){
		if (valor > 0){
			conta.setSaldo(conta.getSaldo() + valor);
			return true;
		}
		return false;
	}
	
	/**
	 * Metodo verifica se tem excecoes para entao realizar uma operacao
	 * @author Nathaly
	 * @param objeto, valor
	 * @return boolean
	 */
	public static boolean Emprestar(Conta conta, double valor) throws SaldoNegativo{
		if (valor > 0 && conta.getSaldo() >= valor) {
			return true;
		}
		throw new SaldoNegativo("Saldo negativo");
	}
	
	/**
	 * Metodo transfere um valor
	 * @author Nathaly
	 * @param valor, objeto 
	 * @return boolean
	 */
	public static boolean transferir(double valor, Conta DepositarNela, Conta RetirarDela) throws SaldoNegativo{
		if (Emprestar(RetirarDela, valor)){
			if(depositar(DepositarNela, valor)){
			   sacar(RetirarDela, valor);
				return true;
			}else{
				return false;
			}				
		}else{
			return false;
		}
	}

}	
