package view.telasconta;

import java.util.Date;

import controller.Banco;
import controller.ContaDAO;
import controller.Transacao;
import model.Conta;
import view.ClearConsole;
import view.TratamentodeEntradas;

/**
 * A classe TelaTransacaoSaque e responsavel por disponibilizar o menu que
 * especifica quais acoes sao possiveis para um saque, utilizando de metodos
 * contidos em outras classes do controller, model e view, para acessar as
 * informacoes necessarias das contas.
 * 
 * @author Adler_Moraes
 *
 */

public class TelaTransacaoSaque {
	/**
	 * O metodo menuSaque permite a escolha de qual tipo de saque sera realizado, na
	 * sua conta padrao ou em outra conta sua, tambem disponibiliza uma opcao para
	 * sair do menu de saque. Caso a opcao de outra conta seja selecionada, o
	 * usuario deve informar em qual conta ele ira sacar, caso seja uma conta
	 * existente e esteja associada ao usuario correspondente, o saque sera
	 * realizado, caso contrario, uma mensagem de conta nao encontrada sera emitida.
	 * Em relacao ao menu de escolha, se uma opcao invalida for inserida, ou seja,
	 * que nao for uma das disponibilizadas, uma mensagem de erro sera emitida.
	 */

	public static void menuSaque() {
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
				System.out.println("\t\t\t\t*                SAQUE                *");
				System.out.println("\t \t\t\t**************************************");
				System.out.println("\t\t\t\t\n\t\t\t\t");
				System.out.println("\t \t\t\t**************************************");
				System.out.println("\t\t\t\t*   " + MenuSaque.SACARCONTAPADRAO.opcao + ".Sacar da Conta Padrao    *");
				System.out.println("\t\t\t\t***************************************");
				System.out.println("\t\t\t\t*   " + MenuSaque.SACAROUTRACONTA.opcao + ".Sacar de Outra Conta    *");
				System.out.println("\t\t\t\t***************************************");
				System.out.println("\t\t\t\t*   " + MenuSaque.SAIR.opcao + ".Voltar    *");
				System.out.println("\t\t\t\t***************************************");
				opcao = TratamentodeEntradas.trataEntradaOpcao();

				switch (MenuSaque.menuOpcao(opcao)) {
				case SACARCONTAPADRAO:
					break;

				case SACAROUTRACONTA:
					System.out.println();
					System.out.println("\t\t\t\tInforme o numero da conta para saque: ");
					System.out.println();
					conta = ContaDAO.consultaConta(TratamentodeEntradas.trataEntradaNumeroConta(),
							TratamentodeEntradas.trataEntradaSenhaConta());

					if (conta != null) {
						valor = TratamentodeEntradas.trataEntradaSaldoConta();
						Transacao.realizarTransacao(new Date(), conta, "Saque de Conta", valor, Banco.SACAR);
						// Banco.saque(conta, valor);
						// System.out.println();
						// System.out.println("\t\t\t\t[Saque realizado com sucesso]");
						System.out.println();
					} else {
						System.out.println();
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
