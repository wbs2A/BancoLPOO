package view.telasconta;

import java.util.Date;

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
 * @author Adler Cavalcante
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Michael Douglas
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
				System.out.println("\t\t\t\t*             DEPOSITO               *");
				System.out.println("\t \t\t\t**************************************");
				System.out.println("\t\t\t\t\n\t\t\t\t");
				System.out.println("\t\t\t\t***************************************");
				System.out.println("\t\t\t\t*   " + MenuDeposito.DEPOSITARCONTAPADRAO.opcao
						+ ".Depositar na Conta Padrao       *");
				System.out.println("\t\t\t\t***************************************");
				System.out.println(
						"\t\t\t\t*   " + MenuDeposito.DEPOSITAROUTRACONTA.opcao + ".Depositar em outra Conta        *");
				System.out.println("\t\t\t\t***************************************");
				System.out.println("\t\t\t\t*   " + MenuDeposito.SAIR.opcao + ".Voltar                          *");
				System.out.println("\t\t\t\t***************************************");
				opcao = TratamentodeEntradas.trataEntradaOpcao();

				switch (MenuDeposito.menuOpcao(opcao)) {
				case DEPOSITARCONTAPADRAO:
					conta = Controller.getSessao().getContaPadrao();
					if (conta != null) {
						System.out.println();
						System.out.println();
						System.out.println("\t\t\t\tConta padrao definida: ");
						System.out.println(conta);
						System.out.println();
						System.out.println();
						valor = TratamentodeEntradas.trataValorTransacao();
						if (valor > 0) {
							try {
								Controller.mov_saque_deposito(new Date(), conta, null, valor, 2);
								System.out.println();
								System.out.println("\t\t\t\t[Deposito realizado com sucesso]");
								System.out.println();
								ContaDAO.salvarContas();
							} catch (Exception e) {

							}
						} else {
							System.out.println();
							System.out.println("\t\t\t\t[Valor invalido para deposito]");
							System.out.println();
						}
					} else {
						System.out.println();
						System.out.println("\t\t\t\t[Voce nao possui uma conta padrao definida]");
						System.out.println();
					}
					break;

				case DEPOSITAROUTRACONTA:
					try {
						System.out.println();
						System.out.printf("\t\t\t\tInforme o numero da conta para deposito: ");
						System.out.println();
						conta = ContaDAO.read(TratamentodeEntradas.trataEntradaNumeroConta());
						if (conta != null) {
							valor = TratamentodeEntradas.trataValorTransacao();
							if (valor > 0) {
								try {
									Controller.mov_saque_deposito(new Date(), conta, null, valor, 2);
									System.out.println();
									System.out.println("\t\t\t\t[Deposito realizado com sucesso]");
									System.out.println();
									ContaDAO.salvarContas();
								} catch (Exception e) {

								}
							} else {
								System.out.println();
								System.out.println("\t\t\t\t[Valor invalido para deposito]");
								System.out.println();
							}
						}
					} catch (Exception ex) {
						System.out.println(ex);
						System.out.println("\t\t\t\t[Conta não Encontrada]");
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
