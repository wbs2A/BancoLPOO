package view.comum;

/**
 * A Classe MenuIncial e responsavel por disponibilizar as opcoes do Enum
 * MenuInicial.
 *
 * @author Adler Cavalcante
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Michael Douglas
 */
public enum MenuInicial {
	FAZERLOGIN(1), FAZERCADASTRO(2), AJUDA(3), SAIR(0);
	int opcao;

	/**
	 * O metodo MenuInicial e responsavel por atribuir a variavel opcao o parametro
	 * que e passado quando uma variavel do tipo MenuInicial e declarada.
	 * 
	 * @param op
	 */
	MenuInicial(int op) {
		this.opcao = op;
	}

	/**
	 * Metodo para retorno da opcao escolhida.
	 *
	 * @param opcao
	 *            int - Valor da opcao escolhida.
	 * @return enum opcao - Opccao com nome correspondente.
	 */
	public static MenuInicial menuOpcao(int opcao) {
		if (opcao == 1) {
			return MenuInicial.FAZERLOGIN;
		} else if (opcao == 2) {
			return MenuInicial.FAZERCADASTRO;
		} else if (opcao == 3) {
			return MenuInicial.AJUDA;
		} else if (opcao == 0) {
			return MenuInicial.SAIR;
		}
		return null;
	}
}
