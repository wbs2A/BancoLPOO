package view.telaspessoa;

public enum MenuExcluirConta {
	NAO(1), SIM(2);
	
	MenuExcluirConta(int op) {
	}
	
	public static MenuExcluirConta menuConfirma(int opcao) {
		if(opcao == 1)
			return MenuExcluirConta.NAO;
		else if(opcao == 2)
			return MenuExcluirConta.SIM;
		return null;
	}
}
