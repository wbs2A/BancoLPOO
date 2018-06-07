package view.telasconta;

/**
 * A Classe MenuTransacoes e responsavel por disponibilizar as opcoes do Enum
 * MenuTransacoes.
 *
 * @author Adler Cavalcante
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Michael Douglas
 */
public enum MenuTransacoes {
	REALIZARSAQUE(1), REALIZARDEPOSITO(2), REALIZARTRANSFERENCIA(3), SAIR(0);

	int opcao;

	/**
	 * O metodo MenuTransacoes e responsavel por atribuir a variavel opcao o
	 * parametro que e passado quando uma variavel do tipo MenuTransacoes e
	 * declarada.
	 * 
	 * @param op
	 */
	MenuTransacoes(int op) {
		this.opcao = op;
	}

	/**
	 * Metodo para retorno da opcao escolhida.
	 *
	 * @param opcao
	 *            int - Valor da opcao escolhida.
	 * @return enum opcao - Opcao com o nome correspondente
	 */
	public static MenuTransacoes menuOpcao(int opcao) {
		if (opcao == 1) {
			return MenuTransacoes.REALIZARSAQUE;
		} else if (opcao == 2) {
			return MenuTransacoes.REALIZARDEPOSITO;
		} else if (opcao == 3) {
			return MenuTransacoes.REALIZARTRANSFERENCIA;
		} else if (opcao == 0) {
			return MenuTransacoes.SAIR;
		}
		return null;
	}
}
