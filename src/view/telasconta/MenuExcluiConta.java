package view.telasconta;

/**
 * A Classe MenuExcluiConta e responsavel por disponibilizar as Opcoes do Enum
 * MenuExcluiConta.
 *
 * @author Adler Cavalcante
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Michael Douglas
 */
public enum MenuExcluiConta {
	NAO(1), SIM(2);

	int opcao;

	/**
	 * O metodo MenuExcluiConta e responsavel por atribuir a variavel opcao o
	 * parametro que e passado quando uma variavel do tipo MenuExcluiConta e
	 * declarada.
	 * 
	 * @param op
	 */
	MenuExcluiConta(int op) {
		this.opcao = op;
	}

	/**
	 * Metodo para retorno da opcao escolhida.
	 *
	 * @param opcao
	 *            int - Valor da opcao escolhida.
	 * @return enum opcao - Opcao com o nome correspondente
	 */
	public static MenuExcluiConta menuConfirma(int opcao) {
		if (opcao == 1) {
			return MenuExcluiConta.NAO;
		} else if (opcao == 2) {
			return MenuExcluiConta.SIM;
		}
		return null;
	}
}
