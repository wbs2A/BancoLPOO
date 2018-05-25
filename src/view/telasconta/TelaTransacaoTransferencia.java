package view.telasconta;

import java.util.Date;

import controller.Banco;
import controller.ContaDAO;
import controller.Transacao;
import model.Conta;
import view.ClearConsole;
import view.TratamentodeEntradas;

/**
 * A classe TelaTransacaoTransferencia e responsavel por disponibilizar o menu
 * que especifica quais acoes sao possiveis para uma transferencia, utilizando
 * de metodos contidos em outras classes do controller, model e view, para
 * acessar as informacoes necessarias das contas.
 * 
 * @author Adler_Moraes
 *
 */

public class TelaTransacaoTransferencia {
	/**
	 * O metodo menuTransferencia permite a escolha de qual tipo de transferencia
	 * sera realizada, da sua conta padrao ou em outra conta sua, tambem
	 * disponibiliza uma opcao para sair do menu de transferencia. Caso a opcao de
	 * outra conta seja selecionada, o usuario deve informar qual a conta que ira
	 * utilizar na transferencia, caso seja uma conta existente e esteja associada
	 * ao usuario correspondente, a transferencia sera realizada, caso contrario,
	 * uma mensagem de conta nao encontrada sera emitida. Em relacao ao menu de
	 * escolha, se uma opcao invalida for inserida, ou seja, que nao for uma das
	 * disponibilizadas, uma mensagem de erro sera emitida.
	 */

	public static void menuTransferencia() {
		int opcao;
		boolean sair = false;
		Conta contaRemetente;
		Conta contaDestino;
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
				System.out.println("\t\t\t\t*            TRANSFERENCIA            *");
				System.out.println("\t \t\t\t**************************************");
				System.out.println("\t\t\t\t\n\t\t\t\t");
				System.out.println("\t \t\t\t****************************************");
				System.out.println("\t\t\t\t*   " + MenuTransferencia.TRANSFERIRDACONTAPADRAO.opcao
						+ ".Transferir da Conta Padrao             *");
				System.out.println("\t\t\t\t**************************************");
				System.out.println("\t\t\t\t*   " + MenuTransferencia.TRANSFERIRDEOUTRACONTA.opcao
						+ ".Transferir de Outra Conta             *");
				System.out.println("\t\t\t\t**************************************");
				System.out.println("\t\t\t\t*   " + MenuTransferencia.SAIR.opcao + ".Voltar             *");
				System.out.println("\t\t\t\t**************************************");
				opcao = TratamentodeEntradas.trataEntradaOpcao();

				switch (MenuTransferencia.menuOpcao(opcao)) {
				case TRANSFERIRDACONTAPADRAO:
					break;

				case TRANSFERIRDEOUTRACONTA:
					System.out.println();
					System.out.printf("\t\t\t\tInforme o numero da conta destino: ");
					System.out.println();
					contaDestino = ContaDAO.consultaConta(TratamentodeEntradas.trataEntradaNumeroConta());

					if (contaDestino != null) {
						System.out.println();
						System.out.println("\t\t\t\tInforme a conta remetente");
						System.out.println();
						contaRemetente = ContaDAO.consultaConta(TratamentodeEntradas.trataEntradaNumeroConta(),
								TratamentodeEntradas.trataEntradaSenhaConta());

						if (contaRemetente != null) {
							if (contaRemetente == contaDestino) {
								System.out.println();
								System.out
										.println("\t\t\t\t[Não é possivel fazer transferencias entre contas iguais]");
								System.out.println();
							} else {
								valor = TratamentodeEntradas.trataEntradaSaldoConta();
								Transacao.realizarTransacaoTrans(new Date(), contaRemetente, contaDestino,
										"Transferencia", valor, Banco.TRANSFERIR);
								// Banco.transferencia(contaRemetente, contaDestino, valor);
								// System.out.println();
								// System.out.println("\t\t\t\t[Transferencia realizada com sucesso]");
								System.out.println();
							}
						} else {
							System.out.println();
							System.out.println("\t\t\t\t[Conta remetente não encontrada]");
							System.out.println();
						}
					} else {
						System.out.println();
						System.out.println("\t\t\t\t[Conta destino não encontrada]");
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
