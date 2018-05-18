package view.comum;

import controller.Login;
import controller.PessoaDAO;
import controller.SessaoConta;
import model.Pessoa;
import view.ClearConsole;
import view.EntradaDeDados;
import view.ExecoesDeEntrada;

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
			pessoa = Login.validaLogin(ExecoesDeEntrada.trataEntradaCpf(), EntradaDeDados.lerSenha());
			if (pessoa != null) {
				SessaoConta.getInstance(pessoa);
				TelaGerenciamentoContaPessoa.menuOpcoes();
			} else {
				System.out.println();
				System.out.println("\t\t\t\t[Usuario e/ou Senha Incorreto(s)]");
				System.out.println();
				System.out.println("\t\t\t\tDeseja Continuar (1)Sim (2)Nao.");
			}
		} while (ExecoesDeEntrada.trataEntradaOpcao() != 2);
	}
}
