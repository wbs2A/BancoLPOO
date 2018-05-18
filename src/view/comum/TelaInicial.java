package view.comum;

import view.ExecoesDeEntrada;
import view.telaspessoa.TelaCadastraPessoa;

public class TelaInicial {
	public static void telaInicial() {
		int opcao;
		boolean sair = false;
		
		do {
			try {
				System.out.println();
				System.out.println("\t\t\t*******************************************************");
			    System.out.println("\t\t\t*\t           CPAN BANCO CENTER                  *");
				System.out.println("\t\t\t*******************************************************");
				System.out.println("\t\t\t\t\n\t\t\t\t");
				System.out.println("\t\t\t\t****************************************");
		        System.out.println("\t\t\t\t*               (1)LOGIN               *");
		        System.out.println("\t\t\t\t****************************************");
		        System.out.println("\t\t\t\t*             (2)CADASTRE-SE           *");
		        System.out.println("\t\t\t\t****************************************");
		        System.out.println("\t\t\t\t*                (0)SAIR               *");
		        System.out.println("\t\t\t\t****************************************");
		        System.out.println("\t\t\t\t ");
		        opcao = ExecoesDeEntrada.trataEntradaOpcao();
		        
		        switch(MenuInicial.menuOpcao(opcao)){
		        	case FAZERLOGIN:
		        		TelaLogin.menuLogin();
		        		break;
		        	
		        	case FAZERCADASTRO:
		        		TelaCadastraPessoa.formularioCadastroPessoa();
		        		break;
		        	
		        	case SAIR:
		        		sair = true;
		        		break;
		        }
			}catch(Exception e) {
				System.out.println();
				System.out.println("\t\t\t\tOpcao Invalida");
				System.out.println();
			}
		}while(!sair);
	}
}
