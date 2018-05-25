package view.telasconta;

import controller.ContaDAO;
import model.Conta;
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
		// System.out.println();
		// System.out.println("\t\t\t\t Confirme sua Identidade ");
		// System.out.println();
		// pessoa = Login.validaLogin(ExecoesDeEntrada.trataEntradaCpf(),
		// EntradaDeDados.lerSenha());

		// if(pessoa != null) {
		conta = ContaDAO.consultaConta(TratamentodeEntradas.trataEntradaNumeroConta(),
				TratamentodeEntradas.trataEntradaSenhaConta());
		if (conta != null) {
			System.out.println();
			System.out.println(conta.getMovimentacoes());
			System.out.println();
		} else {
			System.out.println();
			System.out.println("\t\t\t\t[Conta nao encontrada]");
			System.out.println();
		}
		// }else {
		// System.out.println();
		// System.out.println("\t\t\t\t[Usuario e/ou senha incorreto(s)]");
		// System.out.println();
		// }

	}
}
