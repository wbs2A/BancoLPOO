package controller;

import java.util.ArrayList;
import java.util.Random;
import model.Conta;
import model.Pessoa;
import exceptions.ContaInexistente;
import exceptions.SaldoNegativo;
import exceptions.SenhaIncorreta;

public class ContaDAO extends DAO<Object>{
	
    public static void carregarContas() {
        Object obj = ContaDAO.carregar(arrayConta.getClass().getName());
        arrayConta = ContaDAO.castTo(obj);
    }

    public static void salvarContas() {
        ContaDAO.descarregar(arrayConta);
    }
 
	private static ArrayList<Conta> arrayConta  = new ArrayList<Conta>();
	static Random gerador = new Random();
	
	 /*
	 * @author Nathaly
	 * Metodo le int numero da conta
	 * @return int
	 */
	public static int num(){
		return 100000 +(gerador.nextInt(90000));
	}

	 /*
	 * @author Nathaly
	 * Metodo instancia objeto do tipo conta (cria) e adiciona o objeto conta no array de contas em pessoa
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

	 /*
	 * @author Nathaly
	 * Metodo atualiza senha
	 * @param objeto conta
	 * @param senha
	 */
	public static void update(Conta conta, String senha) {
		conta.setSenha(senha);
	}

	/*
	 * @author Nathaly
	 * Metodo retorna array de Conta
	 * @return array tipo conta de contas
	 */
	public ArrayList<Conta> getContas(){
		return arrayConta;
	}

	/*
	 * @author Nathaly
	 * Metodo buscar mas so se a senha estiver correta
	 * @param int numero conta, senha string
	 * @return objeto conta
	 */
	public static Conta read(int num, String senha) throws ContaInexistente, SenhaIncorreta{
		Conta conta = ContaDAO.read(num);
    	if(conta.getSenha().equals(senha)){
    		return conta;
    	}else{
    		throw new SenhaIncorreta("Senha incorreta");
    	}
	}
	/*
	 * @author Nathaly
	 * Metodo buscar um objeto no array pelo numero da conta
	 * @param int
	 * @return objeto conta
	 */
	public static Conta read(int num) throws ContaInexistente{
		Conta conta = null;
		for(int i = 0; i < arrayConta.size(); i++){
			conta = arrayConta.get(i);
			if(conta.getNumero() == num){
				return conta;
			}
		}
		throw new ContaInexistente("Conta nao existe");
	}
	
	/*
	 * @author Nathaly
	 * Metodo exclui um objeto no array conta
	 * @param objeto
	 */
	public static void delete(Conta conta, Pessoa pessoa){
		arrayConta.remove(conta);
		pessoa.getContas().remove(conta);
	}


	/*
	 * @author Nathaly
	 * Metodo sacar um valor
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
	
	/*
	 * @author Nathaly
	 * Metodo deposita um valor
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
	
	/*
	 * @author Nathaly
	 * Metodo verifica se tem excecoes para entao realizar uma operacao
	 * @param objeto, valor
	 * @return boolean
	 */
	public static boolean Emprestar(Conta conta, double valor) throws SaldoNegativo{
		if (valor > 0 && conta.getSaldo() >= valor) {
			return true;
		}
		throw new SaldoNegativo("Saldo negativo");
	}
	
	/*
	 * @author Nathaly
	 * Metodo transfere um valor
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
