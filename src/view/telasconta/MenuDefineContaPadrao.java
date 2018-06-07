package view.telasconta;

/**
 * A Classe MenuDefineContaPadrao e responsavel por disponibilizar as opcoes do
 * Enum MenuDefineContaPadrao.
 *
 * @author Adler Cavalcante
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Michael Douglas
 */
public enum MenuDefineContaPadrao {
	SIM(1), NAO(2);
	int opcao;

	/**
	 * O metodo MenuDefineContaPadrao e responsavel por atribuir a variavel opcao o
	 * parametro que e passado quando uma variavel do tipo MenuDefineContaPadrao e
	 * declarada.
	 * 
	 * @param op
	 */
	private MenuDefineContaPadrao(int op) {
		this.opcao = op;
	}

	/**
	 * Metodo para retorno da opcao escolhida.
	 *
	 * @param opcao
	 *            int - Valor da opcao escolhida.
	 * @return enum opcao - Opcao com o nome correspondente
	 */
	public static MenuDefineContaPadrao menuOpcao(int opcao) {
		if (opcao == 1) {
			return MenuDefineContaPadrao.SIM;
		} else if (opcao == 2) {
			return MenuDefineContaPadrao.NAO;
		}
		return null;
	}
}
