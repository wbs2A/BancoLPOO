package view.comum;

import controller.Controller;
import model.Pessoa;
import view.ClearConsole;
import view.EntradaDeDados;
import view.TratamentodeEntradas;

/**
 * A classe TelaLogin e responsavel por disponibilizar a tela onde o usuario ira
 * logar no sistema.
 * 
 * @author Adler Cavalcante
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Michael Douglas
 *
 */
public class TelaLogin {
	static Pessoa pessoa;
	static boolean valido;

	/**
	 * O Metodo menuLogin() e responsavel por mostrar a tela onde o usuario ira
	 * logar no sistema. Para logar, sera necessario que ele forneca seu cpf e a
	 * senha de usuario.
	 */
	public static void menuLogin() {
		try {
			ClearConsole.clearConsole();
			System.out.println();
			System.out.println("\t\t\t*******************************************************");
			System.out.println("\t\t\t*\t           CPAN BANCO CENTER                  *");
			System.out.println("\t\t\t*******************************************************");
			System.out.println("\t\t\t\t\n\t\t\t\t");
			System.out.println("\t\t\t\t****************************************");
			System.out.println("\t\t\t\t*                 LOGIN                *");
			System.out.println("\t\t\t\t****************************************");
			System.out.println("\t\t\t\t\n\t\t\t\t");

			valido = Controller.validaLogin(TratamentodeEntradas.trataEntradaCpf(), EntradaDeDados.lerSenha());
			if (valido) {
				TelaGerenciamentoContaPessoa.menuOpcoes();
			}
		} catch (Exception e) {
			System.out.println();
			System.out.println("\t\t\t\t[Usuario e/ou Senha Incorreto(s)]");
			System.out.println();
		}

	}

}