package view.telasconta;

public enum MenuExcluiConta {
	NAO(1), SIM(2);
	
	MenuExcluiConta(int op) {
	}
	
	public static MenuExcluiConta menuConfirma(int opcao) {
		if(opcao == 1)
			return MenuExcluiConta.NAO;
		else if(opcao == 2)
			return MenuExcluiConta.SIM;
		return null;
	}
}
