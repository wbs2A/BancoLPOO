package view.telaspessoa;

import controller.Controller;
import view.ClearConsole;
import view.EntradaDeDados;
import view.TratamentodeEntradas;

/**
 * Classe responsavel por disponibilizar a tela que ira oferecer as opcaoes de
 * exclusao de conta
 *
 * @author Michael Douglas
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Adler Cavalcante
 */

public class TelaExcluiPessoa {
	/**
	 * Metodo para impressao da tela excluirconta e receber a opcao escolhida pelo
	 * usuario
	 */
	public static void menuExcluirPessoa() {
		int opcao;
		boolean sair = false;

		System.out.println();
		System.out.println("\t\t\t\t          Confirme sua Identidade                ");

		try {
			if (Controller.validaLogin(TratamentodeEntradas.trataEntradaCpf(), EntradaDeDados.lerSenha())) {
				do {
					try {
						new ClearConsole();
						System.out.println();
						System.out.println("\t\t\t*******************************************************");
						System.out.println("\t\t\t*\t           CPAN BANCO CENTER                  *");
						System.out.println("\t\t\t*******************************************************");
						System.out.println("\t\t\t\t\n\t\t\t\t");
						System.out.println("\t \t\t\t**************************************");
						System.out.println("\t\t\t\t*            EXCLUIR CONTA           *");
						System.out.println("\t \t\t\t**************************************");
						System.out.println();
						System.out.println("\t\t\t\t  Deseja realmente excluir sua Conta?  ");
						System.out.println("\t\t\tAo excluir, seus dados serão perdidos permanentemente");
						System.out.println("\t\t\t  Todas as suas Contas Bancarias também serão perdidas");
						System.out.println();
						System.out.println("\t \t\t\t**************************************");
						System.out.println("\t\t\t\t*    (" + MenuExcluirConta.NAO.opcao + ")Não                *");
						System.out.println("\t\t\t\t**************************************");
						System.out.println("\t\t\t\t*    (" + MenuExcluirConta.SIM.opcao + ")Sim                *");
						System.out.println("\t\t\t\t**************************************");
						System.out.println("\t\t\t\t\n\t\t\t\t");
						opcao = TratamentodeEntradas.trataEntradaOpcao();

						switch (MenuExcluirConta.menuConfirma(opcao)) {
						case NAO:
							sair = true;
							break;

						case SIM:
							Controller.removerPessoa(Controller.getSessao());
							//PessoaDAO.salvarPessoas();
							//ContaDAO.salvarContas();
							System.out.println();
							System.out.println("\t\t\t\t[Conta Excluida com sucesso]");
							System.out.println();
							System.exit(0);
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
		} catch (Exception e) {
			System.out.println();
			System.out.println("\t\t\t\t[Usuario e/ou Senha Incorreto(s)]");
			System.out.println();
		}
	}
}