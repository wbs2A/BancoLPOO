package view.telasconta;

import java.util.Date;

import controller.ContaDAO;
import controller.Controller;
import model.Conta;
import view.ClearConsole;
import view.EntradaDeDados;
import view.TratamentodeEntradas;

/**
 * A classe TelaTransacaoSaque e responsavel por disponibilizar o menu que
 * especifica quais acoes sao possiveis para um saque, utilizando de metodos
 * contidos em outras classes do controller, model e view, para acessar as
 * informacoes necessarias das contas.
 * 
 * @author Adler Cavalcante
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Michael Douglas
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
				System.out.println("\t\t\t\t*                SAQUE               *");
				System.out.println("\t \t\t\t**************************************");
				System.out.println("\t\t\t\t\n\t\t\t\t");
				System.out.println("\t\t\t\t***************************************");
				System.out.println(
						"\t\t\t\t*   " + MenuSaque.SACARCONTAPADRAO.opcao + ".Sacar da Conta Padrao           *");
				System.out.println("\t\t\t\t***************************************");
				System.out.println(
						"\t\t\t\t*   " + MenuSaque.SACAROUTRACONTA.opcao + ".Sacar de Outra Conta            *");
				System.out.println("\t\t\t\t***************************************");
				System.out.println("\t\t\t\t*   " + MenuSaque.SAIR.opcao + ".Voltar                          *");
				System.out.println("\t\t\t\t***************************************");
				opcao = TratamentodeEntradas.trataEntradaOpcao();

				switch (MenuSaque.menuOpcao(opcao)) {
				case SACARCONTAPADRAO:
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
							System.out.println();
							System.out.println("\t\t\t\t        Confirme a Senha da Conta            ");
							System.out.println();
							if (EntradaDeDados.lerSenhaConta().equals(conta.getSenha())) {
								try {
									Controller.mov_saque_deposito(new Date(), conta, null, valor, 1);
									System.out.println();
									System.out.println("\t\t\t\t[Saque realizado com sucesso]");
									System.out.println();
									ContaDAO.salvarContas();
								} catch (Exception e) {
									System.out.println();
									System.out.println("\t\t\t\t[Saldo insuficiente para saque]");
									System.out.println();
								}
							} else {
								System.out.println();
								System.out.println("\t\t\t\t[Senha invalida]");
								System.out.println();
							}
						} else {
							System.out.println();
							System.out.println("\t\t\t\t[Valor invalido para saque]");
							System.out.println();
						}
					} else {
						System.out.println();
						System.out.println("\t\t\t\t[Voce nao possui uma conta padrao definida]");
						System.out.println();
					}
					break;

				case SACAROUTRACONTA:
					try {
						System.out.println();
						System.out.println("\t\t\t\tInforme o numero e a senha da conta para saque: ");
						System.out.println();
						conta = ContaDAO.read(TratamentodeEntradas.trataEntradaNumeroConta(),
								EntradaDeDados.lerSenhaConta());
						if (conta != null) {
							if (conta.getPessoa().getCpf().equals(Controller.getSessao().getCpf())) {
								valor = TratamentodeEntradas.trataValorTransacao();
								if (valor > 0) {
									try {
										Controller.mov_saque_deposito(new Date(), conta, null, valor, 1);
										System.out.println();
										System.out.println("\t\t\t\t[Saque realizado com sucesso]");
										System.out.println();
										ContaDAO.salvarContas();
									} catch (Exception e) {
										System.out.println();
										System.out.println("\t\t\t\t[Saldo insuficiente para saque]");
										System.out.println();
									}
								} else {
									System.out.println();
									System.out.println("\t\t\t\t[Valor invalido para saque]");
									System.out.println();
								}
							} else {
								System.out.println();
								System.out.println("\t\t\t\t[Conta nao encontrada]");
								System.out.println();
							}

						}
					} catch (Exception ex) {
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
