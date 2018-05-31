package view.telasconta;

import controller.ContaDAO;
import controller.Controller;
import model.Conta;
import view.ClearConsole;
import view.TratamentodeEntradas;

public class TelaAtualizaSenhaConta {

	public static void menuAtualizaSenhaConta() {
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
				System.out.println("\t\t\t\t*           Atualiza Senha Conta      *");
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
						conta.toString();

						conta.update(conta, TratamentodeEntradas.trataEntradaSenhaConta());
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
							conta.toString();
							
							conta.update(conta, TratamentodeEntradas.trataEntradaSenhaConta());
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
