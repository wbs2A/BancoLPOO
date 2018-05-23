import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author Controller
 */

public class contaDAO{
 
	private ArrayList<Conta> arrayConta  = new ArrayList<Conta>();
	Scanner ler = new Scanner(System.in);
	private static int qntContas = 0;

	 /**
	 * Metodo le int numero da conta
	 * @return int
	 */
	public static int lerN_Conta(){
		System.out.print("\nInsira o numero da conta: ");
		return scan.nextInt();
	}

	 /**
	 * Metodo le int numero da agencia da conta
	 * @return int
	 */
	public static int lerAgencia(){
		System.out.print("\nInsira o numero da agencia : ");
		return scan.nextInt();
	}

	/**
	* Metodo le double saldo da conta
	 * @return double
	 */
	public static double lerSaldo(){
		System.out.print("\nInsira o saldo da conta: ");
		return scan.nextDouble();
	}
	
	 /**
	 * Metodo instancia objeto do tipo conta (cria)
	 * @param objeto
	 * @return objeto
	 */

	public static Conta criarConta(Pessoa pessoa, Conta conta){
			
		Conta conta = new Conta(lerN_Conta(), lerAgencia(), lerSaldo(), pessoa);
		
		this.arrayConta.add(conta);
		contaDAO.qntContas++;           
		return conta;
	}

	/**
	 * Metodo adiciona um objeto ja instanciado
	 * @param objeto
	 * @return objeto
	 */
	public Conta addConta(Conta conta){
		this.arrayConta.add(conta);
		return conta;
	}

	 /**
	 * Metodo altera um objeto do tipo conta
	 * @param objeto
	 * @return objeto
	 */
	public Conta setConta(Conta conta) {
		this.arrayConta.merge(conta);
		return conta;
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
	public Conta buscarConta(int num){
		Conta p = null;
		for(int i = 0; i < arrayConta.size(); i++){
			p = arrayConta.get(i);
			if(p.getNumero() == num){
				return p;
			}
		}
		return null;
	}

	/**
	 * Metodo exclui um objeto no array 
	 * @param objeto
	 * @return objeto
	 */
	public void excluirConta(Conta conta){
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