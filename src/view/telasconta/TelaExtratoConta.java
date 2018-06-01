package view.telasconta;

import controller.ContaDAO;
import controller.Controller;
import model.Conta;
import model.Movimentacoes;
import view.EntradaDeDados;
import view.TratamentodeEntradas;

/**
 * A classe TelaExtratoConta e responsavel por disponibilizar a visualizacao das
 * informacoes referentes ao extrato de uma determinada conta, utilizando de
 * seus metodos para acessar tais informacoes provenientes de outras classes
 * contidas no Controller, Model e utilizar metodos de outra view para tratar as
 * entradas.
 *
 * @author Adler_Moraes
 *
 */
public class TelaExtratoConta {

	/**
	 * O metodo extratoConta ira retornar para o usuario o extrato da conta que ele
	 * deseja, pois ele possui mais de uma conta dentro do banco. A primeira op��o �
	 * o extrato da conta padr�o, caso n�o tenha ser� retornado uma mensagem o
	 * informando. A segunda op��o � o extrato de outra conta,onde o usu�rio insere
	 * o n�mero e a senha da conta e o programa retorna o extrato desta conta, caso
	 * n�o ache o usu�rio � informado.
	 */
	public static void extratoConta() {
		int opcao;
		Conta conta;
		boolean sair = false;
		do {
			try {
				System.out.println();
				System.out.println("\t\t\t*******************************************************");
				System.out.println("\t\t\t*\t           CPAN BANCO CENTER                  *");
				System.out.println("\t\t\t*******************************************************");
				System.out.println("\t\t\t\t\n\t\t\t\t");
				System.out.println("\t\t\t\t****************************************");
				System.out.println("\t\t\t\t*   EXTRATO DE CONTA(S) BANCARIA(S)    *");
				System.out.println("\t\t\t*******************************************************");
				System.out.println("\t\t\t\t\n\t\t\t\t");
				System.out.println(
						"\t\t\t\t*   " + MenuExtratoConta.EXTRATOCONTAPADRAO.opcao + ".Ver Extrato da Conta Padrao*");
				System.out.println("\t\t\t\t****************************************");
				System.out.println(
						"\t\t\t\t*   " + MenuExtratoConta.EXTRATOOUTRACONTA.opcao + ".Ver Extrato de Outra Conta*");
				System.out.println("\t\t\t\t****************************************");
				System.out.println("\t\t\t\t*   " + MenuExtratoConta.SAIR.opcao + ".Voltar*");
				System.out.println("\t\t\t\t***************************************");
				opcao = TratamentodeEntradas.trataEntradaOpcao();

				switch (MenuExtratoConta.menuOpcao(opcao)) {
				case EXTRATOCONTAPADRAO:
					conta = Controller.getSessao().getContaPadrao();
					if (conta != null) {
						System.out.println();
						System.out.println();
						System.out.println("\t\t\t\tConta padrao definida: ");
						System.out.println(conta);
						System.out.println();
						System.out.println();
						for (Movimentacoes movimentacoes : conta.getMovimentacoes()) {
							System.out.println(movimentacoes);
						}
					} else {
						System.out.println();
						System.out.println("\t\t\t\t[Voce nao possui uma conta padrao definida]");
						System.out.println();
					}
					break;

				case EXTRATOOUTRACONTA:
					try {
						System.out.println();
						System.out.println("\t\t\t\tInforme os dados da conta: ");
						System.out.println();
						conta = ContaDAO.read(TratamentodeEntradas.trataEntradaNumeroConta(),
								EntradaDeDados.lerSenhaConta());
						if (conta != null) {
							if (conta.getPessoa() == Controller.getSessao()) {
								for (Movimentacoes movimentacoes : conta.getMovimentacoes()) {
									System.out.println(movimentacoes);
								}
							} else {
								System.out.println();
								System.out.println("\t\t\t\t[Conta nao encontrada]");
								System.out.println();
							}
						}
					} catch (Exception ex) {
						System.out.println();
						System.out.println("\t\t\t\t[Conta nao Encontrada]");
						System.out.println();
					}
					break;

				case SAIR:
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
