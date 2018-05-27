package view.comum;

import java.io.IOException;

import controller.Controller;
import exceptions.SenhaIncorreta;
import model.Pessoa;
import view.ClearConsole;
import view.EntradaDeDados;
import view.TratamentodeEntradas;

/**
 * A classe TelaLogin e responsavel por disponibilizar a tela onde o usuario ira
 * logar no sistema.
 * 
 * @author michael_douglas
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
	public static void menuLogin() throws SenhaIncorreta {

		do {
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
			try {
				valido = Controller.validaLogin(TratamentodeEntradas.trataEntradaCpf(), EntradaDeDados.lerSenha());
				if (valido) {
					TelaGerenciamentoContaPessoa.menuOpcoes();
				}
			} catch (IOException ex) {
				System.out.println();
				System.out.println("\t\t\t\t[Usuario e/ou Senha Incorreto(s)]");
				System.out.println();
				System.out.println("\t\t\t\tDeseja Continuar (1)Sim (2)Nao.");
			}
		} while (TratamentodeEntradas.trataEntradaOpcao() != 2);
	}
}