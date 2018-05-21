package view.comum;

import view.TratamentodeEntradas;
import view.telaspessoa.TelaCadastraPessoa;

public class TelaInicial {
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
						"\t\t\t\t*             (" + MenuInicial.FAZERCADASTRO.opcao + ")CADASTRE-SE           *");
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

				case SAIR:
					sair = true;
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
