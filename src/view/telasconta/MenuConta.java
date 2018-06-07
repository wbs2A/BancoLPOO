package view.telasconta;

/**
 * A Classe MenuConta e responsavel por disponibilizar as opcoes do Enum
 * MenuConta.
 *
 * @author Adler Cavalcante
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Michael Douglas
 */
public enum MenuConta {
	REALIZARTRANSACAO(1), EXIBIREXTRATO(2), CADASTRARCONTA(3), EXCLUIRCONTA(4), CONSULTARCONTA(5), DEFINIRCONTAPADRAO(
			6), ATUALIZARSENHACONTA(7), AJUDA(8), SAIR(0);

	int opcao;

	/**
	 * O metodo MenuConta e responsavel por atribuir a variavel opcao o parametro
	 * que e passado quando uma variavel do tipo MenuConta e declarada.
	 * 
	 * @param op
	 */
	MenuConta(int op) {
		this.opcao = op;
	}

	/**
	 * Metodo para retorno da opcao escolhida.
	 *
	 * @param opcao
	 *            int - Valor da opcao escolhida.
	 * @return enum opcao - Opcao com o nome correspondente
	 */
	public static MenuConta menuOpcao(int opcao) {
		if (opcao == 1) {
			return MenuConta.REALIZARTRANSACAO;
		} else if (opcao == 2) {
			return MenuConta.EXIBIREXTRATO;
		} else if (opcao == 3) {
			return MenuConta.CADASTRARCONTA;
		} else if (opcao == 4) {
			return MenuConta.EXCLUIRCONTA;
		} else if (opcao == 5) {
			return MenuConta.CONSULTARCONTA;
		} else if (opcao == 6) {
			return MenuConta.DEFINIRCONTAPADRAO;
		} else if (opcao == 7) {
			return MenuConta.ATUALIZARSENHACONTA;
		} else if (opcao == 8) {
			return MenuConta.AJUDA;
		} else if (opcao == 0) {
			return MenuConta.SAIR;
		}
		return null;
	}
}
