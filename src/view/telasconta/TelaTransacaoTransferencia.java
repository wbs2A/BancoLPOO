package view.telasconta;

import java.util.Date;

import controller.Banco;
import controller.ContaDAO;
import controller.Transacao;
import model.Conta;
import view.ClearConsole;
import view.ExecoesDeEntrada;

public class TelaTransacaoTransferencia {
	
	public static void menuTransferencia(){
		int opcao;
		boolean sair = false;
		Conta contaRemetente;
		Conta contaDestino;
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
		        System.out.println("\t\t\t\t*            TRANSFERENCIA            *");
		        System.out.println("\t \t\t\t**************************************");
		        System.out.println("\t\t\t\t\n\t\t\t\t");
		        System.out.println("\t \t\t\t****************************************");
		        System.out.println("\t\t\t\t*   "+MenuTransferencia.TRANSFERIRDACONTAPADRAO.opcao+".Transferir da Conta Padrao             *");
		        System.out.println("\t\t\t\t**************************************");
		        System.out.println("\t\t\t\t*   "+MenuTransferencia.TRANSFERIRDEOUTRACONTA.opcao+".Transferir de Outra Conta             *");
		        System.out.println("\t\t\t\t**************************************");
		        System.out.println("\t\t\t\t*   "+MenuTransferencia.SAIR.opcao+".Voltar             *");
		        System.out.println("\t\t\t\t**************************************");
		        opcao = ExecoesDeEntrada.trataEntradaOpcao();
		        
		        switch(MenuTransferencia.menuOpcao(opcao)){
		        	case TRANSFERIRDACONTAPADRAO:
		        		break;
		        	
		        	case TRANSFERIRDEUTRACONTA:
		        		System.out.println();
		        		System.out.printf("\t\t\t\tInforme o numero da conta destino: ");
		        		System.out.println();
		        		contaDestino = ContaDAO.consultaConta(ExecoesDeEntrada.trataEntradaNumeroConta());
		        		
		        		if(contaDestino != null) {
		        			System.out.println();
		        			System.out.println("\t\t\t\tInforme a conta remetente");
			        		System.out.println();
			        		contaRemetente = ContaDAO.consultaConta(ExecoesDeEntrada.trataEntradaNumeroConta(), ExecoesDeEntrada.trataEntradaSenhaConta());
		        			
			        		if(contaRemetente != null) {
			        			if(contaRemetente == contaDestino) {
			        				System.out.println();
			        				System.out.println("\t\t\t\t[Não é possivel fazer transferencias entre contas iguais]");
			        				System.out.println();
			        			}else {
			        				valor = ExecoesDeEntrada.trataEntradaSaldoConta();
			        				Transacao.realizarTransacaoTrans(new Date(), contaRemetente, contaDestino, "Transferencia", valor, Banco.TRANSFERIR);
			        				//Banco.transferencia(contaRemetente, contaDestino, valor);
			        				//System.out.println();
			        				//System.out.println("\t\t\t\t[Transferencia realizada com sucesso]");
			        				System.out.println();
			        			}
			        		}else {
			        			System.out.println();
		        				System.out.println("\t\t\t\t[Conta remetente não encontrada]");
		        				System.out.println();
			        		}	
		        		}else {
		        			System.out.println();
		        			System.out.println("\t\t\t\t[Conta destino não encontrada]");
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