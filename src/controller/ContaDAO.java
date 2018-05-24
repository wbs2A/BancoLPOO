package controller;

import java.util.ArrayList;
import java.util.Random;
import model.Conta;
import model.Pessoa;
import exceptions.ContaInexistente;
import exceptions.SaldoNegativo;

/*
 * @author Controller
 */

public class ContaDAO extends DAO{
	
    public static void carregarContas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void salvarContas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
	private static ArrayList<Conta> arrayConta  = new ArrayList<Conta>();
	static Random gerador = new Random();
	
	 /*
	 * Metodo le int numero da conta
	 * @return int
	 */
	public static int num(){
		return gerador.nextInt();
	}

	 /*
	 * Metodo instancia objeto do tipo conta (cria) e adiciona o objeto conta no array de contas em pessoa
	 * @param int agencia fixa
	 * @param string senha
	 * @param double saldo
	 * @param objeto
	 * @return objeto
	 */
	public static Object create(int agencia, String senha, double saldo, Pessoa pessoa ){
		Conta conta = new Conta(14, ContaDAO.num(), (float) saldo, senha, pessoa);
		arrayConta.add(conta);
		pessoa.getContas().add(conta);
		return conta;
	}

	 /*
	 * Metodo atualiza senha
	 * @param objeto
	 * @param senha
	 */
	public static void update(Conta conta, String senha) {
		conta.setSenha(senha);
	}

	/*
	 * Metodo retorna array de Conta
	 * @return objeto
	 */
	public ArrayList<Conta> getContas(){
		return arrayConta;
	}

	/*
	 * Metodo buscar um objeto no array pelo numero da conta
	 * @param valor
	 * @return objeto
	 */
	public static Conta read(int num) throws ContaInexistente{
		Conta conta = null;
		for(int i = 0; i < arrayConta.size(); i++){
			conta = arrayConta.get(i);
			if(conta.getNumero() == num){
				return conta;
			}
		}
		throw new ContaInexistente("Conta n�o existe");
	}
	
	/*
	 * Metodo exclui um objeto no array 
	 * @param objeto
	 * @return objeto
	 */
	private static void del(Conta conta){
		arrayConta.remove(conta);
	}

	public static void delete(int num) throws ContaInexistente{
		Conta conta = read(num);
		del(conta);
	}

	/*
	 * Metodo sacar um valor
	 * @param valor
	 * @return boolean
	 *
	 */
	public static boolean sacar(Conta conta, int valor) throws SaldoNegativo{
		if (Emprestar(conta, valor)){
			conta.setSaldo(conta.getSaldo()-valor);
			return true;
		}
		return false;
	}
	
	/*
	 * Metodo deposita um valor
	 * @param valor
	 * @return boolean
	 */
	public static boolean depositar(Conta conta, int valor){
		if (valor > 0){
			conta.setSaldo(conta.getSaldo() + valor);
			return true;
		}
		return false;
	}
	
	/*
	 * Metodo empresta um valor
	 * @param valor
	 * @return boolean
	 */
	public static boolean Emprestar(Conta conta, int valor) throws SaldoNegativo{
		if (valor > 0 && conta.getSaldo() >= valor) {
			return true;
		}
		throw new SaldoNegativo("Saldo negativo");
	}
	
	/*
	 * Metodo transfere um valor
	 * @param valor
	 * @return boolean
	 */
	public static boolean transferir(int valor, Conta DepositarNela, Conta RetirarDela) throws SaldoNegativo{
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