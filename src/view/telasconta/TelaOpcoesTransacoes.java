package view.telasconta;

import view.ClearConsole;
import view.TratamentodeEntradas;

/**
 * A classe TelaOpcoesTrasacoes e responsavel por disponibilizar um menu de
 * visualizacao das acoes possiveis de manipulacao de uma conta que um usuario
 * pode acessar, utilizando de metodos de outras views para o tratamento de
 * entradas e a limpeza da tela.
 * 
 * @author Adler Cavalcante
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Michael Douglas
 *
 */

public class TelaOpcoesTransacoes {
	/**
	 * O metodo menuTrasacoes funciona como uma tela de opcoes que uma conta pode
	 * realizar, as seguintes opcoes estao disponiveis: realizar saque, realizar
	 * deposito, realizar uma transferencia ou sair do menu de transacoes. Caso uma
	 * opcao invalida seja utilizada, uma mensagem de erro sera emitida.
	 */

	public static void menuTransacoes() {
		int opcao;
		boolean sair = false;

		do {
			try {
				new ClearConsole();
				System.out.println();
				System.out.println("\t\t\t*******************************************************");
				System.out.println("\t\t\t*\t           CPAN BANCO CENTER                  *");
				System.out.println("\t\t\t*******************************************************");
				System.out.println("\t\t\t\t\n\t\t\t\t");
				System.out.println("\t \t\t\t**************************************");
				System.out.println("\t\t\t\t*             TRANSAÇÕES             *");
				System.out.println("\t \t\t\t**************************************");
				System.out.println("\t\t\t\t\n\t\t\t\t");
				System.out.println("\t\t\t\t**************************************");
				System.out.println(
						"\t\t\t\t*   " + MenuTransacoes.REALIZARSAQUE.opcao + ".Realizar Saque                 *");
				System.out.println("\t\t\t\t**************************************");
				System.out.println(
						"\t\t\t\t*   " + MenuTransacoes.REALIZARDEPOSITO.opcao + ".Realizar Deposito              *");
				System.out.println("\t\t\t\t**************************************");
				System.out.println("\t\t\t\t*   " + MenuTransacoes.REALIZARTRANSFERENCIA.opcao
						+ ".Realizar Transferencia         *");
				System.out.println("\t\t\t\t**************************************");
				System.out.println("\t\t\t\t*   " + MenuTransacoes.SAIR.opcao + ".Voltar                         *");
				System.out.println("\t\t\t\t**************************************");
				opcao = TratamentodeEntradas.trataEntradaOpcao();

				switch (MenuTransacoes.menuOpcao(opcao)) {
				case REALIZARSAQUE:
					TelaTransacaoSaque.menuSaque();
					break;

				case REALIZARDEPOSITO:
					TelaTransacaoDeposito.menuDeposito();
					break;

				case REALIZARTRANSFERENCIA:
					TelaTransacaoTransferencia.menuTransferencia();
					break;

				case SAIR:
					sair = true;
					break;
				}
			} catch (Exception e) {
				System.out.println();
				System.out.println("\t\t\t\tOpcao Invalida!");
				System.out.println();
			}
		} while (!sair);
	}
}
