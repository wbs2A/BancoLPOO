package view.telasconta;

/**
 * Classe responsavel por disponibilizar as opcoes do Enum
 * MenuAtualizaSenhaConta
 *
 * @author Michael Douglas
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Adler Cavalcante
 */
public enum MenuAtualizaSenhaConta {
	ATUALIZARSENHACONTAPADRAO(1), ATUALIZARSENHAOUTRACONTA(2), SAIR(0);

	int opcao;

	/**
	 *
	 * @param op
	 */
	MenuAtualizaSenhaConta(int op) {
		this.opcao = op;
	}

	/**
	 * Metodo para retorno da opcao escolhida
	 *
	 * @param opcao
	 *            int - Valor da opcao escolhida
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
