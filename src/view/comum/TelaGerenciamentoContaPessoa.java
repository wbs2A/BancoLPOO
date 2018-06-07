package view.comum;

import controller.Controller;
import view.TratamentodeEntradas;
import view.telasconta.TelaGerenciaConta;
import view.telaspessoa.TelaGerenciaPessoa;

/**
 * A classe TelaGerenciamentoContaPessoa e responsavel por disponibilizar a
 * visualizacao do menu relacionado as opcoes de gerenciamneto de pessoa e
 * conta.
 * 
 * @author Adler Cavalcante
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Michael Douglas
 *
 */
public class TelaGerenciamentoContaPessoa {

	/**
	 * Metodo menuOpcoes e responsavel por mostrar as opcoes na qual o usuario
	 * deseja escolher. Estas podem ser para gerenciar a conta, pessoa ou sair do
	 * sistema.
	 */
	public static void menuOpcoes() {
		int opcao;
		boolean sair = false;

		do {
			try {
				System.out.println("\t\t\t*******************************************************");
				System.out.println("\t\t\t*\t           CPAN BANCO CENTER                  *");
				System.out.println("\t\t\t*******************************************************");
				System.out.println("\t\t\t\t\n\t\t\t\t");
				System.out.println("\t \t\t\t**************************************");
				System.out.println("\t\t\t\t*                HOME                *");
				System.out.println("\t\t\t\t**************************************");
				System.out.println("\t\t\t\tUsuario: " + Controller.getSessao().getNome());
				System.out.println("\t\t\t\t**************************************");
				System.out.println("\t\t\t\t\n\t\t\t\t");
				System.out.println("\t\t\t\t**************************************");
				System.out
						.println("\t\t\t\t*" + MenuHome.GERENCIARCONTA.opcao + ". Gerenciar Conta(s)               *");
				System.out.println("\t\t\t\t**************************************");
				System.out
						.println("\t\t\t\t*" + MenuHome.GERENCIARPESSOA.opcao + ". Gerenciar Pessoa                 *");
				System.out.println("\t\t\t\t**************************************");
				System.out.println("\t\t\t\t*" + MenuHome.SAIR.opcao + ". Sair                             *");
				System.out.println("\t\t\t\t**************************************");
				opcao = TratamentodeEntradas.trataEntradaOpcao();

				switch (MenuHome.menuOpcao(opcao)) {
				case GERENCIARCONTA:
					// ContaDAO.carregarContas();
					TelaGerenciaConta.menuGerenciaContas();
					break;

				case GERENCIARPESSOA:
					TelaGerenciaPessoa.menuGerenciaPessoas();
					break;

				case SAIR:
					// ContaDAO.salvarContas();
					// PessoaDAO.salvarPessoas();
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