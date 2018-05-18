package view.telasconta;

public enum MenuSaque {
SACARCONTAPADRAO(1), SACAROUTRACONTA(2), SAIR(0);
	
	MenuSaque(int op) {
	}
	
	public static MenuSaque menuOpcao(int opcao) {
		if(opcao == 1)
			return MenuSaque.SACARCONTAPADRAO;
		else if(opcao == 2)
			return MenuSaque.SACAROUTRACONTA;
		else if(opcao == 0)
			return MenuSaque.SAIR;
		return null;
	}
}
