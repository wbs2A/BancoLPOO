package view.telasconta;

/**
 * A Classe MenuAtualizaSenhaConta e responsavel por disponibilizar as opcoes do
 * Enum MenuAtualizaSenhaConta.
 *
 * @author Adler Cavalcante
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Michael Douglas
 */
public enum MenuAtualizaSenhaConta {
	ATUALIZARSENHACONTAPADRAO(1), ATUALIZARSENHAOUTRACONTA(2), SAIR(0);

	int opcao;

	/**
	 * O metodo MenuAtualizaSenhaConta e responsavel por atribuir a variavel opcao o
	 * parametro que e passado quando uma variavel do tipo MenuAtualizaSenhaConta e
	 * declarada.
	 * 
	 * @param op
	 */
	MenuAtualizaSenhaConta(int op) {
		this.opcao = op;
	}

	/**
	 * Metodo para retorno da opcao escolhida.
	 *
	 * @param opcao
	 *            int - Valor da opcao escolhida.
	 * @return enum opcao - Opcao com o nome correspondente
	 */
	public static MenuAtualizaSenhaConta menuOpcao(int opcao) {
		if (opcao == 1) {
			return MenuAtualizaSenhaConta.ATUALIZARSENHACONTAPADRAO;
		} else if (opcao == 2) {
			return MenuAtualizaSenhaConta.ATUALIZARSENHAOUTRACONTA;
		} else if (opcao == 0) {
			return MenuAtualizaSenhaConta.SAIR;
		}
		return null;
	}
}
