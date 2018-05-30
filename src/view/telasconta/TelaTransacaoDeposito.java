package view.telasconta;

import controller.ContaDAO;
import controller.Controller;
import model.Conta;
import view.ClearConsole;
import view.TratamentodeEntradas;

/**
 * A classe TelaTransacaoDeposito e responsavel por disponibilizar o menu que
 * especifica quais acoes sao possiveis para um deposito, utilizando de metodos
 * contidos em outras classes do controller, model e view, para acessar as
 * informacoes necessarias das contas.
 * 
 * @author Adler_Moraes
 *
 */

public class TelaTransacaoDeposito {
	/**
	 * O metodo menuDepoisoto permite a escolha de qual tipo de deposito sera
	 * realizado, na sua conta padrao ou em outra conta sua, tambem disponibiliza
	 * uma opcao para sair do menu de deposito. Caso a opcao de outra conta seja
	 * selecionada, o usuario deve informar qual a conta recebera o deposito, caso
	 * seja uma conta existente e esteja associada ao usuario correspondente, o
	 * deposito sera realizado, caso contrario, uma mensagem de conta nao encontrada
	 * sera emitida. Em relacao ao menu de escolha, se uma opcao invalida for
	 * inserida, ou seja, que nao for uma das disponibilizadas, uma mensagem de erro
	 * sera emitida.
	 */

	public static void menuDeposito() {
		int opcao;
		boolean sair = false;
		Conta conta;
		float valor;

		do {
			try {
				new ClearConsole();
				System.out.println();
				System.out.println("\t\t\t*******************************************************");
				System.out.println("\t\t\t*\t           CPAN BANCO CENTER                  *");
				System.out.println("\t\t\t*******************************************************");
				System.out.println("\t\t\t\t\n\t\t\t\t");
				System.out.println("\t \t\t\t**************************************");
				System.out.println("\t\t\t\t*             DEPOSITO                *");
				System.out.println("\t \t\t\t**************************************");
				System.out.println("\t\t\t\t\n\t\t\t\t");
				System.out.println("\t \t\t\t**************************************");
				System.out.println(
						"\t\t\t\t*   " + MenuDeposito.DEPOSITARCONTAPADRAO.opcao + ".Depositar na Conta Padrao    *");
				System.out.println("\t\t\t\t***************************************");
				System.out.println(
						"\t\t\t\t*   " + MenuDeposito.DEPOSITAROUTRACONTA.opcao + ".Depositar em outra Conta    *");
				System.out.println("\t\t\t\t***************************************");
				System.out.println("\t\t\t\t*   " + MenuDeposito.SAIR.opcao + ".Voltar    *");
				System.out.println("\t\t\t\t***************************************");
				opcao = TratamentodeEntradas.trataEntradaOpcao();

				switch (MenuDeposito.menuOpcao(opcao)) {
				case DEPOSITARCONTAPADRAO:
					conta = Controller.getSessao().getContaPadrao();
					if (conta != null) {
						valor = TratamentodeEntradas.trataEntradaSaldoConta();
						ContaDAO.depositar(conta, valor);
					}
					break;

				case DEPOSITAROUTRACONTA:
					System.out.println();
					System.out.printf("\t\t\t\tInforme o numero da conta para deposito: ");
					System.out.println();
					conta = ContaDAO.read(TratamentodeEntradas.trataEntradaNumeroConta());

					if (conta != null) {
						valor = TratamentodeEntradas.trataEntradaSaldoConta();
						ContaDAO.depositar(conta, valor);
					} else {
						System.out.println();
					}

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
