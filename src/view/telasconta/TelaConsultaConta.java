package view.telasconta;

import java.util.ArrayList;

import controller.Controller;
import model.Conta;
import model.Pessoa;

/**
 * A classe TelaConsultaConta e responsavel por disponibilizar a visualizacao do
 * menu relacionado a consulta das contas que uma pessoa possui, utilizando de
 * seus metodos para acessar as informacoes dentro das divisoes controller e
 * model, identificando quais contas que uma pessoa tem.
 * 
 * @author Adler Cavalcante
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Michael Douglas
 *
 */
public class TelaConsultaConta {
	private static ArrayList<Conta> contas;

	/**
	 * O metodo consultaConta e responsavel por mostrar as informacoes de todas as
	 * contas de uma pessoa, caso exista alguma conta registrada no banco, se nao,
	 * uma mensagem dizendo que a pessoa nao possui nenhuma conta bancaria sera
	 * emitida.
	 */
	public static void consultaConta() {
		Pessoa pessoa;
		contas = new ArrayList<Conta>();

		System.out.println();
		System.out.println("\t\t\t*******************************************************");
		System.out.println("\t\t\t*\t           CPAN BANCO CENTER                  *");
		System.out.println("\t\t\t*******************************************************");
		System.out.println("\t\t\t\t\n\t\t\t\t");
		System.out.println("\t\t\t\t****************************************");
		System.out.println("\t\t\t\t*    CONSULTA CONTA(S) BANCARIA(S)     *");
		System.out.println("\t\t\t\t****************************************");
		System.out.println("\t\t\t\t ");
		System.out.println();
		pessoa = Controller.getSessao();
		contas = pessoa.getContas();

		if (contas.isEmpty()) {
			System.out.println();
			System.out.println("\t\t\t\t[Voce nao possui nenhuma conta bancaria]");
			System.out.println();
		} else {

			for (Conta contaspessoa : contas) {
				System.out.println(contaspessoa);
				System.out.println("\t\t\t\tSaldo atual: " + contaspessoa.getSaldo());
				System.out.println();
			}
		}

	}
}
