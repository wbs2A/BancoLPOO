package view.telasconta;

import controller.ContaDAO;
import controller.Login;
import model.Conta;
import model.Pessoa;
import view.EntradaDeDados;
import view.TratamentodeEntradas;

/**
 * A classe TelaCadastraConta e responsavel por disponibilizar a visualizacao do
 * menu relacionado a criacao de uma conta utilizando de seus metodos para
 * chamar as funcoes necessarias das outras classes relacionadas do controller e
 * model.
 * 
 * @author Adler_Moraes
 *
 */

public class TelaCadastraConta {
	/**
	 * O metodo formularioCdastroConta e responsavel por mostrar na tela o
	 * formulario de criacao de uma conta bancaria e permitir as acoes necessarias
	 * para a conclusao da mesma, utilizando de uma validacao de login para
	 * identificacao da pessoa que deseja abrir uma conta, caso a validacao falhe
	 * por algum motivo, seja uma pessoa nao cadastrada ou uma informacao invalida,
	 * uma mensagem de Usuario e/ou senha incorreto(s) sera emitida.
	 * 
	 */
	public static void formularioCadastroConta() {
		float saldo;
		Pessoa pessoa;
		Conta conta;

		System.out.println();
		System.out.println("\t\t\t*******************************************************");
		System.out.println("\t\t\t*\t           CPAN BANCO CENTER                  *");
		System.out.println("\t\t\t*******************************************************");
		System.out.println("\t\t\t\t\n\t\t\t\t");
		System.out.println("\t\t\t\t****************************************");
		System.out.println("\t\t\t\t*      CADASTRO DE CONTA BANCARIA      *");
		System.out.println("\t\t\t\t****************************************");
		System.out.println("\t\t\t\t");

		System.out.println();
		System.out.println("\t\t\t\t        Confirme sua Identidade         ");
		pessoa = Login.validaLogin(TratamentodeEntradas.trataEntradaCpf(), EntradaDeDados.lerSenha());

		if (pessoa != null) {
			saldo = TratamentodeEntradas.trataEntradaSaldoConta();
			if (saldo > 0) {
				conta = ContaDAO.criarConta(saldo, pessoa);
				System.out.println();
				System.out.println("\t\t\t\t[Conta Criada com Sucesso]");
				System.out.println();
				System.out.println(conta);
				System.out.println("\t\t\t\tSenha: " + conta.getSenha());
				System.out.println();
			} else {
				System.out.println();
				System.out.println("\t\t\t\t[Saldo Invalido]");
				System.out.println();
			}
		} else {
			System.out.println();
			System.out.println("\t\t\t\t[Usuario e/ou senha incorreto(s)]");
			System.out.println();
		}

	}
}
