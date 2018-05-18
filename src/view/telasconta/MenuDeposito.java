package view.telasconta;

public enum MenuDeposito {
	DEPOSITARCONTAPADRAO(1), DEPOSITAROUTRACONTA(2), SAIR(0);
	
	MenuDeposito(int op) {
	}
	
	public static MenuDeposito menuOpcao(int opcao) {
		if(opcao == 1)
			return MenuDeposito.DEPOSITARCONTAPADRAO;
		else if(opcao == 2)
			return MenuDeposito.DEPOSITAROUTRACONTA;
		else if(opcao == 0)
			return MenuDeposito.SAIR;
		return null;
	}
}
