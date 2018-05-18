package view.telaspessoa;

import controller.ContaDAO;
import controller.Login;
import controller.PessoaDAO;
import model.Pessoa;
import view.ClearConsole;
import view.EntradaDeDados;
import view.ExecoesDeEntrada;

public class TelaExcluiPessoa {
	
	public static void menuExcluirPessoa() {
		int opcao;
		boolean sair = false;
		Pessoa pessoa;
		
		System.out.println();
		System.out.println("\t\t\t\t          Confirme sua Identidade                ");
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
					System.out.println("\t\t\t\t*            EXCLUIR CONTA           *");
					System.out.println("\t \t\t\t**************************************");
					System.out.println();
					System.out.println("\t\t\t\t  Deseja realmente excluir sua Conta?  ");
					System.out.println("\t\t\tAo excluir, seus dados serão perdidos permanentemente");
					System.out.println("\t\t\t  Todas as suas Contas Bancarias também serão perdidas");
					System.out.println();
					System.out.println("\t \t\t\t**************************************");
					System.out.println("\t\t\t\t*               (1)Não                *");
					System.out.println("\t\t\t\t**************************************");
					System.out.println("\t\t\t\t*               (2)Sim                *");
					System.out.println("\t\t\t\t**************************************");
					System.out.println("\t\t\t\t\n\t\t\t\t");
					opcao = ExecoesDeEntrada.trataEntradaOpcao();
					
					switch(MenuExcluirConta.menuConfirma(opcao)) {
						case NAO:
							sair = true;
							break;
						
						case SIM:
							PessoaDAO.removerPessoa(pessoa);
							PessoaDAO.salvarPessoas();
							ContaDAO.salvarContas();
							System.out.println();
							System.out.println("\t\t\t\t[Conta Excluida com sucesso]");
							System.out.println();
							System.exit(0);
							sair = true;
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
			System.out.println("\t\t\t\t[Usuario e/ou Senha Incorreto(s)]");
			System.out.println();
		}   
	}
}
