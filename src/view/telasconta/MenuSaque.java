package view.telasconta;

/**
 * A Classe MenuSaque e responsavel por disponibilizar as opcoes do Enum
 * MenuSaque.
 *
 * @author Adler Cavalcante
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Michael Douglas
 */
public enum MenuSaque {
	SACARCONTAPADRAO(1), SACAROUTRACONTA(2), SAIR(0);

	int opcao;

	/**
	 * O metodo MenuSaque e responsavel por atribuir a variavel opcao o parametro
	 * que e passado quando uma variavel do tipo MenuSaque e declarada.
	 * 
	 * @param op
	 */
	MenuSaque(int op) {
		this.opcao = op;
	}

	/**
	 * Metodo para retorno da opcao escolhida.
	 * 
	 * @param opcao
	 *            int - Valor da opcao escolhida.
	 * @return enum opcao - Opcao com o nome correspondente
	 */
	public static MenuSaque menuOpcao(int opcao) {
		if (opcao == 1) {
			return MenuSaque.SACARCONTAPADRAO;
		} else if (opcao == 2) {
			return MenuSaque.SACAROUTRACONTA;
		} else if (opcao == 0) {
			return MenuSaque.SAIR;
		}
		return null;
	}
}
