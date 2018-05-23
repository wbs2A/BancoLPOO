import java.util.ArrayList;
import java.util.Random;

/**
 * @author Controller
 */

public class contaDAO extends DAO{
 
	private ArrayList<Conta> arrayConta  = new ArrayList<Conta>();
	Random gerador = new Random();
	
	 /**
	 * Metodo le int numero da conta
	 * @return int
	 */
	public static int num(){
		return gerador.nextInt();
	}

	 /**
	 * Metodo instancia objeto do tipo conta (cria) e adiciona o objeto conta no array de contas em pessoa
	 * @param int agencia fixa
	 * @param string senha
	 * @param double saldo
	 * @param objeto
	 * @return objeto
	 */
	public static Conta create(Int agencia = 14, String senha, Double saldo = 0, Pessoa pessoa){
		Conta conta = new Conta(agencia, num(), saldo, senha, pessoa);
		this.arrayConta.add(conta);
		pessoa.getContas().add(conta);
		return conta;
	}

	 /**
	 * Metodo atualiza senha
	 * @param objeto
	 * @param senha
	 */
	public static void update(Conta conta, String senha) {
		conta.setSenha(senha);
	}

	/**
	 * Metodo retorna array de Conta
	 * @return objeto
	 */
	public ArrayList<Conta> getContas(){
		return arrayConta;
	}

	/**
	 * Metodo buscar um objeto no array pelo numero da conta
	 * @param valor
	 * @return objeto
	 */
	public static Conta search(int num){
		Conta conta = null;
		for(int i = 0; i < arrayConta.size(); i++){
			conta = arrayConta.get(i);
			if(conta.getNumero() == num){
				return conta;
			}
		}
		return null;
	}

	/**
	 * Metodo exclui um objeto no array 
	 * @param objeto
	 * @return objeto
	 */
	public static void delete(Conta conta){
		this.arrayConta.remove(conta);
	}


	/**
	 * Metodo sacar um valor
	 * @param valor
	 * @return boolean
	 *
	 */
	public boolean sacar(int valor){
		if (this.Emprestar(valor)) {
			this.setSaldo(this.getSaldo()-valor);
			return true;
		}
		return false;
	}
	
	/**
	 * Metodo deposita um valor
	 * @param valor
	 * @return boolean
	 */
	public boolean depositar(int valor){
		if (valor > 0){
			this.setSaldo(this.getSaldo() + valor);
			return true;
		}
		return false;
	}

	/**
	* Metodo transfere um valor
	 * @param valor
	 * @return boolean
	 */
	public boolean transferir(int valor, Conta DepositarNela){
		if (this.Emprestar(valor)){

			if(DepositarNela.depositar(valor)){
				this.sacar(valor);
				return true;
			}else{
				return false;
			}				
		}else{
			return false;
		}
	}

	/**
	* Metodo empresta um valor
	 * @param valor
	 * @return boolean
	 */
	public boolean Emprestar(int valor){
		if (valor > 0 && this.getSaldo() >= valor) {
			return true;
		}
		return false;
	}
}	