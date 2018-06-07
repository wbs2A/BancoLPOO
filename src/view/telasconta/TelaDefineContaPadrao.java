package view.telasconta;

import controller.ContaDAO;
import controller.Controller;
import controller.PessoaDAO;
import model.Conta;
import view.ClearConsole;
import view.EntradaDeDados;
import view.TratamentodeEntradas;

/**
 * A Classe TelaDefineConta e responsavel por mostrar a tela onde o usuario
 * podera definir uma conta bancaria padrao.
 * 
 * @author Adler Cavalcante
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Michael Douglas
 *
 */
public class TelaDefineContaPadrao {

	/**
	 * Este metodo e resposanvel por mostrar o menu onde o usuario confirma se
	 * deseja definir ou nao uma conta bancaria padrao. Alem disso e mostrado a ele
	 * uma mensagem com detalhes sobre os beneficios de dinir uma conta bancaria
	 * padrao.
	 */
	public static void menuDefineContaPadrao() {
		int opcao;
		boolean sair = false;
		Conta conta;
		do {
			try {
				new ClearConsole();
				System.out.println();
				System.out.println("\t\t\t*******************************************************");
				System.out.println("\t\t\t*\t           CPAN BANCO CENTER                  *");
				System.out.println("\t\t\t*******************************************************");
				System.out.println("\t\t\t\t\n\t\t\t\t");
				System.out.println("\t \t\t\t**************************************");
				System.out.println("\t\t\t\t*    DEFINIR CONTA BANCARIA PADRAO   *");
				System.out.println("\t \t\t\t**************************************");
				System.out.println("\t\t\t  Deseja realmente adicionar uma conta bancaria Padrao? ");
				System.out.printf(
						"\t\t\t\tCaso deseje, com ela sera possivel realizar \n \t\t\t\t   transacoes de maneira mais rapida.\n");
				System.out.println("\t \t\t\t**************************************");
				System.out.println(
						"\t\t\t\t*   " + MenuDefineContaPadrao.SIM.opcao + ".Sim                            *");
				System.out.println("\t \t\t\t**************************************");
				System.out.println(
						"\t\t\t\t*   " + MenuDefineContaPadrao.NAO.opcao + ".Nao                            *");
				System.out.println("\t \t\t\t**************************************");
				System.out.println("\t\t\t\t\n\t\t\t\t");
				opcao = TratamentodeEntradas.trataEntradaOpcao();

				switch (MenuDefineContaPadrao.menuOpcao(opcao)) {
				case SIM:
					try {
						conta = ContaDAO.read(TratamentodeEntradas.trataEntradaNumeroConta(),
								EntradaDeDados.lerSenhaConta());
						if (conta != null) {
							if (conta.getPessoa().getCpf().equals(Controller.getSessao().getCpf())) {
								Controller.getSessao().setContaPadrao(conta);
								System.out.println();
								System.out.println("[\t\t\t\t[Conta padrao definida com sucesso]");
								System.out.println();
								PessoaDAO.salvarPessoas();
							} else {
								System.out.println();
								System.out.println("\t\t\t\t[Conta nao encontrada]");
								System.out.println();
							}
						}
					} catch (Exception ex) {
						System.out.println();
						System.out.println("\t\t\t\t[Conta nao encontrada]");
						System.out.println();
					}
				case NAO:
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
