package view.telasconta;

public enum MenuTransferencia {
TRANSFERIRDACONTAPADRAO(1), TRANSFERIRDEUTRACONTA(2), SAIR(0);
	
	int opcao;
	
	MenuTransferencia(int op) {
		this.opcao = op;
	}
	
	public static MenuTransferencia menuOpcao(int opcao) {
		if(opcao == 1)
			return MenuTransferencia.TRANSFERIRDACONTAPADRAO;
		else if(opcao == 2)
			return MenuTransferencia.TRANSFERIRDEUTRACONTA;
		else if(opcao == 0)
			return MenuTransferencia.SAIR;
		return null;
	}
}
