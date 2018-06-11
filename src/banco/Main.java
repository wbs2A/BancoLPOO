package banco;

import controller.ContaDAO;
import controller.PessoaDAO;
import view.comum.TelaInicial;

/**
 * Classe que representa a inicializacao da aplicacao e carregamento e descarregamento de objetos.
 * @author: Nathaly.
 * @author: Wesley B.
 */
public class Main {
	
	/**
	 * Metodo principal que executa a aplicacao. Nele e
	 * executado o carregamento dos objetos, a tela principal da aplicacao e o descarregamento quando sai
	 * @author: Nathaly.
	 * @author: Wesley B.
	 * @param String argumentos na linha de comando
	 */
	
	public static void main(String[] args) {
		PessoaDAO.carregarPessoas();
		ContaDAO.carregarContas();

		TelaInicial.telaInicial();

		PessoaDAO.salvarPessoas();
		ContaDAO.salvarContas();
	}
}