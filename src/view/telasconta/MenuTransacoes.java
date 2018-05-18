package view.telasconta;

public enum MenuTransacoes {
	REALIZARSAQUE(1), REALIZARDEPOSITO(2), REALIZARTRANSFERENCIA(3), 
	SAIR(0);
	
	int opcao;
	
	MenuTransacoes(int op) {
		this.opcao = op;
	}
	
	public static MenuTransacoes menuOpcao(int opcao) {
		if(opcao == 1)
			return MenuTransacoes.REALIZARSAQUE;
		else if(opcao == 2)
			return MenuTransacoes.REALIZARDEPOSITO;
		else if(opcao == 3)
			return MenuTransacoes.REALIZARTRANSFERENCIA;
		else if(opcao == 0)
			return MenuTransacoes.SAIR;
		return null;
	}
}
