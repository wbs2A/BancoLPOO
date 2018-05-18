package view.comum;

public enum MenuHome {
	GERENCIARCONTA(1), GERENCIARPESSOA(2), SAIR(0);
	
	MenuHome(int op) {
	}
	
	public static MenuHome menuOpcao(int opcao) {
		if(opcao == 1)
			return MenuHome.GERENCIARCONTA;
		else if(opcao == 2)
			return MenuHome.GERENCIARPESSOA;
		else if(opcao == 0)
			return MenuHome.SAIR;
		return null;
	}
}
