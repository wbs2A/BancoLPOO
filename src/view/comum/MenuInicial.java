package view.comum;

public enum MenuInicial {
	FAZERLOGIN(1), FAZERCADASTRO(2), SAIR(0);
	
	MenuInicial(int op){	
	}
	
	public static MenuInicial menuOpcao(int opcao) {
		if(opcao == 1)
			return MenuInicial.FAZERLOGIN;
		else if(opcao == 2)
			return MenuInicial.FAZERCADASTRO;
		else if(opcao == 0)
			return MenuInicial.SAIR;
		return null;
	}
}
