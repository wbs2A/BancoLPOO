package view.telaspessoa;

import controller.ContaDAO;
import controller.Controller;
import controller.PessoaDAO;
import view.ClearConsole;
import view.EntradaDeDados;
import view.TratamentodeEntradas;

public class TelaConsultaDadosPessoa {

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
			if (Controller.validaLogin(TratamentodeEntradas.trataEntradaCpf(), EntradaDeDados.lerSenha())) {
				System.out.println(Controller.getSessao());

			}
		} catch (Exception e) {
			System.out.println();
			System.out.println("\t\t\t\t[Usuario e/ou Senha Incorreto(s)]");
			System.out.println();
		}
	}
}