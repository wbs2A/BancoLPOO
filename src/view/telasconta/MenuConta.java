package view.telasconta;

public enum MenuConta {
	REALIZARTRANSACAO(1), EXIBIREXTRATO(2), CADASTRARCONTA(3), 
	EXCLUIRCONTA(4), CONSULTARCONTA(5), SAIR(0);
	
	int opcao;
	
	MenuConta(int op) {
		this.opcao = op;
	}
	
	public static MenuConta menuOpcao(int opcao) {
		if(opcao == 1)
			return MenuConta.REALIZARTRANSACAO;
		else if(opcao == 2)
			return MenuConta.EXIBIREXTRATO;
		else if(opcao == 3)
			return MenuConta.CADASTRARCONTA;
		else if(opcao == 4)
			return MenuConta.EXCLUIRCONTA;
		else if(opcao == 5)
			return MenuConta.CONSULTARCONTA;
		else if(opcao == 0)
			return MenuConta.SAIR;
		return null;
	}
}
