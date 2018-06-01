package view.telaspessoa;

import controller.Controller;
import model.Pessoa;
import view.ClearConsole;
import view.EntradaDeDados;
import view.TratamentodeEntradas;

/**
 * A Classe TelaConsultaDadosPessoa e responsavel por mostrar todas as
 * informacoes pessoais referentes a uma determinada pessoa.
 *
 * @author Adler Cavalcante
 * @author Michael Douglas
 * @author Joao Gabriel
 * @author Joao Victor
 * 
 */

public class TelaConsultaDadosPessoa {
	/**
	 * O metodo menuConsultaDadosPessoa e responsavel por disponibilizar a
	 * visualizacao dos dados pessoais de uma pessoa, utilizando de uma validacao de
	 * login para evitar a visualizacao de dados pessoais de outras pessoas,
	 * emitindo um aviso de erro caso alguma informacao inserida na verificacao seja
	 * invalida.
	 */
	public static void menuConsultadoDadosPessoa() {

		new ClearConsole();
		System.out.println();
		System.out.println("\t\t\t*******************************************************");
		System.out.println("\t\t\t*\t           CPAN BANCO CENTER                       *");
		System.out.println("\t\t\t*******************************************************");
		System.out.println("\t\t\t\t\n\t\t\t\t");
		System.out.println("\t\t\t\t**************************************");
		System.out.println("\t\t\t\t*         CONSULTA DADOS PESSOA      *");
		System.out.println("\t\t\t\t**************************************");
		System.out.println("\t\t\t\t\n\t\t\t\t");
		System.out.println();
		System.out.println("\t\t\t\t          Confirme sua Identidade                ");

		try {
			Pessoa pessoaAtual = Controller.getSessao();
			if (pessoaAtual == Controller.getPessoa(TratamentodeEntradas.trataEntradaCpf(),
					EntradaDeDados.lerSenha())) {
				System.out.println(Controller.getSessao());

			} else {
				System.out.println();
				System.out.println("\t\t\t\t[Usuario e/ou Senha Incorreto(s)]");
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println();
			System.out.println("\t\t\t\t[Usuario e/ou Senha Incorreto(s)]");
			System.out.println();
		}
	}
}