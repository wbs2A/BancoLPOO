package view.telasconta;

import controller.ContaDAO;
import controller.Login;
import controller.PessoaDAO;
import model.Conta;
import model.Pessoa;
import view.ClearConsole;
import view.EntradaDeDados;
import view.ExecoesDeEntrada;
import view.telaspessoa.MenuExcluirConta;

public class TelaExcluiConta {
	
	public static void menuExcluirConta() {
		int opcao;
		boolean sair = false;
		Pessoa pessoa;
		Conta conta;
		
		System.out.println();
		System.out.println("\t\t\t\t        Confirme sua Identidade            ");
		System.out.println();
		pessoa = Login.validaLogin(ExecoesDeEntrada.trataEntradaCpf(), EntradaDeDados.lerSenha());
		
		if(pessoa != null) {
			do {
				try {
					new ClearConsole();
					System.out.println();
					System.out.println("\t\t\t*******************************************************");
					System.out.println("\t\t\t*\t           CPAN BANCO CENTER                  *");
					System.out.println("\t\t\t*******************************************************");
					System.out.println("\t\t\t\t\n\t\t\t\t");
					System.out.println("\t \t\t\t**************************************");
					System.out.println("\t\t\t\t*            EXCLUIR CONTA            *");
					System.out.println("\t \t\t\t**************************************");
					System.out.println("\t\t\t\tDeseja realmente excluir uma conta bancaria?");
					System.out.println("\t\t\tAo excluir, seus dados serão perdidos permanentemente");
					System.out.println("\t \t\t\t**************************************");
					System.out.println("\t\t\t\t*   "+MenuExcluiConta.NAO.opcao+".N�o    *");
					System.out.println("\t \t\t\t**************************************");
					System.out.println("\t\t\t\t*   "+MenuExcluiConta.SIM.opcao+".Sim    *");
					System.out.println("\t \t\t\t**************************************");
					System.out.println("\t\t\t\t\n\t\t\t\t");
					opcao = ExecoesDeEntrada.trataEntradaOpcao();
					
					switch(MenuExcluirConta.menuConfirma(opcao)) {
						case NAO:
							sair = true;
							break;
						
						case SIM:
							conta = ContaDAO.consultaConta(ExecoesDeEntrada.trataEntradaNumeroConta(), ExecoesDeEntrada.trataEntradaSenhaConta());
		        			if(conta != null) {
		        				ContaDAO.removerConta(conta, pessoa);
		        				ContaDAO.salvarContas();
		        				PessoaDAO.salvarPessoas();
		        				System.out.println();
		        				System.out.println("[\t\t\t\t[Conta removida com sucesso]");
		        				System.out.println();
		        			}else {
		        				System.out.println();
		        				System.out.println("\t\t\t\t[Conta não encontrada]");
		        				System.out.println();
		        			}
							break;
							
					}
			        
				}catch(Exception e) {
					System.out.println();
					System.out.println("\t\t\t\tOpcao Invalida!");
					System.out.println();
				}
			}while(!sair);
		}else{
			System.out.println();
			System.out.println("\t\t\t\t[Usuario e/ou senha incorreto(s)]");
			System.out.println();
		}   
	}
}
