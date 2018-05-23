package view.comum;

import controller.Controller;
import controller.PessoaDAO;
import model.Pessoa;
import view.ClearConsole;
import view.EntradaDeDados;
import view.TratamentodeEntradas;

public class TelaLogin {
	static Pessoa pessoa;

	public static void menuLogin() {
		PessoaDAO.carregarPessoas();

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
			pessoa = Controller.validaLogin(TratamentodeEntradas.trataEntradaCpf(), EntradaDeDados.lerSenha());
			if (pessoa != null) {
				Controller.getInstance(pessoa);
				TelaGerenciamentoContaPessoa.menuOpcoes();
			} else {
				System.out.println();
				System.out.println("\t\t\t\t[Usuario e/ou Senha Incorreto(s)]");
				System.out.println();
				System.out.println("\t\t\t\tDeseja Continuar (1)Sim (2)Nao.");
			}
		} while (TratamentodeEntradas.trataEntradaOpcao() != 2);
	}
}
