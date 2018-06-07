package view.comum;

import view.comum.TelaAjudaInicial;
import view.TratamentodeEntradas;
import view.telaspessoa.TelaCadastraPessoa;

/**
 * A classe TelaInicial e responsavel por disponibilizar a visualizacao do menu
 * relacionado as opcoes na qual o usuario pode fazer antes de entrar no sistema.
 * 
 * @author Adler Cavalcante
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Michael Douglas
 *
 */
public class TelaInicial {

	/**
	 * Metodo telaInicial() e responsavel por mostrar as opcoes na qual o usuario
	 * deseja escolher. Estas podem ser para logar no sistema, fazer o cadastro de
	 * conta de usuario, ajuda ou sair.
	 */
	public static void telaInicial() {
		int opcao;
		boolean sair = false;

		do {
			try {
				System.out.println();
				System.out.println("\t\t\t*******************************************************");
				System.out.println("\t\t\t*\t           CPAN BANCO CENTER                  *");
				System.out.println("\t\t\t*******************************************************");
				System.out.println("\t\t\t\t\n\t\t\t\t");
				System.out.println("\t\t\t\t****************************************");
				System.out
						.println("\t\t\t\t*               (" + MenuInicial.FAZERLOGIN.opcao + ")LOGIN               *");
				System.out.println("\t\t\t\t****************************************");
				System.out.println(
						"\t\t\t\t*            (" + MenuInicial.FAZERCADASTRO.opcao + ")CADASTRE-SE            *");
				System.out.println("\t\t\t\t****************************************");
				System.out.println("\t\t\t\t*                (" + MenuInicial.AJUDA.opcao + ")AJUDA              *");
				System.out.println("\t\t\t\t****************************************");
				System.out.println("\t\t\t\t*                (" + MenuInicial.SAIR.opcao + ")SAIR               *");
				System.out.println("\t\t\t\t****************************************");
				System.out.println("\t\t\t\t ");
				opcao = TratamentodeEntradas.trataEntradaOpcao();

				switch (MenuInicial.menuOpcao(opcao)) {
				case FAZERLOGIN:
					TelaLogin.menuLogin();
					break;

				case FAZERCADASTRO:
					TelaCadastraPessoa.formularioCadastroPessoa();
					break;
				case AJUDA:
					TelaAjudaInicial.AjudaInicial();
					break;
				case SAIR:
					sair = true;
					System.exit(0);
					break;
				}
			} catch (Exception e) {
				System.out.println();
				System.out.println("\t\t\t\tOpcao Invalida");
				System.out.println();
			}
		} while (!sair);
	}
}
