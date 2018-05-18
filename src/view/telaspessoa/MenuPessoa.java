package view.telaspessoa;

public enum MenuPessoa {
ATUALIZARDADOS(1), EXLUCIRPESSOA(2), SAIR(0);
	
	MenuPessoa(int op) {
	}
	
	public static MenuPessoa menuOpcao(int opcao) {
		if(opcao == 1)
			return MenuPessoa.ATUALIZARDADOS;
		else if(opcao == 2)
			return MenuPessoa.EXLUCIRPESSOA;
		else if(opcao == 0)
			return MenuPessoa.SAIR;
		return null;
	}
}
