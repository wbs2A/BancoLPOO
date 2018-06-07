package view.telasconta;

/**
 * A Classe MenuTransferencia e reponsavel por disponibilizar as opcoes do Enum
 * MenuTransferencia.
 *
 * @author Adler Cavalcante
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Michael Douglas
 */
public enum MenuTransferencia {
	TRANSFERIRDACONTAPADRAO(1), TRANSFERIRDEOUTRACONTA(2), SAIR(0);

	int opcao;

	/**
	 * O metodo MenuTransaferencia e responsavel por atribuir a variavel opcao o
	 * parametro que e passado quando uma variavel do tipo MenuTransferencia e
	 * declarada.
	 * 
	 * @param op
	 */
	MenuTransferencia(int op) {
		this.opcao = op;
	}

	/**
	 * Metodo para retorno da opcao escolhida.
	 *
	 * @param opcao
	 *            int - Valor da opcao escolhida.
	 * @return enum opcao - Opcao com o nome correspondente
	 */
	public static MenuTransferencia menuOpcao(int opcao) {
		if (opcao == 1) {
			return MenuTransferencia.TRANSFERIRDACONTAPADRAO;
		} else if (opcao == 2) {
			return MenuTransferencia.TRANSFERIRDEOUTRACONTA;
		} else if (opcao == 0) {
			return MenuTransferencia.SAIR;
		}
		return null;
	}
}
