package view;

import java.io.Console;
import java.util.Scanner;

/**
 * A classe EntradaDeDados e responsavel por retornar as leituras especificas
 * para cada dado, utilizando da funcao scanner para realizar as leituras.
 * 
 * @author Adler_Moraes
 * @author Michael Douglas
 * @author Joao Gabriel
 * @author Joao Victor
 *
 */

public class EntradaDeDados {
           
         
        private static Console console = System.console(); 
    
	 private static Scanner scanner = new Scanner(System.in,"UTF-8");
	/**
	 * O metodo lerNome() e responsavel por imprimir a opcao que sera lida, no caso
	 * o nome e retornar a funcao scanner para realizar a leitura.
	 * @return String
	 */
	public static String lerNome() {
		System.out.println();
		System.out.printf("\t\t\t\tNome: ");
		return scanner.nextLine();
	}

	/**
	 * O metodo lerDtNasc() e responsavel por imprimir a opcao que sera lida, no
	 * caso a data de nascimento e retornar a funcao scanner para realizar a
	 * leitura.
	 * @return String
	 */
	public static String lerDtNasc() {
		System.out.println();
		System.out.printf("\t\t\t\tData de Nascimento dia/mes/ano: ");
		return scanner.nextLine();
	}

	/**
	 * O metodo lerSexo() e responsavel por imprimir a opcao que sera lida, no caso
	 * o sexo e retornar a funcao scanner para realizar a leitura.
	 * @return String
	 */
	public static String lerSexo() {
		System.out.println();
		System.out.printf("\t\t\t\tSexo 'm' / 'f': ");
		return scanner.nextLine();
	}

	/**
	 * O metodo lerCpf() e responsavel por imprimir a opcao que sera lida, no caso o
	 * cpf e retornar a funcao scanner para realizar a leitura.
	 * @return String
	 */
	public static String lerCpf() {
		System.out.println();
		System.out.printf("\t\t\t\tCpf do Titular: ");
		return scanner.nextLine();
	}

	/**
	 * O metodo lerSenha() e responsavel por imprimir a opcao que sera lida, no caso
	 * a senha e retornar a funcao scanner para realizar a leitura.
	 * @return String
	 */
	public static String lerSenha() {
		System.out.println();
		System.out.printf("\t\t\t\tSenha de Login: ");
		return new String (console.readPassword());
	}

	/**
	 * O metodo lerAgencia() e responsavel por imprimir a opcao que sera lida, no
	 * caso a agencia e retornar a funcao scanner para realizar a leitura.
	 * @return String
	 */
	public static String lerAgencia() {
		System.out.println();
		System.out.printf("\t\t\t\tAgencia: ");
		return scanner.nextLine();
	}

	/**
	 * O metodo lerNumeroConta() e responsavel por imprimir a opcao que sera lida,
	 * no caso o numero da conta e retornar a funcao scanner para realizar a
	 * leitura.
	 * @return String
	 */
	public static String lerNumeroConta() {
		System.out.println();
		System.out.printf("\t\t\t\tNumero da Conta: ");
		return scanner.nextLine();
	}

	/**
	 * O metodo lerSaldo() e responsavel por imprimir a opcao que sera lida, no caso
	 * o saldo e retornar a funcao scanner para realizar a leitura.
	 * @return String
	 */
	public static String lerSaldo() {
		System.out.println();
		System.out.printf("\t\t\t\tSaldo Inicial: ");
		return scanner.nextLine();
	}

	/**
	 * O metodo lerSenhaConta() e responsavel por imprimir a opcao que sera lida, no
	 * caso a senha da conta e retornar a funcao scanner para realizar a leitura.
	 * @return String
	 */
	public static String lerSenhaConta() {
		System.out.println();
		System.out.printf("\t\t\t\tSenha da Conta: ");
		return scanner.nextLine();
	}

	/**
	 * O metodo lerOpcao() e responsavel por imprimir a opcao que sera lida, no caso
	 * a opcao e retornar a funcao scanner para realizar a leitura.
	 * @return String
	 */
	public static String lerOpcao() {
		System.out.println();
		System.out.printf("\t\t\t\tOpcao: ");
		return scanner.nextLine();
	}

	/**
	 * O metodo lerTelefoneCelular() e responsavel por imprimir a opcao que sera
	 * lida, no caso o numero do celular e retornar a funcao scanner para realizar a
	 * leitura.
	 * @return String
	 */
	public static String lerTelefoneCelular() {
		System.out.println();
		System.out.printf("\t\t\t\tNumero do seu Celular (DD)9xxxx-xxxx: ");
		return scanner.nextLine();
	}

	/**
	 * O metodo lerEmail() e responsavel por imprimir a opcao que sera lida, no caso
	 * o email e retornar a funcao scanner para realizar a leitura.
	 * @return String
	 */
	public static String lerEmail() {
		System.out.println();
		System.out.print("\t\t\t\tE-mail: ");
		return scanner.nextLine();
	}

	/**
	 * O metodo lerValorTransacao() e responsavel por imprimir a opcao que sera
	 * lida, no caso o valor da transacao e retornar a funcao scanner para realizar
	 * a leitura.
	 * @return String
	 */
	public static String lerValorTransacao() {
		System.out.println();
		System.out.print("\t\t\t\tValor: ");
		return scanner.nextLine();
	}

	/**
	 * O metodo lerDescricaoTransacao() e responsavel por imprimir a opcao que sera
	 * lida, no caso a descricao da transacao e retornar a funcao scanner para
	 * realizar a leitura.
	 * @return String
	 */
	public static String lerDescricaoTransacao() {
		System.out.println();
		System.out.print("\t\t\t\tDescricao (Opcional): ");
		return scanner.nextLine();
	}
}
