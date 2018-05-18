package view.comum;

import controller.ContaDAO;
import controller.PessoaDAO;
import controller.SessaoConta;
import view.ClearConsole;
import view.ExecoesDeEntrada;
import view.telasconta.TelaGerenciaConta;
import view.telaspessoa.TelaGerenciaPessoa;

public class TelaGerenciamentoContaPessoa {

	public static void menuOpcoes() {
		int opcao;
		boolean sair = false;

		do {
			try {
				new ClearConsole();
				System.out.println("\t\t\t*******************************************************");
				System.out.println("\t\t\t*\t           CPAN BANCO CENTER                  *");
				System.out.println("\t\t\t*******************************************************");
				System.out.println("\t\t\t\t\n\t\t\t\t");
				System.out.println("\t \t\t\t**************************************");
				System.out.println("\t\t\t\t*                HOME                *");
				System.out.println("\t\t\t\t**************************************");
				System.out.println("\t\t\t\tUsuario: "+ SessaoConta.getPessoa().getNome());
				System.out.println("\t\t\t\t**************************************");
				System.out.println("\t\t\t\t\n\t\t\t\t");
				System.out.println("\t\t\t\t**************************************");
				System.out.println("\t\t\t\t*   1. Gerenciar Conta(s)            *");
				System.out.println("\t\t\t\t**************************************");
				System.out.println("\t\t\t\t*   2. Gerenciar Pessoa              *");
				System.out.println("\t\t\t\t**************************************");
				System.out.println("\t\t\t\t*   0. Sair                          *");
				System.out.println("\t\t\t\t**************************************");
				opcao = ExecoesDeEntrada.trataEntradaOpcao();

				switch (MenuHome.menuOpcao(opcao)) {
				case GERENCIARCONTA:
					ContaDAO.carregarContas();
					TelaGerenciaConta.menuGerenciaContas();
					break;

				case GERENCIARPESSOA:
					TelaGerenciaPessoa.menuGerenciaPessoas();
					break;

				case SAIR:
					ContaDAO.salvarContas();
					PessoaDAO.salvarPessoas();
					sair = true;
					break;
				}
			} catch (Exception e) {
				System.out.println();
				System.out.println("\t\t\t\tOpcao Invalida.");
				System.out.println();
			}
		} while (!sair);
	}
}