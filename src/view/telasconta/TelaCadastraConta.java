package view.telasconta;

import java.io.IOException;

import controller.ContaDAO;
import controller.Controller;
import controller.PessoaDAO;
import model.Conta;
import view.EntradaDeDados;
import view.TratamentodeEntradas;

/**
 * A classe TelaCadastraConta e responsavel por disponibilizar a visualizacao do
 * menu relacionado a criacao de uma conta utilizando de seus metodos para
 * chamar as funcoes necessarias das outras classes relacionadas do controller e
 * model.
 * 
 * @author Adler Cavalcante
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Michael Douglas
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
	public static void formularioCadastroConta() throws IOException {
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
		System.out.println("\t\t\t\t        Confirme sua Senha de Login        ");
		if (Controller.getSessao().getSenha().equals(EntradaDeDados.lerSenha())) {
			System.out.println();
			conta = (Conta) ContaDAO.create(TratamentodeEntradas.trataEntradaSenhaContaBancaria(),
					Controller.getSessao());
			System.out.println();
			System.out.println("\t\t\t\t[Conta Criada com Sucesso]");
			System.out.println();
			System.out.println(conta);
			System.out.println("\t\t\t\tSenha: " + conta.getSenha());
			System.out.println("\t\t\t\tSaldo: " + conta.getSaldo());
			System.out.println();
			ContaDAO.salvarContas();
			PessoaDAO.salvarPessoas();
			System.out.println("\t\t\t\tPressione Enter para continuar...");
			System.in.read();
		} else {
			System.out.println();
			System.out.println("\t\t\t\t[Senha Incorreta]");
			System.out.println();
		}

	}
}