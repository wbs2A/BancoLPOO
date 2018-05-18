package view.telasconta;

public enum MenuDefineContaPadrao {
	SIM(1), NAO(2);
	
	private MenuDefineContaPadrao(int op) {
	}
	
	public static MenuDefineContaPadrao menuOpcao(int opcao) {
		if(opcao == 1)
			return MenuDefineContaPadrao.SIM;
		else if(opcao == 2)
			return MenuDefineContaPadrao.NAO;
		return null;
	}
}
