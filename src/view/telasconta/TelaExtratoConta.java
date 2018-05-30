package view.telasconta;

import controller.ContaDAO;
import exceptions.ContaInexistente;
import exceptions.SenhaIncorreta;
import model.Conta;
import view.EntradaDeDados;
import view.TratamentodeEntradas;

/**
 * A classe TelaExtratoConta e responsavel por disponibilizar a visualizacao das
 * informacoes referentes ao extrato de uma determinada conta, utilizando de
 * seus metodos para acessar tais informacoes provenientes de outras classes
 * contidas no Controller, Model e utilizar metodos de outra view para tratar as
 * entradas.
 * 
 * @author Adler_Moraes
 *
 */
public class TelaExtratoConta {
	/**
	 * O metodo extratoConta ira mostrar para o usuario o extrato de uma determinada
	 * conta, ja que ele pode ter mais de uma dentro do banco. Caso nenhuma conta
	 * seja identificada como sendo do usuario ou se alguma informacao da
	 * verificacao estiver errada, uma mensagem de Conta nao encontrada ou Usuario
	 * e/ou senha incorretos sera emitida.
	 * 
	 * @throws ContaInexistente
	 */
	public static void extratoConta() {
		Conta conta;
		System.out.println();
		System.out.println("\t\t\t*******************************************************");
		System.out.println("\t\t\t*\t           CPAN BANCO CENTER                  *");
		System.out.println("\t\t\t*******************************************************");
		System.out.println("\t\t\t\t\n\t\t\t\t");
		System.out.println("\t\t\t\t****************************************");
		System.out.println("\t\t\t\t*   EXTRATO DE CONTA(S) BANCARIA(S)    *");
		System.out.println("\t\t\t\t****************************************");
		System.out.println("\t\t\t\t ");

		try {
			conta = ContaDAO.read(TratamentodeEntradas.trataEntradaNumeroConta(), EntradaDeDados.lerSenhaConta());
			if (conta != null) {
				System.out.println();
				System.out.println(conta.getMovimentacoes());
				System.out.println();
			}
		} catch (ContaInexistente | SenhaIncorreta ex) {
			System.out.println();
			System.out.println("\t\t\t\t[Conta nao encontrada]");
			System.out.println();
		}

	}
}