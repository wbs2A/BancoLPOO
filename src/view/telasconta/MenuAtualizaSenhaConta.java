package view.telasconta;

public enum MenuAtualizaSenha {
	ATUALIZARSENHACONTAPADRAO(1), ATUALIZARSENHAOUTRACONTA(2), SAIR(0);

	int opcao;

	MenuAtualizaSenha(int op) {
		this.opcao = op;
	}

	public static MenuAtualizaSenha menuOpcao(int opcao) {
		if (opcao == 1) {
			return MenuAtualizaSenha.ATUALIZARSENHACONTAPADRAO;
		} else if (opcao == 2) {
			return MenuAtualizaSenha.ATUALIZARSENHAOUTRACONTA;
		} else if (opcao == 0) {
			return MenuAtualizaSenha.SAIR;
		}
		return null;
	}
}
