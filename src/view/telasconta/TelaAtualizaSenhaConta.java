package view.telasconta;

import controller.ContaDAO;
import controller.Controller;
import model.Conta;
import view.ClearConsole;
import view.EntradaDeDados;
import view.TratamentodeEntradas;

/**
 * A classe TelaAtualizaSenhaConta e responsavel por disponibilizar o menu que
 * mostra quais acoes devem ser tomadas para atualizar a senha de uma conta
 * padrao ou uma outra conta, utilizando de metodos contidos em outras classes
 * do controller, model e view, para acessar as informacoes necessarias das
 * contas.
 * 
 * @author Adler_Moraes
 * @author Michael Douglas
 * @author Joao Gabriel
 * @author Joao Victor
 *
 */
public class TelaAtualizaSenhaConta {
	/**
	 * O metodo menuAtualizaSenhaConta permite que o usuario escolha se ele deseja
	 * alterar a senha de sua conta padrao, ou de uma outra conta que ele possua,
	 * caso uma conta padrao seja escolhida, suas respectivas informacaoes serao
	 * imprimidas sem a necessidade da inserção de dados adicionais, tendo a senha
	 * atualiza por fim. Já que se a opcao de uma outra conta for escolhida, o
	 * usuario deve informar o numero da conta, e o mesmo processo sera feito. Nos
	 * dois casos havera uma verificacao para ver se uma conta padrao existe ou se o
	 * numero da conta informada bate com alguma pertecente a pessoa, em caso
	 * negativo, uma mensagem de erro sera emitida.
	 */
	public static void menuAtualizaSenhaConta() {
		int opcao;
		boolean sair = false;
		Conta conta;

		do {
			try {
				new ClearConsole();
				System.out.println();
				System.out.println("\t\t\t*******************************************************");
				System.out.println("\t\t\t*\t           CPAN BANCO CENTER                  *");
				System.out.println("\t\t\t*******************************************************");
				System.out.println("\t\t\t\t\n\t\t\t\t");
				System.out.println("\t \t\t\t**************************************");
				System.out.println("\t\t\t\t*     ATUALIZA SENHA CONTA BANCARIA   *");
				System.out.println("\t \t\t\t**************************************");
				System.out.println("\t\t\t\t\n\t\t\t\t");
				System.out.println("\t \t\t\t**************************************");
				System.out.println("\t\t\t\t*   " + MenuAtualizaSenhaConta.ATUALIZARSENHACONTAPADRAO.opcao
						+ ".Atualizar Senha da Conta Padrao    *");
				System.out.println("\t\t\t\t***************************************");
				System.out.println("\t\t\t\t*   " + MenuAtualizaSenhaConta.ATUALIZARSENHAOUTRACONTA.opcao
						+ ".Atualizar Senha de outra Conta    *");
				System.out.println("\t\t\t\t***************************************");
				System.out.println("\t\t\t\t*   " + MenuAtualizaSenhaConta.SAIR.opcao + ".Voltar    *");
				System.out.println("\t\t\t\t***************************************");
				opcao = TratamentodeEntradas.trataEntradaOpcao();

				switch (MenuAtualizaSenhaConta.menuOpcao(opcao)) {
				case ATUALIZARSENHACONTAPADRAO:

					conta = Controller.getSessao().getContaPadrao();
					if (conta != null) {
						System.out.println(conta.toString());
						System.out.println("\t\t\t\tSenha atual: " + conta.getSenha());

						ContaDAO.update(conta, EntradaDeDados.lerSenhaConta());
						System.out.println();
						System.out.println("\t\t\t\t[Senha atualizada com sucesso]");
						System.out.println();
					} else {
						System.out.println();
						System.out.println("\t\t\t\t[Voce nao possui uma conta padrao definida]");
						System.out.println();
					}

					break;

				case ATUALIZARSENHAOUTRACONTA:
					try {
						System.out.println();
						System.out.printf("\t\t\t\tInforme o numero da conta que deseja alterar a senha: ");
						System.out.println();
						conta = ContaDAO.read(TratamentodeEntradas.trataEntradaNumeroConta());
						if (conta != null) {
							System.out.println(conta.toString());
							System.out.println("\t\t\t\tSenha atual: " + conta.getSenha());

							ContaDAO.update(conta, EntradaDeDados.lerSenhaConta());
							System.out.println();
							System.out.println("\t\t\t\t[Senha atualizada com sucesso]");
							System.out.println();
						}
					} catch (Exception ex) {
						System.out.println();
						System.out.println("\t\t\t\t[Conta nao Encontrada]");
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
