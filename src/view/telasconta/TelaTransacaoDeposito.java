package view.telasconta;

import java.util.Date;

import controller.Banco;
import controller.ContaDAO;
import controller.Transacao;
import model.Conta;
import view.ClearConsole;
import view.ExecoesDeEntrada;

public class TelaTransacaoDeposito {
	
	public static void menuDeposito(){
		int opcao;
		boolean sair = false;
		Conta conta;
		float valor;
		
		do {
			try {
				new ClearConsole();
				System.out.println();
				System.out.println("\t\t\t*******************************************************");
		        System.out.println("\t\t\t*\t           CPAN BANCO CENTER                  *");
		        System.out.println("\t\t\t*******************************************************");
		        System.out.println("\t\t\t\t\n\t\t\t\t");
		        System.out.println("\t \t\t\t**************************************");
		        System.out.println("\t\t\t\t*             DEPOSITO                *");
		        System.out.println("\t \t\t\t**************************************");
		        System.out.println("\t\t\t\t\n\t\t\t\t");
		        System.out.println("\t \t\t\t**************************************");
		        System.out.println("\t\t\t\t*   1. Depositar na Conta Padrao      *");
		        System.out.println("\t\t\t\t***************************************");
		        System.out.println("\t\t\t\t*   2. Depositar em Outra Conta       *");
		        System.out.println("\t\t\t\t***************************************");
		        System.out.println("\t\t\t\t*   0. Voltar                         *");
		        System.out.println("\t\t\t\t***************************************");
		        opcao = ExecoesDeEntrada.trataEntradaOpcao();
		        
		        switch(MenuDeposito.menuOpcao(opcao)){
		        	case DEPOSITARCONTAPADRAO:
		        		
		        		break;
		        	
		        	case DEPOSITAROUTRACONTA:
		        		System.out.println();
		        		System.out.printf("\t\t\t\tInforme o numero da conta para deposito: ");
		        		System.out.println();
		        		conta = ContaDAO.consultaConta(ExecoesDeEntrada.trataEntradaNumeroConta());
		        		
		        		if(conta != null) {
		        			valor = ExecoesDeEntrada.trataEntradaSaldoConta();
		        			Transacao.realizarTransacao(new Date(), conta, "Deposito em Conta", valor, Banco.DEPOSITR);
		        			//Banco.deposito(conta, valor);
		        			//System.out.println();
		        			//System.out.println("\t\t\t\t[Deposito realizado com sucesso]");
		        			//System.out.println();
		        		}else {
		        			//System.out.println();
		        			//System.out.println("\t\t\t\t[Conta não encontrada]");
		        			System.out.println();
		        		}
		        		
		        		break;
		        	
		        	case SAIR:
		        		sair = true;
		        		break;
		        }
		        
			}catch(Exception e) {
				System.out.println();
				System.out.println("\t\t\t\tOpcao Invalida!");
				System.out.println();
			}    
		
		}while(!sair);
    }
}