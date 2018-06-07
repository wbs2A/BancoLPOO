package view.comum;

/**
 * A Classe MenuHome e responsavel por disponibilizar as opcoes do Enum
 * MenuHome.
 *
 * @author Adler Cavalcante
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Michael Douglas
 */
public enum MenuHome {
	GERENCIARCONTA(1), GERENCIARPESSOA(2), SAIR(0);
	int opcao;

	/**
	 * O metodo MenuHome e responsavel por atribuir a variavel opcao o parametro que
	 * e passado quando uma variavel do tipo MenuHome e declarada.
	 * 
	 * @param op
	 */
	MenuHome(int op) {
		this.opcao = op;
	}

	/**
	 * Metodo para retorno da opcao escolhida.
	 *
	 * @param opcao
	 *            int - Valor da opcao escolhida.
	 * @return enum opcao - Opcao com o nome correspondente.
	 */
	public static MenuHome menuOpcao(int opcao) {
		if (opcao == 1) {
			return MenuHome.GERENCIARCONTA;
		} else if (opcao == 2) {
			return MenuHome.GERENCIARPESSOA;
		} else if (opcao == 0) {
			return MenuHome.SAIR;
		}
		return null;
	}
}
