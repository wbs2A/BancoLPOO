package view.telasconta;

/**
 * A Classe MenuExtratoConta e responsavel por disponiblizar as opcoes do Enum
 * MenuExtratoConta.
 *
 * @author Adler Cavalcante
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Michael Douglas
 */
public enum MenuExtratoConta {
	EXTRATOCONTAPADRAO(1), EXTRATOOUTRACONTA(2), SAIR(0);
	int opcao;

	/**
	 * O metodo MenuExtratoConta e responsavel por atribuir a variavel opcao o
	 * parametro que e passado quando uma variavel do tipo MenuExtratoConta e
	 * declarada.
	 * 
	 * @param op
	 */
	MenuExtratoConta(int op) {
		this.opcao = op;

	}

	/**
	 * Metodo para retorno da opcao escolhida.
	 *
	 * @param opcao
	 *            int - Valor da opcao escolhida.
	 * @return enum opcao - Opcao com o nome correspondente
	 */
	public static MenuExtratoConta menuOpcao(int opcao) {
		if (opcao == 1) {
			return MenuExtratoConta.EXTRATOCONTAPADRAO;
		} else if (opcao == 2) {
			return MenuExtratoConta.EXTRATOOUTRACONTA;
		} else if (opcao == 0) {
			return MenuExtratoConta.SAIR;
		}
		return null;
	}
}
