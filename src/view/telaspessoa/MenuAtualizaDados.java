package view.telaspessoa;

public enum MenuAtualizaDados {
	ATUALIZARNOME(1), ATUALIZARCPF(2), ATUALIZARDATANASC(3), ATUALIZARSEXO(4), ATUALIZARSENHA(5), SAIR(0);

	MenuAtualizaDados(int op) {
		
	}
	
	public static MenuAtualizaDados menuOpcao(int opcao) {
		if(opcao == 1)
			return MenuAtualizaDados.ATUALIZARNOME;
		else if(opcao == 2)
			return MenuAtualizaDados.ATUALIZARCPF;
		else if(opcao == 3)
			return MenuAtualizaDados.ATUALIZARDATANASC;
		else if(opcao == 4)
			return MenuAtualizaDados.ATUALIZARSEXO;
		else if(opcao == 5)
			return MenuAtualizaDados.ATUALIZARSENHA;
		else if(opcao == 0)
			return MenuAtualizaDados.SAIR;
		return null;
	}
}
