package view.telasconta;

/**
 * A Classe MenuDeposito e responsavel por disponibilizar as opcoes do Enum
 * MenuDeposito.
 *
 * @author Adler Cavalcante
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Michael Douglas
 */
public enum MenuDeposito {
	DEPOSITARCONTAPADRAO(1), DEPOSITAROUTRACONTA(2), SAIR(0);

	int opcao;

	/**
	 * O metodo MenuDeposito e responsavel por atribuir a variavel opcao o parametro
	 * que e passado quando uma variavel do tipo MenuDeposito e declarada.
	 * 
	 * @param op
	 */
	MenuDeposito(int op) {
		this.opcao = op;
	}

	/**
	 * Metodo para retorno da opcao escolhida.
	 *
	 * @param opcao
	 *            int - Valor da opcao escolhida.
	 * @return enum opcao - Opcao com o nome correspondente
	 */
	public static MenuDeposito menuOpcao(int opcao) {
		if (opcao == 1) {
			return MenuDeposito.DEPOSITARCONTAPADRAO;
		} else if (opcao == 2) {
			return MenuDeposito.DEPOSITAROUTRACONTA;
		} else if (opcao == 0) {
			return MenuDeposito.SAIR;
		}
		return null;
	}
}
